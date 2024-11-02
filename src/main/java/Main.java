package rechw;

public class Main {

	public static void main(String[] args) {
		public int Positive(int j, int [] a ) {
			int count = 0;
			if(a[j] = 0)
				return count;
			if(a[i]>0) {
				count++;
			}
			return Positive(j--, a);
						
		}
		public int location(int n, int [] a, int i) {
			if(i>a.length) {
				return -1;
			}
			if(a[i] = n) {
				return i;
			}
			return location(n, a, i++);
			
		}
		public boolean uprising(int [] a, int i, int n) {
			if(a[i]<n) {
				return false
			}
			if (i>a.length) {
				return true;
			}
			return uprising(a, i++, n+=a[i]);
		}
	}

}
