
public class FermatsLastTheorem {

	public static void checkFermat(int a, int b, int c, int n) {
		int left = (int) (Math.pow(a, n) + Math.pow(b, n));
		int right = (int) Math.pow(c,n);
		if (n>2) {
			if (left == right) {
					System.out.println("Holy smokes, Fermat is wrong!");
				} else {
					System.out.println("No, that doesn't work");			
			} 
		}else {
				System.out.println(left == right);
			}
		}
	
	public static void main(String[] args) {
		checkFermat(1,5,3,1);

	}

}
