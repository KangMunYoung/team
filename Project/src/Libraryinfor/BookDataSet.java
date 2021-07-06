package Libraryinfor;
import java.util.HashMap;

public class BookDataSet {
	
	private static String lenderFirst;
	private static String loginCheck;
	
	public static HashMap<String, BookVO> bookList = new HashMap<String,BookVO>();
	public BookDataSet() {
		
	}
	//대여가능책 셋팅
	public static void basicBook() {
		bookList.put("동백꽃필무렵", new BookVO("동백꽃필무렵","동백이","16000","","대여가능"));
		bookList.put("프로듀사", new BookVO("프로듀사","김수현","20000","","대여가능"));
		bookList.put("고구려7", new BookVO("고구려7","김진명","15000","","대여가능"));
		bookList.put("고양이생활", new BookVO("고양이생활","고양이","12000","","대여가능"));
		bookList.put("무례한상속", new BookVO("무례한상속","김선영","13000","","대여가능"));
	}
	
	public static String getLenderFirst() {
		return lenderFirst;
	}
	public static void setLenderFirst(String lenderFirst) {
		BookDataSet.lenderFirst = lenderFirst;
	}
	public static String getLoginCheck() {
		return loginCheck;
	}
	public static void setLoginCheck(String loginCheck) {
		BookDataSet.loginCheck = loginCheck;
	}
	
	
}
