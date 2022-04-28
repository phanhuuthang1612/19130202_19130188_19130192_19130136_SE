package shape;
/*
 * Lop dinh nghia cho 1 diem
 * x, y
 */
public class CartPt {
	private int x;
	private int y;
	public CartPt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double distanceToO() {
		// TODO Auto-generated method stub
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null || !(obj instanceof CartPt))
			return false;
		else{
			CartPt other= (CartPt)obj;
			return this.x==other.x && this.y==other.y;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+this.x+","+this.y+")";
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	public double distanceToPoint(CartPt point) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(this.x-point.x,2)+Math.pow(this.y-point.y,2));
	}
	
	/**
	 * 
	 */
	public CartPt translate(int dx, int dy){
		return new CartPt(this.x-dx,this.y-dy);
	}
}
