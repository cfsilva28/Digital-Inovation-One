package digital_inovation_date;

import java.util.Date;

public class Util_Date {

	public static void main(String[] args) {

		long currentTimeMillis = System.currentTimeMillis();
		
		System.out.println(currentTimeMillis);

		Date novaData = new Date(currentTimeMillis);

		System.out.println(novaData);

	}

}
