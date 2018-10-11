/*
 Nick Soetaert
*/

//Parent: RentActionCard
//Child: N/A

public class RainbowRentActionCard extends RentActionCard{

    public RainbowRentActionCard(){
	_value = 3; //Card value is 3 million
	_numTargets = NumTargets.ONE; //May only be played on one target


	colors.add(PropertyColor.BROWN);
	colors.add(PropertyColor.BLUE);
	colors.add(PropertyColor.GREEN);
	colors.add(PropertyColor.LIGHT_BLUE);
	colors.add(PropertyColor.ORANGE);
	colors.add(PropertyColor.PINK);
	colors.add(PropertyColor.RED);
	colors.add(PropertyColor.YELLOW);
	colors.add(PropertyColor.RAIL);
	colors.add(PropertyColor.UTILITY);
    }
}

