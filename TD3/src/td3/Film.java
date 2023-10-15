package td3;

/*
  * Classe "fille" (extension d'Emission) représentant les émissions de type "Film"
  */
public class Film extends ProgrammationEmission {

    private int anneeRealisation;
    private String nomRealisateur;
    private boolean isRediff;

    Film(String nom, int duree, int anneeRealisation, String nomRealisateur, boolean isRediff) {
        super(nomRealisateur, duree);
        this.anneeRealisation = anneeRealisation;
        this.nomRealisateur = nomRealisateur;
        this.isRediff = isRediff;
    }

    // Pour la question 2 :

    @Override
    public int calculerFin(int debut) {
        if (isRediff) {
            // Rediff => n'importe quand dans la journée
            return (debut + getDuree());
        } else {
            // Pas une rediff => forcément à 21h
            return (21 + getDuree());
        }
    }

    @Override
    public boolean estProgrammable(int debut) {
        if (isRediff) {
            // Si c'est une rediff, alors possible n'importe quand
            return true;
        } else if (debut == 21) {
            // Si pas une redif, mais pour 21h
            return true;
        } else {
            // Dans le cas contraire (pas redif ET pas 21h)
            return false;
        }
    }

    // Puisque c'est toujours pareil, les getters et setters sont ici créées
    // automatiquement avec IntelliJ par gains de temps ...
    // (J'espère que cela ne vous dérange pas, c'est pour avoir moins de redondance
    // !)

    /**
     * @return int return the anneeRealisation
     */
    public int getAnneeRealisation() {
        return anneeRealisation;
    }

    /**
     * @param anneeRealisation the anneeRealisation to set
     */
    public void setAnneeRealisation(int anneeRealisation) {
        this.anneeRealisation = anneeRealisation;
    }

    /**
     * @return String return the nomRealisateur
     */
    public String getNomRealisateur() {
        return nomRealisateur;
    }

    /**
     * @param nomRealisateur the nomRealisateur to set
     */
    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    /**
     * @return boolean return the isRediff
     */
    public boolean isIsRediff() {
        return isRediff;
    }

    /**
     * @param isRediff the isRediff to set
     */
    public void setIsRediff(boolean isRediff) {
        this.isRediff = isRediff;
    }

}