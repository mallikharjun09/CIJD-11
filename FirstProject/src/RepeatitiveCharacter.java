
public class RepeatitiveCharacter {
	void greet() {
		System.out.println("Welcome to functions");
	}
	public static void main(String[] args) {
		//Declaration phase
		//ClassName  objectName
		RepeatitiveCharacter obj1,obj2,obj3,obj4;
		
		//Instantiation
		//objectName = new ClassName();
		obj1 = new RepeatitiveCharacter();
		obj2 = new RepeatitiveCharacter();
		
		//Calling functions
		//objectName.functionName();
		obj1.greet();
		obj1.greet();
		obj2.greet();
		obj2.greet();
		obj2.greet();
	}
}	
