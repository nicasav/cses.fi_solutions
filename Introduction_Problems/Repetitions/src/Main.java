import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    long max = 1;
    long curr = 1;
    Scanner sc = new Scanner(System.in);
    String dna = sc.nextLine();
    for (int i = 0; i < dna.length() - 1; ++i){
      if (dna.charAt(i) == dna.charAt(i + 1)){
        curr++;
      } else {
        if (max < curr){
          max =curr;
        }
        curr = 1;
      }
    }
    if (max < curr) max = curr;
    System.out.print(max);

  }

}
