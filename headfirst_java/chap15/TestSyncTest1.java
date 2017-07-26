class TestSync implements Runnable {
	private int balance;
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 25; i++){
			//System.out.println(Thread.currentThread().getName());
			//System.out.println(i+" begin "+balance);
			
			
			increment();
			System.out.println(Thread.currentThread().getName() + "  waibu   " +balance);
			//System.out.println("  over  ");
			//System.out.println();
		}
	}

	private void increment() {
		// TODO Auto-generated method stub
		//System.out.println("  zhixing");
		int j = balance;
		balance = j + 1;	
		//System.out.println(j+" neibu "+balance);
		//System.out.println("hhhhh");
	}
}

public class TestSyncTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.setName("Thread A");
		b.setName("Thread B");
		
		a.start();
		b.start();
	}
}