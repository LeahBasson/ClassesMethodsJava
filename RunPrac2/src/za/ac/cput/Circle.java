
package za.ac.cput;

import static java.lang.Math.PI;
        
public class Circle {

    // attributes
    private double radius;

    // constructors
    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }
    
    // setter and getter methods
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double calDiameter(){
        return 2 * radius;
    }
    
    public double circumference(){
        return 2 * PI * radius;
    }
}
