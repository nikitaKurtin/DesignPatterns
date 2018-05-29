package gof.structural.facade.computer;

public class Computer {
    private CPU mCPU;
    private Memory mRam;
    private HardDrive mHardDrive;

    public Computer() {
        mCPU = new CPU();
        mRam = new Memory();
        mHardDrive = new HardDrive();
    }

    public void startComputer() {
        mRam.load(10, mHardDrive.read(4200, 512));
        mCPU.jump(10);
        mCPU.execute("Starting Command");
    }

    public void turnOff() {
        mRam.load(900, mHardDrive.read(1160, 1024));
        mCPU.jump(900);
        mCPU.execute("Shutting Command");
    }
}
