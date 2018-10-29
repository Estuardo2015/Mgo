/*
 Nick Soetaert

 PassGoActionCard.java

 Parent: ActionCard
 Children: N/A
*/
public class PassGoActionCard extends ActionCard{
        //Pre: No args are given
        //Post: A PassGoActionCard is constructed
    public PassGoActionCard(){
        _numTargets = NumTargets.ONE;
        _value = 1;
    }
}

