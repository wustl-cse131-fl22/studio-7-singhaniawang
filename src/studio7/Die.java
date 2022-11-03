package studio7;

public class Die {
	private int sides;
	
	public Die(int sides) 
	{
		this.sides = sides;
	}
	
	public int diceThrow()
	{
		return (int) (this.sides*Math.random()+1);
	}

	public static void main(String[] args) 
	{
		Die dice1 = new Die(6);
		System.out.println("Throw 1: " + dice1.diceThrow());
	}
}
