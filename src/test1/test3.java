package test1;

public class test3 {

	public static void main(String[] args) {
		try{
			int a = 100;
			int b =0;
			int c = a/b;
			System.out.println("value of "+c);
		}catch(Exception e){
			System.out.println("value of C should not be zero");
		}

	}

}
