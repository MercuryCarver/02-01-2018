import java.util.Scanner;
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Put in the person's First name, Last Name, Middle Initial, Career, and how old they are.");
Scanner first = new Scanner(System.in);
String name = first.nextLine();
String last = first.nextLine();
String mi = first.nextLine();
String career = first.nextLine();
int year = first.nextInt();

Constructor human = new Constructor(name, last, mi, career, year);
System.out.println(human.firstname + human.mi + human.lastname + '\n' + " Who wants to be a " + human.career + " and is " + human.year + " years old " );

Constructor human2 = new Constructor(name, last, mi, career, year);
System.out.println(human.firstname + human.mi + human.lastname + '\n' + " Who wants to be a " + human.career + " and is " + human.year + " years old " );

	
	}

	}


