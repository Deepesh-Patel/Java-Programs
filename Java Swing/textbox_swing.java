import javax.swing.*;
class textbox_swing
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 60, 20);
		
		f.add(tf);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}