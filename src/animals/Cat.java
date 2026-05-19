public class Cat extends Animal{
    private String name;
    private int age;
    public Animal(String name ){

    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int Age){
        this.age = age;
    }


    public void move(int step){
        System.out.println("the cat is moving the " + step + "step");
    }

}

