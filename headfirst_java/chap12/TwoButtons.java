import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TwoButtons {
	
	JLabel label;
	JFrame frame;
	
	public static void main (String[] args) {
		
		TwoButtons gui = new TwoButtons();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		
		JButton labelButton = new JButton("change label");//新按钮
		labelButton.addActionListener(new LabelListener());//按钮点击后触发行为
		
		JButton colorButton = new JButton("change color");//新按钮
		colorButton.addActionListener(new ColorListener());//按钮点击后触发行为
		
		label = new JLabel("i'm a label");//标签
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
		
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event){
			label.setText("i'v been clicked!");//这里对label进行设置，就必须在类开始的
			//地方声明label
		}
	}
		
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();//没有发生改变
		}
	}	
}

class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
	}
}