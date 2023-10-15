package td3;

/*
 * Classe "fille" (extension d'Emission) représentant les émissions de type "Divertissement"
 */
public class Divertissement extends ProgrammationEmission {

    /*
     * Bien que l'on est defini une "duree" puisque la solution est fondé sur
     * l'héritage,
     * on impose des émissions de 2 heures :
     */
    private static final int FIXED_DURATION = 2;

    private String animateurName;

    Divertissement(String name, String animateur) {
        super(name);
        this.duree = FIXED_DURATION;
        this.animateurName = animateur;
    }

    // Ici les getters et setters sont fait à la main

    public String getAnimateurName() {
        return animateurName;
    }

    public void setAnimateurName(String newName) {
        this.animateurName = newName;
    }

    // pour la question 2 :
    @Override
    public int calculerFin(int debut) {
        return debut + FIXED_DURATION;
    }

    @Override
    public boolean estProgrammable(int debut) {
        return (debut >= 18 && debut <= 23);
    }

}