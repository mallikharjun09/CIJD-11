package accessspecifiers;

public class Class2ASF {
	public static void main(String[] args) {
		ExampleASF obj = new ExampleASF();
		//Unable to access private members of a class
		//from the outside of that class.
		obj.showDefaultMethod();
		obj.showProtectedMethod();
		obj.showPublicMethod();
	}
}
