public class LivroLivraria{
    
    //Atributos
    private String titulo;
    private String autor;
    private int cod;
    private String genero;
    private float preco;
    
    public LivroLivraria() {//Default constructor
    }
    
    //overloaded
    public LivroLivraria(String titulo, String autor, int cod, String genero, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.cod = cod;
        this.genero = genero;
        this.preco = preco;
    }
    //access methods getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //class method
    public String imprimir(){
        return "Title: "+titulo+ " \nAutor: "+autor+ "\nCod: "+cod+ " \nGenero: "+genero+ 
                String.format(" \nPreço $ %.2f \n ",preco); 
    }







}