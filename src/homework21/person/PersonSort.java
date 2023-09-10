package homework21.person;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonSort {
    private String name;
    private String surname;
    private String gender;
    private Integer age;

    public PersonSort(String name, String surname, String gender, Integer age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    static List<PersonSort> list = new ArrayList<>();

    // "C:\\Users\\User\\IdeaProjects\\text\\temp.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        readFile(filePath);
        writeFile();
        countAge();
        countGender();
    }

    private static void readFile(String filePath) {
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
    }

    public static List<PersonSort> sortPersons() {
        list.sort(Comparator.comparing(PersonSort::getName));
        return list;
    }

    public static void writeFile() {
        list = sortPersons();
        try (FileWriter writer = new FileWriter("C:\\Users\\User\\IdeaProjects\\text\\temp.txt")) {
            for (PersonSort el : list)
                try {
                    writer.write(el.getName() + "," + el.getSurname() + "," + el.getGender() + "," + el.getAge());
                    writer.write(System.getProperty("line.separator"));
                    writer.flush();
                } catch (FileNotFoundException e) {
                    System.out.println("Failed to write to the file");
                }
        } catch (IOException e) {
            System.out.println("Failed to write to the file");
        }
    }

    public static void countAge() {
        long i = list.stream().filter(n -> n.getAge() > 30).count();
        System.out.println("Count " + i);
    }

    public static void countGender() {
        long m = list.stream().filter(n -> n.getGender().equals("male")).count();
        System.out.println("male " + m);
        long f = list.stream().filter(n -> n.getGender().equals("female")).count();
        System.out.println("female " + f);
    }

    public static PersonSort createPerson(String s) {
        String[] strArray = s.split(",");
        return new PersonSort(strArray[0], strArray[1], strArray[2], Integer.valueOf(strArray[3]));
    }


}
