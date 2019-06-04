package io.epicaracer.oopinspire.factorymethodpattern;

public class Dog extends Animal {

	@Override
	AnimalToy getToy() {
		return new DogToy();
	}

}
