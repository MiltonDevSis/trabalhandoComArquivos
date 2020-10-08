import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program02 {
    public static void main(String[] args) {
        /*
        * Código para mostrar o processo de abrir e fechar manualmenre as streams.
        * */

        String path = "c://testandoArquivosJava//teste.txt";
        // declaração das strems antes, pois senão elas não existem no bloco finally.
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("error:" + e.getMessage());
        }finally {
            try{
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
