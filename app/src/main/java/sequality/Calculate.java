package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int total_sum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public double total_ave(int x, int y) {
    int sum = 0;
    int cnt = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
      cnt++;
    }
    return (double) sum / cnt;
  }

  public boolean check_odd(int x) {
    if (x % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  public int total_odd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (check_odd(i) == true) {
        sum += i;
      }
    }
    return sum;
  }

  public int total_even(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (check_odd(i) == false) {
        sum += i;
      }
    }
    return sum;
  }

}
