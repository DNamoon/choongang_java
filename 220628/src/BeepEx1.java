import java.awt.Toolkit;

public class BeepEx1 {

	public static void main(String[] args) {
		Thread th = new Thread(()-> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				tk.beep();
				System.out.println("¶ò!!");
			}
		});
		//Runnable bt = new BeepTask();
//		Thread th = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0;i<5;i++) {
//					toolkit.beep();
//					System.out.println("beep!!");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//			
//		});
//		th.start();
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			System.out.println("¶ò!");
			
			
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		
//		for(int i=0;i<5;i++) {
//			System.out.println("¶ò");
//			try {Thread.sleep(500);} catch(Exception e) {}
//		}

	}

}
