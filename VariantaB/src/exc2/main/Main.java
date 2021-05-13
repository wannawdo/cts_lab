package exc2.main;

import exc2.builder.BuilderConcret;
import exc2.builder.Rezervare;

public class Main {

	public static void main(String[] args) {
		BuilderConcret bc=new BuilderConcret();
		Rezervare r1=bc.setAsezareLaGeam(true).setGenMuzica("Jazz").creeazaRezervare();
		System.out.println(r1);

	}

}
