package baseball.stats;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import java.util.ArrayList;

public class filereader {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:/Users/student/workspace/semiProject/src/baseball/stats/kin_sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		int lines = 0;
		List<List<String>> dataset = new ArrayList<List<String>>();
		
		while((s=br.readLine()) != null){
			ArrayList<String> row = new ArrayList<String>();
			System.out.println(s);
			for(String elem:s.split("\\t")){
				row.add(elem);
			}
			dataset.add(row);
		}
		
		System.out.println("");
		System.out.println("");
		
		int rowsize = dataset.size();
		int columnsize = dataset.get(0).size();
		
		for(int i=0;i<rowsize;i++){
			for(int j=0;j<dataset.get(i).size();j++){
				System.out.print(dataset.get(i).get(j) + " ");
			}
			System.out.println("");
		}
		fr.close();br.close();
	}
}
