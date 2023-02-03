package com.switchcases;
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr the alphabet : ");
		char ch = sc.next().charAt(0);
		
		int ascii = ch;
		System.out.println(ascii);
		
		if((ascii>=65)&&(ascii<=90)||(ascii>=97)&&(ascii<=122)) {
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(ch+" is vowel");
				break;
			default:
				System.out.println(ch+" is consonant.");
			}
		}
		else
		{
			System.out.println("Invalid aphabet..");
		}

	}

}
