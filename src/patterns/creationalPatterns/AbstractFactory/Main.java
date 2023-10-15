package patterns.creationalPatterns.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        GameApplication application = new GameApplication(new SpaceConcreteFactory());
        application.printParameters();

        application = new GameApplication(new BaseConcreteFactory());
        application.printParameters();


    }
}
