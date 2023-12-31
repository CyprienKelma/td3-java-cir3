package td3;

/*
 * Puisque les thèmes son fixé parmis 3 possibles, on peut utiliser un enum "Theme"
 * pour mieux les représenter et éviter d'utiliser un thème incorrect.
 */

enum Theme {
    // On fixe les 3 seules valeurs de thèmes possibles
    INFORMATION("Information"),
    ANIMALIER("Animalier"),
    CULTUREL("Culturel");

    // Puis on créer un champ pour chaque instance de Theme
    private final String themeName;

    // Notre constructeur
    Theme(String themeName) {
        this.themeName = themeName;
    }

    // Si l'on souhaite retrouver le thème de notre reportage
    public String getThemeName() {
        return themeName;
    }
}

/*
 * Classe "fille" (extension d'Emission) représentant les émissions de type
 * "Reportage"
 */
public class Reportage extends ProgrammationEmission {

    Theme theme;

    Reportage(String name, int duree, Theme theme) {
        super(name, duree);
        this.theme = theme;
    }

    // Ici les getters et setters sont fait à la main

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme newTheme) {
        this.theme = newTheme;
    }

    // Pour la question 2 :

    @Override
    public int calculerFin(int debut) {
        return debut + getDuree();
    }

    @Override
    public boolean estProgrammable(int debut) {
        if (getDuree() > 1) {
            return false;
        }
        if ((debut >= 14 && debut <= 18) || (debut >= 0 && debut <= 6)) {
            return true;
        } else {
            return false;
        }
    }

}