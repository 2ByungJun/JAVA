class Song{
	String title;
	String artist;
	int year;
	String country;
	
	public void show() { System.out.println( year + "년 "+ country +  
			             "국적의 " + artist + "가 부른 " + title ); }
	
	public Song() {
		title = ""; artist =""; year=1; country="";
	}
	
	public Song(String title,String artist,int year,String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

}

public class p4_3 {
	public static void main(String[] args) {
		Song mySong = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		mySong.show();
		
	}
}
