public class Snack extends Menu {
    private String katagori_menu = "snack";

    public Snack(String nama, int harga, String desk){
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
