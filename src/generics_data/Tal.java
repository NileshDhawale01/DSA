package generics_data;

public class Tal extends State {

	private String talName;
	private String about;

	Tal(String talName, String about) {
		this.talName = talName;
		this.about = about;
	}

	Tal() {

	}

	public String getTalName() {
		return talName;
	}

	public void setTalName(String talName) {
		this.talName = talName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
