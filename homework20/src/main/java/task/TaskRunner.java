package task;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import task.model.StatusType;
import task.model.Task;
import task.service.TaskService;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class TaskRunner {
    public static void main(String[] args) throws SQLException, JsonProcessingException {
        TaskService taskService = new TaskService();
        taskService.createTask(new Task(1, "task", "", StatusType.ACTIVE, LocalDateTime.now()));
        Task task = taskService.readTask(1);

        //json
        ObjectMapper objectMapper = new ObjectMapper();
        //JavaTimeModule is required to support LocalDateTime with json-format
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        String studentAsStr = objectMapper.writeValueAsString(task);
        System.out.println(studentAsStr);
    }

    private static class JavaTimeModule extends Module {
        @Override
        public String getModuleName() {
            return null;
        }

        @Override
        public Version version() {
            return null;
        }

        @Override
        public void setupModule(SetupContext setupContext) {

        }
    }
}
