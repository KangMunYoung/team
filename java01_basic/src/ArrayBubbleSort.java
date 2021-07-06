

public class ArrayBubbleSort {

	public static void main(String[] args) {
		//1~100 사이의 난수를 10개 생성하여 배열대입후 오름차순으로 정렬하여 출력하라.
		
		int num[]= new int[10];
		
		//난수생성
		for(int i=0; i<num.length; i++) {//i=0,1,2,3,4....9
			int random = (int)(Math.random()*(100-1+1))+1;
			num[i] = random;
		}
		
		
		System.out.println("정렬전 데이타================");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+", ");
		}
		System.out.println();
		for(int j=0; j<num.length-1; j++) {//0,1,2,3,4,5,
			for(int i=0; i<num.length-1; i++) {//0,1,2,3,4,5,6,7,8
			if(num[i] > num[i+1]) {
				//교환하기
				int temp = num[i];
				num[i] = num[i+1];
				num[i+1] = temp;
				}
			}	
		}	
		System.out.println("정렬후 데이타============");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+", ");
			}
		System.out.println();
			}
}

