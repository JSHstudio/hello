package 이욱_2018204044_과제1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuzzleSolve(3, "", "abcd");
	}

static void PuzzleSolve(int k, String S, String U) {
	for(int i = 0;i < k;i++) {
		String change = ""+U.charAt(i);
		U = U.replace(change, "");
		S = S.concat(change);
		if(k == 1)
			System.out.println(S);
		else
			PuzzleSolve(k - 1, S, U);
		U = change.concat(U);
		S = S.replace(change, "");
	}
}
}
