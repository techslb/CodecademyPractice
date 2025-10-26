package blackjack;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Midnight Blackjack");
		Dealer newDealer = new Dealer(52, 0, "none");
		
		System.out.println(newDealer.numberOfCards);
		
		//Scanner input = new Scanner(System.in);
	}

}
