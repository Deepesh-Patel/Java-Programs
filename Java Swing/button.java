import javax.swing.*;
class button
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();

		JButton b = new JButton("click");
		b.setBounds(40, 100, 80, 30);

		f.add(b);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}