package io.epicaracer.oopinspire.singletonpattern;

public class Client {
	public static void main(String[] args) {
		/* singleton
		 * 클래스의 인스턴스, 즉 객체를 하나만 만들어 사용하는 패턴
		 * 
		 * new를 실행할 수 없도록 생성자에 private 접근 제어자를 지정한다.
		 * 유일한 단일 객체를 반환할 수 있는 정적 메서드가 필요하다.
		 * 유일한 단일 객체를 참조할 정적 참조 변수가 필요하다.
		 * 
		 * private 생성자를 갖는다.
		 * 단일 객체 참조 변수를 정적 속성으로 갖는다.
		 * 단일 객체 참조 변수가 참조하는 단일 객체를 반환하는 getinstance() 정적 메서드를 갖는다.
		 * 단일 객체는 쓰기 가능한 속성을 갖지 않는 것이 정석이다.
		 * 
		 */
//		Singleton s = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1); //모두 동일한 인스턴스(오직 하나)를 참조
		System.out.println(s2);
		System.out.println(s3);
		
		s1 = null;
		s2 = null;
		s3 = null;
		
	}
}
