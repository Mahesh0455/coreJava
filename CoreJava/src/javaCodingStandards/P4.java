package javaCodingStandards;

/*
 * Variable names standards,
 * usually variable names are nouns, should starts with small letter
 * and if it contains multiple words, then every inner word should start with 
 * uppercase letter, using camel case convention
 * 
 * eg.
 * name
 * age
 * salary
 * firstName
 * =================================
 * 
 * Coding standars for constants
 * MAX_VALUE
 * MAX_PRIORITY
 * NORM_PRIORITY
 * PI
 * usually constants names are nouns, should contains onlyupper case letters
 * if it contains multiple word then these word are separated by underscore symbol...	
 * 
 * NOte: usually we can declare constants with public static final modifiers
 * 
 * ===============================
 * java bean coding standards...
 * 
 * Java bean is simple java class, with private members/properties and public methods
 * 
 * 
 * 
 * 
 */

public class P4{
	
	private String name;
	
	private boolean empty;
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmpty(boolean empty) {
		this.empty=empty;
	}
	
	public boolean isEmpty() {
		return empty;	
	}

}
