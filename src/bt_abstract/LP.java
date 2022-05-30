package bt_abstract;

public class LP extends Artikel{
    String nameOfArtist = "MaiHai";
    int nrOfRecord = 5000;
    @Override
    public void addArtikel() {
        System.out.println("Add game: "+nameOfArtist + "-" + nrOfRecord);
    }

    @Override
    public void removeArtikel() {
        System.out.println("Remove game: "+nameOfArtist + "-" + nrOfRecord);
    }
}
