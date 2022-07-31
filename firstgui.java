package first_GUI_application;
import javax.swing.JOptionPane;

public class firstgui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Please enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
		JOptionPane.showMessageDialog(null,"hey "+ name +" you are "+ age + "years old");
	}

}
