package shape;
/**
 * Lop dinh nghia cho hinh vuong
 * goc CartPT, canh (size)
 */
class Square extends AShape {
	
	private int size;
	public Square(CartPt orgin, int size) {
		super(orgin);
		this.size = size;
	}
	@Override
	/**
	 * (non-Javadoc)
	 * @see shape.IShape#area()
	 */
	public double area() {
		// TODO Auto-generated method stub
		return this.size*this.size;
	}
	/* (non-Javadoc)
	 * @see shape.IShape#contains(shape.CartPT)
	 */
	@Override
	public boolean contains(CartPt point) {
		// TODO Auto-generated method stub
		int x=this.loc.getX();
		int y=this.loc.getY();
		return x<point.getX() && point.getX()<x+this.size
				&& y<point.getY() && point.getY()<y+this.size;
	}
	/* (non-Javadoc)
	 * @see shape.IShape#boudingBox()
	 */
	@Override
	public Square boudingBox() {
		// TODO Auto-generated method stub
		return new Square(this.loc,this.size);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof Square))
			return false;
		else{
			Square other=(Square)obj;
			return this.loc.equals(other.loc)&&this.size==other.size;
		}
	}
	
	
	
}
