package ThreadSleeep;

public class Main implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(" Inside run  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" end of run()...");
	}
	public static void main(String[] args) {
		Main job= new Main();
		Thread t1= new Thread(job);
		t1.start();
		System.out.println(" end of main()...");
	}

}
