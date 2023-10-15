package td3;


 /*
  * Classe "mère" représentant les émissions au sens large
  */
public class Emission {
    
    private String name;
    private int duree;

    Emission(String name, int duree){
        this.name = name;
        this.duree = duree;
    }

}