/*
 Nick Soetaert
 October 9, 2018
*/

public abstract class ActionCard extends Card {

    protected NumTargets _numTargets; //ONE or MANY

    public ActionCard(){
	this._canPutInBank = true;
    }
}
