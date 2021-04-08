package ro.ase.cts.seminar7.main;

import java.util.ArrayList;

import ro.ase.cts.seminar7.adapter.AdapterMetric;
import ro.ase.cts.seminar7.adapter.AmericanCar;
import ro.ase.cts.seminar7.adapter.Lamborghini;
import ro.ase.cts.seminar7.adapter.MoveableImperial;

public class Main {

	public static void main(String[] args) {
		ArrayList<MoveableImperial> cars = new ArrayList<MoveableImperial>();
		cars.add(new AmericanCar("Ford"));
		cars.add(new AmericanCar("Chevy"));

		Lamborghini lambo = new Lamborghini("Aventador");
		AdapterMetric adapter=new AdapterMetric(lambo);
		cars.add(adapter);
		for(MoveableImperial car:cars) {
			System.out.println("Max speed in miles is "+car.getMaxSpeedImperial());
		}

	}

}
