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
            String term = args[0];
            String file = args[1];
            Path filePath = Paths.get(file);
            try {
                Files.lines(filePath).filter(line -> line.contains(term))
                        .forEachOrdered(line -> System.out.println(line));
            }
            catch (IOException e) {
                System.out.println("Got an IOException");
            }
        }
    }
}
