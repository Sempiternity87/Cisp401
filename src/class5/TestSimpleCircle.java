/*******************************************************************************
* TestSimpleCircle.java
*******************************************************************************/
package class6

/*******************************************************************************
* Test Simple Circle
*******************************************************************************/
public class TestSimpleCircle
  {
  public static void main (String[] args)
    {
    SimpleCircle circle1 = new SimpleCircle();
    SimpleCircle circle2 = new SimpleCircle(25);
    SimpleCircle circle3 = new SimpleCircle(125);
    
    System.out.printf("The area of the circle of radius %d is %d\n", circle1.radius, circle1.getArea());
    System.out.printf("The area of the circle of radius %d is %d\n", circle2.radius, circle2.getArea());
    System.out.printf("The area of the circle of radius %d is %d\n", circle3.radius, circle3.getArea());
    }
  }

/*******************************************************************************
* Simple Circle
*******************************************************************************/
public Class SimpleCircle
  {
  /*****************************************************************************
  * Properties
  *****************************************************************************/
  public double radius;
  
  /*-----------*/
  /* Accessors */
  /*-----------*/
  public double getArea()      { return Math.PI * radius * radius; }
  public double getPerimeter() { return 2 * Math.PI * radius; }
  
  public void setRadius(double newRadius) { radius = newRadius; }
  
  /*****************************************************************************
  * Constructor
  *****************************************************************************/
  public SimpleClass() { this(1); }
  public SimpleClass(double newRadius) { setRadius(newRadius) ; }
  }
