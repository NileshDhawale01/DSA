package generics_data;

public class State extends Country {

	private Integer stateCode;
	private String stateName;

	State(Integer stateCode, String stateName) {
		this.stateCode = stateCode;
		this.stateName = stateName;
	}

	State() {

	}

	public Integer getStateCode() {
		return stateCode;
	}

	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
