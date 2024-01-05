package General;

//abstract is used for data hiding.

abstract class Operators {
    abstract void ADDorSUB();
}

class Addition extends Operators {
    void ADDorSUB() {
        System.out.println("Adding...");
    }
}

class Substraction extends Operators {
    void ADDorSUB() {
        System.out.println("Substracting...");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Addition circle = new Addition();
        circle.ADDorSUB();

        Substraction rectangle = new Substraction();
        rectangle.ADDorSUB();
    }
}

