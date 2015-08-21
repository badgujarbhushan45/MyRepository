package study.github;

public class Demo {
	
	private int intValue;
	private String stringValue;
	
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
	
	public String toString() {
		
		return "Demo[intValue : "+ intValue +", stringValue : "+ stringValue +"]";
	}

}
