package 이욱_2018204044_과제2;

import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem02HashMap  {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				String path = "./한국언론진흥재단_공유경제_관련_기사.txt";
				File f = new File(path);
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF16"));
				String str = "";
				String[] newsword;
				HashMap <String, Integer> wordcountmap = new HashMap<String, Integer>();
				
				long start = System.currentTimeMillis();
				
				try {
					while ((str = br.readLine()) != null) {
						newsword = str.split(",");
						for (int i = 0; i < newsword.length; i++) {
							if(wordcountmap.get(newsword[i]) == null) {
								wordcountmap.put(newsword[i], 1);
							}else
								wordcountmap.replace(newsword[i], (wordcountmap.get(newsword[i]) + 1));
						}
					}
					br.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				long end = System.currentTimeMillis();

				System.out.println("HashMap 실행속도: " + (end - start) + "ms");

				List<String> sortedmap = sortByValue(wordcountmap);
				for(int i = 0; i < 20; i++) {
					System.out.println((i + 1) + ".(" + sortedmap.get(i) + ", " + wordcountmap.get(sortedmap.get(i)) + ")");
				}
				
	}
	public static List sortByValue(final Map map) {
		List<String> list = new ArrayList();
		
		list.addAll(map.keySet());
		
		Collections.sort(list,new Comparator() {
			@Override
			public int compare(Object o1,Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable) v2).compareTo(v1);
			}
	});
		return list;
	}
}
