public class Menu {
    private String nama_menu;
    private String katagori_menu;
    private int harga_menu;
    private String deskripsi_menu;

    Menu(String nama, String katagori, int harga, String desk){
        this.nama_menu = nama;
        this.katagori_menu = katagori;
        this.harga_menu = harga;
        this.deskripsi_menu = desk;
    }

    public void SetNama(String nama){
        this.nama_menu = nama;
    }

    public void SetKatagori(String katagori){
        this.katagori_menu = katagori;
    }

    public void SetHarga(int harga){
        this.harga_menu = harga;
    }

    public void SetDesk(String desk){
        this.deskripsi_menu = desk;
    }
    
    public String getNama(){
        return nama_menu;
    }

    public String getKatagori(){
        return katagori_menu;
    }

    public int getHarga(){
        return harga_menu;
    }
    
    public String getDesk(){
        return deskripsi_menu;
    }
}
