public class Phone {
    //Test programmation orienté Objet
    public static void main (String[] args) {
        Brand apple = new Brand("Apple");

        System.out.println(apple.brandName);

    }
    class Phone {
        int pixels;
        String model;
        Brand brand;

        public Phone(int pixels, String model, Brand brand) {
            this.pixels = pixels;
            this.model = model;
            this.brand = brand;
        }
    }

    class Brand {
        String brandName;

        public Brand(String brandName) {
            this.brandName = brandName;
        }
    }
}
