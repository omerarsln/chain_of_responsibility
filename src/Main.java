public class Main {

    public static void main(String[] args) {

        Chain halka1 = new AddNumbers();
        Chain halka2 = new SubtractNumbers();
        Chain halka3 = new MultNumbers();
        Chain halka4 = new DivideNumbers();

        halka1.setNextChain(halka2);
        halka2.setNextChain(halka3);
        halka3.setNextChain(halka4);

        Request request = new Request(4, 2, "add");

        halka1.calculate(request);

    }
}
