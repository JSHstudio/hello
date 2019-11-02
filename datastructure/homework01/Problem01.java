package 이욱_2018204044_과제1;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Rob", "Mike", "Rose", "Jill", "Jack", "Paul", "Bob"};
	    int[] scores = {750, 1105, 590, 740, 610, 410, 840};

		Scoreboard board = new Scoreboard(5);
		for(int i = 0;i < names.length; i++) {
			GameEntry a = new GameEntry(names[i], scores[i]);
			board.add(a);
		}
		
		try {
			board.remove(3);
			board.remove(1);
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}	
	}

}
