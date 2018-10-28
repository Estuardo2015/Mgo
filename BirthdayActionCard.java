/*
 Nick Soetaert

 BirthdayActionCard.java

 Parent: ActionCard
 Children: N/A
*/
public class BirthdayActionCard extends ActionCard{
        //Pre: No args are given
        //Post: A BirthdayActionCard is constructed
    public BirthdayActionCard(){
	//Note: Only card besides normal rent where you have multiple targets
        _numTargets = NumTargets.MANY;
        _value = 2;
    }
}

