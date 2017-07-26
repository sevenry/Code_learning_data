import javax.swing.*;
import java.awt.event.*;


public class TwoButtons1 {//相比SimpleGuilB没有在该类中引入接口。
	JButton button1;
	JFrame frame = new JFrame();//这行也可以添加在这里。
	public static void main (String[] args) {
		
		TwoButtons1 gui = new TwoButtons1();
		gui.go();
	}
	
	public void go() {
		//JFrame frame = new JFrame();
		//JButton button;在这里添加则在内部类中无法直接调用button
		button1 = new JButton("click me");
		
		button1.addActionListener(new LabelListener());
		//button.addActionListener(this);//出错，因为不在ActionListener接口下
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button1);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
		
	class LabelListener implements ActionListener {//相对SimpleGuilB，这里只利
	//用其中一个方法
		public void actionPerformed(ActionEvent event){
			button.setText("i'v been clicked!");
		}
	}
		
	
		
	
}