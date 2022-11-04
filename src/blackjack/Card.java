package blackjack;

public class Card {
	
	public String mark;
	public int num;
	public Card next;
	

	public Card(int number) {		// 넣는 숫자의 나머지에 따라 카드가 바뀜
		
		int num;
		num = number % 15;
		
		if(0<num && num<11) {
			this.mark = String.valueOf(num);
			this.num = num;
		}
		else if(num == 11) {
			this.mark = "J";
			this.num = 10;
		}
		else if(num == 12) {
			this.mark = "Q";
			this.num = 10;
		}
		else if(num == 13) {
			this.mark = "K";
			this.num = 10;
		}
		else if(num == 14) {	// A가 1 or 11로 작동하는데 다른데서 구현하고자 함
			this.mark = "A";
			this.num = 11;
		}
		
	}
	
	public String getMark() {
		return mark;
	}

	
	

}
