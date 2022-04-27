package shape;

public interface IShape {
	/*
	 * Tinh dien tich cua 1 hinh
	 * area
	 * - Input: hinh (IShape)
	 * - Output: double
	 */
	public double area();
	public double distanceToO();
	public boolean contains(CartPt point);
	public Square boudingBox();
}

