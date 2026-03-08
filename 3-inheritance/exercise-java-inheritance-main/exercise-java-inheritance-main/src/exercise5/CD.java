package exercise5;

public class CD implements Packable {

    protected String artist;
    protected String nameCD;
    protected int publicationYear;
    protected double weight = 0.5;

    public CD(String artist, String nameCD, int publicationYear){
        this.artist=artist;
        this.nameCD=nameCD;
        this.publicationYear=publicationYear;
    }

    @Override
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return artist+" "+nameCD+" "+publicationYear;}
}
