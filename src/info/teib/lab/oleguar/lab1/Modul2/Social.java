

package info.teib.lab.oleguar.lab1.Modul2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.io.PrintWriter;

public class Social {
    public ArrayList<Human> getHumans() {
        return humans;
    }

    public ArrayList<Human> humans = new ArrayList<Human>();

    public ArrayList<String> getSocial() {
        return social;
    }

    public ArrayList<String> social = new ArrayList<String>();

    public Map<Human, String> getPeopleOtzivi() {
        return peopleOtzivi;
    }

    public Map<Human, String> peopleOtzivi = new HashMap<Human, String>();

    public void addHuman(String name, String mail, int number, String otziv) {
        humans.add(new Human(name, mail, number));
    }


    public void addOtzivForHuman(String otziv, String mail, String name, int number) {
        Human human = new Human(name, mail, number);
        peopleOtzivi.put(human, otziv);
        {
        }
    }

    public void HumanFileReader(String filename) {
        String name;
        String email;
        int number;
        String otziv;
        Scanner HumanReader = new Scanner(filename);
        while (HumanReader.hasNext()) {

            name = HumanReader.nextLine();
            email = HumanReader.nextLine();
            number = HumanReader.nextInt();
            otziv = HumanReader.nextLine();
            addHuman(name, email, number, otziv);
        }
    }

    public void addHumans(String name, String mail, String fileWithHuman, String otziv, int number) {
        addHumans(name, mail, fileWithHuman, otziv, number);
        try {
            PrintWriter writer = new PrintWriter(fileWithHuman);
            writer.write(mail + "\n" + name);
            writer.write(number + "\n" + otziv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void giveMeHuman() {

        Human human = new Human();
        ArrayList<String> forHuman;
        forHuman = human();
        for (String human : forHuman) {
            System.out.println(human);
        }
    }
        }}

