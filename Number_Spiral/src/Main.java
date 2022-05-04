
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int t = Integer.parseInt(br.readLine());
    while (t>0) {
      String[] input = br.readLine().split(" ");
      printval(Long.parseLong(input[0]), Long.parseLong(input[1]));
      t--;
    }
  }
  public static void printval(long x, long y){
      long print;
      if(y > x) {
        if (y % 2 == 1){
          print = y * y - (x - 1);
        } else {
          print = (y - 1) * (y - 1) + 1 + (x - 1);
        }
      } else{
        if (x % 2 == 1){
          print = x * x - (x - 1) - (x - y);
        } else {
          print = (x-1) * (x-1) + 1 + (x - 1) + (x - y);
        }
      }
      System.out.println(print);

  }


}