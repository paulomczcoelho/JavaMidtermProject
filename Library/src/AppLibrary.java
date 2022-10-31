import java.util.Scanner;

public class AppLibrary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int menu;
        
        //Referencia para o objeto da classe// 
        BookLibrary objBook;

        String title, author, genre;
        Float price;
          
        do{
            showMenu();
            menu = input.nextInt();

            switch(menu){
                case 1:
                   
                    System.out.println("Type a title: ");
                    title = inputString.nextLine();
                                  
                    System.out.println("Type an author: ");
                    author = inputString.nextLine();
            
                    System.out.println("Type a genre: ");
                    genre = inputString.nextLine();
                                                        
                    System.out.println("Type a price: ");
                    price = inputPrice.nextFloat();
                    
                    //criar objeto da classe
                    objBook = new BookLibrary(title, author, genre, price);
                    
                    //guardar no ArrayList
                    Collection.adicionar(objBook);
                    break;
                case 2:
                    System.out.println("===> Book listing");
                    System.out.println(Collection.list());
                    break;
                case 3:
                    System.out.println("Book deletion");
                    System.out.println("Enter book title");
                    title = inputString.nextLine();
                    if( ! (Collection.getlistBooks().isEmpty())){
                        if (Collection.remover(title)) {
                            System.out.println("book successfully removed");
                        }else{
                            System.out.println("title not found!");
                        }    
                    }else{
                        System.out.println("There are no books in the collection!");
                    }
                    break;
                case 4:
                    System.out.println("search by genre");
                    System.out.println("Type the genre");
                    genre = inputString.nextLine();
                    System.out.println("There is(are) " +Collection.search(genre)
                        + " Book(s) of genre " +genre);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("invalid option!!");    
            }

        }while (menu !=5);
       
        input.close();
        inputString.close();
        
        inputPrice.close();
    }
    
    static void showMenu(){
        System.out.println("=============| LIBRARY |===============");
        System.out.println("1 - REGISTER");
        System.out.println("2 - LIST");
        System.out.println("3 - DELETE BOOK");
        System.out.println("4 - SEARCH BY GENRE");
        System.out.println("5 - EXIT");
        System.out.println("===> CHOOSE AN OPTION: ");
    }

}