package za.ac.cput;

import javax.swing.JOptionPane;

public class RunPrac2 {
    
    public static void main(String[] args) {
  
        // Can only use a String for input then you will have to use casting.
        String input = JOptionPane.showInputDialog("Enter radius: ");
        double radius = Double.parseDouble(input);
        
        // construct circle object
        Circle circle = new Circle(radius);
        
        JOptionPane.showMessageDialog(null, "The diameter: " + circle.calDiameter());
        
    }// end of main
    
}// end of class
