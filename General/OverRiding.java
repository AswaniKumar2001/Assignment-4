package General;

//taking method from parent class and overriding the same method in the child class, is known as Method OverRiding.

class Sum1{
    void add(int a, int b){
        System.out.println(a+b);
    }
}

class Sum2 extends Sum1 {
    @Override
    void add(int a, int b){
        System.out.println(a+b);;
    }
}

public class OverRiding{
    public static void main(String[] args) {
        Sum1 A = new Sum1();
        Sum1 B = new Sum2();
        A.add(2,3);
        B.add(3,5);
    }
}
