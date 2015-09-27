package MainPackage;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests the triangle object
 * @author kpreed
 */
public class TriangleTest
{
	public static Triangle tri;

	/**
	 * Constructs a new triangle object for testing.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		tri = new Triangle(19.5,37,24);
	}

	/**
	 * Tests the getPerimeter method, the getArea() method and prints the toString message.
	 */
	@Test
	public void test()
	{
		assertTrue(tri.getPerimeter() == (19.5+37+24));
		assertTrue(Math.round(tri.getArea()*100)/(double)100 == 210.02);
		System.out.println(tri.toString());
	}

}
