package q2;

public class Square extends Quadrilateral
{
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	int area()
	{
		return base*height;
	}

}
