import java.io.IOException;
import java.util.Scanner;
import java.net.URL;

public class CountChars {

	public static void main(String[] args) throws IOException {
		String address = "https://www.google.com";
		String addy = "https://www.lego.com";
		URL url = new URL(addy);
		Scanner in = new Scanner(url.openStream());

		in.useDelimiter("");
int nextInt =0;
int  nextDouble = 0;
int nextString = 0;
		// TODO: count character types
		String input = in.nextLine();

		while(in.hasNext()){
			for(int i = 0;  i < input.length(); i++) {
				if (Character.isLetter(input.charAt(i))) {
					nextInt++;
				} else if (Character.isDigit(input.charAt(i))) {
					nextDouble++;
				} else if (Character.isWhitespace(input.charAt(i))) {
					nextString++;
				}

			}
			in.next();
		}
		
		// TODO: print results to System.out
		System.out.println("Letter Count            " + nextInt);
		System.out.println("digit count             " + nextDouble);
		System.out.println("whitespace count        " + nextString);
		in.close();
	}

}
