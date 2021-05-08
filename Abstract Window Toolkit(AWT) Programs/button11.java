import java.awt.*;
class button11 extends Frame
{
	button11()
	{
		Button b = new Button("click");
		b.setBounds(40, 100, 80, 30);
		add(b);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		button11 bb = new button11();
	}
}
