package star_pattren;

public class cross_pattren {
    public static void main(String[] args) {
     
    	int rows =	7;  // Given odd number
    	for(int i = 1;i<=rows;i++) {
    		for(int j = 1;j<=rows;j++) {
    			if(i==j|| i+j==rows+1) {
    				System.out.print(i);
    			}
    			else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
}
