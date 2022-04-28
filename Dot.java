package shape;
/*
 * Lop nay dinh nghia cho 1 diem 
 * CartPT p
 */
public class Dot extends AShape {

	public Dot(CartPt p) {
		super(p);

	}

	/*
	 * (non-Javadoc)
	 * @see shape.IShape#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		return this.loc.equals(point);
	}

	@Override
	public Square boudingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc,0);
	}
	
	
	
}
