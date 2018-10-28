public class Main {
    public static void main(String args[])
    {
	NormalRentActionCard blueGreenRent = 
	 new NormalRentActionCard(PropertyColor.BLUE, PropertyColor.GREEN);

	RainbowRentActionCard rainbowRent = new RainbowRentActionCard();

	NormalPropertyCard boardwalk =
	 new NormalPropertyCard(PropertyColor.BLUE);

	System.out.println(boardwalk.getName());
	System.out.println(boardwalk.getCurrColor());
	System.out.println(boardwalk.getValue());
	System.out.println(boardwalk.getCanPutInBank());

	WildPropertyCard w = new WildPropertyCard(PropertyColor.GREEN, PropertyColor.BLUE);
   }
}
