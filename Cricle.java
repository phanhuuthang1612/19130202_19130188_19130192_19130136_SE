package shape;

/*
 * Lop dinh nghia hinh tron thuoc hinh, gom co
 * - Tam (center - CartPT)
 * - Ban Kinh (radius)
 */
public class Cricle extends AShape{
	private int radius;
	public Cricle(CartPt center, int radius) {
		super(center);
		this.radius = radius;
	}
	@Override
	/*
	 * (non-Javadoc)
	 * @see shape.IShape#area()
	 */
	public double area() {
		// TODO Auto-generated method stub
		return this.radius*this.radius*Math.PI;
	}
	/* (non-Javadoc)
	 * @see shape.AShape#contains(shape.CartPT)
	 */
	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
	
		return this.loc.distanceToPoint(point)<this.radius;
	}
	/* (non-Javadoc)
	 * @see shape.AShape#boudingBox()
	 */
	@Override
	public Square boudingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc.translate(this.radius,this.radius),
				this.radius*2);
	}
	
	
	
	
}
