package gof_exercises.command_math;

public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        NumberReceiver number = new NumberReceiver();
        MyCommand add10 = new AddCommand(number, 10);
        MyCommand divide2 = new DivideCommand(number, 2);

        NumberReceiver otherNum = new NumberReceiver(50);
        MyCommand divide16 = new DivideCommand(otherNum, 16);

        System.out.println(number);

        //Calling commands
        invoker.callCommand(add10);
        System.out.println(number);

        invoker.callCommand(divide2);
        System.out.println(number);

        invoker.callCommand(add10);
        System.out.println(number);

        //Undoing operations
        invoker.undoOperation();
        System.out.println(number);

        invoker.undoOperation();
        System.out.println(number);

        //with another receiver
        System.out.println(otherNum);
        invoker.callCommand(divide16);
        System.out.println(otherNum);

        invoker.undoOperation();
        System.out.println(number);

        invoker.undoOperation();
        System.out.println(number);

        StringReceiver stringReceiver = new StringReceiver();
        invoker.callCommand(new StringCommand(stringReceiver, "Hello"));
        System.out.println(stringReceiver);
        invoker.callCommand(new StringCommand(stringReceiver, "World"));
        System.out.println(stringReceiver);
        invoker.undoOperation();
        System.out.println(stringReceiver);
        invoker.callCommand(new StringCommand(stringReceiver, " WORLD 2"));
        System.out.println(stringReceiver);
    }
}
