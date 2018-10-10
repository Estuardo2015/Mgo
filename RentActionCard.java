/*
 Nick Soetaert
 October 9, 2018
*/

//Parent: ActionCard
//Child: NormalRentActionCard, RainbowRentActionCard


import java.util.HashSet;
import java.util.Set;

public abstract class RentActionCard extends ActionCard {

    public Set<PropertyColor> colors = new HashSet<>();

    public boolean contains(PropertyColor color){
	return colors.contains(color);
	//return if a rent card contains that color or not
    }

}


