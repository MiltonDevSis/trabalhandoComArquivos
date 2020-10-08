import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program04 {
    /*
    * new FileWriter(parametro): cria ou recria um arquivo exixtente.
    * new FileWriter(parametro, true): acrescenta ao arquivo  já existente.
    * */

    public static void main(String[] args) {

        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "c://testandoArquivosJava//testeOut.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line: lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
