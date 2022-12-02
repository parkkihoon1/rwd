package test_1202;

import java.util.Scanner;

public class MemberInsert extends Member {
	Scanner stdIn = new Scanner(System.in);
	
	public MemberInsert(String memberID, String password, String name) {  
		 super(memberID, password, name);
	}
	public void updateAddInfo() { 
		
		System.out.println("추가정보를 입력하시겠습니까?");
		System.out.println("추가정보를 입력하시려면Y, 그만하시려면 N을 입력해주세요");
		String answer = stdIn.nextLine();
		
		if(answer.equals("Y")) {
			System.out.println("주소를 입력해 주십시요>>>");
			String address = stdIn.nextLine();
			setAddress(address);
			System.out.println("이메일을 입력해주십시요>>>");
			String email = stdIn.nextLine();
			setEmail(email);
		}
		else {  
			System.out.println("회원가입 종료");
		}
	}
	public void printMemberInfo() {
		System.out.println("회원가입 정보는 아래와 같습니다.");
		System.out.println(toString());
	}
	
	public void login() {  
		System.out.println("로그인 정보를 입력해 주세요");
		
		System.out.println("아이디를 입력해주세요");
		String memberID = stdIn.nextLine();
		System.out.println("비밀번호를 입력해주세요");
		String password = stdIn.nextLine();
		
		if(memberID.equals(this.getMemberID()) && password.equals(this.getPassword())) {  
			System.out.println("로그인에 성공 했습니다.");
		}
		else{  
			System.out.println("로그인정보가 정확하지 않습니다.");
			login();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
