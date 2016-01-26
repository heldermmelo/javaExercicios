import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Convert {
		/**
		 * @param args
		 * @throws ParseException 
		 */
		/**
		 * @param args
		 * @throws ParseException
		 */
		/**
		 * @param args
		 * @throws ParseException
		 */
		public static void main(String[] args) throws ParseException{
			
			Scanner leitor = new Scanner(System.in);
			
			
			Pattern p = Pattern.compile("-?0[0-9](.)[0-9]?[A-Z]");
			
			
			System.out.print("Converta:");
			NumberFormat df=DecimalFormat.getInstance(Locale.ENGLISH);
			String p1=leitor.nextLine();
			
			Matcher m = p.matcher(p1);
			
			//String m1 = matcher.toString();
			//System.out.print(m1);
			
			double m2;
			
			if(m.find(0)==true){
				m2=df.parse(p1).doubleValue();
				System.out.print(m2);
			m2 = m2 * 4;
			System.out.print(m2);
			}else{
				System.out.print("nao conheço");
			}
			
		}
}


		