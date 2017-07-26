import javax.swing.*;
import java.awt.event.*;


public class SimpleGuilB implements ActionListener{//接口引入
	JButton button;
	
	public static void main (String[] args) {
		SimpleGuilB gui = new SimpleGuilB();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		button.addActionListener(this);//向按钮注册
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
		
	public void actionPerformed(ActionEvent event){//在接口下完成行为
		button.setText("i'v been clicked!");
		
	}
		
	
}