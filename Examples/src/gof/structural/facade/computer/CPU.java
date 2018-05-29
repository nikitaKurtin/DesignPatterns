package gof.structural.facade.computer;

class CPU {
    void execute(String command) {
        System.out.println("CPU has executed a command:");
        System.out.println('\t' + command);
    }

    void jump(int position) {
        System.out.println("Jumped to location in memory location: " + position);
    }
}
