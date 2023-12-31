package week11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnnoyClassListener extends JFrame{
	public AnnoyClassListener() {
		setTitle("Annoy Class Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =getContentPane();
		c.setBackground(Color.YELLOW);
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("기말고사");
		btn.setBackground(Color.GREEN);
		btn.setBackground(Color.BLACK);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("방학 시작")) {
					b.setText("기말고사");
				}else {
					b.setText("방학 시작");
				}
				
				setTitle(b.getText());
			}
		});
		
		c.add(btn);
		
		setSize(450,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnnoyClassListener();

	}

}
