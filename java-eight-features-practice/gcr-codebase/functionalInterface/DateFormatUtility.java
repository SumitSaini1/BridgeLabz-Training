package FunctionalInterface;
interface Format{
	static String DateFormat(String date,String month,String year){
		StringBuilder formatDate=new StringBuilder();
		formatDate.append(date);
		formatDate.append("/");
		formatDate.append(month);
		formatDate.append("/");
		formatDate.append(year);
		return formatDate.toString();
		
	}
}
public class DateFormatUtility {

	public static void main(String[] args) {
		String date=Format.DateFormat("23", "7", "2025");
		System.out.println("FormatedDate"+ date);
		
		// TODO Auto-generated method stub

	}

}
