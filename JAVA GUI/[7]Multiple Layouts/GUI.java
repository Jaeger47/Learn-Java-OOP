//GUI.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI {
private JFrame frame;
private JLabel label_1;
private JLabel label_2;
private JTextField input_1;
private JButton button_1;
private JButton button_2;
private int width;
private int height;
private JPanel panel_1;
private JPanel panel_2;

//constructor to initialize the JFrame
public GUI(int w, int h) {
	frame = new JFrame();
	panel_1 = new JPanel();
	panel_2 = new JPanel();
	input_1 = new JTextField(10);
	label_1 = new JLabel("Hello");
	label_2 = new JLabel("World");
	button_1 = new JButton("START");
	button_2 = new JButton("STOP");
	width = w;
	height = h;
}
//public method to setup the GUI
public void setUpGUI() {
	Container content = frame.getContentPane();	
	FlowLayout flowFrame = new FlowLayout(FlowLayout.CENTER);
	FlowLayout flowPanel = new FlowLayout(FlowLayout.CENTER);
	BoxLayout box = new BoxLayout(panel_1,BoxLayout.PAGE_AXIS);
	
	content.setLayout(flowFrame);
	
	panel_1.setBackground(Color.green);
	panel_1.setLayout(box);
	panel_1.setPreferredSize(new Dimension(250,200));
	
	panel_2.setBackground(Color.blue);
	panel_2.setLayout(flowPanel);
	panel_2.setPreferredSize(new Dimension(250,200));
	
	panel_1.add(label_1);
	panel_1.add(button_1);
	label_1.setAlignmentX(Component.CENTER_ALIGNMENT);
	button_1.setAlignmentX(Component.CENTER_ALIGNMENT);
	button_1.setPreferredSize(new Dimension(100, 50));
		
	button_1.setBackground(Color.cyan);
	label_2.setForeground(Color.white);
	
	panel_2.add(label_2);
	panel_2.add(button_2);
	panel_2.add(input_1);

	frame.setSize(width,height);//setting window size
	frame.setTitle("Hello GUI");//setting window name
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.add(panel_1);
	frame.add(panel_2);
	
	frame.setVisible(true);//to make the window visible
	}

public void setUpButtonListeners() {
		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Object button_event = ae.getSource();
				
				if(button_event == button_1) {
					System.out.println("START BUTTON");
				}else if(button_event == button_2) {
					System.out.println("STOP BUTTON");
				}
			}
		};
		
		button_1.addActionListener(buttonListener);
		button_2.addActionListener(buttonListener);
	}
}

