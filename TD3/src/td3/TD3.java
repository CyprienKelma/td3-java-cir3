package td3;

public class TD3 {

    public static void main(String[] args) throws Exception {

        /* Question 1 */

        // Instance de divers objets :
        Divertissement divert1 = new Divertissement("12 Coups de Midi", "M. Durant");
        Divertissement divert2 = new Divertissement("12 Coups de Minuit", "M. Randut");

        System.out.println("divert1 nom : " + divert1.getName());
        System.out.println("divert2 nom : " + divert2.getName());
        System.out.println("divert2 nom de l'animateur : " + divert2.getAnimateurName());
        // Comme demandé, la durée des divertissements est fixé à 2 heures :
        System.out.println("divert1 durée : " + divert1.getDuree());

        // Autres tests d'émissions :
        Film film1 = new Film("Oppenheimer", 2, 2023, "Christopher Nolan", false);
        Film film2 = new Film("Da Vinci Code", 2, 2003, "Ron Howard", true);

        System.out.println("film1 durée : " + film1.getDuree());
        System.out.println("film1 nom du réalisateur : " + film1.getNomRealisateur());
        System.out.println("film2 est une rediffusion : " + film2.isIsRediff());
        System.out.println("film2 name : " + film2.getName());

        Reportage reportage1 = new Reportage("Our Planet", 3, Theme.ANIMALIER);
        System.out.println("reportage1 thème : " + reportage1.getTheme());

        /*
         * *****************************************************************************
         * *******************
         */

        // Question 2 :
        int heureDeDebut = 20; // Valeur d'exemple à modifier pour tester

        if (divert1.estProgrammable(heureDeDebut)) {
            int heureDeFin = divert1.calculerFin(heureDeDebut);
            System.out.println(
                    "Le divertissement est valide. Il commence à : " + heureDeDebut + "h et finis à " + heureDeFin
                            + "h.");
        } else {
            System.out.println("Ce divertissement ne peux pas être programmé.");
        }

        if (reportage1.estProgrammable(heureDeDebut)) {
            int heureDeFin = reportage1.calculerFin(heureDeDebut);
            System.out.println(
                    "Le reportage est valide. Il commence à : " + heureDeDebut + "h et finis à " + heureDeFin + "h.");
        } else {
            System.out.println("Ce reportage ne peux pas être programmé.");
        }

        /*
         * *****************************************************************************
         * *******************
         */

        // Question 3 :

        // !! Voir la classe ProgrammeTelevision !!

    }
}
