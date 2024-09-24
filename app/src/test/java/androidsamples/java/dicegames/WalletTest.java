package androidsamples.java.dicegames;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletTest {


  @Mock
  Die6 mockDie;

  public static WalletViewModel viewModel;
  @BeforeClass
  public static void setUpClass() {
    // Create a single instance for all tests

  }
  @Before
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    viewModel = new WalletViewModel();
    viewModel.dice = mockDie;

  }


  @Test
  public void testRoll652412() {

    when(mockDie.value())
            .thenReturn(6) // First roll
            .thenReturn(5) // Second roll
            .thenReturn(2) // Third roll
            .thenReturn(4) // Fourth roll
            .thenReturn(1) // Fifth roll
            .thenReturn(2); // Sixth roll


    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(1, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(0, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(5, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(2, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(2, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(3, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(5, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(4, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(4, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(2, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(1, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(5, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(4, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(2, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(6, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(1, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());


    verify(mockDie, times(6)).roll();
  }
  @Test
  public void testRollSequenceInDocumentation() {
    // Configure the mockDie to return values in the specified sequence
    when(mockDie.value())
            .thenReturn(6)
            .thenReturn(6)
            .thenReturn(6)
            .thenReturn(3)
            .thenReturn(3)
            .thenReturn(6)
            .thenReturn(1)
            .thenReturn(6)
            .thenReturn(6)
            .thenReturn(5)
            .thenReturn(4);

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(1, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(0, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(2, viewModel.singleSixes());
    assertEquals(2, viewModel.totalRolls());
    assertEquals(1, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(15, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(3, viewModel.singleSixes());
    assertEquals(3, viewModel.totalRolls());
    assertEquals(2, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(25, viewModel.balance());

    viewModel.rollDie();

    assertEquals(3, viewModel.dieValue());
    assertEquals(3, viewModel.singleSixes());
    assertEquals(4, viewModel.totalRolls());
    assertEquals(2, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(25, viewModel.balance());
    viewModel.rollDie();

    assertEquals(3, viewModel.dieValue());
    assertEquals(3, viewModel.singleSixes());
    assertEquals(5, viewModel.totalRolls());
    assertEquals(2, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(3, viewModel.previousRoll());
    assertEquals(20, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(4, viewModel.singleSixes());
    assertEquals(6, viewModel.totalRolls());
    assertEquals(2, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(3, viewModel.previousRoll());
    assertEquals(25, viewModel.balance());

    viewModel.rollDie();

    assertEquals(1, viewModel.dieValue());
    assertEquals(4, viewModel.singleSixes());
    assertEquals(7, viewModel.totalRolls());
    assertEquals(2, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(25, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(5, viewModel.singleSixes());
    assertEquals(8, viewModel.totalRolls());
    assertEquals(2, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(1, viewModel.previousRoll());
    assertEquals(30, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(6, viewModel.singleSixes());
    assertEquals(9, viewModel.totalRolls());
    assertEquals(3, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(40, viewModel.balance());

    viewModel.rollDie();

    assertEquals(5, viewModel.dieValue());
    assertEquals(6, viewModel.singleSixes());
    assertEquals(10, viewModel.totalRolls());
    assertEquals(3, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(40, viewModel.balance());
    viewModel.rollDie();

    assertEquals(4, viewModel.dieValue());
    assertEquals(6, viewModel.singleSixes());
    assertEquals(11, viewModel.totalRolls());
    assertEquals(3, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(5, viewModel.previousRoll());
    assertEquals(40, viewModel.balance());
  }
  @Test
  public void negativeRollSequence2222(){
    when(mockDie.value())
            .thenReturn(2) // First roll
            .thenReturn(2) // Second roll
            .thenReturn(2) // Third roll
            .thenReturn(2);// Fourth roll
    viewModel.rollDie();




    assertEquals(2, viewModel.dieValue());
    assertEquals(0, viewModel.singleSixes());
    assertEquals(1, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(0, viewModel.previousRoll());
    assertEquals(0, viewModel.balance());

    viewModel.rollDie();

    assertEquals(2,viewModel.dieValue());
    assertEquals(0, viewModel.singleSixes());
    assertEquals(2, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(1, viewModel.doubleOthers());
    assertEquals(2, viewModel.previousRoll());
    assertEquals(-5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(2, viewModel.dieValue());
    assertEquals(0, viewModel.singleSixes());
    assertEquals(3, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(2, viewModel.doubleOthers());
    assertEquals(2, viewModel.previousRoll());
    assertEquals(-10, viewModel.balance());

    viewModel.rollDie();

    assertEquals(2, viewModel.dieValue());
    assertEquals(0, viewModel.singleSixes());
    assertEquals(4, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(3, viewModel.doubleOthers());
    assertEquals(2, viewModel.previousRoll());
    assertEquals(-15, viewModel.balance());
    verify(mockDie, times(4)).roll();
  }

  @Test
  public void test66666() {

    when(mockDie.value())
            .thenReturn(6)
            .thenReturn(6)
            .thenReturn(6)
            .thenReturn(6)
            .thenReturn(6);
    viewModel.rollDie();




    assertEquals(6, viewModel.dieValue());
    assertEquals(1, viewModel.singleSixes());
    assertEquals(1, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(0, viewModel.previousRoll());
    assertEquals(5, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(2, viewModel.singleSixes());
    assertEquals(2, viewModel.totalRolls());
    assertEquals(1, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(15, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(3, viewModel.singleSixes());
    assertEquals(3, viewModel.totalRolls());
    assertEquals(2, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(25, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(4, viewModel.singleSixes());
    assertEquals(4, viewModel.totalRolls());
    assertEquals(3, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(35, viewModel.balance());

    viewModel.rollDie();

    assertEquals(6, viewModel.dieValue());
    assertEquals(5, viewModel.singleSixes());
    assertEquals(5, viewModel.totalRolls());
    assertEquals(4, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(6, viewModel.previousRoll());
    assertEquals(45, viewModel.balance());
    verify(mockDie, times(5)).roll();
  }
  @Test
  public void test12() {

    when(mockDie.value())

            .thenReturn(1)
            .thenReturn(2);
    viewModel.rollDie();




    assertEquals(1, viewModel.dieValue());
    assertEquals(0, viewModel.singleSixes());
    assertEquals(1, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(0, viewModel.previousRoll());
    assertEquals(0, viewModel.balance());

    viewModel.rollDie();

    assertEquals(2, viewModel.dieValue());
    assertEquals(0, viewModel.singleSixes());
    assertEquals(2, viewModel.totalRolls());
    assertEquals(0, viewModel.doubleSixes());
    assertEquals(0, viewModel.doubleOthers());
    assertEquals(1, viewModel.previousRoll());
    assertEquals(0, viewModel.balance());


    verify(mockDie, times(2)).roll();
  }
}
