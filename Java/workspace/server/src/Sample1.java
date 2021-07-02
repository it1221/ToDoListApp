import java.io.*;

class Sample1 {

  public static void main(String[] args) {
    int evaluation = 0;
    do {
      try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("素数かどうか調べたい数を入力してください：");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i=2; i<=num; i++) {
          if(num == 0) {
            System.out.println("0は0です。");
          }
          else if(num == 1) {
            System.out.println("1は素数です。");
          }
          int result = ( num % i );
          if(result == 0) {
            if(num != i) {
              System.out.println(num + "は素数ではありません。");
              System.out.println(i + "で割ることができます。");
              System.out.println(" " + i + " * " + (num/i) + " = " + num);
              evaluation = 1;
              break;
            }
            else if(num == i) {
              System.out.println(num + "は素数です。");
              evaluation = 1;
              break;
            }
          }
        }
      } 
      catch(NumberFormatException e) {
        System.out.println("整数の数字を入力してください。");
        continue;
      }
      catch(Exception e) {
        System.out.println(e);
        continue;
      }
    }while(evaluation == 0);
    System.out.println("正常終了");
  }
}