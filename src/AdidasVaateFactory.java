public class AdidasVaateFactory extends AbstractFactory {

    @Override
    public IVaatteet getVaatteet(String vaateTyyppi) {

        if (vaateTyyppi.equalsIgnoreCase("Adidas")) {
            return new Adidas();
        }

        return null;
    }
}
