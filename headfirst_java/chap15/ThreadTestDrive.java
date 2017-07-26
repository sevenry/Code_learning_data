class MyRunnable implements Runnable {

	
	public void run() {
		// TODO Auto-generated method stub
		go();

	}

	private void go() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(200);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		doMore();
	}

	private void doMore() {
		// TODO Auto-generated method stub
		System.out.println("Top of the Stack.");
		
	}

}

class ThreadTestDrive {
	public static void main (String[] args) {
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		
		myThread.start();
		System.out.println("back in main");
	}
	
}
