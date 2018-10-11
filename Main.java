public class Main {
    public static void main(String args[])
    {
	NormalRentActionCard blueGreenRent = 
	 new NormalRentActionCard(PropertyColor.BLUE, PropertyColor.GREEN);
	RainbowRentActionCard rainbowRent = new RainbowRentActionCard();

	System.out.println(blueGreenRent.contains(PropertyColor.BROWN));
	System.out.println(rainbowRent.contains(PropertyColor.BLUE));

	System.out.println(rainbowRent.getValue());
	System.out.println(rainbowRent.getCanPutInBank());
    }
}
