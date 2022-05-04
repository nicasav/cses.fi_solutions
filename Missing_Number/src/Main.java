import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long input1 = Integer.parseInt(sc.nextLine());
    long number = Arrays.stream(sc.nextLine().split(" "))
          .mapToLong(Long::parseLong)
          .sum();
    long result = (input1*(input1 + 1) / 2) - number;
    System.out.print(result);

  }

}