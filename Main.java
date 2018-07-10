public class Main {
	static int n1 = 0, n2 = 1, n3, count;
	static int[] myArr;
	public static void main(String args[]) {
		count = 5;
		System.out.print(n1+" "+n2);
		myArr = new int[count];
		myArr[0] = n1;
		myArr[1] = n2;
		fibonacci(count);
	}



	public static void fibonacci(int n) {
		
		if(n > 2){
			n3 = n2+n1;
			myArr[count-n+2] = n3;
			n--;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			n2 = n3;
			fibonacci(n);
		}else{
			System.out.println("       n1:"+n1+" n2:"+n2+" n3:"+n3);
		}
	}
}
