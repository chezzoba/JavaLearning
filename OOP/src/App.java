public class App {
    public static void main(String[] args) throws Exception {
        Car mycar = new Car();

        mycar.drive();

        System.out.println(mycar);

        Human rick = new Human("Rick", 65, 70);
        Human morty = new Human("Morty", 32, 80);

        morty.eat();

        Diceroller diceroller = new Diceroller();

        mycar.go();

        Bicycle bike = new Bicycle();
        bike.go();

        Hero batman = new Hero("Batman", 42, "€€€");
        System.out.println(batman);

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
