package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonEx1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("click!");
		JTextField tf = new JTextField();
		tf.setBounds(100, 150, 80, 30);
		f.add(tf);
		f.add(b);
		b.setBounds(100,100,80,30);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("클릭!");
				tf.setText("출력");
			}
			
		});
		f.setSize(400, 300);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

}
