package week11;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx(){
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		
		cp.setBackground(Color.LIGHT_GRAY); // background 색 : Light-Gray
		cp.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		cp.add(new JButton("add"));
		cp.add(new JButton("sub"));
		cp.add(new JButton("mul"));
		cp.add(new JButton("div"));
		cp.add(new JButton("Calculate"));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
