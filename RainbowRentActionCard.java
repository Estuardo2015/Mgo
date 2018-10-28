/*
 Nick Soetaert
*/

//Parent: RentActionCard
//Child: N/A

public class RainbowRentActionCard extends RentActionCard{

    public RainbowRentActionCard(){
	_value = 3; //Card value is 3 million
	_numTargets = NumTargets.ONE; //May only be played on one target

	rentColors.add(PropertyColor.BROWN);
	rentColors.add(PropertyColor.BLUE);
	rentColors.add(PropertyColor.GREEN);
	rentColors.add(PropertyColor.LIGHT_BLUE);
	rentColors.add(PropertyColor.ORANGE);
	rentColors.add(PropertyColor.PINK);
	rentColors.add(PropertyColor.RED);
	rentColors.add(PropertyColor.YELLOW);
	rentColors.add(PropertyColor.RAIL);
	rentColors.add(PropertyColor.UTIL);
   }
}

