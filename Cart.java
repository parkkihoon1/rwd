package test_1202;

public class Cart {
	int prductID, cnt; String prdutName;
	Cart(int prductID, int cnt, String prdutName){  
		this.prductID = prductID; //��ǰ�ڵ�
		this.cnt = cnt; //���� ����
		this.prdutName =prdutName;
	}

	@Override
	public String toString() {
		return "��ǰ��ȣ: " + prductID + ",���� :" +cnt + ",��ǰ�̸�:" + prdutName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
