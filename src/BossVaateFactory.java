public class BossVaateFactory extends AbstractFactory{
    public IVaatteet getVaatteet(String vaateTyyppi) {
        if (vaateTyyppi.equalsIgnoreCase("Boss")) {
            return new Boss();
        }
        return null;
    }
}
