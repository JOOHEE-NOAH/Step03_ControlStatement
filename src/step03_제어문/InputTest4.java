package step03_���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ������ ���� ����ϼ���
 * �������� �Է��ϼ��� : 5
 * 
 * ���� ���� : 78.5      <---3.14*r*r
 * ���� �ѷ� : 31.4      <---2*3.14*r
 */
public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int r;
		double size, round;
		
		//�Է�(Ű�����Է�, ����, ��Ʈ��ũ, ����)
		System.out.print("�������� �Է��ϼ��� : ");
		r=Integer.parseInt(br.readLine());
		
//		double area=3.14*r*r;
//		double cir=2*3.14*r;
		
		//���
		size=3.14*r*r;
		round=2*3.14*r;
		
		//���
		System.out.println();
		System.out.printf("���� ���� : %.1f\n", size);
		System.out.printf("���� �ѷ� : %.1f", round);

	}

}
