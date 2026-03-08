package exercise5;

public class Book implements Packable {
    protected String author;
    protected String title;
    protected double weight;

    public Book(String author, String title, double weight){
        this.author=author;
        this.title=title;
        this.weight=weight;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return author+" "+title+" "+weight;}
}
