import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Inputs to reverse: ");
		String str = scanner.next();
		
		int StrLength = str.length();
		
		for(int i = 1; i < str.length() + 1; i++) {
			System.out.print(str.charAt(StrLength - i));
			
			System.out.println(i);
					
		}
	}

}
