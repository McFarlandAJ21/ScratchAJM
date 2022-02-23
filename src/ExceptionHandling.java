
public class ExceptionHandling {

	/** @return s repeated n times
	  * @param n should be non-negative
	  */
	public static String repeat(String s, int n) { //s = hi n = 3 -> return hihihi
	    if(n < 0){
	        throw new IllegalArgumentException("Cannot repeat a  string " + n + " times");                       //can't return negative hi
	    }
	    StringBuilder sb = new StringBuilder();

		   sb.append(s);
	   
	    return "";
	}
	
	public static String progressBar(int width, double percent){
		int numChars = (int)(Math.floor((width-2) * percent));
		return "[" + repeat("X", numChars) + "]";
	}
		
	public static void main(String[] args){
		try{
		    System.out.println(progressBar(1, 0.6));
		}
		catch (IllegalArgumentException iae){
		    System.err.println(iae.getMessage());
		}
		
	}

}
