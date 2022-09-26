public class TestJava {

    public static void main(String[] args) {
      int epargne = 500;
      int revenus = 2000;

        // Ajoutez 100 à votre épargne :)
        epargne += 100;

        // Enlevez 50 à votre revenus :(
        revenus -= 50;

        // Combien de jours je vais devoir épargner
        int nombreDeJoursEpargne = (5000 - revenus) / epargne;

        // Mettez à jour à nouveau votre revenus
        revenus += (30-10)*7;

        float a = 5;
        float b = 2;
        double c = a/b;
        System.out.println(c);

        // Test des fonctions String de base avec de la concaténation
        String bornCity = "Lorient";
        String secondFavoriteCity = "Biarritz";
        int numberOfTimes = 5;
        String favorites = "I was born in " + bornCity + " and I have already travelled to " +secondFavoriteCity + " " + numberOfTimes + " times !";
                System.out.println(favorites);
    }


}