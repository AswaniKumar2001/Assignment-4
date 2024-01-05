package General;

//interface is used to Achieve abstraction and its supports Multiple Inheritance.

interface Interface {
    void print();
}

    class Sum implements Interface{
        public void print(){
            System.out.println("sum is "+2+3);
        }

    public static void main(String[] args) {
        Sum obj= new Sum();
        obj.print();
    }
}
