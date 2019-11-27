package jg_lv.HomeWork;

public class BookTest {
    public static void main(String[] args) {
        Book Mio =new Book();

        Mio.setAuthor("A.Lindgrēne");
        Mio.setTitle("Mio,manu Mio");
        Mio.setPageCount(148);

        Book Saeculum =new Book();

        Saeculum.setAuthor("Urzula Poznanski");
        Saeculum.setTitle("Saeculum");
        Saeculum.setPageCount(400);

        Book Princis = new Book();

        Princis.setAuthor("Antuāns de Sent-Ekziperī");
        Princis.setTitle("Mazais princis");
        Princis.setPageCount(96);

        System.out.println(Mio);
        System.out.println(Saeculum);
        System.out.println(Princis);
    }
}
