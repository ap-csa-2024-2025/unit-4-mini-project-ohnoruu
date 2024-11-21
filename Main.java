import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// No need to touch anything in here
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.println("Enter a sentence:");
		str = sc.nextLine();

		str.toLowerCase();
		algorithm1(str);
		algorithm2(str);

		sc.close();
	}

	// This method should implement Algorithm 1 and print all neccessary data
	public static void algorithm1(String input) //remove every vowel unless it is at the start
	{
		String substring = "";
		// TODO: Put solution to Algorithm 1 here
		for (int i = 0; i < input.length(); i++){
			boolean containsVowels = input.substring(i,i+1).equals("a")||input.substring(i,i+1).equals("e")||input.substring(i,i+1).equals("i")||input.substring(i,i+1).equals("o")||input.substring(i,i+1).equals("u");
			if (!containsVowels || i==0){
				substring+=input.substring(i,i+1);
			}
		}
		System.out.println(substring);
	}

	// This method should implement Algorithm 2 and print all neccessary data
	public static void algorithm2(String input) //take every unique character and follow it with the number of times it appears in the string
	{
		// TODO: Put solution to Algorithm 1 here
		for (letter = 0; letter < input.length(); letter++){ //for letter in String input
			for (int lettersBefore = 0; lettersBefore < letter; lettersBefore++){
				
			}
		}
		System.out.println("Implement me!");
	}
}
