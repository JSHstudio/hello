import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
public class ch11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"독수리", "고양이", "강아지"};
		List<String> list = new ArrayList<String>();
		list.add("개미");
		list.add("개미");
		System.out.println(list);
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);
		al1.set(0, "벌");
		al1.set(1, "벌");
		System.out.println("'벌'을 채운 후 : " + al1);
		for(String i : s) {
			al1.add(i);
		}
		System.out.println("리스트를 모두 추가한 후 : " + al1);
		Collections.sort(al1);
		System.out.println("리스트를 섞은 후 : " + al1);
		Collections.reverse(al1);
		System.out.println("리스트를 역순으로 정렬한 후 : " + al1);
		System.out.println("리스트에서 최소 : " + Collections.min(al1));
		System.out.println("리스트에서 최대 : " + Collections.max(al1));
		System.out.println("리스트에서 벌의 빈도 : " + Collections.frequency(al1, "벌"));
	}
}
