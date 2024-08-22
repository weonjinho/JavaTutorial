package __0821_Lesson;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		int[] a = {20, 10, 30};
		
		int[] b = new int[3];
		// b[0] = b[a[2]];
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		int maxIndex = 0;
		int max = 0;
		for(int i=0;i<b.length;i++) {
			max = 0;
			for(int j=0;j<b.length-i;j++) {
				if(b[max]>b[j]) {
					max = j;
				}
			}
			System.out.println(b[max]);
			int temp = b[b.length-1-i];
			b[b.length-1-i]=b[max];
			b[max] = temp;
		}
		System.out.println(Arrays.toString(b));
		
	}

}
