public class Dog {
    private String name;
    private String drink;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDrink(){
        return drink;
    }
    public void setDrink(String drink){
        this.drink = drink;
    }

    public void drink(){
        if(drink == "coffee" || drink == "orange juice"){
            System.out.println("the dog is drinking is " + drink);
        }else{
            System.out.println("the dog does not drink " + drink);
        }
    }
}
