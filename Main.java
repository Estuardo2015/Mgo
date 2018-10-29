public class Main {
    public static void main(String args[])
    {
	Player p1 = new Player("Nick");

	DebtCollectorActionCard dc = new DebtCollectorActionCard();

	DoubleTheRentActionCard dr = new DoubleTheRentActionCard();
	ForcedDealActionCard fd = new ForcedDealActionCard();
	SlyDealActionCard sd = new SlyDealActionCard();
	BirthdayActionCard b = new BirthdayActionCard();

	NormalRentActionCard blueGreenRent = 
	 new NormalRentActionCard(PropertyColor.BLUE, PropertyColor.GREEN);

	RainbowRentActionCard rainbowRent = new RainbowRentActionCard();

	NormalPropertyCard boardwalk =
	 new NormalPropertyCard(PropertyColor.BLUE);

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
	
	ForeclosureActionCard f = new ForeclosureActionCard();

   }
}
