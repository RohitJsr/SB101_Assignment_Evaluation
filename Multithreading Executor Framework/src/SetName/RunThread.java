package SetName;

public class RunThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<25;i++) {
			String tname= Thread.currentThread().getName();
			System.out.println(tname +" id running");
		}
	}
	public static void main(String[] args) {
		RunThread job= new RunThread();
		Thread one = new Thread(job);
		Thread two = new Thread(job);
		one.setName("Dhoni Thread...");
		two.setName("Kholi thread...");
		
		one.start();
		two.start();
	}

}
