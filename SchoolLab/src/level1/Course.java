package level1;


public class Course {
	private String Number;
	private String Title;
	private int Unirs;
	
	
	
	public Course(String number, String title, int unirs) {
		super();
		Number = number;
		Title = title;
		Unirs = unirs;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getUnirs() {
		return Unirs;
	}
	public void setUnirs(int unirs) {
		Unirs = unirs;
	}

}
