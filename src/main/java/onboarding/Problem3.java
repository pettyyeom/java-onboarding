package onboarding;

import java.util.Scanner;



public class Problem3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("1~99사이의 정수를 입력하세요 : ");

		int input = in.nextInt();

		

		if(input < 10){

			if(input == 3 || input ==6 || input ==9)

				System.out.println("박수짝");

			else 

				System.out.println("박수없음");

		}else{

			int count1=0,count2=0;

			int a = input/10;

			int b = input%10;

			if(a==3 || a== 6 || a==9)

				count1++;

			if(b==3 || b==6 || b==9)

				count2++;

			

			if(count1 == 1 && count2==1)

				System.out.println("박수짝짝");

			else if((count1 == 1 && count2 ==0) ||(count1 == 0 && count2 ==1))

				System.out.println("박수짝");

			else 

				System.out.println("박수 없음");

		}

	}

}
