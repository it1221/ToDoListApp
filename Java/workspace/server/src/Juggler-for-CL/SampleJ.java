package sample10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleJ {

	public static int coins = 50;
	public static void coinsum (int adc) {
		coins += adc;
		System.out.println("コイン数：" + coins + "枚");
	}


	public static void main(String[] args) throws IOException {

		while(true) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//System.out.println("Enterを押してください");

		int num = (int) (Math.random()*100)+1;
		if(num >= 100) {
			System.out.println("GOGO");

			System.out.println("Enterを押してください");
			String str3 = br.readLine();
			System.out.println("7");
			String str1 = br.readLine();
			System.out.println("7");
			String str2 = br.readLine();
			int num2 = (int)(Math.random()*10)+1;
			if(num2 >= 6) {
				System.out.println("7");
				String str9 = br.readLine();
				System.out.println("You won 300 coins!");
				coinsum(300);
				String str12 = br.readLine();
			}
			else {
				System.out.println("bar");
				String str8 = br.readLine();
				System.out.println("You won 100 coins!");
				coinsum(100);
				String str13 = br.readLine();
			}
			String str4 = br.readLine();
		}
		else if(num > 80 && num < 100) {
			System.out.println("replay");
			coinsum(0);
			String str5 = br.readLine();
			continue;
		}
		else if(num <= 80 && num >= 70) {
			System.out.println("bell");
			coinsum(7);
			String str6 = br.readLine();
			continue;
		}
		else if(num < 5) {
			System.out.println("cherry");
			coinsum(3);
			String str6 = br.readLine();
			int num2 = (int)(Math.random()*10)+1;
			if(num2 >= 9) {
				System.out.println("GOGO");
				String str9 = br.readLine();

				
				System.out.println("7");
				String str1 = br.readLine();
				System.out.println("7");
				String str2 = br.readLine();
				int num3 = (int)(Math.random()*10)+1;
				if(num3 >= 6) {
					System.out.println("7");
					String str19 = br.readLine();
					System.out.println("You won 300 coins!");
					coinsum(300);
					String str12 = br.readLine();
				}
				else {
					System.out.println("bar");
					String str8 = br.readLine();
					System.out.println("You won 100 coins!");
					coinsum(100);
					String str13 = br.readLine();
				}
			}
			else {
				continue;
			}
			continue;
		}
		else {
			System.out.println(num);
			coinsum(-3);
			String str7 = br.readLine();
			continue;

		}

		}
	}

}
