import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        if ( args.length < 2 ) {
            System.out.println("usage: grep term file");
        }
        else {
            try { 
                grep(args[0], args[1]);
            }
            catch (IOException e) {
                System.out.println("Got an IOException");
            }
        }
    }

    public static void grep(String term, String filepath) throws IOException {
        Files.lines(Paths.get(filepath)).filter(line -> line.contains(term))
                        .forEachOrdered(line -> System.out.println(line));
    }
}
