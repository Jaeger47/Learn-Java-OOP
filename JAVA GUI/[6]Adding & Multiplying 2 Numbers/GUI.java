//GUI.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI {
	private JFrame frame;
	private JLabel label_1;
	private JTextField input_1;
	private JTextField input_2;
	private JButton button_1;
	private JButton button_2;
	private int width;
	private int height;

	private int num1,num2,ans;
	private String input1,input2;

//constructor to initialize the JFrame
public GUI(int w, int h) {
	frame = new JFrame();
	button_1 = new JButton("Add");
	button_2 = new JButton("Multiply");
	label_1 = new JLabel("ANSWER");
	input_1 = new JTextField(5);
	input_2 = new JTextField(5);
	width = w;
	height = h;
}
//public method to setup the GUI
public void setUpGUI() {
	Container content = frame.getContentPane();
	FlowLayout flow = new FlowLayout();
	content.setLayout(flow);
	
	frame.setSize(width,height);//setting window size
	frame.setTitle("Hello GUI");//setting window name
	content.add(input_1);
	content.add(input_2);
	content.add(label_1);
	content.add(button_1);
	content.add(button_2);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);//to make the window visible
	}

public void setUpButtonListeners() {
	 ActionListener buttonListener = new ActionListener()	{
		 @Override
		 public void actionPerformed(ActionEvent ae) {
			Object button_event = ae.getSource();
			
			if(button_event == button_1) {
				input1 = input_1.getText();
				input2 = input_2.getText();
				num1 = Integer.parseInt(input1);
				num2 = Integer.parseInt(input2);
				ans = num1 + num2;
				label_1.setText(Integer.toString(ans));
			}else if(button_event == button_2) {
				input1 = input_1.getText();
				input2 = input_2.getText();
				num1 = Integer.parseInt(input1);
				num2 = Integer.parseInt(input2);
				ans = num1 * num2;
				label_1.setText(Integer.toString(ans));
			}
		 }
	 };
	 
	 button_1.addActionListener(buttonListener);
	 button_2.addActionListener(buttonListener);
  }


}

