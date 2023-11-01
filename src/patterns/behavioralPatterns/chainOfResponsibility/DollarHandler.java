package patterns.behavioralPatterns.chainOfResponsibility;

public interface DollarHandler {
    void process(MyCurrency currency) throws Exception;
    void setNextChain(DollarHandler dollarHandler);
}
