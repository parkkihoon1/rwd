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
			System.out.println("구매할 번호를 입력해 주십시요");
			productID = Integer.parseInt(scan.nextLine());
			System.out.println("상품의 구매 개수를 입력해 주십시오");
			cnt = Integer.parseInt(scan.nextLine());
			carts[count++] = new Cart(productID,cnt,prdutName);
			
			
			
			System.out.println("상점에서 상품을 더 구매 하시겠습니까?");
			System.out.println("더 구매를 원하시면Y, 쇼핑을 그만하시려면N을 입력해주십시요>>>>");
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
