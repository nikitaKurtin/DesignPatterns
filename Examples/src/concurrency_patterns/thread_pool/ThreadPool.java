package concurrency_patterns.thread_pool;

import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Thread Pool
 */
class ThreadPool implements Closeable {

    private int threadNums;//numbering thread names
    private ArrayList<DispatchQueue> queues = new ArrayList<>(); //collection of dispatch queues that work concurrently

    public ThreadPool() {
        for (int i = 0; i < 3; i++) increaseCapacity(); //start with three dispatch queues
    }

    synchronized void async(Runnable target) {
        var dq = queues.get(0);
        for (int i = 1; i < queues.size(); i++) { //find smallest queue
            if (dq.size() == 0) break; //if current dq is empty - then no need to continue

            var temp = queues.get(i);
            if (temp.size() < dq.size()) dq = temp;
        }

        dq.add(target); //add to smallest queue - will run automatically

        //if smallest queue is big & we have less than 10 queues, add new queue.
        if (dq.size() > 5 && queues.size() < 10) increaseCapacity();
    }

    private void increaseCapacity() {
        System.out.println("increasing capacity");
        queues.add(new DispatchQueue("thread #" + ++threadNums));
    }

    private void dispose() {
        System.out.println("Thread pool - done");
        for (DispatchQueue t : queues) t.done();
    }

    @Override
    public void close() {
        dispose();
    }

    private void onThreadInactive(DispatchQueue queue) {
        if (queues.size() > 3) { //if pool has move than 3 dispatch queues, remove this one.
            queue.done();
            queues.remove(queue);
        }
    }

    private class DispatchQueue extends Thread {
        private boolean isDone; //boolean indicating thread is not working anymore
        private Queue<Runnable> queue; //queue of runnable operations

        DispatchQueue(String name) {
            super(name);
            this.queue = new ArrayDeque<>();
            this.isDone = false;
        }

        int size() {
            return queue.size();
        }

        synchronized void add(Runnable target) {
            if (this.getState() == State.NEW) start();//lazy starting
            queue.add(target);
        }

        @Override
        public void run() {
            while (!isDone)
                if (!queue.isEmpty()) queue.remove().run();
                else {
                    try {
                        sleep(10);
                        onThreadInactive(this); //notify pool that this thread is inactive
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            System.out.println(getName() + " - Done");
        }

        void done() {
            isDone = true;
        }
    }
}
