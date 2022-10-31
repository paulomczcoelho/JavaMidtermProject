import java.util.ArrayList;

public class Acervo {
    
    private static ArrayList<LivroLivraria> listarLivros = new ArrayList<>();//Atributo

    //method GET 
    public static ArrayList<LivroLivraria> getListarLivros(){
       
        return listarLivros;
    }
    
    //method add objct in list = obj type LivroLibrary
    static public void adicionar(LivroLivraria l){
        listarLivros.add(l);
    }
    
    //lista os dados de todos os objetos da lista
    static public String listar(){
        String saida = "";
        
        //iterando sobra a lista de livros
        int i = 1;
        
        if (listarLivros.isEmpty()){
            saida = "Não existe livros cadastrado";
        }else{
            for (LivroLivraria l : listarLivros){
                saida += "\n======| Livros Nº "+(i++)+ " |=======\n";
                saida += l.imprimir();
            } 
        }  
        return saida; 
    }
    
    //method pesquisar por genero
    static public int pesquisar(String genero){
        int qtd = 0;

        for(LivroLivraria l : listarLivros){
            if(l.getGenero().equalsIgnoreCase(genero)){
                qtd++;
            }
        }
        return qtd;
    }

    //method pesquisar por preço overload
    static public int pesquisar(double vInicial, double vFinal ){
        int qtd = 0;

        for (LivroLivraria l : listarLivros){

            if(l.getPreco() >= vInicial && l.getPreco() <= vFinal){
                qtd++;
            }
        }
        return qtd;
    }

    //method remover por titulo, retornando boolean
    static public boolean remover(String titulo){
        for(LivroLivraria l : listarLivros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                listarLivros.remove(l);
                return true;
            }
        }
        return false;
    }
    
    //method total acervo
    static double calcTotalAcervo(){
        double total = 0;

        for(LivroLivraria l : listarLivros){
            total += l.getPreco();
        }
        return total;
    }


}
