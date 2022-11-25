

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SudokuTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SudokuTest
{
    /**
     * Default constructor for test class SudokuTest
     */
    public SudokuTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
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
        Sudoku sudoku1 = new Sudoku();
        assertEquals(true, sudoku1.check());
    }
}


