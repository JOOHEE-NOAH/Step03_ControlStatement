package step03_���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* inputstreamreader, bufferedereader
 * �̸� : ��ȣ��
 * ���� : 23
 * ���� : ��
 * 
 * �̸��� ��ȣ���Դϴ�
 * ���̴� 23���Դϴ�
 * ������ ���� �Դϴ�
 * 
 */
public class InputTest3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		InputStreamReader isr=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(isr);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String name;
		int age;
//		String gender;
		char gender;
		
	
		System.out.print("�̸� : ");  
		name=br.readLine();
		System.out.print("���� : ");  
		age=Integer.parseInt(br.readLine());
//		System.out.print("���� : ");  
//		gender=br.readLine();
		System.out.print("���� : ");
		gender=br.readLine().charAt(0);
		
		
//		System.out.println("�̸��� "+name+"�Դϴ�\n���̴� "+age+"���Դϴ�\n������ "+gender+" �Դϴ�");
		System.out.println("�̸��� "+name+"�Դϴ�");
		System.out.println("���̴� "+age+"�Դϴ�");
		System.out.println("������ "+gender+"�� �Դϴ�");

	}

}
