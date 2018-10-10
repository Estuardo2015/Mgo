public class Main {
    public static void main(String args[])
    {
	NormalRentActionCard rent = 
	 new NormalRentActionCard(PropertyColor.BLUE, PropertyColor.GREEN);
	RainbowRentActionCard rainbow = new RainbowRentActionCard();
	System.out.println(rent.contains(PropertyColor.BROWN));
	System.out.println(rainbow.contains(PropertyColor.BLUE));
    }
}
