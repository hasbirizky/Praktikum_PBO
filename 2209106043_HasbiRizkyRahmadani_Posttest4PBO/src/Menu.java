public class Menu {
    protected String nama_menu;
    protected int harga_menu;
    protected String deskripsi_menu;

    Menu(String nama, int harga, String desk){
        this.nama_menu = nama;
        this.harga_menu = harga;
        this.deskripsi_menu = desk;
    }

    public void display(){
        
    }

    public void SetNama(String nama){
        this.nama_menu = nama;
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

    public int getHarga(){
        return harga_menu;
    }
    
    public String getDesk(){
        return deskripsi_menu;
    }
}
