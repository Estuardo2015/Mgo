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
	
	System.out.println(bluePropertySet.getRent());

	RentPrice greenRent = new RentPrice(PropertyColor.GREEN);
	PropertySet greenPropertySet = new PropertySet(greenRent);
	greenPropertySet.addProperty();
	greenPropertySet.addProperty();
	System.out.println(greenPropertySet.getRent());
    }
}
