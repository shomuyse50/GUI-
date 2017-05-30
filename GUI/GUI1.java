import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class GUI{
	public static void main(String[] args) {
		AlohaMan am = new AlohaMan();
	}
}

class AlohaMan implements ActionListener{
	JFrame frame;
	JButton btn1;
	JPanel panel;
	JLabel label;

	public AlohaMan(){
		frame = new JFrame("GUIはじめの一歩");
		frame.setLocation(500,250);
		frame.setSize(250,250);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1 = new JButton("tst");
		panel = new JPanel();
		label = new JLabel();

		panel.add(btn1);
		panel.add(label);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		frame.getContentPane().setLayout(new FlowLayout());
		con.add(panel);
		con.add(label);

		btn1.addActionListener(this);
		btn1.setActionCommand("tst");

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		label.setText("表示できたね");
	}
}