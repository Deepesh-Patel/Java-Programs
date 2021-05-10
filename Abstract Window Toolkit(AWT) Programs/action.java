import java.awt.*;
import java.awt.event.*;
class action extends Frame implements ActionListener
{
	TextField tf;
	action()
	{
		tf = new TextField();
		tf.setBounds(60, 50, 120, 40);
		Button b = new Button("display");
		b.setBounds(184, 50, 80, 30);
		b.addActionListener(this);
		add(b);
		add(tf);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Welcome to java");
	}
	public static void main(String[] args) 
	{
		action a = new action();
	}
}