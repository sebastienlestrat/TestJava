public class TestJava {

  static String exemple = "Hello Guys !";

    public static void main(String[] args) {
        fonction1();
        fonction2();

        float a = 5;
        float b = 2;
        double c = a / b;
        System.out.println(c);

        // Test des fonctions String de base avec de la concaténation
        String bornCity = "Lorient";
        String secondFavoriteCity = "Biarritz";
        int numberOfTimes = 5;
        String favorites = "I was born in " + bornCity + " and I have already travelled to " + secondFavoriteCity + " " + numberOfTimes + " times !";
        System.out.println(favorites);


        // Boucle for
        for (int i = 0; i < 5; i++) {
            System.out.println("Claps your hands");
        }

        // Boucle While
        int numberOfTrees = 0;
        while (numberOfTrees < 15) {
            numberOfTrees += 1;
                    System.out.println("I planted "+ numberOfTrees + " trees!");
        }
        System.out.println("Yeah I have a forest on my ground xD ");
    }

     //Principe de portée d'une variable

        public static void fonction1(){
        System.out.println(exemple);
        }

        public static void fonction2(){
        System.out.println(exemple);
        }



}


class Unicorn {

  // Attributs des classes
  static int height = 170;
  static String power = "Double Infinity";
    static int minutesToSleep = 120;
    static int minutesToRun = 60;


    public static void sleep() {
    // Variable
    // Problème de portée de varaible
      System.out.println(minutesToSleep);
      System.out.println(height);
      System.out.println(power);
      System.out.println(minutesToRun);

     // Si je mets cette variable, System.out.println(minutesToRun);
    // ça ne fonctionnera pas car elle est dans la portée locale "Run"
    }

    public static void run(){

      System.out.println(minutesToRun);
        System.out.println(minutesToSleep);

     }


}