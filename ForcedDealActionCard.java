/*
 Nick Soetaert

 ForcedDealActionCard.java

 Parent: ActionCard
 Children: N/A
*/
public class ForcedDealActionCard extends ActionCard{
        //Pre: No args are given
        //Post: A Foreclosure card is constructed
    public ForcedDealActionCard(){
        _numTargets = NumTargets.ONE;
        _value = 3;
    }
}
