public class Makanan extends Menu{
    private String katagori_menu = "Makanan";
    
    public Makanan(String nama, int harga, String katagori, String desk){
        super(nama, harga, desk);
        this.katagori_menu = katagori;
    }

    public String getKatagori(){
        return katagori_menu;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Kategori: " + this.katagori_menu);
    }
}
