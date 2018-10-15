/*
 Nick Soetaert
*/

//Parent: RentActionCard
//Child: N/A

public class NormalRentActionCard extends RentActionCard{

	//As opposed to property cards,
	//All normal rent cards have TWO colors.
    public NormalRentActionCard(PropertyColor color1, PropertyColor color2){
	_value = 1;
	_numTargets = NumTargets.MANY; //Played vs entire table
        this.rentColors.add(color1); //Put given colors into "rentColors"
	this.rentColors.add(color2);
    }
}
