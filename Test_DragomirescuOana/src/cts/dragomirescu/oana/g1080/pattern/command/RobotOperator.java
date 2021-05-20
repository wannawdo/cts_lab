package cts.dragomirescu.oana.g1080.pattern.command;

import java.util.ArrayList;
import java.util.List;



public class RobotOperator {
List<IProcesatorCerere> listaComenzi;

public RobotOperator() {
	super();
	this.listaComenzi = new ArrayList<>();
}

public void adaugaComenzi(IProcesatorCerere procesatorCerere) {
	listaComenzi.add(procesatorCerere);
}

public void executaComanda(IProcesatorCerere procesatorCerere) {
	//listaComenzi.get(0).procesareCerere();
	listaComenzi.remove(0);
}

}
