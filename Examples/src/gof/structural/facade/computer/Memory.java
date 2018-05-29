package gof.structural.facade.computer;

class   Memory {
    void load(int position, byte[] data) {
        System.out.println("Loaded memory in position " + position + "with data" + new String(data));

    }
}
