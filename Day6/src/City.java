
public class City extends State {
	public String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

//	public City(String cityName) {
//		super();
//		this.cityName = cityName;
//		this.countryName;
//		this.stateName;
//	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", stateName=" + stateName + ", countryName=" + countryName + "]";
	}
	
	
	

	
}
