public class Main {
    public static void main(String args[])
    {
	NormalRentActionCard blueGreenRent = 
	 new NormalRentActionCard(PropertyColor.BLUE, PropertyColor.GREEN);
	RainbowRentActionCard rainbowRent = new RainbowRentActionCard();

	NormalPropertyCard boardwalk =
	 new NormalPropertyCard(Property.BOARDWALK);

	System.out.println(boardwalk.name);

	System.out.println(blueGreenRent.contains(PropertyColor.BROWN));
	System.out.println(rainbowRent.contains(PropertyColor.BLUE));

	System.out.println(rainbowRent.getValue());
	System.out.println(rainbowRent.getCanPutInBank());

	RentPrice blueRent = new RentPrice(3, 8);
	PropertySet bluePropertySet = new PropertySet(2, blueRent);
	bluePropertySet.addProperty();
	bluePropertySet.addProperty();
	bluePropertySet.removeProperty();
	System.out.println(bluePropertySet.getRent());
    }
}
