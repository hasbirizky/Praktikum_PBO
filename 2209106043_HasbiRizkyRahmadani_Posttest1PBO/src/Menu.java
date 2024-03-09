public class Menu {
    String nama_menu;
    String katagori_menu;
    int harga_menu;
    String deskripsi_menu;

    Menu(String nama, String katagori, int harga, String desk){
        this.nama_menu = nama;
        this.katagori_menu = katagori;
        this.harga_menu = harga;
        this.deskripsi_menu = desk;
    }

    void display(){
        System.out.println("Nama Menu : " + this.nama_menu);
        System.out.println("Katagori Menu : " + this.katagori_menu);
        System.out.println("Harga Menu : " + this.harga_menu);
        System.out.println("Deskripsi Menu : " + this.deskripsi_menu);
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
}
