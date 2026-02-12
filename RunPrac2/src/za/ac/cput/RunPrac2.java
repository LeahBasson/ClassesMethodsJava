package za.ac.cput;

import javax.swing.JOptionPane;

public class RunPrac2 {
    
    public static void main(String[] args) {
       
        // Can only use a String for input then you will have to use casting.
        String radInput = JOptionPane.showInputDialog("Enter radius: ");
        double radius = Double.parseDouble(radInput);
        
        // construct circle object
        Circle circle = new Circle(radius);
        
        double diameter = circle.calDiameter();
        
        JOptionPane.showMessageDialog(null, "The diameter is: " + diameter);
        
    }
    
}
