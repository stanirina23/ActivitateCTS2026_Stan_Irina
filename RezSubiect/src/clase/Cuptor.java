package clase;

public class Cuptor {
    String marca;
    private static Cuptor cuptor=null;


    @Override
    public String toString() {
        return "Cuptor{" +
                "marca='" + marca + '\'' +
                '}';
    }

    private Cuptor(String marca) {
        this.marca = marca;

    }

   public static synchronized Cuptor instanta(String marca){
        if(cuptor==null){
            cuptor=new Cuptor(marca);

        }

        return cuptor;
   }

}
