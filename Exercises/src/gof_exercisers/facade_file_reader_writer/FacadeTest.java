package gof_exercisers.facade_file_reader_writer;

public class FacadeTest {
    public static void main(String[] args) {

        MyFileWriterReader writerReader = new MyFileWriterReader("src/gof_exercisers.facade_file_reader_writer/data.txt");

        //write from start (override)
        writerReader.writeFile("I'm new data in file");

        //subscribe to file
        writerReader.appendToFile("hello");

        String data = writerReader.readFile();
        System.out.println(data);
    }
}
