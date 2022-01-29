package whileex;
/* do-while을 이용하여 반복 처리 하세요
 * 
 * 다시 실행 할까요?(y/Y) y
 * 다시 실행 할까요?(y/Y) Y
 * 다시 실행 할까요?(y/Y) n
 * 
 * ***** 수고하셨습니다 *****
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
			System.out.print("다시 실행 할까요?(y/Y) ");
			ck=br.readLine().charAt(0);
			
		}while(ck=='y' || ck=='Y');
		System.out.println("***** 수고하셨습니다 *****");
			
			
			
			//???????  --> 한글자일땐 char 사용하기 !! 문자열 비교는 뒤에 나옴 
//		String ans; 
//		
//		do {
//		System.out.print("다시 실행 할까요?(y/Y) ");
//		ans=br.readLine();
//		}while(ans=='y' || ans=='Y');
//		
//		System.out.println("***** 수고하셨습니다 *****");
		


	}

}
