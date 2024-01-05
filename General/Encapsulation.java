package General;

//Encapsulation, here we are using Setter and Getter to access and set the instance variables.

class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name=newName;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("Aswin");
        System.out.println(obj.getName());
    }
}

