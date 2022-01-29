package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* switch�� while�� �̿��Ͽ� �޴� ���α׷� �ۼ�
 * 1.�簢�� 2.�ﰢ�� 3.�� 4.����
 * �����ϼ��� : 1
 * �簢���� ���õǾ����ϴ�
 * 
 * 1.�簢�� 2.�ﰢ�� 3.�� 4.����
 * �����ϼ��� : 4
 * ***** ���α׷��� �����մϴ� *****
 * 
 */
public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n; //"�����ϻ���" �Է¹��� ����
		
		while(true) {
		System.out.print("1.�簢�� 2.�ﰢ�� 3.�� 4.����\n�����ϼ��� : ");
		n=Integer.parseInt(br.readLine());
		
		switch(n) {
		case 1: System.out.println("�簢���� ���õǾ����ϴ�"); break;
		case 2: System.out.println("�ﰢ���� ���õǾ����ϴ�"); break;
		case 3: System.out.println("���� ���õǾ����ϴ�"); break;
		case 4: 
			System.out.println("***** ���α׷��� �����մϴ� *****"); 
			System.exit(0); // 0 ��������, ���� ����
		
		
		default: System.out.println("�Էµ� ���� �߸��Ǿ����ϴ�");
		}
		
		}
		

	}

}
