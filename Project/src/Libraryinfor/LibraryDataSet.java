package Libraryinfor;
import java.util.HashMap;

public class LibraryDataSet {
	public static HashMap<String, LibraryVO> libraryList = new HashMap<String,LibraryVO>();
	public LibraryDataSet() {
		
	}
	//기본데이터 셋팅
	public static void basicLmSet() {
		libraryList.put("ehgns507", new LibraryVO("ehgns507","1234","강감찬","010-4560-8794","2019-06-16"));
		libraryList.put("kimdohoon", new LibraryVO("kimdohoon","4567","김삿갓","010-7896-1895","2019-09-23"));
		libraryList.put("dohoon05", new LibraryVO("dohoon05","7890","장보고","010-8492-3564","2018-07-10"));
	}
}



