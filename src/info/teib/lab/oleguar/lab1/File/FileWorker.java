package info.teib.lab.oleguar.lab1.File;

import javax.xml.soap.Name;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Юыху on 13.12.2015.
 */
public class FileWorker {


    public static void write() {

        try {String result = "";

            Scanner fileIn = new Scanner(new File("C://blog/a.txt"));
            do {
                result+=fileIn.nextLine();
                result+="\n";
            } while (fileIn.hasNext());
                System.out.println(result);


        Scanner scn = new Scanner(System.in);
        System.out.print("Write name");
        String nameHuman = scn.nextLine();
        System.out.print("Write mail");
        String mail = scn.nextLine();
        System.out.print("Write text");
        String text = scn.nextLine();
        String fileName = "C://blog/a.txt";
        File file = new File(fileName);


        try {

            if (!file.exists()) {
                System.out.print("File doesnt exist");
                file.createNewFile();
            }


            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.println(result);
                out.println("Name:"+nameHuman);
                out.println("Mail:"+mail);
                out.println("text:"+text);

            } finally {

                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws FileNotFoundException {


        FileWorker.write();


    }

}


