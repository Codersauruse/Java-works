import javax.swing.JOptionPane;
public class Hypotenus_of_a_traingle {

	public static void main(String[] args) {
		double a ;// these a,b,c lenthes of a traingle.
		double b ;
		double c ;
		// TODO Auto-generated method stub
		 a = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("please enter the  length of triangle"));
		 javax.swing.JOptionPane.showInternalMessageDialog(null, "you have entered a number to " + a);
		 b = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("please enter the  length of triangle"));
		 javax.swing.JOptionPane.showInternalMessageDialog(null, "you have entered a number to " + b);
         double z = (a*a + b*b);
         c = Math.sqrt(z);
         javax.swing.JOptionPane.showInternalMessageDialog(null, "hypotenus of triangle is = " + c);
	}

}
