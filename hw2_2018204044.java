import java.util.HashMap;
import java.util.Scanner;
public class hw2_2018204044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capital = new HashMap<>();
		capital.put("������", "�ĸ�");
		capital.put("������", "������");
		capital.put("�׸���", "���׳�");
		capital.put("���ѹα�", "����");
		capital.put("����", "����");
		String [] keys = capital.keySet().toArray(new String[0]);
		System.out.println("***�������߱� ���� ���� ***");
		while(true) {
			Scanner sc = new Scanner(System.in);
			int randomindex = (int)(Math.random() * 5);
			String input;
			String key = keys[randomindex];
			System.out.print(key + "�� ������?");
			input = sc.next();
			if(input.equals(capital.get(key))) {
				System.out.println("����");
			}else if(input.equals("����")) {
				System.out.println("���� ����...");
				break;
			}else{
				System.out.println("�ƴմϴ�!!");
			}
		}
	}

}
