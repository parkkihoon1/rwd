package test_1202;

import java.util.Scanner;

public class MemberInsert extends Member {
	Scanner stdIn = new Scanner(System.in);
	
	public MemberInsert(String memberID, String password, String name) {  
		 super(memberID, password, name);
	}
	public void updateAddInfo() { 
		
		System.out.println("�߰������� �Է��Ͻðڽ��ϱ�?");
		System.out.println("�߰������� �Է��Ͻ÷���Y, �׸��Ͻ÷��� N�� �Է����ּ���");
		String answer = stdIn.nextLine();
		
		if(answer.equals("Y")) {
			System.out.println("�ּҸ� �Է��� �ֽʽÿ�>>>");
			String address = stdIn.nextLine();
			setAddress(address);
			System.out.println("�̸����� �Է����ֽʽÿ�>>>");
			String email = stdIn.nextLine();
			setEmail(email);
		}
		else {  
			System.out.println("ȸ������ ����");
		}
	}
	public void printMemberInfo() {
		System.out.println("ȸ������ ������ �Ʒ��� �����ϴ�.");
		System.out.println(toString());
	}
	
	public void login() {  
		System.out.println("�α��� ������ �Է��� �ּ���");
		
		System.out.println("���̵� �Է����ּ���");
		String memberID = stdIn.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���");
		String password = stdIn.nextLine();
		
		if(memberID.equals(this.getMemberID()) && password.equals(this.getPassword())) {  
			System.out.println("�α��ο� ���� �߽��ϴ�.");
		}
		else{  
			System.out.println("�α��������� ��Ȯ���� �ʽ��ϴ�.");
			login();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
