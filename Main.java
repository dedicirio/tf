import java.util.Scanner;
/**
 * Classe quer armazena o método Main, utilizado para colocar o jogo em uso.
 * 
 * @author (Joao Aiolfi)
 * @author(Gabriel Abreu)
 * @author(Andre Cirio)
 * 
 * @version (22/11/2022)
 */
class Main {
    /**
     * metodo utilizado para colocar o jogo em prática.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sudoku jogo = new Sudoku();
        
        char coluna;
        char linha;
        char valor;
        int tipoJogo = 0;
        int colunaAtual= 0;
        int linhaAtual= 0;
        String escolha = new String();
        String y = new String();
        String n = new String();
        
        System.out.println("Informe qual tabuleiro voce quer jogar\n\t  Jogo:1,2,3 ou aleatorio (4)");
        tipoJogo = in.nextInt();
        jogo.escolher(tipoJogo);
      


        while ( !jogo.fimDeJogo() ) {
            System.out.println("\t         Sudoku!");
            System.out.println("\t        =========");
            
            System.out.println( jogo.toString() );
              
            System.out.printf("Quer refazer ultima jogada? (coluna:%d)\n(linha:%d)y\n",colunaAtual, linhaAtual);
            escolha = in.nextLine();
            
            if(escolha.equals(y))
            {
            
            }
            else if(escolha.equals(n))
            {
            
            
            
            }
              

    
            System.out.println("Informe a coluna");
            coluna = in.next().charAt(0);
            colunaAtual = coluna;
            System.out.println("Informe a linha");
            linha = in.next().charAt(0);   
            linhaAtual = linha;
            System.out.println("Informe o valor");
            valor = in.next().charAt(0);   
           
            
            
            
            
            System.out.println("COLUNA = " + coluna);
            System.out.println(" LINHA = " + linha);
            System.out.println(" VALOR = " + valor);
            
            try {
                jogo.jogar(coluna, linha, valor);
            } catch (Exception e) {
                System.out.println("Jogada invalida!");
                System.out.println(e);
                
            }

        }
        in.close();

        System.out.println("\f\t         Sudoku!");
        System.out.println("\t        =========");
        System.out.println( jogo.toString() );
        System.out.println("* FIM *");

    }
}