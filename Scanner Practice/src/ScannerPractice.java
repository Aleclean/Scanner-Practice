import java.util.Scanner;

public class ScannerPractice
	{
	static int age;
	static double favorite;
	static String name;
	public static void main(String[] args)
		{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		System.out.println("Hello " + name + ", nice to meet you.");
		
		System.out.println("How old are you, " + name + "?");
		age = keyboard.nextInt();		
		
		if(age <= 6)
			{
			System.out.println("Only " + age + "? " + "You're young to be using a computer.");
			}
		if(age > 6 && age <= 60 )
			{
			System.out.println(age + "? " + "So you're average age.");
			}
		if(age > 60)
			{
			System.out.println("Wow " + age + ", you're old.");
			}
		
		System.out.println("Well " + name + ", enter your favorite decimal.");
		favorite = keyboard.nextDouble();
		System.out.println("Your favorite decimal is " + favorite + ", interesting.");
		}
	}
