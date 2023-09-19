package homework23.model;

public class UserRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        cloneUser();
    }

    public static void cloneUser() {
        User user1 = new User();
        user1.setName("Bob");
        ID id1 = new ID();
        id1.setId(1234567890);
        user1.setId(id1);

        User user2 = user1;
        user2.setName("Julia");

        System.out.println("User 1 -" + user1.getName() + " " + user1.getId());
        System.out.println("User 2 -" + user2.getName() + " " + user2.getId());

        User user3 = user1.clone();
        user3.setName("User 3");
        System.out.println("User 1 -" + user1.getName());
        System.out.println("User 3 -" + user3.getName());
        System.out.println(user3.getId().equals(user1.getId()));
        user3.setName("New User3");

        System.out.println("User 1 -" + user1.getName() + " " + user1.getId());
        System.out.println("User 3 -" + user3.getName() + " " + user3.getId());
        System.out.println(user1.getName().equals(user3.getName()));

    }
}
