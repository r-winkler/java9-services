package greeter.cli;

public class Main {
	
	public static void main(String... args) {
		
		Iterable<Greeter> greters = ServiceLoader.load(Greeter.class);
		for (Greeter greeter: greeters) {
			System.out.println(greeter.sayHello());
		}
	}
}