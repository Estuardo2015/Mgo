/*
 Nick Soetaert
*/

//Parent: RentActionCard
//Child: N/A

public class NormalRentActionCard extends RentActionCard{

    public NormalRentActionCard(PropertyColor color1, PropertyColor color2){
        this.colors.add(color1);
	this.colors.add(color2);
	_value = 1;
    }
}
