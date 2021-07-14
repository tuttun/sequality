package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testave() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2, 3), 0);
  }

  @Test
  public void testtotal_sum() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.total_sum(1, 10));
  }

  @Test
  public void testtotal_ave() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.total_ave(1, 10), 0);
  }

  @Test
  public void testcheck_odd() {
    Calculate calculate = new Calculate();
    boolean expected_true = true;
    boolean expected_false = false;
    for (int i = 1; i <= 10; i++) {
      if (i == 1) {
        assertEquals(expected_true, calculate.check_odd(1));
      }

      if (i == 2) {
        assertEquals(expected_false, calculate.check_odd(2));
      }

      if (i == 3) {
        assertEquals(expected_true, calculate.check_odd(3));
      }

      if (i == 4) {
        assertEquals(expected_false, calculate.check_odd(4));
      }

      if (i == 5) {
        assertEquals(expected_true, calculate.check_odd(5));
      }

      if (i == 6) {
        assertEquals(expected_false, calculate.check_odd(6));
      }

      if (i == 7) {
        assertEquals(expected_true, calculate.check_odd(7));
      }

      if (i == 8) {
        assertEquals(expected_false, calculate.check_odd(8));
      }

      if (i == 9) {
        assertEquals(expected_true, calculate.check_odd(9));
      }

      if (i == 10) {
        assertEquals(expected_false, calculate.check_odd(10));
      }
    }
  }

  @Test
  public void testtotal_even() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.total_even(1, 10));
  }

  @Test
  public void testtotal_odd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.total_odd(1, 10));
  }
}
