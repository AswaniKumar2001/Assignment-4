package General;

//here we are using the Different methods, with same name, this is Polymorphism.

public class Polymorphism {

    int  add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=4;
        Polymorphism A = new Polymorphism();
        System.out.println(A.add(a,b));
        System.out.println(A.add(a,b,c));
    }
}
