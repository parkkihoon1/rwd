package test_1202;

public class Cart {
	int prductID, cnt; String prdutName;
	Cart(int prductID, int cnt, String prdutName){  
		this.prductID = prductID; //상품코드
		this.cnt = cnt; //구매 개수
		this.prdutName =prdutName;
	}

	@Override
	public String toString() {
		return "상품번호: " + prductID + ",갯수 :" +cnt + ",상품이름:" + prdutName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
