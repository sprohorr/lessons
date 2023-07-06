package homework7.phone;

public class PhoneRunner {
    /*
    "Инкапсуляция" ограничевает доступ к переменным в полях класса.
     В методе receiveCall использована "перегрузка"- механизм реализующий "Полиморфизм"
     */
    public static void main(String[] args) {
        Phone subscriber = new Phone("sony", 10001);
        Phone subscriber2 = new Phone("nokia", 10002, 100);
        Phone subscriber3 = new Phone("samsung", 10003);
        System.out.println(subscriber);
        System.out.println(subscriber2);
        System.out.println(subscriber3);
        System.out.println(subscriber.receiveCall("Sasha"));
        System.out.println(subscriber2.receiveCall("Anny"));
        System.out.println(subscriber3.receiveCall("Fred"));

        System.out.println(subscriber.receiveCall("Sasha", 10001));
        System.out.println(subscriber2.receiveCall("Anny", 10002));
        System.out.println(subscriber3.receiveCall("Fred", 10003));
        subscriber.sendMessage(10001, 10002, 10003);
    }
}
