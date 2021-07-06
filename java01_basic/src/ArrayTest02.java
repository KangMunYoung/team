
public class ArrayTest02 {

	public static void main(String[] args) {
		// 2차원 : 행과 열을 가진다.
		
		//배열의 선언
		//      행 열 
		int data[][] = new int[5][5]; //int 25개를 저장가능한 변수가 생성됨
		
		data[0][3] = 100;
		data[1][2] = 85;
		data[1][4] = 84;
		data[3][3] = 77;
		
		//2차원 배열			length:1차원배열일때 변수의 갯수, 2차원배열일때는 행의수
		for(int r=0; r<data.length; r++) {//행의 수 만큼
			for(int c=0; c<data[r].length; c++) { // data[r].length-> r행의 칸수
				System.out.print(data[r][c]+"\t");
			}
			System.out.println();
		}
		
		//2차원 배열의 초기값 설정
		String[][] jusorok = {
								{"홍길동","010-4568-9999","asdf@nate.com"},
								{"이순신","010-1234-456","ewgwe@nate.com"},
								{"세종대왕","010-8795-4895","cccc@nate.com"}
								
					};
		
		
		for(int r=0; r<jusorok[r].length; r++) {
			for(int c=0; c<jusorok[r].length; c++) {
			System.out.print(jusorok[r][c]+"\t");
		}
			System.out.println();
			}
	}
}


