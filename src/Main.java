import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
                        break;
                    }

                    System.out.print("Enter description (optional): ");
                    String description = scanner.nextLine().trim();

                    System.out.print("Enter status (Pending/Completed): ");
                    String status = scanner.nextLine().trim();

                    if (!status.equalsIgnoreCase("Pending") &&
                        !status.equalsIgnoreCase("Completed")) {
                        System.out.println("Invalid status. Task not created.");
                        break;
                    }

                    status = status.equalsIgnoreCase("Completed")
                            ? "Completed" : "Pending";

                    tasks.add(new Task(title, status, description));
                    System.out.println("Task added successfully.");
                    break;

                case "2":
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            Task task = tasks.get(i);
                            System.out.printf("%d. %s [%s]%n",
                                    i + 1, task.getTitle(), task.getStatus());

                            if (!task.getDescription().isEmpty()) {
                                System.out.println("   " + task.getDescription());
                            }
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
                            tasks.get(number - 1).setStatus("Completed");
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
