package td3;

import java.util.ArrayList;
import java.util.List;

// Question 3 :

public class ProgrammeTelevision {

    // On commence par créer une liste d'émissions en guise de champs :
    private List<ProgrammationEmission> emissions;

    public ProgrammeTelevision() {
        emissions = new ArrayList<>(); // On initialise la liste
    }

    // Puis on crée le getter de la liste d'émissions :
    public List<ProgrammationEmission> getEmissions() {
        return emissions;
    }

    // On ajoute une émission à la liste :
    public void ajouterEmission(ProgrammationEmission emission) {
        emissions.add(emission);
    }

    // On supprime une émission de la liste :
    public void supprimerEmission(ProgrammationEmission emission) {
        emissions.remove(emission);
    }

    // Questions 3 :

    // A) Pour afficher le programme télé :
    public void afficherProgramme() {
        System.out.println("Programme de la soirée :");
        for (ProgrammationEmission emission : emissions) {
            System.out.println("- " + emission.getName() + " à : " + emission.getDuree() + "h.");
        }
    }

    // B) Je n'ai pas réussi à tester s’il y a une superposition de programmation

    // C) Pour afficher heure par heure les émissions programmées :
    public void afficherProgrammeHeureParHeure() {
        for (int heure = 0; heure < 24; heure++) {
            System.out.println("Heure : " + heure + "h");
            for (ProgrammationEmission emission : emissions) {
                int heureDebut = emission.getDebut();
                int heureFin = emission.calculerFin(heureDebut);
                if (heure >= heureDebut && heure < heureFin) {
                    System.out.println(emission.getName());
                }
            }
        }
    }

}