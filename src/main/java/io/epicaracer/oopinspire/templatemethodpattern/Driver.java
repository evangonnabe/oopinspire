package io.epicaracer.oopinspire.templatemethodpattern;

public class Driver {
	public static void main(String[] args) {
		/* 템플릿 메서드 패턴
		 * 상위 클래스에서 공통 로직을 수행하는 템플릿 메서드와
		 * 하위 클래스에 오버라이딩을 강제하는 abstract method 또는 
		 * 선택적으로 오버라이딩 할 수 있는 Hook method를 두는 패턴을 템플릿 메서드 패턴이라 함
		 * 
		 * 상위 클래스의 견본 메서드에서 하위 클래스가 오버라이딩한 메서드를 호출하는 패턴
		 */
		
		Animal bolt = new Dog();
		Animal kitty = new Cat();
		
		bolt.playWithOwner();
		
		System.out.println();
		System.out.println();
		
		kitty.playWithOwner();
	}
}
