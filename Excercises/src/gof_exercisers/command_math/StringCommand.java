package gof_exercisers.command_math;

public class StringCommand implements MyCommand {
    private StringReceiver mReceiver;
    private String concat;

    public StringCommand(StringReceiver mReceiver, String concat) {
        this.mReceiver = mReceiver;
        this.concat = concat;
    }

    @Override
    public void execute() {
        mReceiver.setText(mReceiver.getText() + concat);
    }

    @Override
    public void undo() {
        String str = mReceiver.getText();
        str = str.substring(0, str.length() - concat.length());
        mReceiver.setText(str);
    }
}
