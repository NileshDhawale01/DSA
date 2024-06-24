package generics_data;

public class Country {

	private Integer contryCode;
	private String contryName;

	Country(Integer contryCode, String contryName) {
		this.contryCode = contryCode;
		this.contryName = contryName;
	}

	Country() {

	}

	public Integer getContryCode() {
		return contryCode;
	}

	public void setContryCode(Integer contryCode) {
		this.contryCode = contryCode;
	}

	public String getContryName() {
		return contryName;
	}

	public void setContryName(String contryName) {
		this.contryName = contryName;
	}

}
