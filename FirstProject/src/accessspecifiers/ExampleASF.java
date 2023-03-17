package accessspecifiers;

public class ExampleASF {
	private void showPrivateMethod() {
		System.out.println("You've called a private method");
	}
	
	void showDefaultMethod() {
		System.out.println("You've called a default method");
	}
	
	protected void showProtectedMethod() {
		System.out.println("You've called a protected method");
	}
	
	public void showPublicMethod() {
		System.out.println("You've called a public method");
	}
	
	public static void main(String[] args) {
		ExampleASF asf = new ExampleASF();
		asf.showPrivateMethod();
		asf.showDefaultMethod();
		asf.showProtectedMethod();
		asf.showPublicMethod();
	}
}
