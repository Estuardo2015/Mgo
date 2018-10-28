/*
 Nick Soetaert
 October 9, 2018
*/

//Parent: ActionCard
//Child: NormalRentActionCard, RainbowRentActionCard


import java.util.HashSet;
import java.util.Set;

public abstract class RentActionCard extends ActionCard {

    public Set<PropertyColor> rentColors = new HashSet<>();

	//return if a rent card contains that color or not
    public boolean contains(PropertyColor color){
	return rentColors.contains(color);
    }

}


