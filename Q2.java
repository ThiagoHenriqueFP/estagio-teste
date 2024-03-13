import java.util.ArrayList;
import java.util.List;

public class Q2 {

  static long fibo(int n) {
    int F = 0; // atual
    int ant = 0; // anterior

    for (int i = 1; i <= n; i++) {

      if (i == 1) {
        F = 1;
        ant = 0;
      } else {
        F += ant;
        ant = F - ant;
      }

    }

    return F;
  }

  public static void main(String[] args) {
    Long test = 5L;
    int iteracoes = 20;
    List<Long> numbers = new ArrayList<>();

    for (int i = 0; i < iteracoes; i++) {
      numbers.add(fibo(i));
    }

    if (numbers.contains(test))
      System.out.println("o numero pertence a sequencia de fibonacci");
    else
      System.out.println("o numero não pertence a sequencia de fibonacci");
  }
}
