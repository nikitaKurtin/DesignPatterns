package gof_exercisers.command_math;

public class StringReceiver {

    private String mText;

    StringReceiver() {
        this("");
    }

    StringReceiver(String mText) {
        this.mText = mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public String getText() {
        return mText;
    }

    @Override
    public String toString() {
        return getText();
    }
}
