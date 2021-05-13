package strategy2;

public class PlataCash  implements ModPlata{

	@Override
	public void achitare(float suma) {
		System.out.println("Suma achitata: "+ suma+ " cash");
		
	}

}
