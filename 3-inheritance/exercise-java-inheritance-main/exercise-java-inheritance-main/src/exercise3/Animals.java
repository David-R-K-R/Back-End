package exercise3;

public class Animals {

    protected String name;

    public Animals(String name){
        this.name=name;
    }

    public void sleep(){
        System.out.println(name+" sleeps");
    }

    public void eat(){
        System.out.println(name+" eats");
    }

    public String getName(){
        return this.name;
    }
}
