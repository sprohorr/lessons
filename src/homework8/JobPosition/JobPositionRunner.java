package homework8.JobPosition;

import homework8.JobPosition.mode.Accountant;
import homework8.JobPosition.mode.Director;
import homework8.JobPosition.mode.Worker;

public class JobPositionRunner {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.jobTitle();
        worker.jobTitle();
        accountant.jobTitle();
    }
}
