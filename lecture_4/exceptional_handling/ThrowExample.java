public class ThrowExample {
  public static int factorial(int n) throws Exception {
    if (n < 0) {
      throw new Exception("Invalid argument: " + n + " (must be non-negative)");
    }
    if (n == 0) {
      return 1;
    }
    return n * factorial(n-1);
  }

  public static void main(String[] args) {
    try {
      int result = factorial(-5);
      System.out.println(result);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
