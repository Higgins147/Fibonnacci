
public class Fibonnacci {

	public static void main(String[] args) {
		
		int n = 6;
		System.out.println("The sum of the first " + n + " numbers are: " + fibIt(n));
		System.out.println("The sum of the first " + n + " numbers are: " + fibRec(n));
	}
	
	static int fibIt(int o){
		
		int a = 0;
		int b = 1;
		int temp = 0;
		int total = 0;
		
		if(o < 1){
			return 0;
		}
		
		for(int i = 1; i < o; i++){
			total = total + b;
			temp = b;
			b = a + b;
			a = temp;
		}
		return total;
	}
	
	static int fibRec(int f){
		if(f <= 1){
			return f;
		}
		else{
			return (fibRec(f - 1) + fibRec(f - 2)) + 1;
		} 
	}
}