import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lettura {
    public void leggiFile(String percorsoFileDaLeggere) throws IOException {
        File file = new File(percorsoFileDaLeggere);

        FileReader reader = new FileReader(file);
        BufferedReader lineReader = new BufferedReader(reader);

        String line = lineReader.readLine();
        while (line != null) { //leggo fino alla fine del file
            System.out.println(line);
            line = lineReader.readLine();
        }
    }
}


