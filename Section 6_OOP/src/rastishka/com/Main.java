package rastishka.com;

public class Main {

    public static void main(String[] args) {

    	// Car example
        Car porsche = new Car();
        Car holden = new Car();

        // System.out.println("Model is " + porsche.getModel()); // Model is null
        //porsche.setModel("911"); // Model is Unknown;

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel()); // Model is Carrera

		// Coding Exercise 30. Simple Calculator challenge.

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        // Coding Exercise 31. Person challenge.

		Person person = new Person();
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");
		System.out.println("fullName= " + person.getFullName());
    }
}
