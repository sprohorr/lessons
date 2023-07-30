package homework9.library;

import java.util.Arrays;

public class Reader {
    private String name;
    private String surname;
    private String fatherName;
    private int libraryCardNumber;
    private static int counterBook;

    public Reader(String surname, String name, String fatherName, int libraryCardNumber) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.libraryCardNumber = libraryCardNumber;
    }

    public Reader() {
    }

    public void takeBook(int counterBook) {
//        Выводит на консоль сообщение "Петров В. В. взял 3 книги".
        Reader.counterBook += counterBook;
        System.out.println(surname + " " + name.charAt(0) + ". " + fatherName.charAt(0) + ".  взял " + counterBook +
                " книги.");
    }

    //- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    public void takeBook(String... books) {
        Reader.counterBook += books.length;
        System.out.println(surname + " " + name.charAt(0) + ". " + fatherName.charAt(0) + ".  взял книги: " + Arrays.toString(books));
    }

    // - takeBook, который будет принимать переменное количество объектов класса Book (описание ниже). Метод также выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    public void takeBook(Book... books) {
        Reader.counterBook += books.length;
        System.out.println(surname + " " + name.charAt(0) + ". " + fatherName.charAt(0) + ". " + " взял книги: " + Arrays.toString(books));

    }

    public void counterBook() {
        System.out.println("Взяли всех книг: " + counterBook);
    }
}

/*
Библиотека
Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО и номер читательского билет.
Разработать программу, в которой создается массив объектов данного класса.
Перегрузить методы takeBook():
  - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
  - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
  - takeBook, который будет принимать переменное количество объектов класса Book (описание ниже). Метод также выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
Используя static, посчитать сколько раз читатели брали какие-либо книги.
Cоздать класс Book(используется как параметр в методе takeBook), Book должен содержать
  - название
  - автора книги
  - имя библиотеки (одинаковое для всех книг, например, Национальная библиотека)
  - метод, выводящий на конcоль сообщение: "Все книги принадлежат библиотеке: Национальная библиотека"
 */