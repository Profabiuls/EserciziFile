import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scrittura scrivo = new Scrittura();
        Lettura leggo = new Lettura();
        scrivo.scriviFile("provaScritturaFrase.txt", "Questa è una prova di scrittura,\n" +
                "apro il file, scrivo e chiudo il file");

        scrivo.scriviNumero("provaDiScritturaNumero.txt", 22);
        leggo.leggiFile("provaScritturaFrase.txt");
        leggo.leggiFile("provaDiScritturaNumero.txt");
        System.out.println("Programma terminato..");
    }
}
