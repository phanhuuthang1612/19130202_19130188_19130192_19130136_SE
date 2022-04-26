package shape;

import junit.framework.TestCase;

public class IShareTest extends TestCase{
	public void testConstructor(){
		CartPt p1= new CartPt(4,5);
		CartPt p2= new CartPt(10,4);
		
		IShape d1= new Dot(p1);
		IShape d2= new Dot(p2);
		Dot d3 = new Dot(p1);
		
		IShape s1=new Square(p1,6);
		IShape s2=new Square(p2,10);
		
		IShape c1=new Cricle(p1,6);
		s1= new Cricle(p2,3);
	}
	/*
	 * Test ham tinh dien tinh (area)
	 */
	public void testArea(){
		CartPt p1= new CartPt(4,5);
		CartPt p2= new CartPt(10,4);
		
		IShape d1= new Dot(p1);
		IShape d2= new Dot(p2);
		Dot d3 = new Dot(p1);
		
		IShape s1=new Square(p1,6);
		IShape s2=new Square(p2,10);
		
		IShape c1=new Cricle(p1,6);
		s1= new Cricle(p2,3);
		
		assertEquals(d1.area(), 0, 0.001);
		assertEquals(s2.area(),100,0.001);
		assertEquals(c1.area(), 6*6*Math.PI,0.001);
		String s;
	
	}
	public void testBoudingBox(){
		CartPt p1= new CartPt(4,5);
		CartPt p2= new CartPt(10,4);
		
		IShape d1= new Dot(p1);
		IShape d2= new Dot(p2);
		Dot d3 = new Dot(p1);
		
		IShape s1=new Square(p1,6);
		IShape s2=new Square(p2,10);
		
		IShape c1=new Cricle(p1,6);
		s1= new Cricle(p2,3);
		
		assertEquals(d1.boudingBox(), new Square(p1,0));
		
		AShape r1=new Rectangle(p1,4,6);
		
		assertEquals(r1.boudingBox(), new Square(new CartPt(4,4),6));
	}

}
