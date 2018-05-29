package concurrency_patterns.thread_pool;

/**
 * Created by Gal on 8/24/2017.
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        try (ThreadPool pool = new ThreadPool()) {

            for (int i = 0; i < 140; i++) {
                final int num = i;
                pool.async(() -> {
                    try {
                        System.out.println("working " + num);
                        Thread.sleep(200);
                        System.out.println(num + " done");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }

            for (int i = 0; i < 10; i++) {
                final int num = i;
                pool.async(() -> {
                    try {
                        System.err.println("Big working " + num);
                        Thread.sleep(1000);
                        System.err.println("Big " + num + " done");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

                Thread.sleep(500);
            }

            for (int i = 0; i < 30; i++) {
                Thread.sleep(300);
                System.out.println("hi " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
