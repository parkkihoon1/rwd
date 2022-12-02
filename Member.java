package test_1202;

public class Member { //회원관련 모델 클래스
	private final String memberID; //아이디
	private String password; //비밀번호
	private String name; //이름
	private String address; //주소
	private String email; // 이메일
	
	Member(String memberID, String password, String name){  //생성자를 통해 입력
		this.memberID = memberID;
		this.password = password;
		this.name = name;
	}
	

	public String getPassword() {
		return password;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMemberID() {
		return memberID;
	}
	
	


	@Override
	public String toString() {
		System.out.println(("회원가입정보는 아래와 같습니다."));
		return "아이디: " + memberID + ", 이름 :" +  name + ", 주소:" + address + ", 이메일:" + email;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
