package list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasksList = new ArrayList();

    public void addTask (String taskName) {
        this.tasksList.add(taskName);
    }

    public void removeTask (String taskName) {
        this.tasksList.remove(taskName);
    }

    public int getNumberOfTask () {
        return this.tasksList.size();
    }

    public void getTaskDescriptions () {
        this.tasksList.forEach(element -> System.out.println(element));
    }


}
