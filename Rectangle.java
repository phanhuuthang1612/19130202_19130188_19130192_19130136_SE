/**
 * 
 */
package shape;

/**
 * @author songndc
 *
 */
public class Rectangle extends AShape {
	private int height;
	private int width;

	/**
	 * @param loc
	 */
	public Rectangle(CartPt loc) {
		super(loc);
		
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param loc: vi tri cua goc trai tren
	 * @param height: chieu cao
	 * @param width: chieu rong
	 */
	public Rectangle(CartPt loc, int height, int width) {
		super(loc);
		this.height = height;
		this.width = width;
	}


	/* (non-Javadoc)
	 * @see shape.AShape#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

	/* (non-Javadoc)
	 * @see shape.AShape#contains(shape.CartPt)
	 */
	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		int x = this.loc.getX();
		int y = this.loc.getY();
		return x<point.getX() && point.getX()<x+this.width
				&& y<point.getY() && point.getY()<y+this.height;
	}

	/* (non-Javadoc)
	 * @see shape.AShape#boudingBox()
	 */
	@Override
	public Square boudingBox() {
		// TODO Auto-generated method stub
		if(this.height<this.width){
			return new Square(new CartPt(this.loc.getX(),
					this.loc.getY()-(this.width-this.height)/2),this.width);
		}else {
			if(this.height>this.width){
				return new Square(new CartPt(this.loc.getX()-(this.height-this.width)/2,
						this.loc.getY()),this.height);
			}else
				return new Square(this.loc,this.height);
			
		}
		
	}

}
