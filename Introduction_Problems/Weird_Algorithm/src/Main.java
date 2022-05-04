import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long number = Integer.parseInt(sc.nextLine());
    while(number > 1){
      System.out.print(number + " ");
      if (number % 2 == 1){
        number = number * 3 + 1;
      } else {
        number /= 2;
      }
    }
    System.out.print(number);

  }

}