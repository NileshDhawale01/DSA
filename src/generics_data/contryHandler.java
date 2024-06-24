package generics_data;

public class contryHandler {

	public static void main(String[] args) {

		Country country = new Country(91, "India");
		State state = new State(16, "Maharashtra");
		Tal tal = new Tal("Unknown", "unknown Tal!");

		String str = new String("Hii This is String");

		Country modifiledCountry = handleAnyData(country);
		State modifiledState = handleAnyData(state);
		Tal modifiledTal = handleAnyData(tal);

		// it will not work because String is not Country Class related --> String not a
		// child class of Country
//		handleAnyData(str);

		System.out.println("Data Is :: \nCountry Code is :: " + modifiledCountry.getContryCode()
				+ " Country Name Is :: " + modifiledCountry.getContryName() + "\nState Code Is :: "
				+ modifiledState.getStateCode() + " State Name Is :: " + modifiledState.getStateName()
				+ "\nTal Name Is :: " + modifiledTal.getTalName() + " Tal About Is :: " + modifiledTal.getAbout());

	}

	// this will handle all data come from country class or it's child classes
	public static <T extends Country> T handleAnyData(T data) {

		// here maintain hierarchy from child to parent
		if (data instanceof Tal tal) {

			tal.setTalName("Unknown Data Modified");
			tal.setAbout("unknown Tal! Modified Data");
			return (T) tal;

		} else if (data instanceof State state) {

			state.setStateName("Maharashtra Modified Data");
			return (T) state;
		} else if (data instanceof Country country) {

			country.setContryName("India Modified Data");
			return (T) country;
		}
		return data;
	}
}
