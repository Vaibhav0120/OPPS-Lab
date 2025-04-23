class Animal {
    Animal() {
        System.out.println("Animal constructor called.");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor called.");
    }
}

class Puppy extends Dog {
    Puppy() {
        super();
        System.out.println("Puppy constructor called.");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy(); // Triggers constructor chain
    }
}
