package algorithm;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		
		String answer = "";
		for(char x : str.toCharArray()) {
			//Character ���� �Լ��� ������ ��ҹ��� Ȯ��
			//if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			//else answer += Character.toLowerCase(x);
			
			// ������ ���������� ��ҹ��� Ȯ�� 
			if(x >= 65 && x <=90) answer += (char)(x+32);
			else if(x >= 97 && x <=122) answer += (char)(x-32);;
		}
		
		
		
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "";
		
		int m =Integer.MIN_VALUE;
		String[] s=str.split(" ");
		for(String x : s) {
			int len=x.length();
			if(len>m) {
				m=len;
				answer=x;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);		
		String str = sc.nextLine();		
		System.out.println(T.solution2(str));

	}

}
