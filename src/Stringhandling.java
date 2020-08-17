
public class Stringhandling {

	public static void main(String[] args) {
		
		String s="1234567890";
		
		String s1="login";
		String s3="login";
		
		char ab[]=s.toCharArray();
		
		
		for(int i=0;i<ab.length;i++)
		{
			System.out.println(ab[i]);
		}
		
		String s6=new String(ab);
		
		System.out.println(s6);
		
		
		
		System.out.println("hello".toUpperCase());
		
		System.out.println("hello".startsWith("he",0));
		
		
		String s4="hifdf and hello to hifdf to everyone because everyone is important ";
				
				
	System.out.println(s4.startsWith("hellohi"));
	System.out.println(s4.substring(10,20));
	
	System.out.println(s4.indexOf("hifdf",0));
		
	
		
	}

}

