package study.github;

public class Test {

	public static Demo doSomething() {
		Demo demo = new Demo();
		demo.setIntValue(10);
		demo.setStringValue("String Value");
		
		return demo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Demo :: " + doSomething());

	}

}
