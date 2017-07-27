/*
 * Here we create an abstract class and override the abstract functions  in the subsequent subclasses
 */
package figure;

abstract public class Figure {                                          // abstract class declaration

    double dim1;                                                        // this variable will hold result of each caluclations that we perform 
    static final double PI = 3.141;                                     // declaring constant PI 

    abstract void findArea();                                           // abstract method findArea declaration

    abstract void findPerimeter();                                      // abstract method findPerimeter declaration

    public static void main(String[] args) {                            // main section 
        Circle objCircle = new Circle();                                // declared object of Circle and initialized
        Rectangle objRectangle = new Rectangle();                        // declared object of Rectangle and initialized
        Triangle objTriangle = new Triangle();                           // declared object of Triangle and initialized

        objCircle.setRadius(3);                                         // setting circle radious
        objCircle.findArea();                                           // output area of circle
        objCircle.findPerimeter();                                      // output perimeter of circle
        System.out.println("-----------------------------------------");

        objRectangle.setLengthWidth(6.2, 16);                               // setting length and width of rectangle
        objRectangle.findArea();                                            // output area of rectangle 
        objRectangle.findPerimeter();                                       // output perimeter of rectangle
        System.out.println("-----------------------------------------");

        objTriangle.setSideBaseHeight(6, 10, 10);                                 // setting side, base and height for triangle
        objTriangle.findArea();                                                   // output area of triangle
        objTriangle.findPerimeter();                                              // output perimeter of triangle
        System.out.println("-----------------------------------------");

    }

}

class Circle extends Figure {                    // subclass Circle created from abstract class Figure 

    double radius;                              // variable to hold radius value
                                                // formula to find area of circle A = pi * r * r  ( where e: radius) 
    @Override                                   // annotation mentioned, it populated by netbeans IDE, it explicitly annotates 
                                                // that here we are overriding a parent method
    void findArea() {

        dim1 = PI * radius * radius;                        //applying formula to find area of circle
        System.out.println("Area of Circle : " + dim1);    // show output  
    }

    public double getRadius() {                            // getter method to get radius value.
        return radius;
    }

    public void setRadius(double radius) {                 // setter to set radius value
        this.radius = radius;
    }

                                                                     // formula to find area of perimeter of circle C = 2 pi r ( where r: radius)
    @Override                                                       // annotating this is method override happening here 
    void findPerimeter() {                                          // method to find perimeter of circle
        dim1 = 2 * PI * radius;                                     // applying formula to calculate perimeter 
        System.out.println("Perimeter of circle: " + dim1);        // show output 
    }

}

class Rectangle extends Figure {                                    // class rectangle  inherits figure 

    double length;                                                  //variable to hold length value
    double width;                                                   // variable to hold width value 

                                                                     //formula to find area of rectangle  A=l.w ( where l: length, w: width) 
    @Override                                                       // annotates method overriding here 
    void findArea() {                                               // method to find area of rectable 
        dim1 = length * width;                                          //applying formula to find area of rectable 
        System.out.println("Area of Rectangle : " + dim1);         //show output 
    }

    @Override                                                                // annoteates method overriding here 
                                                                            //formula to find perimeter of rectangle  P=2(l+w) ( where l: length , w: width)
    void findPerimeter() {                                                  // method to find perimeter of rectangle
        dim1 = 2 * length + width;                                        //applying formula to find perimeter of rectangle 
        System.out.println("Perimeter of Rectangle : " + dim1);         // show output 
    }

    public double getLength() {                                     //method to get length value
        return length;
    }

    public double getWidth() {                                     // method to get width value 
        return width;
    }

    public void setLengthWidth(double length, double width) {                   //method to set length and width value 
        this.width = width;
        this.length = length;
    }

}

class Triangle extends Figure {                                                 // subclass Triangle created from abstract class Figure 

    double height;                                                            // variable to hold height value
    double base;                                                              // variable to hold base value 
    double side;                                                             // variable to hold side value 

    @Override                                                                   // annotates method overriding 
                                                                                // formula to find area of triangle  A= h.b/2 ( where h: height, b: base)
    void findArea() {                                                           // method to find area of Triangle 
        dim1 = height * base / 2;                                               // applying formula to find area of triangle
        System.out.println("Area of Triangle : " + dim1);                       // show output 
    }

                                                                                // formula to find perimter of traingle 
                                                                                // P = s1+b+s2 ( where s1: side, b: base, s2:another side)
    @Override                                                                   // annotates method overriding 
    void findPerimeter() {                                                      // method to find permeter of of triangle 
        dim1 = side + base + side;                                              // applying formula to find perimeter of Triangle
        System.out.println("Perimeter of Triangle : " + dim1);
    }

    void setSideBaseHeight(double side, double base, double height) {            //method to set base, height and side 
                                                                                // we need to collect only one side value as , both sides of a traingle
                                                                                // are always equal
        this.base = base;
        this.side = side;
        this.height = height;
    }

}
