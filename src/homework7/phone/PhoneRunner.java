package homework7.phone;

import homework7.phone.Phone;

public class PhoneRunner {
    /*
    "Инкапсуляция" ограничевает доступ к переменным в полях класса.
     В методе receiveCall использована "перегрузка"- механизм реализующий "Полиморфизм"
     */
    public static void main(String[] args) {
        Phone subscriber = new Phone();
        Phone subscriber2 = new Phone();
        Phone subscriber3 = new Phone();
        subscriber.receiveCall("Bob", 100001);
        subscriber2.receiveCall("Anny", 100002);
        subscriber3.receiveCall("Fred", 100003);
        System.out.println(subscriber.receiveCall());
        System.out.println(subscriber2.receiveCall());
        System.out.println(subscriber3.receiveCall());
        subscriber2.sendMessage(100002, 100003, 100001);
    }
}
