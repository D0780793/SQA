
package demo;


public class Swimming_pool {
	public int swimming_pool (int date,boolean member , int age , int time , boolean group ) {
		int price = 0;
		if(date>0 && date<6) {
			if(age<=12 || age>=60) {
				if(age<3 || age >75) {
					price = 0;
				}
				else {
					price = 160;
				}
			}
			else {
				price = 200;
			}
		}
		else {
			price = 125;
		}
		return price;
	}
}

