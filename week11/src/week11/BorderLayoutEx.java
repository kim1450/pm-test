package week11;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx(){
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		
		cp.setBackground(Color.LIGHT_GRAY); // background 색 : Light-Gray
		cp.setLayout(new BorderLayout(30,20));
		
		cp.add(new JButton("Calculate"),BorderLayout.CENTER); 
		cp.add(new JButton("add"),BorderLayout.NORTH);
		cp.add(new JButton("sub"),BorderLayout.SOUTH);
		cp.add(new JButton("mul"),BorderLayout.EAST);
		cp.add(new JButton("div"),BorderLayout.WEST);
		
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
