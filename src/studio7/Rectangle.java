package studio7;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int givenlength, int givenwidth)
	{
		length = givenlength;
		width = givenwidth;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}

	public int Area() {
		int Area = length * width;
		return Area;
	}

	public int Perimeter() {
		int Perimeter = (length + width) * 2;
		return Perimeter;
	}

	public boolean compareArea(Rectangle secondrectangle) {
		if (this.Area() < secondrectangle.Area()) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleOne = new Rectangle (3, 4);
		Rectangle rectangleTwo = new Rectangle (50, 70);
		rectangleOne.Area();
		rectangleOne.Perimeter();
		rectangleOne.compareArea(rectangleTwo);
		rectangleOne.isSquare();
		System.out.println("Area: " + rectangleOne.Area());
		System.out.println("Perimeter " + rectangleOne.Perimeter());
		System.out.println("Compared: " + rectangleOne.compareArea(rectangleTwo));
		System.out.println("Is Square?  " + rectangleOne.isSquare());
	
	}

}
