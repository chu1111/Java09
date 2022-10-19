package java09;
import static java.lang.System.out;
public class class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//呼叫建構元，直接呼叫
		add2n add = new add2n(5);
		add2n add2 = new add2n(10);
		
	}


}
class add2n{
	
	
	 

	public  add2n(int n) {
		//建立變數，存放相加值
		int sum = 0;
		//開始相加
		for (int i = n; i > 0; i--) {
			sum += i;
		}
		out.print(sum);
	}
}
