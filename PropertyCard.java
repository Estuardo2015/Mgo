/*
 Nick Soetaert

 Parent: Card
 Children: NormalPropertyCard, WildPropertyCard, RainbowPropertyCard
*/

import java.util.HashSet;
import java.util.Set;

public abstract class PropertyCard extends Card {
    //private String name;  //if num_properties==2, name=wild, ==3 name=rainbow
    public Set<PropertyColor> propertyColors = new HashSet<>();
}
