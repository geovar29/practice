
public class pattern {

	
	public void fibinocciseries() {
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
	
	public void task2() {
		
		int a=0,b=1,c;
		
		for(int i=1;i<=10;i++) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(c +" ");
		}
	}
	public static void main(String[] args) {
		
		pattern sn=new pattern();
		
		sn.task2();

	}

}
