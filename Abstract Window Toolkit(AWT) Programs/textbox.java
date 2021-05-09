import java.awt.*;
class textbox extends Frame
{
	TextField tf, tf1;
	textbox()
	{
		Frame f = new Frame("java program");
		tf = new TextField();
		tf.setBounds(50, 50, 60, 20);
		tf1 = new TextField();
		tf1.setBounds(50, 100, 60, 20);
		f.add(tf);
		f.add(tf1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) 
	{
		textbox tt = new textbox();
	}
}