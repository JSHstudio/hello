package 이욱_2018204044_과제1;

public class GameEntry {
	private String name;
	private int score;
	
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}
	
	public String getName() {return name;}
	public int getScore() {return score;}
	public String toString() {
		return "(" + name + ", " + score + ")";
	} 
}
