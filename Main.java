
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (Joao Aiolfi, Gabriel Abreu, André cirio) 
 * @version (22/11/2022)
 */
import java.util.Scanner;

/**
 * @author marco.mangan@pucrs.br
 */
class Main {

    /**
     * 
     */
    private Main() {}

    /**
     * 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sudoku jogo = new Sudoku();

        char coluna;
        char linha;
        char valor;

        while ( !jogo.fimDeJogo() ) {
            System.out.println("\t         Sudoku!");
            System.out.println("\t        =========");

            System.out.println( jogo.toString() );

            System.out.println("Informe a coluna");
            coluna = in.next().charAt(0);
            System.out.println("Informe a linha");
            linha = in.next().charAt(0);        
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
        System.out.println("** FIM **");

    }
}