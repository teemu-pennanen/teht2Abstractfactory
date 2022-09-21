public class Adidas implements IVaatteet{
    @Override
    public String merkinNimi() {
        return "Adidas";
    }

    @Override
    public String getYlaosa() {
        return "Adidkasen Tpaita";
    }

    @Override
    public String getAlaosa() {
        return "Adidaksen farkut";
    }

    @Override
    public String getHattu() {
        return "Adidaksen lippis";
    }

    @Override
    public String getKengat() {
        return "Adidaksen kengät";
    }

    @Override
    public String toString(){
        return "Päälläni on " + getYlaosa() + ", " + getAlaosa() + ", jalassa " +
                getKengat() + " ja päässä " + getHattu();
    }
}
