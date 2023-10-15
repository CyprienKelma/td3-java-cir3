package td3;

public abstract class ProgrammationEmission extends Emission {

    ProgrammationEmission(String name) {
        super(name);
    }

    ProgrammationEmission(String name, int duree) {
        super(name, duree);
    }

    // Calcul l'heure de fin de la diffusion
    public abstract int calculerFin(int debut);

    // Vérifie si elle est programmable
    public abstract boolean estProgrammable(int debut);
}