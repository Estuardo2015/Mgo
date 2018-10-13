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

	TwoPropRentPrice blueRent = new TwoPropRentPrice(3, 8);
	PropertySet bluePropertySet = new PropertySet(blueRent);
	bluePropertySet.addProperty();
	bluePropertySet.addProperty();
	bluePropertySet.addProperty();
	bluePropertySet.addProperty();
	bluePropertySet.addProperty();
	bluePropertySet.removeProperty();
	bluePropertySet.removeProperty();
	bluePropertySet.addProperty();
	bluePropertySet.removeProperty();
	bluePropertySet.removeProperty();
	bluePropertySet.removeProperty();

	
	System.out.println(bluePropertySet.getRent());

	ThreePropRentPrice greenRent = new ThreePropRentPrice(2, 4, 7);
	PropertySet greenPropertySet = new PropertySet(greenRent);
	greenPropertySet.addProperty();
	greenPropertySet.addProperty();
	System.out.println(greenPropertySet.getRent());


	FourPropRentPrice railRent = new FourPropRentPrice(1, 2, 3, 4);
	PropertySet railPropertySet = new PropertySet(railRent);

	railPropertySet.addProperty();
	railPropertySet.addProperty();
	railPropertySet.addProperty();
	railPropertySet.addProperty();
	railPropertySet.addProperty();
	railPropertySet.addProperty();
	System.out.println(railPropertySet.getRent());

    }
}
