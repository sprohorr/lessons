package homework21.person;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonSort {
    //"C:\\Users\\User\\IdeaProjects\\text\\temp.txt";
    public static String filePath;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        filePath = scanner.nextLine();

        List<Person> personlist = readFile(filePath);
        writeFile(personlist);
        countAge(personlist);
        countGender(personlist);
    }

    public static List<Person> readFile(String filePath) {
        List<Person> list = new ArrayList<>();
        File file = new File(filePath);
        try (FileReader reader = new FileReader(file);
             Scanner scan = new Scanner(reader)) {
            while (scan.hasNext()) {
                list.add(createPerson(scan.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Failed to read file");
        }
        return list;
    }

    public static List<Person> sortPersons(List<Person> personlist) {
        personlist.sort(Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
        return personlist;
    }

    public static void writeFile(List<Person> personlist) {
        personlist = sortPersons(personlist);
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Person el : personlist)
                try {
                    writer.write(el.getName() + "," + el.getSurname() + "," + el.getGender() + "," + el.getAge() + '\n');
                } catch (FileNotFoundException e) {
                    System.out.println("Failed to write to the file");
                }
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
    }

    public static void countAge(List<Person> personlist) {
        long age = personlist.stream().filter(n -> n.getAge() > 30).count();
        System.out.println("Count " + age);
    }

    public static void countGender(List<Person> personlist) {
        long male = personlist.stream().filter(n -> n.getGender().equals("male")).count();
        System.out.println("male " + male);
        long female = personlist.stream().filter(n -> n.getGender().equals("female")).count();
        System.out.println("female " + female);
    }

    public static Person createPerson(String s) {
        String[] strArray = s.split(",");
        Person person = new Person();
        person.setName(strArray[0].trim());
        person.setSurname(strArray[1].trim());
        person.setGender(strArray[2].trim());
        person.setAge(Integer.valueOf(strArray[3].trim()));
        return person;
    }
}


