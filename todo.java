public class todo {
        private String description;
        private boolean isCompleted;

        public todo(String description) {
            this.description = description;
            this.isCompleted = false;
        }

        public String getDescription() {
            return description;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void markAsCompleted() {
            isCompleted = true;
        }

        @Override
        public String toString() {
            return (isCompleted ? "[X] " : "[ ] ") + description;
        }
    }

