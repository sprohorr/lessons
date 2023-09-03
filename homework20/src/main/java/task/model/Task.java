package task.model;


import java.time.LocalDateTime;

public class Task {
    private int id;
    private String name;
    private String description;
    private StatusType statusType;
    private LocalDateTime createTime;

    public Task(int id, String name, String description, StatusType statusType, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.statusType = statusType;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", statusType=" + statusType +
                ", localDateTime=" + createTime +
                '}';
    }
}
