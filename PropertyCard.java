/*
 Nick Soetaert

 Parent: Card
 Children: NormalPropertyCard, WildPropertyCard, RainbowPropertyCard
*/

import java.util.HashSet;
import java.util.Set;

public abstract class PropertyCard extends Card {
    protected PropertyColor currColor;
    //ONLY FOR WILDS  - public Set<PropertyColor> propertyColors = new HashSet<>();

    public PropertyColor getCurrColor(){
	return currColor;
    }
}
