package io.epicaracer.oopinspire.factorymethodpattern;

public class Driver {
	public static void main(String[] args) {
		/* 팩터리 메서드 패턴
		 * 오버라이드된 메서드가 객체를 반환하는 패턴
		 * 
		 */
		
		// 팩터리 메서드를 보유한 객체들 생성
		Animal bolt = new Dog();
		Animal kitty = new Cat();
		
		//팩터리 메서드가 반환하는 객체들
		AnimalToy boltBall = bolt.getToy();
		AnimalToy kittyTower = kitty.getToy();
		
		boltBall.identify();
		kittyTower.identify();
	}
}
