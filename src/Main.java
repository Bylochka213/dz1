public class Main {  // на самом деле это Test, под прикрытием :)
    public static void main(String[] args) {
        // Нельзя создать меч из пластика
        // Sword<Plastic> plasticSword = new Sword<>(new Plastic());

        Sword<Steel> steelSword = new Sword<>(new Steel());
        System.out.println("Меч из стали: " + steelSword.checkStrength()); // true
    }
}