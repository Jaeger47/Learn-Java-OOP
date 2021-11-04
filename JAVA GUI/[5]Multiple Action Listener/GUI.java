import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {
	private JFrame frame;
	private JLabel label_1;
	private JTextField input_1;
	private JButton button_1;
	private JButton button_2;
	private int width;
	private int height;
	
	//constructor to initialize GUI components
	public GUI(int w, int h) {
		frame = new JFrame();//initialize JFrame
		input_1 = new JTextField(10);
		label_1 = new JLabel("Hello");
		button_1 = new JButton("button 1");//initialize JButton
		button_2 = new JButton("button 2");//initialize JButton
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
		content.add(label_1);
		content.add(button_1);
		content.add(button_2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to make the program close when clicking the x button
		frame.setVisible(true);//to make the window visible
	}
	
	public void setUpButtonListeners() {
		ActionListener buttonListener = new ActionListener() {//listener object
			@Override
			public void actionPerformed(ActionEvent ae) { //response
				Object button_event = ae.getSource();
				
				if(button_event == button_1) {
					System.out.println("Button 1!");
				} else if(button_event == button_2) {
					System.out.println("Button 2!");
				}
			}
		};
		
		button_1.addActionListener(buttonListener);//register the listener to the button
		button_2.addActionListener(buttonListener);//register the listener to the button
	}
	

}
