package cts.dragomirescu.oana.g1080.main;

import cts.dragomirescu.oana.g1080.pattern.singleton.Robot;
import cts.dragomirescu.oana.g1080.pattern.state.Cerere;

public class Main {

	public static void main(String[] args) {
		System.out.println(" ------SINGLETON-----\n");
		Robot r1 = Robot.creareInstanta("Dexter", 1, 2013, 15.7f, "DELL");
		Robot r2 = Robot.creareInstanta("JIM", 2, 2013, 15.7f, "ASUS");
		System.out.println(r1);
		System.out.println(r2);
		
		
		System.out.println(" ------STATE-----\n");
		Cerere cerere=new Cerere(1,"Cererea 1","Cerere transfer", "De solicitare", 12, true);
		cerere.avizareDecanat();
		cerere.verificare();
		cerere.respingere();
		
		
		Cerere cerere2=new Cerere(1,"Cererea 1","Cerere transfer", "De solicitare",3, false);
		cerere.confirmare();
		cerere.verificare();
		cerere.avizareDecanat();
	
		
		System.out.println(" ------COMMAND-----\n");
		
	}

}
