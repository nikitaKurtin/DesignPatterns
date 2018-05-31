package gof_exercises.command_math;

import java.util.Stack;

public class Invoker {
    private final Stack<MyCommand> history = new Stack<>();

    public void callCommand(MyCommand cmd) {
        history.push(cmd)
                .execute();
    }

    public void undoOperation() {
        if (!history.isEmpty()) {
            history.pop()
                    .undo();
        } else {
            System.out.println("No History");
        }
    }
}
