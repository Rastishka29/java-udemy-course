package rastishka.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(FlourPackChallenge.canPack(1, 0, 4));
        System.out.println(FlourPackChallenge.canPack(1, 0, 5));
        System.out.println(FlourPackChallenge.canPack(0, 5, 4));
        System.out.println(FlourPackChallenge.canPack(2, 2, 11));
        System.out.println(FlourPackChallenge.canPack(-3, 2, 11));
        System.out.println(FlourPackChallenge.canPack(2, 1, 5));
        System.out.println(FlourPackChallenge.canPack(5, 4, 24));

    }
}
