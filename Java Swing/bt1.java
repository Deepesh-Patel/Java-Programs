import javax.swing.*;
class bt1
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();

		JButton b = new JButton("click");
		b.setBounds(40, 100, 80, 30);

		JButton bb = new JButton("Submit");
		bb.setBounds(40, 150, 80, 30);

		JTextField tf = new JTextField("Welcome");
		tf.setBounds(50, 50, 60, 20);

		JTextField tf1 = new JTextField("to java");
		tf1.setBounds(130, 50, 60, 20);


		f.add(b);
		f.add(bb);
		f.add(tf);
		f.add(tf1);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}