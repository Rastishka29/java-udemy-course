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

		// Constructors. Bank Account challenge.

		BankAccount felixBankAccount = new BankAccount("2907", 2900.500,
				"Felix Konovalenko", "felix@gmail.com", "+380931234567"
				);
		System.out.println("account name is " + felixBankAccount.getCustomerName());
		System.out.println("account number is " + felixBankAccount.getAccountNumber());
		System.out.println("account balance is " + felixBankAccount.getBalance());
		felixBankAccount.depositFunds(1300.30);
		felixBankAccount.depositFunds(-1300.30);
		System.out.println("account balance is " + felixBankAccount.getBalance());
		felixBankAccount.withdrawFunds(1999.00);
		System.out.println("account balance is " + felixBankAccount.getBalance());
		felixBankAccount.withdrawFunds(5000.00);
		System.out.println("account balance is " + felixBankAccount.getBalance());
		felixBankAccount.withdrawFunds((2201.8));
		System.out.println("account balance is " + felixBankAccount.getBalance());

		BankAccount defaultBankAccount = new BankAccount();
		System.out.println("account name is " + defaultBankAccount.getCustomerName());
		System.out.println("account number is " + defaultBankAccount.getAccountNumber());
		System.out.println("account balance is " + defaultBankAccount.getBalance());

		BankAccount benAccount = new BankAccount("Ben","ben@gmail.com",
				"+380939876543");
		System.out.println("account name is " + benAccount.getCustomerName());
		System.out.println("account number is " + benAccount.getAccountNumber());
		System.out.println("account balance is " + benAccount.getBalance());

		// Vip Customer Challenge

		VipCustomer defaultCustomer = new VipCustomer();
		System.out.println("Customer name " + defaultCustomer.getCustomerName());
		System.out.println("Customer name " + defaultCustomer.getCustomerEmail());
		System.out.println("Customer name " + defaultCustomer.getCreditLimit());

		VipCustomer vovaCustomer = new VipCustomer("Vova", "vova@gmail.com");
		System.out.println("Customer name " + vovaCustomer.getCustomerName());
		System.out.println("Customer name " + vovaCustomer.getCustomerEmail());
		System.out.println("Customer name " + vovaCustomer.getCreditLimit());

		VipCustomer olgaCustomer = new VipCustomer("Olga", 50000.00, "olga@gmail.com");
		System.out.println("Customer name " + olgaCustomer.getCustomerName());
		System.out.println("Customer name " + olgaCustomer.getCustomerEmail());
		System.out.println("Customer name " + olgaCustomer.getCreditLimit());

		// Coding Exercise 31. Wall area.

		Wall wall = new Wall(5,4);
		System.out.println("area= " + wall.getArea());

		wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());

	}
}
