package patterns.behavioralPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        MyCurrency currency = new MyCurrency(1);

        HundredDollarHandler dollarHandler1 = new HundredDollarHandler();
        DollarHandler dollarHandler2 = new FiftyDollarHandler();
        DollarHandler dollarHandler3 = new TenDollarHandler();

        dollarHandler1.setNextChain(dollarHandler2);
        dollarHandler2.setNextChain(dollarHandler3);

        try {
            dollarHandler1.process(currency);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
