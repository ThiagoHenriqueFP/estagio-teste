public class Q5 {
  public static void main(String[] args) {
    String test = "some random string";

    StringBuilder reverse = new StringBuilder();

    for (int i = test.length() - 1; i >= 0; i--) {
      reverse.append(test.charAt(i));
    }

    System.out.println(reverse);
  }
}
