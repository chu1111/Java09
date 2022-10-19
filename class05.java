package java09;

public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class CCount{
	 int cnt = 0;//類別變數，方便
	
	CCount(){
		count();
	}
	//實例函數
	void count() {
		cnt += 1;
	}
	void setZero(){
		cnt = 0;
	}
	void setValue(int n) {
		cnt = n;
	}
	
}