package rastishka.com;

public class Main {

    public static void main(String[] args) {
	Car porsche = new Car();
	Car holden = new Car();

	// System.out.println("Model is " + porsche.getModel()); // Model is null
		//porsche.setModel("911"); // Model is Unknown;

	porsche.setModel("Carrera");
	System.out.println("Model is " + porsche.getModel()); // Model is Carrera
    }
}
