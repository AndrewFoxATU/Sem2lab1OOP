package ie.atu.productv3;
import ie.atu.productv5.Music;
import ie.atu.productv5.TV;

public class ProductDB {
    public static Product getProduct(String productCode) {
        //  public static Book or Software getProduct(String productCode) {
        // In a more realistic application, this code would get the data for the product from a file or database
        // For now, this code just uses if/else statements to return the correct product data

        //We need all the book and software objects, but what kind of object do we return?



        Product myProduct = null;
        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            //myBook = new ie.atu.productv1.Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            //myBook = new ie.atu.productv1.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            //myBook = new ie.atu.productv1.Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }





        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            //mySoftware = new ie.atu.productv2.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            //mySoftware = new ie.atu.productv2.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            //mySoftware = new ie.atu.productv2.Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        if (productCode.equalsIgnoreCase("Music1")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setArtist("Artist1");
            myMusic.setDescription("Artist1 Desc");
            myMusic.setPrice(57.50);
            myMusic.setLabel("Artist1 music");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("Music2")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setArtist("Artist2");
            myMusic.setDescription("Artist2 Desc");
            myMusic.setPrice(57.50);
            myMusic.setLabel("Artist2 music");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("Music3")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setArtist("Artist3");
            myMusic.setDescription("Artist3 Desc");
            myMusic.setPrice(57.50);
            myMusic.setLabel("Artist3 music");
            myProduct = myMusic;
        }




        if (productCode.equalsIgnoreCase("TV1")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setScreenSize("1920x1080");
            myTV.setDescription("TV1 Desc");
            myTV.setPrice(57.50);
            myTV.setManu("TV1 Manufacture");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("TV2")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setScreenSize("1920x1080");
            myTV.setDescription("TV2 Desc");
            myTV.setPrice(57.50);
            myTV.setManu("TV2 Manufacture");
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("TV3")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setScreenSize("1920x1080");
            myTV.setDescription("TV3 Desc");
            myTV.setPrice(57.50);
            myTV.setManu("TV3 Manufacture");
            myProduct = myTV;
        }


    return myProduct;
    }
}

