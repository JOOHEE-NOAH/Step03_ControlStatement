package switchex;
/*args�� �Էµ� month�� �ϼ��� ���ϼ���   // /*������ Ctrl+����
 * $ java SwithchEx3 3
 * 
 * 3���� 31�ϱ��� �ֽ��ϴ�
 */
public class SwitchEx3 {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int day=0;
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day=31; break;
		case 2: day=28; break;
		default: day=30;
		}
		System.out.println(month+"���� "+day+"�ϱ��� �ֽ��ϴ�");

	}

}
