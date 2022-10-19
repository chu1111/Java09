package java09;

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj = new Caaa();//第一個建構元被呼叫
		Caaa obj2 = new Caaa(12);//第二個建構元被呼叫
	}

}
// hw9_3, 從某一建構元呼叫另一建構元
//不可為public，檔案的主檔名必須與public類別名稱相同
class Caaa
{
	private int value;//改為public不會有所改變，因為都在class內執行
	public Caaa()
	{
		//試填寫此處的程式碼，使得呼叫此建構元時，value的值會被設為10
		value = 10;
		System.out.println("value="+value);
	}
	public Caaa(int i)
	{
		value = i;
		System.out.println("value="+value);
	}
}
