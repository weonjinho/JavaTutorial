package __0821_Lesson;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word1b = "진호";
		String word2b = "!@#$";
		String a = word1b + word2b;
		System.out.println(a);
		
		String word1a = "진호";
		String word2a = "!@#$";
		String b = word1a + word2a;
		System.out.println(b);
		int cnt = 0;
		int cnt_wrong = 0;
		if(word1b.equals(word1a)) {
			cnt += word1a.length();
			System.out.println("일치");
		}else {
			for(int i = 0; i < word1b.length(); i++) {
				if(word1b.charAt(i) == word1a.charAt(i)) {
					cnt++;
				}else {
					cnt_wrong++;
				}				
			}
		}
		System.out.println(cnt);
		System.out.println((double) 1.0 - (cnt_wrong/word1a.length()));
	}
}
