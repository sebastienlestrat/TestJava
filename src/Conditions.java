public class Conditions {
    // Essai avec des conditions (if, else if, else)
    public static void main(String[] args) {

        int nombre = 5;

        if (nombre == 1) {
            System.out.println("if 1");
        } else if (nombre == 2) {
            System.out.println("if 2");
        } else {
            System.out.println("else");
        }

        // Essai avec conditions (switch, case>break, default)
        switch (nombre) {
            case 1:
                System.out.println("switch 1");
                break;
            default:
                System.out.println("default");
        }

        //Remplacez les conditions if/else par un switch qui fonctionnera d'après la valeur de la variable selectedColor
        enum Color {
            blue, green, red, yellow, dark;
        }

        Color selectedColor = Color.dark;

        if (selectedColor == Color.blue) {
            System.out.println("The color is blue");
        } else if (selectedColor == Color.green) {
            System.out.println("The color is green");
        } else if (selectedColor == Color.red) {
            System.out.println("The color is red");
        } else if (selectedColor == Color.yellow) {
            System.out.println("The color is yellow");
        } else {
            System.out.println("We do not know the color!");
        }

        switch (selectedColor) {
            case blue:
                System.out.println("The color is blue");
                break;
            case green:
                System.out.println("The color is green");
                break;
            case red:
                System.out.println("The color is red");
                break;
            case yellow:
                System.out.println("The color is yellow");
                break;
            default:
                System.out.println("We do not know the color!");
        }


    }
}
