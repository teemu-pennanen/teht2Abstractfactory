public class Main {

    public static void main(String[] args) {

        System.out.println("Moi olen Jasper, opiskelen insinööriksi");
        AbstractFactory AF1 = VaateFactoryProducer.getFactory(true);
        IVaatteet Adidas = AF1.getVaatteet("Adidas");
        System.out.println(Adidas.toString());

        System.out.println("- Jasper valmistuu -");

        System.out.println("Hei olen Jasper, olen vihdoin insinööri :)");
        AbstractFactory AF2 = VaateFactoryProducer.getFactory(false);
        IVaatteet Boss = AF2.getVaatteet("Boss");
        System.out.println(Boss.toString());

    }
}
