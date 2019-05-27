import java.util.HashMap;
import java.util.Scanner;
public class hw2_2018204044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capital = new HashMap<>();
		capital.put("프랑스", "파리");
		capital.put("스페인", "리스본");
		capital.put("그리스", "아테네");
		capital.put("대한민국", "서울");
		capital.put("영국", "런던");
		String [] keys = capital.keySet().toArray(new String[0]);
		System.out.println("***수도맞추기 게임 시작 ***");
		while(true) {
			Scanner sc = new Scanner(System.in);
			int randomindex = (int)(Math.random() * 5);
			String input;
			String key = keys[randomindex];
			System.out.print(key + "의 수도는?");
			input = sc.next();
			if(input.equals(capital.get(key))) {
				System.out.println("정답");
			}else if(input.equals("종료")) {
				System.out.println("게임 종료...");
				break;
			}else{
				System.out.println("아닙니다!!");
			}
		}
	}

}
