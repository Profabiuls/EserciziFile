import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Scrittura {
 // private String nomeFile;

  public void scriviFile(String nomeFile,String frase) throws IOException {
      //Apro file
      File file = new File(nomeFile);
      //Creo filewriter
      FileWriter writer = new FileWriter(file);
       // Scrivo
      writer.write(frase);
      writer.close();
  }

    public void scriviNumero(String nomeFile,int numero) throws IOException {
        //Apro file
        File file = new File(nomeFile);
        //Creo filewriter
        FileWriter writer = new FileWriter(file);
        // Scrivo
        writer.write(numero);
        writer.close();
    }
}


