package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���� �Է¹޾� �������� ����ϼ���
 * ���� �Է��ϼ��� : 7
 * 7 X 1 = 7
 * 7 X 1 = 14
 *   :
 * 7 X 9 = 63
 * 
 */
public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a, n=1; 
		
		System.out.print("���� �Է��ϼ��� : ");
		a=Integer.parseInt(br.readLine());
		
		while(n<=9) {
			System.out.println(a+" X "+n+" = "+a*n);
			++n; //�ѹ� ����ϰ� �� ���Ŀ� n ����
		}

	}

}
