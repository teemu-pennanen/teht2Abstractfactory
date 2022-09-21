public class Boss implements IVaatteet{
    @Override
    public String merkinNimi() {
        return "Boss";
    }

    @Override
    public String getYlaosa() {
        return "Boss:n Tpaita";
    }

    @Override
    public String getAlaosa() {
        return "Boss:n farkut";
    }

    @Override
    public String getHattu() {
        return "Boss:n lippis";
    }

    @Override
    public String getKengat() {
        return "Boss:n kengät";
    }

    @Override
    public String toString(){
        return "Päälläni on " + getYlaosa() + ", " + getAlaosa() + ", jalassa " +
                getKengat() + " ja päässä " + getHattu();
    }
}
