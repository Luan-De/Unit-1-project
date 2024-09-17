https://www.online-java.com/gF19nQZRbP
// Names: Jaskaran and Luan  Date: 9/16/24  Title: Typical day at EHS
import java.util.Scanner;
class Main{
	public static void main(String[ ] args){
		Scanner input = new Scanner(System.in);
		// Asking for string inputs
		System.out.println("Enter a past tense verb: ");
		String verb = input.nextLine();
		System.out.println("Enter an animal ");
		String animal = input.nextLine(); 
		System.out.println("Enter a weapon ");
		String weapon = input.nextLine();
		System.out.println("Enter a teacher ");
		String teacher = input.nextLine(); 
        System.out.println("Enter a friend ");
		String friend = input.nextLine(); 
        System.out.println("Enter an adjective ");
		String adjective = input.nextLine(); 
        System.out.println("Enter a food ");
		String food = input.nextLine(); 
		// Asking for integer inputs
        System.out.println("Enter a integer ");
        int integer = input.nextInt(); 
        // Asking for double inputs
        System.out.println("Enter a decimal number ");
		double doubleNum = input.nextDouble(); 
		// Asking for boolean inputs
		System.out.println("Did you yell cowabunga? true or false ");
		boolean booleanx = input.nextBoolean();
		


		System.out.print("I " + verb +  " into Cheever's room.  There I saw a ");
		System.out.print(animal + " and it grabbed my phone and ate it.  The only choice I had was to hit it with a " + weapon + ". But suddenly, ");
		System.out.print(teacher + " stole my money and punched me! My friend " + friend + " dashed in to help and used his " + adjective + " sword to slice them up!");
		System.out.print(" Then we ate " + food + " while sitting on the bike stands. ");
		System.out.print(integer + " hispanic gangsters showed up with ski masks and began yelling at me in spanish. ");
		System.out.print(" I handed them what was leftover of my money and a " + doubleNum + " inch bird swept down and I flew it back to cheever's class. ");
		System.out.print(" mr. cheever pulled out his ruler and beat me up with it until I ");
		if (booleanx == true) { 
		    	System.out.print("yelled cowabunga!!!");
		}
		else if (booleanx == false) { 
		    	System.out.print("was about to yell cowabunga but didn't.");
		}
	}
}
