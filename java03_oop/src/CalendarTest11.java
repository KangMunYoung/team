import java.util.Calendar;
import java.util.Scanner;
public class CalendarTest11 {
	Scanner scan = new Scanner(System.in);
	int year, month, date, week, lastDay; //  0
	
	CalendarTest11 () {}
		
		int getDate(String msg) {
//			Scanner scan = new Scanner(System.in);
			System.out.print(msg+"=");
			return this.scan.nextInt();
		}
		String setData() {
			year = (int)getDate("년도");
			month = (int)getDate("월");
			 
			System.out.printf("\t\t%d년 %d월\n",year,month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			return null;
		}
		void toDay() {
			Calendar date = Calendar.getInstance();
			date.set(year, month-1,1);//날짜 변경 1월->0, 2월->,...5월->4

			week = date.get(Calendar.DAY_OF_WEEK);
		}
		void endDay () {
			lastDay = 31;
			switch(month){
				case 4:
				case 6:
				case 9:
				case 11:
					lastDay=30; break;
				case 2:
					//년도가 4로 나누어지고 100으로 나누어지지 않ㄴ으면 윤년
					//400으로 나누어지면 윤년
					if(year%4==0 &&	year%100!=0 ){
						lastDay = 29;
					}else{
						lastDay = 28; 
					}
			}
		}
			void toDayOut() {
				for(int s=1; s<week; s++){
					System.out.print("\t");
				}
				for(int d=1; d<=lastDay; d++){
					System.out.print(d+"\t");
					if((d+week-1)%7==0){
						System.out.println();
					}
				}
				System.out.println();
			}
		void startCalendar() {
			setData();
			toDay();
			endDay ();
			toDayOut();
		}
				
	
		public static void main(String a[]) {
			CalendarTest11 cal = new CalendarTest11();
			cal.startCalendar();
			}
		}
	
		


