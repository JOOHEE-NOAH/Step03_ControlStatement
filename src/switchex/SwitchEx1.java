package switchex;

public class SwitchEx1 {

	public static void main(String[] args) {
		
//		char sw='G';
//		switch(sw) {
//		case 'E': 
//		case 'e': System.out.println("excellent"); break;
//		case 'G': 
//		case 'g': System.out.println("good"); break;
//		default : System.out.println("fail"); //default=else�� �ش�, ���� default �� �տ� ������ break; �Է�������� 
//		
//		}
		
		
		
//		char sw='g';
//		if(sw=='E' || sw=='e') {
//			System.out.println("excellent");
//		}else if (sw=='G' || sw=='g') {
//			System.out.println("good");
//		}else {
//			System.out.println("fail");
//		}
		
//		-------------------------------------
		int score=85;
		char grade;
		
		switch(score/10) {    //95/10 --> 9
		case 10:
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F';
		}
		System.out.println("������ "+score+"���̸� ������ "+grade+"�Դϴ�");
		
		
		
		
		
	}

}
