package gof_exercisers.command_math;

public class DivideCommand implements MyCommand {
    private NumberReceiver mReceiver;
    private double mOperand;

    public DivideCommand(NumberReceiver mReceiver, double operand) {
        this.mReceiver = mReceiver;
        this.mOperand = operand;
    }

    @Override
    public void execute() {
        double new_number = mReceiver.getNumber();

        mReceiver.setNumber(new_number / mOperand);
    }

    @Override
    public void undo() {
        mReceiver.setNumber(mReceiver.getNumber() * mOperand);
    }
}
