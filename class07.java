package java09;
import static java.lang.System.out;
public class class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//呼叫建構元，直接呼叫
		power p = new power(2, 5);
		power p2 = new power(3, 2);
		
	}


}
class power{
	public power(int x, int n) {
		out.print(Math.pow(x, n));
	}
}