package td3;


 /*
  * Classe "fille" (extension d'Emission) représentant les émissions de type "Divertissement"
  */
public class Divertissement extends Emission{
    
    private String animateurName;

    Divertissement(String name, int duree, String animateur){
        super(name, duree);
        this.animateurName = animateur;
    }

}