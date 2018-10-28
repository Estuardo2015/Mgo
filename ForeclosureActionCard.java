/*
 Nick Soetaert

 ForeclosureActionCard.java

 Parent: ActionCard
 Children: N/A
*/
public class ForeclosureActionCard extends ActionCard{
	//Pre: No args are given
	//Post: A Foreclosure card is constructed
    public ForeclosureActionCard(){
	_numTargets = NumTargets.ONE;
	_value = 5;
    }

	//stealSet(PropertySet Player1[2]);
	//Pre: A specific card set belonging to a different player is given
	//Post: The GameMaster's move card method is called
   //public void stealSet(){}
}
