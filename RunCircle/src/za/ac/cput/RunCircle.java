package za.ac.cput;

import javax.swing.JOptionPane;


public class RunCircle {

    
    public static void main(String[] args) {
        // Can only use a String for input then you will have to use casting.
        String input = JOptionPane.showInputDialog("Enter radius: ");
        double radius = Double.parseDouble(input);
        
        // construct circle object
        Circle circle = new Circle(radius);
        
        JOptionPane.showMessageDialog(null, "The radius is: " + radius);
        JOptionPane.showMessageDialog(null, "The diameter is: " + circle.diameter());
        JOptionPane.showMessageDialog(null, "The circumference is: " + circle.circumference());
        JOptionPane.showMessageDialog(null, "The area is: " + circle.area());
    }
    
}
