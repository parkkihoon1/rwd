package test_1202;

import java.util.Scanner;

public class ShopCart {
	Scanner scan = new Scanner(System.in);
	Cart[] carts = new Cart[10];
	int count =0;
	int productID, cnt;
	String prdutName;
	
	public ShopCart() {  
		
	}
	public void selectProduct() {  
		while(true) {  
			System.out.println("������ ��ȣ�� �Է��� �ֽʽÿ�");
			productID = Integer.parseInt(scan.nextLine());
			System.out.println("��ǰ�� ���� ������ �Է��� �ֽʽÿ�");
			cnt = Integer.parseInt(scan.nextLine());
			carts[count++] = new Cart(productID,cnt,prdutName);
			
			
			
			System.out.println("�������� ��ǰ�� �� ���� �Ͻðڽ��ϱ�?");
			System.out.println("�� ���Ÿ� ���Ͻø�Y, ������ �׸��Ͻ÷���N�� �Է����ֽʽÿ�>>>>");
			String bb = scan.nextLine();
			
			if(bb.equals("Y")) {  
				continue;
			}
			else if (bb.equals("N")){
				break;
			}
		}
	}
	public void printCart() {
		for(Cart cart : carts) {  
			if(cart != null) {  
				System.out.println(cart);
			}
		}
	}
		
	
	public static void main(String[] args) {
		
	}
	
}
