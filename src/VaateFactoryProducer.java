public class VaateFactoryProducer {
    public static AbstractFactory getFactory(boolean isAdidas) {
        if (isAdidas){
            return new AdidasVaateFactory();
        }
        else {
            return new BossVaateFactory();
        }
    }
}
