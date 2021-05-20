package cts.dragomirescu.oana.g1080.pattern.singleton;

public interface IRobotSoftware {
    public void trimiteCerere(String denumire);

    public String getInformatii(String categorie);

    public void prelucrareCerere(String tip);

    public int getIdRobot();
}