public class Minuman extends Menu {
    private String katagori_menu = "minuman";

    public Minuman(String nama, int harga, String katagori, String desk){
        super(nama, harga, desk);
        this.katagori_menu = katagori;
    }

    public String getKatagori(){
        return katagori_menu;
    }

    public void display(){
        System.out.println(this.nama_menu);
        System.out.println(this.harga_menu);
        System.out.println(this.katagori_menu);
        System.out.println(this.deskripsi_menu);
    }
}
