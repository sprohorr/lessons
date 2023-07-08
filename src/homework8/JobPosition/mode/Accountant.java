package homework8.JobPosition.mode;

public class Accountant implements JobPosition {
    private String accountant = "Accountant";

    @Override
    public void jobTitle() {
        System.out.println("{" + accountant + "}");
    }
}
