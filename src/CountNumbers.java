import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args) {
        try{
            float f = 0;
            File file = new File("numbers.txt");
            Scanner readFile = new Scanner(file);
            while (readFile.hasNext()){
                String number = readFile.nextLine();
                if(number.matches("[-+]?[0-9]*\\.?[0-9]+")){
                    f = f + Float.parseFloat(number);
                }
            }
            System.out.println(f);
        } catch (FileNotFoundException e){
            System.out.println("Some error happened");
            e.printStackTrace();
        }
    }
}
