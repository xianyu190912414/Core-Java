/**
 * @version 1.10 2020-3-15
 * @author 19091
 *
 */
public class PairTest1 {
	public static void main(String[] args) {
		String[] words = {"Mary", "had", "a", "little", "lamb"};
		Pair<String> mn = ArrayAlg.minmax(words);
		System.out.println("min = " + mn.getFirst());
		System.out.println("max = " + mn.getSecond());
	}
}

class ArrayAlg {
	/**
	 * Gets the minimum and maximum of an array of Strings.
	 * @param a an array of Strings
	 * @return a pair with the min and max value, or null if a is null or empty.
	 */
	
	public static Pair<String> minmax(String[] a) {
		if(a == null || a.length == 0) return null;
		String min = a[0];
		String max = a[0];
		for(int i = 1; i < a.length; i ++) {
			if(min.compareTo(a[i]) > 0) min = a[i];
			if(max.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<>(min, max);
	}
}

class Pair<String> {
	private String first;
	private String second;
	
	public Pair() {first = null; second = null;}
	public Pair(String first, String second) {
		this.first = first; 
		this.second = second;
	}
	
	public String getFirst() {
		return first;
	}
	public String getSecond() {
		return second;
	}
}
