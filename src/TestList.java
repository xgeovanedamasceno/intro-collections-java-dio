import list.TaskList;

public class TestList {
    public static void main(String[] args) {
        TaskList listOne = new TaskList();

        listOne.addTask("Do Dishes");
        listOne.addTask("Mop the floor");
        listOne.addTask("Make the bed");
        listOne.addTask("Cook the dinner");

        System.out.println("**");
        System.out.println(listOne.getNumberOfTask());
        listOne.getTaskDescriptions();


        listOne.removeTask("Make the bed");

        System.out.println("**");
        System.out.println(listOne.getNumberOfTask());
        listOne.getTaskDescriptions();
    }
}
