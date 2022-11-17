
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ω√¿€");
		
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("≥°");
			}
			
		});
		th.start();

		for(int i=0; i<5000;i++) {
			System.out.println("*****");
		}
	}

}
