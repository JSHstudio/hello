import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
public class ch11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"������", "�����", "������"};
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "����", "����");
		System.out.println(list);//���ǿ� �´� ArrayList����
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);//���� �� al1����Ʈ ����
		Collections.fill(al1, "��");//����Ʈ�� �� ����
		System.out.println("'��'�� ä�� �� : " + al1);
		for(String i : s) {
			al1.add(i);//��Ʈ���迭�� ���Ҹ� �߰�
		}
		System.out.println("����Ʈ�� ��� �߰��� �� : " + al1);
		Collections.shuffle(al1);//����Ʈ ���Ƿ� ����
		System.out.println("����Ʈ�� ���� �� : " + al1);
		Collections.reverse(al1);//����Ʈ ���� ����
		System.out.println("����Ʈ�� �������� ������ �� : " + al1);
		System.out.println("����Ʈ���� �ּ� : " + Collections.min(al1));//����Ʈ �ּҰ� ��� Collections��� �̿�
		System.out.println("����Ʈ���� �ִ� : " + Collections.max(al1));//����Ʈ �ִ밪 ��� Collections��� �̿�
		System.out.println("����Ʈ���� ���� �� : " + Collections.frequency(al1, "��"));//�ش� ����Ʈ�� ������ �󵵼��� count
	}
}
