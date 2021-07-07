import javax.swing.*;
class bt
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();

		JButton b = new JButton("click");
		b.setBounds(40, 100, 80, 30);

		JTextField tf = new JTextField("Welcome");
		tf.setBounds(50, 50, 60, 20);

		f.add(b);
		f.add(tf);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}