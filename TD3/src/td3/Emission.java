package td3;

/*
 * Classe "mère" représentant les émissions au sens large
 */
public class Emission {

    private String name;
    protected int duree;

    private int debut;

    Emission(String name) {
        this.name = name;
    }

    Emission(String name, int duree) {
        this.name = name;
        this.duree = duree;
    }

    // Puisque c'est toujours pareil, les getters et setters sont ici créées
    // automatiquement avec IntelliJ par gains de temps ...
    // (J'espère que cela ne vous dérange pas, c'est pour avoir moins de redondance
    // !)

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the duree
     */
    public int getDuree() {
        return duree;
    }

    /**
     * @param duree the duree to set
     */
    public void setDuree(int duree) {
        this.duree = duree;
    }

    /**
     * @return int return the debut
     */
    public int getDebut() {
        return debut;
    }
}