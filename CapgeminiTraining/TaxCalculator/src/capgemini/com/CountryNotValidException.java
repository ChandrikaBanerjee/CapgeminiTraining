package capgemini.com;

public class CountryNotValidException extends Exception {

	@Override
	public String toString() {
		return "The employee should be an Indian citizen for calculating tax.";
	}

	

}
