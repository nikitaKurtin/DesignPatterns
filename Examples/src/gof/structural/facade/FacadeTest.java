package gof.structural.facade;

import gof.structural.facade.computer.Computer;

public class FacadeTest {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.startComputer();
        comp.turnOff();
    }
}
