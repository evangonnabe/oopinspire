package io.epicaracer.oopinspire.adapterpattern;

public class ClientWithAdapter {
	
	public static void main(String[] args) {
		//Adapter pattern
		//호출당하는 쪽의 메서드를 호출하는 쪽의 코드에 대응하도록 중간에 변환기를 통해 호출하는 패턴 
		
		AdapterServicA asa1 = new AdapterServicA();
		AdapterServicB asb1 = new AdapterServicB();
		
		asa1.runService();
		asb1.runService();
	}
	
	
	
	
}
