/*
 Nick Soetaert
 October 10, 2018

 NormalPropertyCard.java

 Parent: PropertyCard
 Children: N/A
*/

public class NormalPropertyCard extends PropertyCard {
    public Property name;
    public NormalPropertyCard(Property property){
	_value = 1;
	name = property;
//todo: Create switch statement for every single property (ugh...)
//include:
/*
 -name
 -value
 -canBank (always no - put before switch statement)
 -rent ammounts
 -canBuildStructure (how should this look for wildcards?)
*/
    }
}
