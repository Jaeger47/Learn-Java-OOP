import javax.swing.JFrame;
import javax.swing.JButton;

public class GUI {
	private JFrame frame;
	private JButton button;
	private int width;
	private int height;
	
	//constructor to initialize GUI components
	public GUI(int w, int h) {
		frame = new JFrame();//initialize JFrame
		button = new JButton("button");//initialize JButton
		width = w;
		height = h;
	}
	
	//public method to setup the GUI
	public void setUpGUI() {
		frame.setSize(width,height);//setting window size
		frame.setTitle("Hello GUI");//setting window name
		frame.add(button);//adding button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to make the program close when clicking the x button
		frame.setVisible(true);//to make the window visible
	}

}
