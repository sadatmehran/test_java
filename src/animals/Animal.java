public class Animal{
     protected String name;
     protected String color;

     public Animal(String name, String color){
        this.name = name;
        this.color = color;
     }

     public String getName(){
        return this.name;
     }

     public void setName(String name){
        this.name = name;
     }

     public String getColor(){
        return this.color;
     }

     public void setColor(String color){
        this.color = color;
     }

     public void drink(String drink){
        System.out.println("this " + name + "drink " + drink);
     }
}
