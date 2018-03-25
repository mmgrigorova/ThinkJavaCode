
public class BottlesOnTheWall {

	public static void bottlesOnTheWall(int bottles) {
		if (bottles == 0) {
			noBottles();
		} else {
			bottlesLyrics(bottles);
			bottlesOnTheWall(bottles - 1);
		}
	}
	
	public static void noBottles() {
		System.out.println("No bottles of beer on the wall,\n" + 
				"no bottles of beer,\n" + 
				"ya’ can’t take one down, ya’ can’t pass it around,\n" + 
				"’cause there are no more bottles of beer on the wall!");
	}
	
	public static void bottlesLyrics(int bottles) {
		System.out.println(bottles + " bottles of beer on the wall,");
		System.out.println(bottles + " bottles of beer, \n" +
				"ya’ take one down, ya’ pass it around,");
	}
	
	public static void main(String[] args) {
		bottlesOnTheWall(4);

	}

}
