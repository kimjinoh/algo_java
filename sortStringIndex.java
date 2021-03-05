import java.util.Arrays;
public class sortStringIndex {
	public String[] solution(String[] strings, int n) {
		// Arrays.sort(strings);
		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(n) > strings[j].charAt(n)) {
					String tmp = strings[i];
					strings[i] = strings[j];
					strings[j] = tmp;
				} else if (strings[i].charAt(n) == strings[j].charAt(n)) {
					if (strings[i].compareTo(strings[j]) > 0) {
						String tmp = strings[i];
						strings[i] = strings[j];
						strings[j] = tmp;
					}
				}
			}
		}
		return strings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = { "cccc", "fbbe", "abce", "abcd", "cdx", "axce", "axce", "axcf", "afce", "axcd" };
		int n = 2;
		sortStringIndex sol = new sortStringIndex();
		System.out.println(sol.solution(strings, n));
	}

}
