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

	WildPropertyCard w = new WildPropertyCard(PropertyColor.BLUE, PropertyColor.GREEN);
	w.setCurrColor(PropertyColor.BLUE);
	System.out.println(w.getValue());
	System.out.println(w.getCurrColor());
	w.setCurrColor(PropertyColor.GREEN);
	System.out.println(w.getCurrColor());

	RainbowPropertyCard r = new RainbowPropertyCard();
	r.setCurrColor(PropertyColor.PINK);
	System.out.println(r.getCurrColor());
	r.setCurrColor(PropertyColor.RED);
	System.out.println(r.getCurrColor());
	System.out.println(r.getValue());
	System.out.println(r.getName());
	System.out.println(r.getCanPutInBank());
	
	

   }
}
