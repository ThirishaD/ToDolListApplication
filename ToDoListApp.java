import java.util.Scanner;

public class ToDoListApp {

        public static void main(String[] args) {
            todolist toDoList = new todolist();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("\nTo-Do List Menu:");
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. Mark Task as Completed");
                System.out.println("4. Show Tasks");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        toDoList.addTask(description);
                        System.out.println("Task added.");
                        break;
                    case 2:
                        System.out.print("Enter task number to remove: ");
                        int removeIndex = scanner.nextInt();
                        toDoList.removeTask(removeIndex - 1);
                        System.out.println("Task removed.");
                        break;
                    case 3:
                        System.out.print("Enter task number to mark as completed: ");
                        int completeIndex = scanner.nextInt();
                        toDoList.markTaskAsCompleted(completeIndex - 1);
                        System.out.println("Task marked as completed.");
                        break;
                    case 4:
                        System.out.println("Your Tasks:");
                        toDoList.showTasks();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }

            scanner.close();
            System.out.println("Goodbye!");
        }
    }

