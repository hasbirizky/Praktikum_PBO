public class Minuman extends Menu {
    private final String katagori_menu = "Minuman";

    public Minuman(String nama, int harga, String desk){
        super(nama, harga, desk);
    }

    public String getKatagori(){
        return katagori_menu;
    }

    @Override
    public void display(){
        System.out.println("Kategori: " + this.katagori_menu);
    }
}
