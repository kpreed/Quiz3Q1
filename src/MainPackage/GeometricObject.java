package MainPackage;

/**
 * Creates the super class GeometricObject to be extended by other shape objects
 * @author gibbons
 */
public abstract class GeometricObject 
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() 
	{
		dateCreated = new java.util.Date();
	}

	/**
	 * Construct a geometric object with color and filled value
	 * @param color The color of the shape
	 * @param filled Specifies whether the shape is filled or if it's an outline
	 */
	protected GeometricObject(String color, boolean filled) 
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * @return Shape's color
	 */
	public String getColor() 
	{
		return color;
	}
	
	/**
	 * @param color New color of the shape
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/**
	 * @return Whether or not the shape is filled
	 */
	public boolean isFilled() 
	{
		return filled;
	}

	/**
	 * @param filled Sets the shape's fille status
	 */
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}

	/**
	 * @return The date the shape was created
	 */
	public java.util.Date getDateCreated() 
	{
		return dateCreated;
	}
	
	/**
	 * @return Returns a String with the date created, the color, and the filled status.
	 */
	@Override
	public String toString() 
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}