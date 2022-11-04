package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	ArrayList<Card> deck;
	int[] arrNum = new int[312];
	int count = 0;
	Card head;
	
	
	Random random = new Random();
	
	public void shuffle() {
		
		for(int i = 0; i < 312; i++) { // // arrNum 배열에 1 ~ 312의 랜덤 수를 집어 넣음
			
			arrNum[i] = random.nextInt(312)+1; 
            for(int j = 0; j < i; j++) 
            {
                if(arrNum[i]==arrNum[j]) { // 중복 방지
                    i--;
                }
            }
		}
		
		for (int i = 0; i < 312; i++) { // 순서대로 랜덤한 카드 넣기
		
			addCard(arrNum[i]);
		}
		
		count = 312; // 카드뭉치 숫자 
		
	}
	
	public void addCard(int data) {
		
		Card newCard;
		
		if(head == null){  // 맨 처음일때
			newCard = new Card(data);
			head = newCard;
		}
		
		else {
			newCard = new Card(data); // 수정해야함
			
			Card tempCard = head;

			tempCard = tempCard.next;
			head = newCard;

			
			
			
		}


	}
	
	public Card outCard() {  // 한장 빼기
		
		Card tempCard = head;
		
		head = tempCard.next;
		
		count--;
		
		return tempCard;
	}
	
	public void checkDeck() { // 카드 뭉치 숫자 체크
		
		System.out.println("현재 카드 숫자 : " + count);
		if(count < 51) {
			System.out.println("카드 숫자가 모자르기에 다시 셔플합니다.");
			shuffle();
		}
		
	}
	
	

}
