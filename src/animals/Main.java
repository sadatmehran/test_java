public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Mimo");
        dog.setDrink("coffee");
        dog.drink();


        Monkey monkey = new Monkey();
        monkey.setName("Momo");
        monkey.setDrink("tea");
        monkey.drink();


        Cat cat = new Cat();
        cat.setName("Kitty");

        cat.move(1);
        cat.move(2);
        cat.move(3);


        Bird bird = new Bird("Parrow", "Red" , "France");
        System.out.println(bird);
        bird.drink("tea");

    }
}
