package question2a;

public class CustomExceptionDemo {
	public static void checkage(int age)throws InvalidAgeException
	{
		if(age<18) {
			throw new InvalidAgeException("you must 18 and above to proceed");
		}
		System.out.println("Age is valid ,Proceed");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	    	 checkage(16);
	     }
	     catch(InvalidAgeException e){
	    	System.out.println("Exception caught"+ e.getMessage()); 
	     }
	     finally {
	    	 System.out.print("Execution finished");
	     }
		
	}

}
