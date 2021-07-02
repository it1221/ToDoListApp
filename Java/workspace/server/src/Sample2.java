import java.util.*;

class Sample2 {

  public static void main(String[] args) {
    int min = 0;
    int max = 100;
    int fibo = 1;
    int lastfibo = 0;
    int evaluation = 0;

    do {
      try {
        Scanner scn = new Scanner(System.in);
        System.out.println("フィボナッチ数列を表示します。表示の下限と上限を入力してください。");
        System.out.print("下限：");        
        min = scn.nextInt();
        System.out.print("上限：");
        max = scn.nextInt();

        System.out.println(min + "から" + max + "までのフィボナッチ数列を表示します。");
        if(min < 0) {
          System.out.println("0以上の整数を入力してください。");
          continue;
        }
        if(min <= 1) {
          if(min == 0) {
            System.out.print("0, ");
          }
          System.out.print("1, ");
        }
        for(int i=1; i<=max; i++) {
          fibo += lastfibo;
          if(fibo >= min && fibo <= max) {
            System.out.print(fibo);
            if((fibo+fibo-lastfibo) < max) {
              System.out.print(", ");
            }
          }
          lastfibo = fibo-lastfibo;
        }
        System.out.print('\n');
        evaluation = 1;
        break;
      }
      catch(NumberFormatException e) {
        System.out.println("整数を入力してください。");
        continue;
      }
      catch(InputMismatchException e) {
        System.out.println("整数を入力してください。");
        continue;
      }
      catch (Exception e) {
        System.out.println(e);
      }
    }while(evaluation == 0);
    System.out.println("正常終了");
  }
}