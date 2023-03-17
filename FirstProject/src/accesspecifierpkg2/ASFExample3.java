package accesspecifierpkg2;
import accessspecifiers.ExampleASF;

public class ASFExample3 {
	public static void main(String[] args) {
		ExampleASF obj = new ExampleASF();
		//We can access only public member from the ExampleASF class
		//because ASFExample3 is not an inherited class for ExampleASF class.
		obj.showPublicMethod();
	}
}
