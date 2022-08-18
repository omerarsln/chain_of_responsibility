public class DivideNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) { nextInChain = nextChain; }

    @Override
    public void calculate(Request request) {
        if (request.getCalcWanted() == "div") {
            System.out.print(request.getNumber1()
                    + " / "
                    + request.getNumber2()
                    + " = "
                    + (request.getNumber1() / request.getNumber2()));
        } else {
            if(nextInChain != null){
                nextInChain.calculate(request);
            }
            else{
                System.out.println("İşlem Yapılamadı");
            }
        }
    }
}
