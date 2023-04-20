package multithreading.create;

public class ThreadCreation2 {
	
	public static void main(String[] args) throws Exception {
		
		Thread thread = new NewThread();
		thread.start();
	}
	
	private static class NewThread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello from " + Thread.currentThread().getName());
		}
	}
}
