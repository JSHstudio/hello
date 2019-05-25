import java.util.Scanner;
import java.util.stream.Stream;
public class ch11_6 {

	public static void main(String[] args) {
		Stream<String> kb = Stream.generate(() -> new Scanner(System.in).nextLine());
		System.out.println(kb.limit(5).filter(s -> s.length() == 2).count());
	}

}
