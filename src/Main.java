class Animal {
    public void makeSound() {
        System.out.println();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("냐옹");
    }
}

class Capybara extends Animal {
    @Override
    public void makeSound() {
        System.out.println("끽");
    }
}

class Quokka extends Animal {
    @Override
    public void makeSound() {
        System.out.println("퀔퀔!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Capybara();
        Animal a4 = new Quokka();

        Animal[] animals = {a1,a2,a3,a4};

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }
    }
}