/**
 * 
 */
package shape;

/**
 * @author songndc
 * 
 *
 */
public abstract class AShape implements IShape {

	protected CartPt loc;
	
	public AShape(CartPt loc) {
		super();
		this.loc = loc;
	}

	/* (non-Javadoc)
	 * @see shape.IShape#area()
	 */
	public abstract double area();

	@Override
	public double distanceToO() {
		// TODO Auto-generated method stub
		return this.loc.distanceToO();
	}

	
	public abstract boolean contains(CartPt point) ;
	public abstract Square boudingBox();

	

}

