 import java.util.Scanner;

public class CoversorTempo {
    //complete os espaços em branco com sua solução
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sec, min, hour, time, rest, rest2;

    time = input.nextInt();

    if (time >= 3600) {
      rest = time % 3600;
      hour = (int)((time - rest) / 3600);
      rest2 = rest % 60;
      min = (int)((rest - rest2) / 60);
      sec = (int)(rest2);

      System.out.println(hour + ":" + min + ":" + sec);
    } else if (time >= 60) {
      rest = time % 60;
      min = (int)((time - rest) / 60);
      sec = (int)(rest);

      System.out.println("0:" + min + ":" + sec);
    } else if (time < 60) {
      sec = time;

      System.out.println("0:0:" + sec);
    }
  }
} 