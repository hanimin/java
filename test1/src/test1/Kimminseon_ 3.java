package test1;


public class Kimminseon_2 {

	public static void main(String[] args) {
		int[] a = {83,90,87};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {		
			sum += a[i];
			count ++;
		}
		avg = (double)sum/count;
		System.out.println("sum: " + sum);
		System.out.println("avg:"+avg);

	}

}
