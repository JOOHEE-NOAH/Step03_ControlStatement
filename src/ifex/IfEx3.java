package ifex;
/* --���� a�� �����ϰ� 55�Ǵ� 46�� ��������
 * 1. �ܼ� if�̿�
 *       ���ǽĿ��� 50���� ũ�� "55�� 50���� ũ�ų� ����"
 *                50���� ������ "46�� 50���� �۴�"               
 * 2. if~else �̿�(a%2==0)
 *        a ������ ���� Ȧ�� ���� ¦�� ���� ����ϼ���
 * 3. if~else~if �̿�
 *        a ������ ���� "���", "����", "zero"������ ���
 *        
 * -------
 * 55�� 50���� ũ�ų� ����
 * 55�� Ȧ���Դϴ�
 * 55�� ����Դϴ�
 * 
 */
public class IfEx3 {

	public static void main(String[] args) {
//		��Ǯ�� 
//		int a=55;
//		String str;
//		
//		if (a>=50) {
//			System.out.println(a+"�� 50���� ũ�ų� ����");
//		}
//		if (a<=50) {
//			System.out.println(a+"�� 50���� �۴�");
//		}
//		
//
//		if (a%2==0)  {
//			System.out.println(a+"�� ¦���Դϴ�");
//		}
//		else {
//			System.out.println(a+"�� Ȧ���Դϴ�");
//		}
//		
//		if (a>=0)  {str="���";
//		System.out.println(a+"��"+" ����Դϴ�");
//		}
//		else if(a<=0) {str="����";
//		System.out.println(a+"��"+" �����Դϴ�");
//		}
//		else if(a==0) {str="zero";
//		System.out.println(a+"��"+" zero�Դϴ�");
//		}
				

		int a=55;
		
//		1.-----------------
		if(a>=50) {
		System.out.println(a+"�� 50���� ũ�ų� ����");
		}
		if(a<50) {
			System.out.println(a+"�� 50���� �۴�");
		}
		
//		2.-----------------
		if(a%2==0)
			System.out.println(a+"�� ¦���Դϴ�");
		else
			System.out.println(a+"�� Ȧ���Դϴ�");
		
//		3.-------------------
		if(a>0)  System.out.println(a+"�� ����Դϴ� ");
		else if(a<0) System.out.println(a+"�� �����Դϴ� ");
		else System.out.println(a+"�� zero�Դϴ�");

		

	}

}
