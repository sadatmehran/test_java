public class Bird extends Animal{
    private String country;
    public Bird(String name, String color , String country){
        super(name, color);
        this.country = country;
    }

    public void fly(){
        System.out.println("the " + this.name + "is flying"  );
    }
    @Override
    public void drink(String drink){
        if(drink == "water"){
            System.out.println("the " + name + drink);
        }else{
            System.out.println("the" + name + "can not drink this " + drink );
        }
    }
}
