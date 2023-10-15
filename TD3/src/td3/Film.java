package td3;


/*
  * Classe "fille" (extension d'Emission) représentant les émissions de type "Film"
  */
public class Film extends Emission {

    private int anneeRealisation;
    private String nomRealisateur;
    private boolean isRediff;

    Film(String nom, int duree, int anneeRealisation, String nomRealisateur, boolean isRediff){
        super(nomRealisateur, duree);
        this.anneeRealisation = anneeRealisation;
        this.nomRealisateur = nomRealisateur;
        this.isRediff = isRediff;
    }
}