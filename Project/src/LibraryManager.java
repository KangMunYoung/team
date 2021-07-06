import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;


import Libraryinfor.BookDataSet;
import Libraryinfor.BookVO;
import Libraryinfor.LibraryDataSet;
import Libraryinfor.LibraryVO;

public class LibraryManager {
	Scanner scan = new Scanner(System.in);
	String menuTitle = "메뉴[1.회원목록, 2.회원 추가, 3.회원 삭제 , 4.대여가능책 목록, 5.책추가, 6.삭제, 7.로그아웃, 8.종료]";
	String bookTitle = "메뉴[1.대여가능한 책 목록, 2.검색, 3.반납, 4.대여, 5.로그아웃]";
	
	public LibraryManager() {
	}
	public void start() {
		Scanner scan = new Scanner(System.in);
		String Wel = "[1.로그인, 2.관리자로그인, 3.회원가입]";
		System.out.println("=========================================");
		String come = inData(Wel);
		System.out.println("=========================================");
		LibraryDataSet.basicLmSet();
		String loginCheck = BookDataSet.getLoginCheck();
		if(come.equals("1")) {//회원
			LibraryVO vo = new LibraryVO();
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 :");
			String libraryId = scan.nextLine();
			System.out.print("비밀번호 :");
			String libraryPwd = scan.nextLine();
			String somePwd = "";
			
			int count = 0;
			
			Collection<LibraryVO> LibraryCollection = LibraryDataSet.libraryList.values();
			Iterator<LibraryVO> LibraryIterator = LibraryCollection.iterator();
			while(LibraryIterator.hasNext())  { // 로그인 정보 만큼 반복
			
				LibraryVO idLogin = LibraryIterator.next();
				if(libraryId.equals(idLogin.getLibraryId())) { 
					somePwd = idLogin.getLibraryPwd();
						if(LibraryDataSet.libraryList.containsKey(libraryId)) {
							if(somePwd.equals(libraryPwd)) {
								System.out.println("로그인 되었습니다.");

								
								if(loginCheck == null) {
									BookDataSet.basicBook();
									}
								BookDataSet.setLoginCheck("Y");
								BookDataSet.setLenderFirst(libraryId);
								bookProcessStart();
								break;
							}else{
								System.out.println("아이디와 비밀번호가 일치하지않습니다.");
								start();
								break;
							}
						}
					}else{
						count++;
						
					}
				}
			if(count ==  LibraryDataSet.libraryList.size() ) {
				System.out.println("등록된 아이디가 없습니다.");
				start();
			}
		
  //------------------------------------------------------------------------ 

			
			
		}else if(come.equals("2")) {//관리자
			boolean logResult=false;
			do {
			//로그인
			String userid = inData("아이디");
			String userpwd = inData("비밀번호");
			Login log = new Login();
			logResult = log.loginCheck(userid, userpwd);//
			}while(!logResult);
			System.out.println("관리자모드로 로그인 하셨습니다.");
			
			//로그인 성공하면 오는곳
			//사원의 기본정보 생성
			if(loginCheck == null) {
				BookDataSet.basicBook();
				}
			BookDataSet.setLoginCheck("Y");
			LibraryDataSet.basicLmSet();
			
		
			LmProcessStart();
		
		
		}else if(come.equals("3")) {//회원가입
			
			String id = inData("아이디");
			String pwd = inData("비밀번호");
			String name = inData("이름");
			String number = inData("연락처");
			String dd = inData("등록일");
			System.out.println("회원가입이 완료되었습니다.");
			LibraryDataSet.libraryList.put(id, new LibraryVO(id,pwd,name,number,dd));
			start();
			System.out.printf("%-10s %-10s %-10s %-15s %-10s\n",id,pwd,name,number,dd);
		}else {
		
		System.out.println("메뉴를 선택해주세요");
		start();
		}
	
	}
	

