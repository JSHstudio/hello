package 이욱_2018204044_과제2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.UnaryOperator;

import javax.lang.model.element.Element;

class WordCount {
	String word;
	int count;

	public WordCount(String word, int count) {
		this.word = word;
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public int getCount() {
		return count;
	}

	public String toString() {
		return "(" + word + ", " + count + ")";
	}
	
	public void plus() {
        count += 1;
     }

}
public class Problem02ArrayList {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		String path = "./한국언론진흥재단_공유경제_관련_기사.txt";
		File f = new File(path);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF16"));
		String str = "";
		String[] newsword;
		ArrayList<WordCount> wordcountlist = new ArrayList<WordCount>();
		int count = 1;
		
		long start = System.currentTimeMillis();
		
		try {
			while ((str = br.readLine()) != null) {
				int index = 0;
				newsword = str.split(",");
				for(int i = 0; i < newsword.length; i++) {
					if ((index = search(wordcountlist, newsword[i])) == -1)
			               wordcountlist.add(new WordCount(newsword[i], count));
			            else
			               wordcountlist.get(index).plus();
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Collections.sort(wordcountlist, new Comparator<WordCount>() {
			@Override
			public int compare(WordCount o1, WordCount o2) {
				// TODO Auto-generated method stub
				if (o1.count > o2.count)
					return -1;
				else if (o1.count == o2.count)
					return 0;
				else
					return 1;
			}
		});
		
		long end = System.currentTimeMillis();

		System.out.println("ArrayList 실행속도: " + (end - start) + "ms");
		
		for (int i = 0; i < 20; i++) {
			System.out.println((i + 1) + "." + wordcountlist.get(i).toString());
		}

	}
	private static int search(ArrayList<WordCount> list, String str) {
		int i = 0;
		for(i = 0; i < list.size(); i++) {
			if(list.get(i).getWord().contentEquals(str))
				return i;
		}
		return -1;
	}
}
