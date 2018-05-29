package gof.structural.facade.computer;

class HardDrive {
    byte[] read(long location, int size) {
        System.out.println("Read data from drive at location :" + location);
        return new byte[size];
    }
}
