package ifex;
//if �� : ���� �˻縦 ������ �� ����� ���� ������ ����
public class IfEx1 {

	public static void main(String[] args) {

//		if~else if~else ��  <���� �������� �˻��ؾ� �Ҷ� ����
		int score=95;
		char grade='\0';
		
		if (score>=90)  grade='A';  //�Ϲ������� ���� ���
		else if(score>=80)  grade='B';
		else if(score>=70)  grade='C';
		else if(score>=60)  grade='D';
		else grade='F';
		
//		if(score>=90 && score<=100)  grade='A'; //�� ������ ����� �� �ʱ�ȭ �ʿ�
//		if(score>=80 && score<=90)  grade='B';
//		if(score>=70 && score<=80)  grade='C';
//		if(score>=60 && score<=70)  grade='D';
//		if(score>=0 && score<=60)  grade='F';
		
		System.out.println("������ "+score+"���̰� ������ "+grade+"�Դϴ�");
		
		

////		if~else ��
//		int score=45;
//		if(score>=60) {
//			System.out.println("�հ�");
//			System.out.println("������ "+score+"���Դϴ�");
//		}else {
//			System.out.println("���հ�");
//			System.out.println("������ "+score+"���̸� ������ȸ��...");
//		}
//		
//		
//		System.out.println((score>=60)?"�հ�":"���հ�"); //���� if~else���� ���� �ǹ��� ����
//		
//		System.out.println((score>=60)?200:100); // 200,100�ڸ��� �Լ��� ���� �ȵ� ����, ���� ����
		
		
////		�ܼ� if��------------------------
//		String str="hello";
//		
//		if(str=="hello") {
//			System.out.println("��ο� ");
//			System.out.println("�ڹ�");
//		}
//		System.out.println("������"); //if ������ ����, if�ʹ� �������

	}

}