	public void bookProcessStart() {
		do {
			//메뉴입력
			System.out.println("============================================================");
			String menuu = inData(bookTitle);
			System.out.println("============================================================");
			if(menuu.equals("1")) {//대여가능한 책
				allBookList();
			}else if(menuu.equals("5")) {
				System.out.println("로그아웃 하셨습니다.");
				start();
				break;
			}else if(menuu.equals("2")) {//검색
				System.out.print("검색하실 책 제목을 입력해주세요:");
				String findbooks = scan.nextLine();
				//String somebooks = "";
				
				
				Collection<BookVO> list = BookDataSet.bookList.values();
				Iterator<BookVO> bb = list.iterator();
			
				while(bb.hasNext()) {
					BookVO vb = bb.next();
					if(BookDataSet.bookList.containsKey(findbooks)) {	
						if(vb.getBookName().equals(findbooks)) {
						BookVO.bookPrint();
						vb.booPrint();
						break;
						}
					}else {
						System.out.println("검색하신 책이 없습니다.");
						
						break;
					}
				}
				
				
			
			}else if(menuu.equals("3")) {//반납
				System.out.print("반납하실 책제목을 입력해주세요 :");
				Collection<BookVO> list = BookDataSet.bookList.values();
				Iterator<BookVO> bb = list.iterator();
				String buybooks = scan.nextLine();
			
				
				
				while(bb.hasNext()) {
					BookVO vb = bb.next();
					if(BookDataSet.bookList.containsKey(buybooks)) {	
						if(vb.getBookName().equals(buybooks)) {
							if(vb.getLenderCheck().equals("대여불가")) {
								if(BookDataSet.getLenderFirst().equals(vb.getLender())){
									vb.setLender("");
									vb.setLenderCheck("대여가능");
									System.out.println("반납되었습니다.");	
									break;
								}else {
									System.out.println("반납 불가능한 책입니다.");
									break;
								}
							}else {
								System.out.println("반납 불가능한 책입니다.");
								break;
							}
						}
					}else {
						System.out.println("검색하신 책이 없습니다.");
						break;
					}
				}
		
			}else if(menuu.equals("4")) {//대여
				System.out.print("대여하실 책제목을 입력해주세요 :");
				Collection<BookVO> list = BookDataSet.bookList.values();
				Iterator<BookVO> bb = list.iterator();
				String buybooks = scan.nextLine();
			
				
				
				while(bb.hasNext()) {
					BookVO vb = bb.next();
					if(BookDataSet.bookList.containsKey(buybooks)) {	
						if(vb.getBookName().equals(buybooks)) {
							if(vb.getLenderCheck().equals("대여가능")) {
								vb.setLender(BookDataSet.getLenderFirst());
								vb.setLenderCheck("대여불가");
								System.out.println("대여되었습니다.");
								break;
							}else {
								System.out.println("대여가 불가능한 책입니다.");
								break;
							}
						}
					}else {
						System.out.println("검색하신 책이 없습니다.");
						break;
					}
				}
		
					}else {
				System.out.println("메뉴를 잘못선택하였습니다. 다시 입력하세요.");
						}
					}while(true);
	}			

	
			
	//메뉴
	public void LmProcessStart() {
		do {
			//메뉴입력
			System.out.println("============================================================================================");
			String menu = inData(menuTitle);
			System.out.println("============================================================================================");
			if(menu.equals("1")) {//회원목록
				allLibraryList();
			}else if(menu.equals("2")) {//회원 추가
				 LibraryInsert();
				
			}else if(menu.equals("3")) {//회원 삭제
				libraryDelete();
				
			}else if(menu.equals("4")) {//대여가능책목록
				allBookList();
				//bookInsert();
			}else if(menu.equals("5")) {//책추가
				bookInsert();
				
			}else if(menu.equals("6")) {//책삭제
				bookDelete();
			}else if(menu.equals("7")) {//로그아웃
				System.out.println("로그아웃 하셨습니다.");
				start();
			}else if(menu.equals("8")) {//종료
			
				System.err.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}else {
				System.out.println("메뉴를 잘못선택하였습니다. 다시 입력하세요.");
			}
		}while(true);
	}
	
	//회원전체목록 출력하기
	public void allLibraryList() {
		LibraryVO.titlePrint();
		Collection<LibraryVO> list = LibraryDataSet.libraryList.values();
		Iterator<LibraryVO> ii = list.iterator();
		while(ii.hasNext()) {
		LibraryVO vo = ii.next();
		vo.lmPrint();
		}
	}
	//대여가능책 목록 출력하기
		public void allBookList() {
			BookVO.bookPrint();
			Collection<BookVO> list = BookDataSet.bookList.values();
			Iterator<BookVO> bb = list.iterator();
			while(bb.hasNext()) {
			BookVO vb = bb.next();
			if(vb.getLenderCheck().equals("대여가능")) {
				vb.booPrint();
			}
		
		
		}
	}
			public void LibraryInsert() {
				//1명의 사원정보를 저장할 VO객체 생성하기
				LibraryVO vo = new LibraryVO();
				vo.setLibraryId(inData("아이디"));
				vo.setLibraryPwd(inData("비밀번호"));
				vo.setLibraryName(inData("회원이름"));
				vo.setTel(inData("연락처"));
				vo.setDate(inData("회원가입일"));
				LibraryDataSet.libraryList.put(vo.getLibraryName(), vo);
			}
			//사원삭제
			public void libraryDelete() {
				String delName = inData("삭제할 회원명");
				LibraryDataSet.libraryList.remove(delName);
			}
			
			//책삭제
			public void bookDelete() {
				String delBook = inData("삭제할 책");
				BookDataSet.bookList.remove(delBook);

			}//책 추가
			public void bookInsert() {
			BookVO vo = new BookVO();
			
			vo.setBookName(inData("책 이름"));//사원번호
			vo.setBookWriter(inData("책 저자"));
			vo.setPrice(inData("책 가격"));
			vo.setLenderCheck("대여가능");
			vo.setLender("");
			
		
			BookDataSet.bookList.put(vo.getBookName(), vo);
			}
	

		private String inData(String menuTitle) {
			System.out.print(menuTitle+"->");
			return scan.nextLine();
	


	}

}
