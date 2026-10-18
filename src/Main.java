public class Main {
    public static void main(String[] args) {
        System.out.println("CSC-154 Task Tracker");
        System.out.println("Project initialized successfully.");
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Task {
        String title;
        boolean completed;

        Task(String title) {
            this.title = title;
            this.completed = false;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Task Tracker ===");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine().trim();

                    if (title.isEmpty()) {
                        System.out.println("Task title cannot be empty.");
                    } else {
                        tasks.add(new Task(title));
                        System.out.println("Task added.");
                    }
                    break;

                case "2":
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            Task task = tasks.get(i);
                            String status = task.completed
                                    ? "Completed" : "Pending";
                            System.out.printf("%d. %s [%s]%n",
                                    i + 1, task.title, status);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Enter task number: ");
                    try {
                        int number = Integer.parseInt(scanner.nextLine());

                        if (number < 1 || number > tasks.size()) {
                            System.out.println("Invalid task number.");
                        } else {
                            tasks.get(number - 1).completed = true;
                            System.out.println("Task completed.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;

                case "4":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
