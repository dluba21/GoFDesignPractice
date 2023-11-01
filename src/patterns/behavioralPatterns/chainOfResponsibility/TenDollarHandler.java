package patterns.behavioralPatterns.chainOfResponsibility;

public class TenDollarHandler implements DollarHandler {

    private DollarHandler nextChainMember;

    @Override
    public void setNextChain(DollarHandler dollarHandler) {
        this.nextChainMember = dollarHandler;
    }

    public TenDollarHandler() {
    }

    @Override
    public void process(final MyCurrency currency) throws Exception {

        int quantity = currency.getAmount() / 10;
        int remainder = currency.getAmount() % 10;
        if (quantity != 0) {
            System.out.println("ATM has dispensed " + quantity + " banknote(s) of $10");
        }
        if (remainder != 0) {
            throw new Exception("No handler to process remained $" + remainder + " amount");
        }
    }
}