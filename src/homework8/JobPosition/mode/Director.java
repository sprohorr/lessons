package homework8.JobPosition.mode;

public class Director implements JobPosition {
    private String director = "Director";

    @Override
    public void jobTitle() {
        System.out.println("{" + director + "}");
    }
}
