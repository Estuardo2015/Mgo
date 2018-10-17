/*
 Nick Soetaert
 October 9, 2018
*/

import java.lang.String;

public abstract class Card {

    protected String _name;
    protected int _value;
    protected boolean _canPutInBank;


    public String getName(){
	return _name; }

    public int getValue(){
	return _value; }

    public boolean getCanPutInBank(){
	return _canPutInBank; }

}
