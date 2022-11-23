
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (Joao Aiolfi, Gabriel Abreu, André Cirio) 
 * @version (22/11/2022)
 */
import java.util.Random;


class Sudoku {

    private int[][] tabuleiro = new int[9][9];
    private int[][] inicial;

    /**
     * método que armazena as matrizes
     */
    public Sudoku() {
        int[][] exemplo1 = {            
                {6, 4, 1,  5, 8, 7,  3, 9, 2},
                {5, 3, 7,  1, 2, 9,  6, 8, 4},
                {2, 8, 9,  3, 6, 4,  1, 5, 7},

                {1, 7, 5,  4, 3, 6,  8, 2, 9},
                {4, 2, 6,  9, 5, 8,  7, 1, 3},
                {8, 9, 3,  7, 1, 2,  5, 4, 6},

                {9, 6, 8,  2, 7, 1,  4, 3, 5},
                {3, 1, 2,  6, 4, 5,  9, 7, 8},
                {7, 5, 4,  8, 9, 3,  2, 6, 1}

            };
            int[][] exemplo2 = {
                {5, 3, 4,  6, 7, 8,  9, 1, 2},
                {6, 7, 2,  1, 9, 5,  3, 4, 8},
                {1, 9, 8,  3, 4, 2,  5, 6, 7},

                {8, 5, 9,  7, 6, 1,  4, 2, 3},
                {4, 2, 6,  8, 5, 3,  7, 9, 1},
                {7, 1, 3,  9, 2, 4,  8, 5, 6},

                {9, 6, 1,  5, 3, 7,  2, 8, 4},
                {2, 8, 7,  4, 1, 9,  6, 3, 5},
                {3, 4, 5,  2, 8, 6,  1, 7, 9}
            };
            int[][] exemplo3 = {
                {9, 4, 5,  2, 7, 1,  8, 3, 6},
                {8, 1, 6,  3, 9, 5,  4, 2, 7},
                {7, 3, 2,  6, 8, 4,  5, 1, 7},

                {2, 5, 8,  4, 6, 7,  3, 9, 1},
                {6, 9, 4,  1, 3, 8,  7, 5, 2},
                {3, 7, 1,  5, 2, 9,  6, 4, 8},

                {4, 6, 7,  9, 5, 2,  1, 8, 3},
                {1, 2, 3,  8, 4, 6,  9, 7, 5},
                {5, 8, 9,  7, 1, 3,  2, 6, 4}
            };
            

        inicial = exemplo1;
        
        copiar(inicial, tabuleiro);
        
        verificar();
        preparar();
    }

    /**
     * metodo que copia a matriz inicial
     */
    private void copiar(int[][] inicial, int[][] tabuleiro) {
        for (int i = 0; i < inicial.length; i++) {
            for (int j = 0; j < inicial[i].length; j++) {
                tabuleiro[i][j] = inicial[i][j];
            }
        }
    }
    
    /**
     * metodo que verifica se a matriz é valida , obtendo a soma de 45 na vertical, horizontal
     * e dentro do quadrado
     */
    public void verificar() {
        for (int i = 0; i < tabuleiro.length; i++) {
            int sl = 0;
            int sc = 0;
            for (int j = 0; j < tabuleiro[i].length; j++) {
                sl += tabuleiro[i][j];
                sc += tabuleiro[j][i];        
            }
            if (sl != 45) {
                throw new IllegalStateException("Matriz inicial inválida! Erro na linha: " + i);
            }
            if (sc != 45) {
                throw new IllegalStateException("Matriz inicial inválida! Erro na coluna: " + i); 
            }        
        }
        // TODO: completar verificaçao!

    }

    /**
     * metodo utilizado para criação de "espaços vazios" no tabuleiro
     */
    public void preparar() {
        Random gerador = new Random();
        
        for (int c = 0; c < 20; c++) {
            int i = gerador.nextInt(9);
            int j = gerador.nextInt(9);
            tabuleiro[i][j] = 0;
        }
    }

    /**
     * metodo que possibilita a escolha do local de cada jogada, verificando se a se a posição
     * não esta ocuupada 
     */
    public void jogar(char coluna, char linha, char valor) {
        int i;
        int j;
        int v;

        i = converterParaLinha(linha);
        j = converterParaColuna(coluna);
        v = converterParaValorNumerico(valor);
        
        if (tabuleiro[i - 1][j - 1] == 0) {
            tabuleiro[i - 1][j - 1] = v;
        } else {
            throw new IllegalArgumentException("Posiçao ja ocupada!");
        }

    }

    /**
     * metodo utilizado para escolher a linha da jogada, verificando se a escolha é válida
     */
    private int converterParaLinha(char linha) {
        int i;
        switch(linha) {
            case '1':
                i = 1;
                break;
            case '2':
                i = 2;
                break;
            case '3':
                i = 3;
                break;
            case '4':
                i = 4;
                break;
            case '5':
                i = 5;
                break;
            case '6':
                i = 6;
                break;
            case '7':
                i = 7;
                break;
            case '8':
                i = 8;
                break;
            case '9':
                i = 9;
                break;
            default:
                throw new IllegalArgumentException("Linha invalida " + linha);
        }
        return i;
    }

    /**
     * metodo utilizado para escolher a coluna da jogada, verificando se a escolha é válida
     */
    private int converterParaColuna(char coluna) {
        int j;
        switch(coluna) {
            case 'A':
            case 'a':
                j = 1;
                break;
            case 'B':
            case 'b':
                j = 2;
                break;
            case 'C':
            case 'c':
                j = 3;
                break;
            case 'D':
            case 'd':
                j = 4;
                break;
            case 'E':
            case 'e':               
                j = 5;
                break;
            case 'F':
            case 'f':               
                j = 6;
                break;
            case 'G':
            case 'g':
                j = 7;
                break;
            case 'H':
            case 'h':
                j = 8;
                break;
            case 'I':
            case 'i':                
                j = 9;
                break;
            default:
                throw new IllegalArgumentException("Coluna invalida " + coluna);
        }
        return j;
    }

    /**
     * metodo utilizado para escolher o valor numérico da jogada, verificando se a escolha
     * é válida 
     */
    private int converterParaValorNumerico(char valor) {
        int v;
        switch(valor) {
            case '1':
                v = 1;
                break;
            case '2':
                v = 2;
                break;
            case '3':
                v = 3;
                break;
            case '4':
                v = 4;
                break;
            case '5':
                v = 5;
                break;
            case '6':
                v = 6;
                break;
            case '7':
                v = 7;
                break;
            case '8':
                v = 8;
                break;
            case '9':
                v = 9;
                break;
            default:
                throw new IllegalArgumentException("Valor invalido " + valor);
        }
        return v;
    }
    
    /**
     * metodo utilizado para verificar se o tabuleiro esta completo. 
     * Através da leitura da matriz, o metodo verifica se existe algum zero (vazio) na matriz,
     * caso existir o jogo continua, caso contrario ele acaba.
     */
    public boolean fimDeJogo() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (tabuleiro[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 
     */
    public String toString() {
        String s = "\t   A B C  D E F  G H I\n\n";

        for (int i = 0; i < tabuleiro.length; i++) {
            s += "\t"+(i + 1) + "  "; 
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == 0)
                    s += "  ";
                else
                    s += tabuleiro[i][j] + " ";

                if (j + 1 == 3 || j + 1 == 6) {
                    s += " ";
                }
            }
            s += "\n";
            if (i + 1 == 3 || i + 1 == 6) {
                s += "\n";
            }
        }
        return s;
    }
}
