import java.io.*;
import java.util.*;

public class Main {
    private static InputStreamReader u = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(u);
    private static ArrayList<Menu> DataMenu = new ArrayList<>();
    private static Scanner enter = new Scanner(System.in);

    private static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void getch(){
        System.out.println("");
        System.out.print("Klik Enter Jika Ingin Kembali Ke Menu");
        enter.nextLine();
    }

    public static void main(String[] args) throws NumberFormatException, IOException{
        while(true){
            clear();
            System.out.println("Menu");
            System.out.println("1. Create Menu");
            System.out.println("2. Display Menu");
            System.out.println("3. Update Menu");
            System.out.println("4. Delete Menu");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih = Integer.parseInt(input.readLine());

            switch (pilih) {
                case 1:
                    CreateMenu();
                    break;
                case 2:
                    DisplayMenu();
                    getch();
                    break;
                case 3:
                    UpdateMenu();
                    break;
                case 4:
                    DeleteMenu();
                    break;
                case 5:
                    System.out.println("Anda Telah Keluar Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada");
                    break;
            }
        }
    }

    static void CreateMenu() throws NumberFormatException, IOException{
        clear();
        System.out.println("Tambah Menu");
        System.out.print("Masukkan Nama Menu : ");
        String nama_menu = input.readLine();
        System.out.print("Masukkan Katagori Menu : ");
        String katagori_menu = input.readLine();
        int harga_menu;
        while(true){
            try{
                System.out.print("Masukkan Harga Menu : ");
                harga_menu = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
            }
        }
        System.out.print("Masukkan Deskripsi Menu : ");
        String deskripsi_menu = input.readLine();
        Menu new_menu = new Menu(nama_menu, katagori_menu, harga_menu, deskripsi_menu);
        DataMenu.add(new_menu);
        System.out.println("");
        System.out.println("Menu Telah Ditambah");
        getch();
    }

    static void DisplayMenu(){
        clear();
        if(DataMenu.isEmpty()){
            System.out.println("Menu Belum Ada");
        }
        else{
            for(int i = 0; i < DataMenu.size(); i++){
                DataMenu.get(i).display();
            }
        }
    }

    static void UpdateMenu() throws NumberFormatException, IOException{
        clear();
        if(DataMenu.isEmpty()){
            System.out.println("Tidak Ada Menu, Tidak Dapat Melakukan Pembaruan Menu");
            getch();
            return;
        }
        DisplayMenu();
        System.out.print("Masukkan Menu Yang Ingin Diubah : ");
        String namamenu = input.readLine();
        boolean menuFound = false;
        for(int i = 0; i < DataMenu.size(); i++){
            Menu menu = DataMenu.get(i);
            if(menu.getNama().equals(namamenu)){
                menuFound = true;
                System.out.print("Masukkan Menu Baru : ");
                String namabaru = input.readLine();
                System.out.print("Masukkan Katagori Baru : ");
                String katagoribaru = input.readLine();
                int hargabaru;
                while(true){
                    try{
                        System.out.print("Masukkan Harga Baru : ");
                        hargabaru = Integer.parseInt(input.readLine());
                        break;
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Inputan Harus Berupa Angka");
                    }
                }
                System.out.print("Masukkan Deskripsi Baru : ");
                String deskbaru = input.readLine();
                menu.SetNama(namabaru);
                menu.SetKatagori(katagoribaru);
                menu.SetHarga(hargabaru);
                menu.SetDesk(deskbaru);
                System.out.println("");
                System.out.println("Menu Telah Diperbarui");
                getch();
            }
        }
        if(!menuFound){
            System.out.println("Menu Tidak Ada");
            getch();
        }
    }

    static void DeleteMenu() throws NumberFormatException, IOException{
        clear();
        if(DataMenu.isEmpty()){
            System.out.println("Tidak Ada Menu, Tidak Dapat Menghapus Menu");
            getch();
            return;
        }
        DisplayMenu();
        System.out.print("Masukkan Menu Yang Ingin Dihapus : ");
        String namamenu = input.readLine();
        boolean menuFound = false;
        for(int i = 0; i < DataMenu.size(); i++){
            if(DataMenu.get(i).nama_menu.equals(namamenu)){
                menuFound = true;
                DataMenu.remove(i);
                System.out.println("");
                System.out.println("Menu Telah Dihapus");
                getch();
            }
        }
        if(!menuFound){
            System.out.println("Menu Tidak Ada");
            getch();
        }
    }
}
