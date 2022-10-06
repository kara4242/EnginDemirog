
public class Main1 {

	public static void main(String[] args) {
	
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] say1=new int[] {1,2,3};
		int[] say2=new int[] {10,20,30};
		say2[0]=1000;
		System.out.println(say1[0]);

	}

}
