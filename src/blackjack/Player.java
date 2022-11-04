package blackjack;

import java.util.ArrayList;

public class Player {
	
	public int playerMoney;
	public String playerName;
	int playerBetMoney;
	ArrayList<Card> hand = new ArrayList<>();
	
	
	
	
	
	public Player(int playerMoney, String playerName) {
		this.playerMoney = playerMoney;
		this.playerName = playerName;
	}
	
	public void getMoney(int money) {
		this.playerMoney += money;
	}
	
	
	public void loseMoney(int money) {
		this.playerMoney -= money;
	}
	
	
	
	
	public void showPlayerMoney() {
		if (playerMoney == 0) {
			System.out.println("소유하신 금액이 없어서 이용하실 수 없습니다.");
			return;
		}
		System.out.println("현재 소유 금액 : " + playerMoney);
	}
	
	
	
	
	
	public void bet(int money) {
		
		if(money < 0) { 
			System.out.println("잘 못 입력하셨습니다.");
		}
		else if(playerMoney < money) {
			System.out.println("보유 금액만큼만 배팅할 수있습니다.");
		}
		else if(playerMoney == money) {
			System.out.println(money + "$ 올인!");
			playerMoney -= money;
		} 
		else {
			System.out.println(money + "$ 배팅");
			playerMoney -= money;
		}
	}

}
