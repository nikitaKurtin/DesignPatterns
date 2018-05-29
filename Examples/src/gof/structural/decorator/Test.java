package gof.structural.decorator;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Original origin = new Original();
        origin.hi();

        new Decorator(origin).bye();

        Wrapper wrappi = new Wrapper(origin);
        wrappi.say("Hello world");


        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("some path")));
        br.readLine();
    }
}
