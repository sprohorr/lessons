package homework8.JobPosition.mode;

public class Worker implements JobPosition {
    private String worker = "Worker";

    @Override
    public void jobTitle() {
        System.out.println("{" + worker + "}");
    }
}
