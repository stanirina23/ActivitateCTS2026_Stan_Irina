package clase;

public class YalaAdapter implements DispozitivSecuritate {
    private AdapteeYalaSmart yala;

    public YalaAdapter(AdapteeYalaSmart yala) {
        this.yala = yala;
    }

    @Override
    public void verificaIdentitate() {
        System.out.println("Adaptor: Se simuleaza verificarea identității pentru Yala Smart");
    }

}