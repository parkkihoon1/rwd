package test_1202;

import java.util.Scanner;

public class ShopProduct {
	Scanner stdIn = new Scanner(System.in);
	
	public void printProduct() { 
	
		Product sp1 = new Product( 1, "블랜딩커피", 5000);
		Product sp2 = new Product( 2, "파나마게이샤", 15000);
		Product sp3 = new Product( 3, "이디오피아 커피", 10000);
		
		System.out.println(sp1.getProductID() + sp1.getProductName() + sp1.getprice());
		System.out.println(sp2.getProductID() + sp2.getProductName() + sp2.getprice());
		System.out.println(sp3.getProductID() + sp3.getProductName() + sp3.getprice());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
