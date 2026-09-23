package StringProgramByMe;

import java.util.Scanner;

public class FindLongestWordInAStrting {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a= sc.nextLine();
		
		String currentWord = "";
        String longestWord = "";

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);

            if (ch != ' ') {

                currentWord = currentWord + ch;

            } else {

                if (currentWord.length() > longestWord.length()) {

                    longestWord = currentWord;
                }

                currentWord = "";
            }
        }

        // Check the last word
        if (currentWord.length() > longestWord.length()) {

            longestWord = currentWord;
        }

        System.out.println("Longest word: " + longestWord);
	}

}
