package whileex;
/* do-while�� �̿��Ͽ� �ݺ� ó�� �ϼ���
 * 
 * �ٽ� ���� �ұ��?(y/Y) y
 * �ٽ� ���� �ұ��?(y/Y) Y
 * �ٽ� ���� �ұ��?(y/Y) n
 * 
 * ***** �����ϼ̽��ϴ� *****
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char ck;
		
		do {
			System.out.print("�ٽ� ���� �ұ��?(y/Y) ");
			ck=br.readLine().charAt(0);
			
		}while(ck=='y' || ck=='Y');
		System.out.println("***** �����ϼ̽��ϴ� *****");
			
			
			
			//???????  --> �ѱ����϶� char ����ϱ� !! ���ڿ� �񱳴� �ڿ� ���� 
//		String ans; 
//		
//		do {
//		System.out.print("�ٽ� ���� �ұ��?(y/Y) ");
//		ans=br.readLine();
//		}while(ans=='y' || ans=='Y');
//		
//		System.out.println("***** �����ϼ̽��ϴ� *****");
		


	}

}
