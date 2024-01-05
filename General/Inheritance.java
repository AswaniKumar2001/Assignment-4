package General;

//access data from parent class to child class.

class Person{
    String name = "Aswin";
}

class Inheritance extends Person {
    int age = 22;
    public static void main(String[] args) {
        Inheritance Details = new Inheritance();
        System.out.println(Details.name);
        System.out.println(Details.age);
    }
}
