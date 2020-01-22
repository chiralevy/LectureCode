
public class ProperBetterCard {
	private int number;
	private String suit;
	
	public ProperBetterCard(int tempNumber, String tempSuit){
		if( isValidNumber(tempNumber) ) {
			number = tempNumber;
		}else {
			System.out.println("Invalid card number: " + tempNumber);
			System.out.println("Defaulting to 1");
			number = 1;
		}
		
		suit = tempSuit;
	}
	
	public String getSuit(){
		return suit;
	}
	
	public int getNumber(){
		return number;
	}
	
	public void cheat(){
		number = 1; // ACE!
	}
	
	public boolean isValidNumber(int num) {
		return num >= 1 && num <= 13;
	}
	
	public static void main(String args[]){
		ProperBetterCard card1 = new ProperBetterCard(-1, "hearts");
		ProperBetterCard card2 = new ProperBetterCard(2, "clubs");
		
		System.out.println("Card1: " + card1.getNumber() + " of " + card1.getSuit());
		System.out.println("Card2: " + card2.getNumber() + " of " + card2.getSuit());
		
		card1.cheat();
		System.out.println("CHEATING!");

		System.out.println("Card1: " + card1.getNumber() + " of " + card1.getSuit());
		System.out.println("Card2: " + card2.getNumber() + " of " + card2.getSuit());
		
	}
}