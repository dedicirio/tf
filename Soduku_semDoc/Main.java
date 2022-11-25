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
        String y;
        String n;
        
        System.out.println("Informe qual tabuleiro voce quer jogar\n\t  Jogo:1,2,3 ou aleatorio (4)");
        tipoJogo = in.nextInt();
        jogo.escolher(tipoJogo);
      


        while ( !jogo.fimDeJogo() ) {
            System.out.println("\t         Sudoku!");
            System.out.println("\t        =========");
            
            System.out.println( jogo.toString() );
            
           
              

    
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
                if(jogo.check()){
                   jogo.jogar(coluna, linha, valor); 
                }else{
                    jogo.restart();
                    System.out.println("\f O JOGO FOI REINICIADO\n 7 erros seguidos!!!");
                }
                
            } catch (Exception e) {
                System.out.println("Jogada invalida!");
                System.out.println(e);
                if(jogo.getCount()>=3){
                    jogo.ajuda(coluna, linha, valor);
                    System.out.println("\fDepois de 3 erros na mesma casa decidimos ajudar voce completando automaticamente!");
                }
                
            }

        }
        in.close();

        System.out.println("\f\t         Sudoku!");
        System.out.println("\t        =========");
        System.out.println( jogo.toString() );
        System.out.println("* FIM *");

    }
}