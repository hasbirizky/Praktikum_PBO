public class Makanan extends Menu{
    private final String katagori_menu = "Makanan";
    
    public Makanan(String nama, int harga, String desk){
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
