import java.util.Scanner;

public class AppLivroLivraria{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        int menu;
        double vInicial, vFinal;
        
        LivroLivraria objLivro;

        String titulo, autor, genero;
        float preco;
        int cod;
        
        do{
            exibirMenu();
            menu = input.nextInt();

            switch(menu){
                case 1:
                    //cadastro do livro
                    System.out.println("Digite o titulo: ");
                    titulo = inputString.nextLine();
                    System.out.println("Digite o autor:");
                    autor = inputString.nextLine();
                    System.out.println("Digite o genero:");
                    genero = inputString.nextLine();
                    System.out.println("Digite o cod:");
                    cod = input.nextInt();
                    System.out.println("Digite o preço:");
                    preco = input.nextFloat();
                     
                    //criar objeto da classe
                    objLivro = new LivroLivraria(titulo, autor, cod, genero, preco);
                    
                    //guardar no ArrayList
                    Acervo.adicionar(objLivro);
                    
                    break;
                case 2:
                    System.out.println("===> Listagem de Livros");
                    System.out.println(Acervo.listar());
                    break;
                case 3:
                    System.out.println("Exclusão do livro");
                    System.out.println("Digite o titulo do livro");
                    titulo = inputString.nextLine();

                    if( ! (Acervo.getListarLivros().isEmpty())){
                        if (Acervo.remover(titulo)) {
                            System.out.println("Livro removido com sucesso");
                        }else{
                            System.out.println("Titulo não encontrado!");
                        }    
                    }else{
                        System.out.println("Não existe livros no acervo!");
                    }
                    break;
                case 4:
                    System.out.println("Pesquisar por genero");
                    System.out.println("Digite o genero");
                    genero = inputString.nextLine();
                    System.out.println("Existem " + Acervo.pesquisar(genero)
                        + "Livro(s) do genero " + genero);
                    break;
                case 5:
                    System.out.println("====>Pesquisa por faixa de preço");
                    System.out.println("Digite a faixa inicial e a final:");
                    vInicial = input.nextDouble();
                    vFinal = input.nextDouble();

                    System.out.println("Existem " + Acervo.pesquisar(vInicial, vFinal)
                        + "livros(s) com preço entre "
                        + String.format("$ %.2f e $ %.2f \n", vInicial, vFinal));
                    break;
                case 6:
                    System.out.println("===> Total em $ de livros no Acervo");
                    System.out.println("O total é: " + 
                                        String.format("$ %.2 \n", Acervo.calcTotalAcervo() ));
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida!!");    
            }

        }while (menu !=7);
       
        input.close();
        input.close();
    }
    
    static void exibirMenu(){
        System.out.println("=============| LIVRO LIVRARIA |===============");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - LISTAR");
        System.out.println("3 - EXCLUIR LIVRO");
        System.out.println("4 - PESQUISAR POR GENERO");
        System.out.println("5 - PESQUISAR POR FAIXA DE PREÇO");
        System.out.println("6 - CALCULAR TOTAL DO ACERVO");
        System.out.println("7 - SAIR");
        System.out.println("===> Escolha um opção: ");
    }

    

}