public class Monkey{
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
        if(drink == "grape juoce" || drink == "tea"){
            System.out.println("the monkey is drinking " + drink);
        }else{
            System.out.println("the monkey does not drink " + drink);
        }
    }

}
