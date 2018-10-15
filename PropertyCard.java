/*
 Nick Soetaert

 Parent: Card
 Children: NormalPropertyCard, WildPropertyCard, RainbowPropertyCard
*/

import java.util.HashSet;
import java.util.Set;

public abstract class PropertyCard extends Card {
    public Set<PropertyColor> propertyColors = new HashSet<>();
}
