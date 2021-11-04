import javax.swing.JFrame;

public class GUI {
	private JFrame frame;
	private int width;
	private int height;
	
	//constructor to initialize the JFrame
	public GUI(int w, int h) {
		frame = new JFrame();
		width = w;
		height = h;
	}
	
	//public method to setup the GUI
	public void setUpGUI() {
		frame.setSize(width,height);//setting window size
		frame.setTitle("Hello GUI");//setting window name
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to make the program close when clicking the x button
		frame.setVisible(true);//to make the window visible
	}

}
