import java.util.*;

/**
 * This program runs the Sieve of Erathostenes benchmark. It computes all primes up to 2000000.
 * @version 1.10 2020-3-24
 * @author 19091
 *
 */

public class Sieve {
	public static void main(String[] args) {
		int n = 2000000;
		long start = System.currentTimeMillis();
		BitSet b = new BitSet(n + 1);
		int count = 0;
		int i;
		
		for(i = 2; i <= n; i ++) 
			b.set(i);
		i = 2;
		
		//分成两部分，第一部分是i^2 < n,第二部分是后面的所有。
		while(i * i <= n) {
			if(b.get(i)) {
				count ++;
				//去除i的2倍，3倍，4倍,...
				int k = 2 * i;
				while(k <= n) {
					b.clear(k);
					k += i;
				}
			}
			i ++;
		}
		while(i <= n) {
			if(b.get(i)) count ++;
			i ++;
		}
		long end = System.currentTimeMillis();
		System.out.println(count + " primes");
		System.out.println((end - start) + " milliseconds. ");
	}
}
