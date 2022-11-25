

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste SudokuTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class SudokuTest
{
    /**
     * Construtor default para a classe de teste SudokuTest
     */
    public SudokuTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void teste1()
    {
        Sudoku sudoku2 = new Sudoku();
        assertEquals(false, sudoku2.fimDeJogo());
    }

    @Test
    public void teste2()
    {
    }
}


