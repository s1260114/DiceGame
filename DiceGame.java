import java.util.Random;
import java.util.Scanner;

class Person{
    private String name;

    public Person(String na){
	name = na;
    }

    public String Name(){
	return name;
    }
}
    
class Dice{
    private int dice1,dice2;

    public Dice(int Die1, int Die2){
	dice1 = Die1;
	dice2 = Die2;
    }

    public int Die1Value(){
	return dice1;
    }

    public int Die2Value(){
	return dice2;
    }
}

public class DiceGame{
    public static void main(String[] args){
	Random random = new Random();
	Dice dice = new Dice(1+random.nextInt(6),1+random.nextInt(6));

	System.out.println("What is your name?");
	System.out.print("> ");
	
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	Person person = new Person(str);

	System.out.println("Hello, " + person.Name() + "!");
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " + dice.Die1Value());
	System.out.println("Die 2: " + dice.Die2Value());
	int total =  dice.Die1Value() + dice.Die2Value();
	System.out.println("Total value: " + total);
    }
}
	
