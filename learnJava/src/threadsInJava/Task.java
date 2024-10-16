package threadsInJava;

class Task implements Runnable {
    private String taskName;
    
    public Task(String taskName) {
        this.taskName = taskName;
    }
    
    @Override
    public void run() {
        System.out.println(taskName + " starts.");
        try {
            Thread.sleep(2000); // Simulating a task that takes 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " ends.");
    }
}