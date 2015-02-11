import java.util.ArrayList;

public class IndexEntry {
	public String word;
	public ArrayList<Integer> numsList;
	
	public IndexEntry(String wordy){
		word = wordy.toUpperCase();
		numsList=new ArrayList<Integer>();
	}
	public void add(int num){
		for (int i = 0; i >= 0; i++){
			if (numsList.contains(num) == false){
				numsList.add(num);
			}
		}
	}
	public String getWord(){
		return word;
	}
	public String toString(){
		String returnedString = word;
		for (int pageNum : numsList){
			returnedString += pageNum + ",";
		}
		return (returnedString.substring(returnedString.length()-2));
	}
}
