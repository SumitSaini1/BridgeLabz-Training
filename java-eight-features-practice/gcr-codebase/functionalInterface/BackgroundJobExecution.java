package FunctionalInterface;

public class BackgroundJobExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable background=()->{
			System.out.println("Executed tasks:");
			for(int i=0;i<5;i++) {
				System.out.println("Task execution is process:"+i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
					
				}
			}
		};
		Thread thread=new Thread(background);
		thread.start();
	}

}
