package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * ���ڸ� �Է��ϼ��� : 5
 * 
 * 5�� Ȧ���Դϴ�
 * 
*/
public class SwitchEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//�Է�
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		a=Integer.parseInt(br.readLine()); 
		System.out.println();
		
		//��� �� ���
		switch(a%2) {  //key �ڸ����� ��꿡�� �������� �������
		case 1: System.out.println(a+"�� Ȧ���Դϴ�"); break;
		case 0: System.out.println(a+"�� ¦���Դϴ�");  //������ case �극��ũ�� ��������
		}
		
//		
//	  case 'g': System.out.println("good"); break;
////	default : System.out.println("fail");
			
//			switch(score/10) {    //95/10 --> 9
//			case 10:
//			case 9: grade='A'; break;
//			case 8: grade='B'; break;
//			case 7: grade='C'; break;
//			case 6: grade='D'; break;
//			default: grade='F';
//		

	}



}
