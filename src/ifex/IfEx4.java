package ifex;
/* ��ø if���� �̿��Ͽ� �ۼ��ϼ���
 * 3�� ������ ������ �Է� �޾� �հ�, ���հ��� ����ϼ���
 * 3�� ������ ���� 40�� �̻��̾�� �ϰ� ����� 60�̻��϶� "�հ�" ���
 * ����� 60�� ������ 1�� �����̶� 40�̸��̸� "�������� ���հ�" ���
 * ����� 60�̸��̶�� "���հ�" ���
 * 
 * -----
 * ���������Է� : 95
 * ���������Է� : 85
 * ���������Է� : 73
 * ��� : �հ�
 * 
 * ���������Է� : 95
 * ���������Է� : 85
 * ���������Է� : 33
 * ��� : �������� ���հ�
 * 
 * ���������Է� : 55
 * ���������Է� : 45
 * ���������Է� : 33
 * ��� : ���հ�
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int k, e, m, tot;
		double avg;

		
		System.out.print("���������Է� : ");  
		k=Integer.parseInt(br.readLine());
		System.out.print("���������Է� : ");  
		e=Integer.parseInt(br.readLine());
		System.out.print("���������Է� : ");  
		m=Integer.parseInt(br.readLine());
		
		tot=k+e+m;
	    avg=tot/3.0; 
		
	    if(avg<60) {
	    System.out.println("��� : ���հ�");
	    }
	    else {
	    	if(k>=40 && e>=40 && m>=40) {
	    System.out.println("��� : �հ�");
	    	}
	    	else {
	    System.out.println("��� : �������� ���հ�");
	    }
	    }
	    
	    
//	    if(avg>=60) {
//	    	//��øif
//	       if(k<40 || e<40 || m<40){
//	    System.out.println("�������� ���հ�");
//	    }else {
//	    	System.out.println("�հ�");
//	    }
//	      
//	    }else {
//	    	System.out.println("��� : ���հ�");
//	    }
//	    
		

	}

}
