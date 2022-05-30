package bt_abstract;

public class Boardgame extends Artikel{
    int nrOfPlayer = 100;
    int averagePlaytime = 1000;
    @Override
    public void addArtikel() {
        System.out.println("Add game: "+nrOfPlayer + "-" + averagePlaytime);
    }

    @Override
    public void removeArtikel() {
        System.out.println("Remove game: "+nrOfPlayer + "-" + averagePlaytime);
    }
}
