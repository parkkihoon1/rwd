package test_1202;

public class Product { //��ǰ ���� Ŭ����. ��ٱ��� ������� ��ǰ�� ������
	private final int productID; //��ǰ�ڵ�
	private final String productName; //��ǰ�̸�
	private final int price; //����
	
	Product(int productID, String productName, int price){  
		this.productID = productID;
		this.productName =productName;
		this.price = price;
	}
	int getProductID() {  
		return productID;
	}
	String getProductName() {  
		return productName;
	}
	int getprice() {  
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
