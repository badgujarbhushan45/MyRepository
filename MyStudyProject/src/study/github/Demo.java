package study.github;

public class Demo {
	
	private int intValue;
	private String stringValue;
	private boolean valid;
	
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}	
	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}
	/**
	 * @param valid the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	public String toString() {
		
		return "Demo[intValue : "+ intValue +", stringValue : "+ stringValue +", valid : "+ valid +"]";
	}

}
