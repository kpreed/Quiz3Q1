package MainPackage;

/**
 * Defines the Triangle object which extends the GeometricObject class
 * @author kpreed
 */
public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	/**
	 * Default constructor, sets each side length to 1
	 */
	public Triangle()
	{
		this.setSide1(1);
		this.setSide2(1);
		this.setSide3(1);
	}
	
	/**
	 * @param side1 Length of side 1
	 * @param side2 Length of side 2
	 * @param side3 Length of side 3
	 */
	public Triangle(double side1, double side2, double side3)
	{
		this.setSide1(side1);
		this.setSide2(side2);
		this.setSide3(side3);
	}
	
	/**
	 * This constructor makes it possible change the color and the filled status of the triangle.
	 * This wasn't specifically asked for but I thought it may be useful.
	 * @param side1 Length of side 1
	 * @param side2 Length of side 2
	 * @param side3 Length of side 3
	 * @param color The color of the triangle
	 * @param filled The filled status of the triangle
	 */
	public Triangle(double side1, double side2, double side3, String color, boolean filled)
	{
		this(side1,side2,side3);
		super.setColor(color);
		super.setFilled(filled);
	}
	
	/**
	 * @return The length of side 1
	 */
	public double getSide1() 
	{
		return side1;
	}
	
	/**
	 * @param side1 Sets the new length of side 1
	 */
	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}

	/**
	 * @return The length of side 2
	 */
	public double getSide2() 
	{
		return side2;
	}
	
	/**
	 * @param side2 Sets the length of side 2
	 */
	public void setSide2(double side2) 
	{
		this.side2 = side2;
	}

	/**
	 * @return The length of side 3
	 */
	public double getSide3() 
	{
		return side3;
	}
	
	/**
	 * @param side3 Sets the length of side 3
	 */
	public void setSide3(double side3) 
	{
		this.side3 = side3;
	}
	
	/**
	 * @return The area of the triangle
	 */
	@Override
	public double getArea() 
	{
		double p = this.getPerimeter()/2;
		return Math.sqrt(p*(p-this.getSide1())*(p-this.getSide2())*(p-this.getSide3()));
	}

	/**
	 * @return The perimeter of the triangle
	 */
	@Override
	public double getPerimeter() 
	{
		return this.getSide1()+this.getSide2()+this.getSide3();
	}
	
	/**
	 * @return Returns a string printing when the shape was created, the color of the shape, the filled status of the shape
	 * the length of each side, the area of the triangle, and the perimeter of the triangle.
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\nside 1: " + this.getSide1() + "\nside 2: " + this.getSide2() + "\nside 3: " + this.getSide3() + 
				"\narea: " + this.getArea() + "\nperimeter: " + this.getPerimeter();
	}
}
