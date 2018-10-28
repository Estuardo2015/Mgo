/*
 Nick Soetaert
 October 27, 2018

 WildPropertyCard.java

 Parent: PropertyCard
 Children: N/A
*/
import java.util.Set;
import java.util.HashSet;

public class RainbowPropertyCard extends PropertyCard {

    public Set<PropertyColor> colors = new HashSet<>();

	//Pre: No arguments are given
	//Post: A RainbowPropertyCard is constructed
    public RainbowPropertyCard(){

	_canPutInBank = false;
	_value = 0;
	_name = "Rainbow Property Card";

        colors.add(PropertyColor.BROWN);
        colors.add(PropertyColor.BLUE);
        colors.add(PropertyColor.GREEN);
        colors.add(PropertyColor.LIGHT_BLUE);
        colors.add(PropertyColor.ORANGE);
        colors.add(PropertyColor.PINK);
        colors.add(PropertyColor.RED);
        colors.add(PropertyColor.YELLOW);
        colors.add(PropertyColor.RAIL);
        colors.add(PropertyColor.UTIL);

    }

    public void setCurrColor(PropertyColor c){
	currColor = c;
    }
}
