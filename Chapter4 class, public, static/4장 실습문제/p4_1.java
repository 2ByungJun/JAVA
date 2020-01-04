class TV{
	String brand;
	int year;
	int inch;
	void show() { System.out.println(brand + "에서 만든 "
	                    + year + "년형 " + inch + "인치 TV"); }
	
	public TV(String brand,int year,int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
}


public class p4_1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}

}
