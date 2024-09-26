package input;

import java.util.Scanner;

public class quiz01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("이름 입력");
	String str;
	str = input.next();
	System.out.println("당신의 이름은 무엇입니까? " + str);
	
	System.out.println();
	
	int num1;
	System.out.println("점수 입력 : ");
	num1 = input.nextInt();
	System.out.println(str + "님의 국어 점수 : " + num1);
	
	System.out.println();
	
	int num2;
	System.out.println("점수 입력 : ");
	num2 = input.nextInt();
	System.out.println(str + "님의 영어 점수 : " + num2);
	
	System.out.println();
	
	int num3;
	System.out.println("점수 입력 : ");
	num3 = input.nextInt();
	System.out.println(str + "님의 수학 점수 : " + num3);
	
	System.out.println();
	
	System.out.println("============");
	System.out.println("이름 : " + str);
	System.out.println("============");
	System.out.println("국어 : " + num1);
	System.out.println("영어 : " + num2);
	System.out.println("수학 : " + num3);
	System.out.println("============");
	System.out.println("합계 : " + (num1+num2+num3));
	System.out.println("============");
	
	
}
}
