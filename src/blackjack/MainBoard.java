package blackjack;

import java.util.Scanner;



public class MainBoard {

	public static void main(String[] args) {

		Deck boardDeck = new Deck();
		Dealer dealer = new Dealer();
		Scanner sc = new Scanner(System.in);
		String name;
		int money;
		int betMoney;
		
		
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("                        BlackJack 게임을 시작합니다.                         ");
		System.out.println("                       !!!인생 역전의 꿈을 여기서!!!                        ");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
//		System.out.println("이름을 입력하세요");	// 매번 실행해 보기 번거로우니 주석처리
//		name = sc.next();
//		System.out.println("가지고 있는 금액을 입력하세요($)");
//		money = sc.nextInt();
//		Player player1 = new Player(money, name);

		Player player1 = new Player(5000, "Lee");
		
		
		while(true) {
			
			
			
			boardDeck.shuffle();
			
			for (int i = 0; i<10; i++) { // 사기방지를 위한 카드 50장 제거
			boardDeck.outCard();
			}
			boardDeck.count = boardDeck.count - 50;
			
			
			player1.showPlayerMoney();
			System.out.println();
			if (player1.playerMoney == 0) { // 소유 금액이 없다면 쫓아냄
				break;
			}
			
			System.out.println("배팅할 금액을 입력하세요($)(상한선 없음)");
			System.out.println("그만 두실려면 '0'을 입력해주세요");
			betMoney = sc.nextInt();
			
			if(betMoney == 0) {  // 그만두기
				System.out.println("다음에 또 오세요");
				break;
			}
			
			player1.bet(betMoney);
			

			for (int i = 0;  i <10; i++) {
				
				player1.hand.add(boardDeck.outCard());
				dealer.hand.add(boardDeck.outCard());
				player1.hand.add(boardDeck.outCard());
				dealer.hand.add(boardDeck.outCard());
				
				System.out.println("◆◆◆◆현재 패 상황◆◆◆◆");
				System.out.println("");
				System.out.println("Dealer : " + dealer.hand.get(0).mark);
				System.out.println("Player : " + player1.hand.get(0).mark + " / " + player1.hand.get(1).mark);
				System.out.println("");
				System.out.println(boardDeck.count);
				
//				break;
				
			}
			
			break;
			
		
		
		
		}
		
		
	}

}
