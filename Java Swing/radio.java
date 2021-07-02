import javax.swing.*;
public class radio
{
	public static void main(String args[]) 
	{
		JFrame f = new JFrame();

		JRadioButton rdb = new JRadioButton("male");
		rdb.setBounds(50, 40, 100, 30);

		JRadioButton rdb1 = new JRadioButton("female");
		rdb1.setBounds(150, 40, 100, 30);

		f.add(rdb);
		f.add(rdb1);

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
