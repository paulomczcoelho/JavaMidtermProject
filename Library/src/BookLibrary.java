public class BookLibrary{
    
    //Atributos
    private String title;
    private String author;
    private String genre;
    private float price;
    
    public BookLibrary() {//Default constructor//
    }
    
    //overloaded//
    public BookLibrary(String title, String author, String genre, float price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }
    //access methods getters e setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setprice(float price) {
        this.price = price;
    }

    //class method
    public String printOut(){
        return "Title: "+title+ " \nAuthor: "+author+ " \nGenre: "+genre+ 
                String.format(" \nPrice $ %.2f \n ",price); 
    }

}