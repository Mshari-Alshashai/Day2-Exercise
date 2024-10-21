import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);


//1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
        System.out.println("Enter your weight in Kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI = " + bmi);

//2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
        System.out.println("Enter your obtained marks: ");
        int marks = input.nextInt();
        System.out.println("Enter the total marks: ");
        int totalMarks = input.nextInt();
        double percentage = (marks / (double) totalMarks) * 100;
        System.out.println("Your percentage is: " + percentage + "%");

//3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
        System.out.println("Enter the amount in USD: ");
        double usd = input.nextDouble();
        double eur = usd * 0.85;
        System.out.println("The amount in EUR: " + eur);

//4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
        input.nextLine();
        System.out.println("Enter the sentence: ");
        String sentence = input.nextLine();
        System.out.println("Length of string: " + sentence.length());
        StringBuilder modified_sentence = new StringBuilder(sentence);
        modified_sentence.reverse();
        System.out.println("Reversed string: " + modified_sentence);

//5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
        System.out.println("Enter the sentence: ");
        String sentence2 = input.nextLine();
        String substring = sentence2.substring(10, 20);
        System.out.println(substring);

//6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
        System.out.println("Enter the sentence: ");
        String sentence3 = input.nextLine();
        System.out.println("Enter the Keyword: ");
        String keyword = input.nextLine();
        System.out.println("Is the keyword present? " + sentence3.contains(keyword));

//7.  Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
        System.out.println("Enter the sentence: ");
        String sentence4 = input.nextLine();
        System.out.println("Enter the word to replace: ");
        String wordToReplace = input.nextLine();
        System.out.println("Enter the new word: ");
        String newWord = input.nextLine();
        System.out.println("Modified sentence: " + sentence4.replace(wordToReplace, newWord));

//8.  Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
        System.out.println("Enter the first sentence: ");
        String sentence5 = input.nextLine();
        System.out.println("Enter the second sentence: ");
        String sentence6 = input.nextLine();
        System.out.println("Are they equal (ignoring case)? " + sentence5.equalsIgnoreCase(sentence6));

    }
}

