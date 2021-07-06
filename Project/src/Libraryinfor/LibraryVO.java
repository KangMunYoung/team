package Libraryinfor;

public class LibraryVO {
	private String libraryId; //도서관 아이디
	private String libraryPwd; //도서관 비밀번호
	private String libraryName; //도서관 회원명
	private String tel; //연락처
	private String date; //가입날짜

	public LibraryVO() {
	}
	public LibraryVO(String libraryId,String libraryPwd, String libraryName,String tel,String date) {
		this.libraryId = libraryId;
		this.libraryPwd = libraryPwd;
		this.libraryName = libraryName;
		this.tel = tel;
		this.date = date;

	}
	
		public void lmPrint() {
			System.out.printf("%-10s %-10s %-10s %-15s %-10s\n",libraryId,libraryPwd,libraryName,tel,date);
		}
		//타이틀 출력
		public static void titlePrint() {
			System.out.printf("%-8s %-8s %-13s %-13s %-10s\n","아이디","비밀번호","회원이름","연락처","가입날짜");
	}
	
		public String getLibraryId() {
			return libraryId;
		}
		public void setLibraryId(String libraryId) {
			this.libraryId = libraryId;
		}
		public String getLibraryPwd() {
			return libraryPwd;
		}
		public void setLibraryPwd(String libraryPwd) {
			this.libraryPwd = libraryPwd;
		}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
	
