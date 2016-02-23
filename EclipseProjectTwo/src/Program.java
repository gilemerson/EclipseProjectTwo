
public class Program {
	
public static Person person; //Reference to the  'Person Class'
private String _name = "";

	public static void main(String[] args) {
				
		System.out.println("Program Started..");	

		person = new Person(22);
		person.set_name("Gil");
		
		System.out.println(person.get_name());
		
		person.runs(); //printing public method to the console
		
	}

}
