
public class Finbinocciseries {
   
	public static void fibinocciSeries(int b) {
		
			int a[]= {0,1};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		for(int i=0;i<=b;i++) {
			int c=a[0]+a[1];
			a[0]=a[1];
			a[1]=c;
			System.out.println(c);
		}
		
	}
	
	public static void factorial(int a) {
			int b[]= {1};
		
		for(int i=2;i<=a;i++) {
			
			int d=b[0]*i;
			
			b[0]=d;
		}
		System.out.println(b[0]);
	}
	
	
	public static void primenumber() {
		int a[]= {10,82,6,7,5,100};
		for(int i=0;i<a.length;i++) {
			
			for(int j=1;j<a[i];j++) {
				
				if(a[i]%j!=0) {
					
					System.out.println("this is prime number : " +a[i]);
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		//factorial of the number
		factorial(4);
		//fibinocci series
		fibinocciSeries(5);
		
		//prime number or not
		//int a[]= {10,82,6,7,5,100};
		primenumber();
		
		
		
		
		
		
		
	}

}
