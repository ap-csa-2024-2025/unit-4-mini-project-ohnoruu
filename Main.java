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

		str=str.toLowerCase();
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
		int letterCount = 0;
		String currentLetter = "";
		String output = "";
		// TODO: Put solution to Algorithm 1 here
		//For length of total string
		for (int i=0; i < input.length(); i++){
			letterCount=0;
			//count occurences of letter in string, add accordingly to substring
			currentLetter = input.substring(i,i+1);
			for (int letter=0; letter < input.length(); letter++){ //loop through string and count occurences of letter of i
				if ((input.substring(letter, letter+1).equals(currentLetter))&&(output.indexOf(currentLetter)==(-1))&&(!currentLetter.equals(" "))){ //check if letter is unique (does not occur again)
					letterCount++;
				}
			}
		if (letterCount!=0){
			output+=letterCount;
			output+=currentLetter;
		}
		}
		System.out.println(output);
	}
}
