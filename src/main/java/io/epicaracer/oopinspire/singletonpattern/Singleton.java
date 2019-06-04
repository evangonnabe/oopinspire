package io.epicaracer.oopinspire.singletonpattern;

public class Singleton {
	static Singleton singletonObject; //정적 참조 변수
	
	private Singleton() {
		
	} //private 생성자 (인스턴스 생성 불가능)
	
	public static Singleton getInstance() {
		if(singletonObject == null) {
			singletonObject = new Singleton();
		}
		
		return singletonObject;
	}
}
