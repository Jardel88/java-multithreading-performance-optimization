package multithreading.create;

public class ThreadCreation {
	
	public static void main(String[] args) throws Exception {
		/*	
		Thread thread = new Thread(() -> {		
		}); 
		*/
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("We are now in thread " + Thread.currentThread().getName());
				System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
				
			}
		});
		
		thread.setName("New Worker Thread");
		
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Weare in thread: " + Thread.currentThread().getName() + " before start a new thread");
		thread.start();
		System.out.println("Weare in thread: " + Thread.currentThread().getName() + " after start a new thread");
		
		Thread.sleep(10000);
	}

}
