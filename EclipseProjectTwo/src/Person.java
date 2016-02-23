/**
 * 
 */

/**
 * @author Gil
 *
 */

public class Person {

//Private Instance Variables 
private String _gender;
private String _name;
private int _age;

    //Gender Getter Method 
	public String getGender() {
	return this._gender;
	}
	//Gender Setter Method
	public void setGender(String _gender) {
	this._gender = _gender;
	}
	
	
	//Name Getter Method
	public String get_name() {
		return this._name;
	}
	//Name Setter Method
	public void set_name(String _name) {
		this._name = _name;
	}
	
	
	public Person(int _age){
		//Constructor
		this._age = _age;
	}	
	
	
	//Public Methods (Runs) Outputs to the console
	public void runs(){
		System.out.println(this._name + "Runs");
	}
	
  }

