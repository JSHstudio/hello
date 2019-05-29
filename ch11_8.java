import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
public class ch11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"독수리", "고양이", "강아지"};
		List<String> list = new ArrayList<String>();
		Collections.addAll(list, "개미", "개미");
		System.out.println(list);//조건에 맞는 ArrayList생성
		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);//복사 된 al1리스트 생성
		Collections.fill(al1, "벌");//리스트에 값 변경
		System.out.println("'벌'을 채운 후 : " + al1);
		for(String i : s) {
			al1.add(i);//스트링배열의 원소를 추가
		}
		System.out.println("리스트를 모두 추가한 후 : " + al1);
		Collections.shuffle(al1);//리스트 임의로 섞음
		System.out.println("리스트를 섞은 후 : " + al1);
		Collections.reverse(al1);//리스트 역순 정렬
		System.out.println("리스트를 역순으로 정렬한 후 : " + al1);
		System.out.println("리스트에서 최소 : " + Collections.min(al1));//리스트 최소값 출력 Collections모듈 이용
		System.out.println("리스트에서 최대 : " + Collections.max(al1));//리스트 최대값 출력 Collections모듈 이용
		System.out.println("리스트에서 벌의 빈도 : " + Collections.frequency(al1, "벌"));//해당 리스트의 원소의 빈도수를 count
	}
}
