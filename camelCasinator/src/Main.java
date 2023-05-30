import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ReadIt("exo.txt");
    }
    

    static void ReadIt(String fileTxt) {
        File myObj;
        try {
            myObj = new File(fileTxt);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                System.out.println(ToCamelCase(data));

            }
            myReader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    static String ToCamelCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] parts = str.split("[\\s_-]+");
        StringBuilder camelCase = new StringBuilder(parts[0].toLowerCase());

        for (int i = 1; i < parts.length; i++) {
            String capitalized = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1).toLowerCase();
            camelCase.append(capitalized);
        }

        return camelCase.toString();
    }
}




