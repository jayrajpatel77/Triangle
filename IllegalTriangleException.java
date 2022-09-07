
public class IllegalTriangleException extends Exception {
	
	
	public IllegalTriangleException(String string) {
		
		super(string);
	}
	
	public IllegalTriangleException() {

		super("The Triangle cannot be created");
	}

	

}
