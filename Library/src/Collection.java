import java.util.ArrayList;

public class Collection {
    
    private static ArrayList<BookLibrary> listBooks = new ArrayList<>();//Atributo

    //method GET devolve o array list tipado em livro livraria
    public static ArrayList<BookLibrary> getlistBooks(){
        return listBooks;
    }
    
    //method add objct in list = obj type LivroLibrary.
    static public void adicionar(BookLibrary l){
        listBooks.add(l);
    }
    
    //lista os dados de todos os objetos da lista
    static public String list(){
        String output = "";
        //iterando sobra a lista de livros
        int i = 1;
        if (listBooks.isEmpty()){
            output = "There are no registered books";
        }else{
            for (BookLibrary l : listBooks){
                output += "\n======| Books Nº "+(i++)+ " |=======\n";
                output += l.printOut();
            } 
        }  
        return output; 
    }
    
    //method search por genero devolve um inteiro
    static public int search(String genre){
        int qtd = 0;

        for(BookLibrary l : listBooks){
            if(l.getGenre().equalsIgnoreCase(genre)){
                qtd++;
            }
        }
        return qtd;
    }

    //method remover por titulo, retornando boolean
    static public boolean remover(String title){
        if (listBooks.isEmpty()){
           System.out.println("The collections is empty");
        }else{
            for(BookLibrary l : listBooks){
                if(l.getTitle().equalsIgnoreCase(title)){
                    listBooks.remove(l);
                    return true;
                }
            }
        }
        return false;
    }

}
