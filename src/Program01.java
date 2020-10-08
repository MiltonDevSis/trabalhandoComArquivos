import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {

        /*
        * Lendo classes com File e scanner.
        * */

        File file = new File("c://testandoArquivosJava//teste.txt");
        Scanner scanner = null;

        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {

            // Colocar o bloco finally é uma boa pratica, pois
            // nesse caso o recurso vai ser fechado independentemente se
            // deu certo o try ou não.

            if(scanner != null){ // testar se o scanner vale algo, pois pode não entrar no try e dar um nullpoiterexception;
                scanner.close();
            }
        }
    }
}
