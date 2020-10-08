import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program03 {

    public static void main(String[] args) {
        /*
        * Refatorado o cod. do program02.
        * Retirado as inicializações do BufferReader e FileReader, e instanciado no bloco try
        * Retirado bloco finally.
        * */

        String path = "c://testandoArquivosJava//teste.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("error:" + e.getMessage());
        }
    }
}
