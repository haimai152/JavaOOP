package bt_abstract;

public class Book extends Artikel{
    String writer = "Hai";
    String genre = "fiction";
    @Override
    public void addArtikel() {
        System.out.println("Add book: "+writer + "-" + genre);
    }

    @Override
    public void removeArtikel() {
        System.out.println("Remove book: "+writer + "-" + genre);
    }

}
