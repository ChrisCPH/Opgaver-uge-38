/*
 *
 * Hvis du kompilerer programmet får du 7 fejl.
 * Kan du fixe programmet så det kan køre og
 * outputtet bliver:
 * "7 is the smallest!"
 *
 * 
 */
public class Oops {
  static int smaller = 0;
  public static void main(String[] args) {
    int a = 7, b = 42;
    minimum(a,b);
    if (smaller == a) {
      System.out.println(a + " is the smallest!");
    }
  }
  public static Integer minimum(int a, int b) {
    if (a < b) {
      smaller = a;
    } else if(a >= b) {
      smaller = b;
    }
    return smaller;
  }
}