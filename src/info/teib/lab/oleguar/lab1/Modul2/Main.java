package info.teib.lab.oleguar.lab1.Modul2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Social social = new Social();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number = scanner.nextInt();
        String mail = scanner.nextLine();
        String otziv = scanner.nextLine();
        String filename = scanner.nextLine();
        String fileWithHuman = scanner.nextLine();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                social.addHuman(name, mail, number, otziv);
                break;
            case 2:
                social.addOtzivForHuman(otziv, mail, name, number);
                break;
            case 3:
                social.HumanFileReader(filename);
                break;
            case 4:
                social.addHumans(name, mail, fileWithHuman, otziv, number);
                break;

        }
     social.getPeopleOtzivi();
        social.getHumans();
        social.getSocial();
    }
}



