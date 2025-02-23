import java.util.ArrayList;
import java.util.List;


public class todolist {

        private List<todo> tasks;

        public todolist() {
            tasks = new ArrayList<>();
        }

        public void addTask(String description) {
            tasks.add(new todo(description));
        }

        public void removeTask(int index) {
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
            } else {
                System.out.println("Invalid task number!");
            }
        }

        public void markTaskAsCompleted(int index) {
            if (index >= 0 && index < tasks.size()) {
                tasks.get(index).markAsCompleted();
            } else {
                System.out.println("Invalid task number!");
            }
        }

        public void showTasks() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks in the list.");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }
        }
    }
