package patterns.behavioralPatterns.chainOfResponsibility;

public class FiftyDollarHandler implements DollarHandler {
    private DollarHandler nextChainMember;

    @Override
    public void setNextChain(DollarHandler dollarHandler) {
        this.nextChainMember = dollarHandler;
    }

    public FiftyDollarHandler() {
    }

    @Override
    public void process(final MyCurrency currency) throws Exception {
        if (currency.getAmount() / 50 > 0) {
            int quantity = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("ATM has dispensed " + quantity + " banknote(s) of $50");
            if (remainder != 0) { //<-- passes to the next handler or if rem == 0 then brakes processing of handlers
                this.nextChainMember.process(new MyCurrency(remainder));
                /* <-- handler that processed part that can be handled
                    by it and passed remainder part to next handler*/
            }
            //here
        }
        else if (currency.getAmount() != 0) {
            this.nextChainMember.process(currency); /* <-- handler can't process object and
                                                    just passes through itself to next handler */
        }
    }
}