package threadsInJava;

public class MainClass {

	public static void main(String[] args) {
//		objectBasics();
//		collectionsBasics();
//		SingleThreadedExample();
		MultiThreadedExample();

	}

	public static void MultiThreadedExample() {
		System.out.println("Main thread starts.");

		// Creating threads for tasks
		Thread task1 = new Thread(new Task("Task 1"));
		Thread task2 = new Thread(new Task("Task 2"));
		Thread task3 = new Thread(new Task("Task 3"));

		// Starting threads
		task1.start();
		task2.start();
		task3.start();

		System.out.println("Main thread ends.");
	}

	public static void SingleThreadedExample() {
		performTask("Task 1");
		performTask("Task 2");
		performTask("Task 3");
	}

	private static void performTask(String taskName) {
		System.out.println(taskName + " starts.");
		try {
			Thread.sleep(2000); // Simulating a task that takes 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(taskName + " ends.");
	}

}
