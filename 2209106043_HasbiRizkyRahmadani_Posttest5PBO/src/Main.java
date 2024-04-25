import java.io.*;
import java.util.*;

public class Main {
    private static InputStreamReader u = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(u);
    private static Scanner enter = new Scanner(System.in);
    static Restoran resto = new Restoran();

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
                    menuCreate();;
                    break;
                case 2:
                    menuDisplay();
                    getch();
                    break;
                case 3:
                    menuUpdate();
                    break;
                case 4:
                    menuDelete();
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

    static void menuCreate() throws NumberFormatException, IOException{
        clear();
        System.out.println("Menu Tambah");
        System.out.println("1. Tambah Makanan");
        System.out.println("2. Tambah Minuman");
        System.out.println("3. Tambah Snack");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilih;
        while(true){
            try{
                System.out.print("Masukkan Pilihan Anda : ");
                pilih = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
                System.out.print("");
            }
        }
        switch (pilih) {
            case 1 :
                CreateMakanan();
                break;
            case 2 :
                CreateMinuman();
                break;
            case 3 :
                CreateSnack();
                break;
            case 4 :
                break;
            default :
                System.out.println("Pilihan Tidak Ada");
                break;
        }
    }

    static void CreateMakanan() throws NumberFormatException, IOException{
        clear();
        System.out.println("Tambah Makanan");
        System.out.print("Masukkan Nama Makanan : ");
        String nama_makanan = input.readLine();
        int harga_makanan;
        while(true){
            try{
                System.out.print("Masukkan Harga Makanan : ");
                harga_makanan = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
            }
        }
        System.out.print("Masukkan Deskripsi Makanan : ");
        String desk_makanan = input.readLine();
        Makanan newMakanan = new Makanan(nama_makanan, harga_makanan, desk_makanan);
        resto.add(newMakanan);
        System.out.println("");
        System.out.println("Makanan Telah Ditambah");
        getch();
    }

    static void CreateMinuman() throws NumberFormatException, IOException{
        clear();
        System.out.println("Tambah Minuman");
        System.out.print("Masukkan Nama Minuman : ");
        String nama_minuman = input.readLine();
        int harga_minuman;
        while(true){
            try{
                System.out.print("Masukkan Harga Minuman : ");
                harga_minuman = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
            }
        }
        System.out.print("Masukkan Deskripsi Minuman : ");
        String desk_minuman = input.readLine();
        Minuman newMinuman = new Minuman(nama_minuman, harga_minuman, desk_minuman);
        resto.add(newMinuman);
        System.out.println("");
        System.out.println("Minuman Telah Ditambahkan");
        getch();
    }

    static void CreateSnack() throws NumberFormatException, IOException{
        clear();
        System.out.println("Tambah Snack");
        System.out.print("Masukkan Nama Snack : ");
        String nama_snack = input.readLine();
        int harga_snack;
        while(true){
            try{
                System.out.print("Masukkan Harga Snack : ");
                harga_snack = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
            }
        }
        System.out.print("Masukkan Deskripsi Snack : ");
        String desk_snack = input.readLine();
        Snack newSnack = new Snack(nama_snack, harga_snack, desk_snack);
        resto.add(newSnack);
        System.out.println("");
        System.out.println("Snack Telah Ditambahkan");
    }

    static void menuDisplay() throws NumberFormatException, IOException{
        clear();
        System.out.println("Menu Display");
        System.out.println("1. Display Makanan");
        System.out.println("2. Display Minuman");
        System.out.println("3. Display Snack");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilih;
        while(true){
            try{
                System.out.print("Masukkan Pilihan Anda : ");
                pilih = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
                System.out.print("");
            }
        }
        switch (pilih) {
            case 1 :
                resto.displayMakanan(input);
                break;
            case 2 :
                resto.displayMinuman(input);
                break;
            case 3 :
                resto.displaySnack(input);
                break;
            case 4 :
                break;
            default :
                System.out.println("Pilihan Tidak Ada");
                break;
        }
    }
    
    static void menuUpdate() throws NumberFormatException, IOException{
        clear();
        System.out.println("Menu Update");
        System.out.println("1. Update Makanan");
        System.out.println("2. Update Minuman");
        System.out.println("3. Update Snack");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilih;
        while(true){
            try{
                System.out.print("Masukkan Pilihan Anda : ");
                pilih = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
                System.out.print("");
            }
        }
        switch (pilih) {
            case 1 :
                UpdateMakanan();
                break;
            case 2 :
                UpdateMinuman();
                break;
            case 3 :
                UpdateSnack();
                break;
            case 4 :
                break;
            default :
                System.out.println("Pilihan Tidak Ada");
                break;
        }
    }

    static void menuDelete() throws NumberFormatException, IOException{
        clear();
        System.out.println("Menu Delete");
        System.out.println("1. Delete Makanan");
        System.out.println("2. Delete Minuman");
        System.out.println("3. Delete Snack");
        System.out.println("4. Exit");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilih;
        while(true){
            try{
                System.out.print("Masukkan Pilihan Anda : ");
                pilih = Integer.parseInt(input.readLine());
                break;
            }
            catch(NumberFormatException ex){
                System.out.println("Inputan Harus Berupa Angka");
                System.out.print("");
            }
        }
        switch (pilih) {
            case 1 :
                DeleteMakanan();
                break;
            case 2 :
                DeleteMinuman();
                break;
            case 3 :
                DeleteSnack();
                break;
            case 4 :
                break;
            default :
                System.out.println("Pilihan Tidak Ada");
                break;
        }
    }

    static void UpdateMakanan() throws NumberFormatException, IOException{
        clear();
        if(resto.getMakanan().isEmpty()){
            System.out.println("Tidak Ada Menu, Tidak Dapat Melakukan Pembaruan Menu");
            getch();
            return;
        }
        resto.displayMakanan(input);
        System.out.print("Masukkan Nama Makanan Yang Ingin Diubah : ");
        String namaMakanan = input.readLine();
        boolean makananFound = false;
        for(int i = 0; i < resto.getMakanan().size(); i++){
            Makanan makan = resto.getMakanan().get(i);
            if(makan.getNama().equalsIgnoreCase(namaMakanan)){
                makananFound = true;
                System.out.print("Masukkan Makanan Baru : ");
                String makananBaru = input.readLine();
                int hargaBaru;
                while(true){
                    try{
                        System.out.print("Masukkan Harga Baru : ");
                        hargaBaru = Integer.parseInt(input.readLine());
                        break;
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Inputan Harus Berupa Angka");
                    }
                }
                System.out.print("Masukkan Deskripsi Baru : ");
                String deskBaru = input.readLine();
                makan.SetNama(makananBaru);
                makan.SetHarga(hargaBaru);
                makan.SetDesk(deskBaru);
                System.out.println("");
                System.out.println("Menu Telah Diperbarui");
                getch();
            }
        }
        if(!makananFound){
            System.out.println("Menu Tidak Ada");
            getch();
        }
    }

    static void UpdateMinuman() throws NumberFormatException, IOException{
        clear();
        if(resto.getMinuman().isEmpty()){
            System.out.println("Tidak Ada Menu, Tidak Dapat Melakukan Pembaruan Menu");
            getch();
            return;
        }
        resto.displayMinuman(input);
        System.out.print("Masukkan Nama Minuman Yang Ingin Diubah : ");
        String namaMinuman = input.readLine();
        boolean minumanFound = false;
        for(int i = 0; i < resto.getMinuman().size(); i++){
            Minuman minum = resto.getMinuman().get(i);
            if(minum.getNama().equalsIgnoreCase(namaMinuman)){
                minumanFound = true;
                System.out.print("Masukkan Nama Minuman Baru : ");
                String minumanBaru = input.readLine();
                int hargaBaru;
                while(true){
                    try{
                        System.out.print("Masukkan Harga Baru : ");
                        hargaBaru = Integer.parseInt(input.readLine());
                        break;
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Inputan Harus Berupa Angka");
                    }
                }
                System.out.print("Masukkan Deskripsi Baru : ");
                String deskBaru = input.readLine();
                minum.SetNama(minumanBaru);
                minum.SetHarga(hargaBaru);
                minum.SetDesk(deskBaru);
                System.out.println("");
                System.out.println("Menu Telah Diperbarui");
                getch();
            }
        }
        if(!minumanFound){
            System.out.println("Menu Tidak Ada");
            getch();
        }
    }

    static void UpdateSnack() throws NumberFormatException, IOException{
        clear();
        if(resto.getSnack().isEmpty()){
            System.out.println("Tidak Ada Menu, Tidak Dapat Melakukan Pembaruan Menu");
            getch();
            return;
        }
        resto.displaySnack(input);
        System.out.print("Masukkan Nama Snack Yang Ingin Diubah : ");
        String namaSnack = input.readLine();
        boolean snackFound = false;
        for(int i = 0; i < resto.getSnack().size(); i++){
            Snack snack = resto.getSnack().get(i);
            if(snack.getNama().equalsIgnoreCase(namaSnack)){
                snackFound = true;
                System.out.print("Masukkan Nama Snack Baru : ");
                String snackBaru = input.readLine();
                int hargaBaru;
                while(true){
                    try{
                        System.out.print("Masukkan Harga Baru : ");
                        hargaBaru = Integer.parseInt(input.readLine());
                        break;
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Inputan Harus Berupa Angka");
                    }
                }
                System.out.print("Masukkan Deskripsi Baru : ");
                String deskBaru = input.readLine();
                snack.SetNama(snackBaru);
                snack.SetHarga(hargaBaru);
                snack.SetDesk(deskBaru);
                System.out.println("");
                System.out.println("Menu Telah Diperbarui");
                getch();
            }
        }
        if(!snackFound){
            System.out.println("Menu Tidak Ada");
            getch();
        }
    }
    
    static void DeleteMakanan() throws NumberFormatException, IOException{
        clear();
        if(resto.getMakanan().isEmpty()){
            System.out.println("Tidak Ada Makanan, Tidak Dapat Menghapus Makanan");
            getch();
            return;
        }
        resto.displayMakanan(input);
        System.out.print("Masukkan Makanan Yang Ingin Dihapus : ");
        String namaMakanan = input.readLine();
        boolean makananFound = false;
        for(int i = 0; i < resto.getMakanan().size(); i++){
            if(resto.getMakanan().get(i).getNama().equalsIgnoreCase(namaMakanan)){
                makananFound = true;
                resto.getMakanan().remove(i);
                System.out.println("");
                System.out.println("Makanan Telah Dihapus");
                getch();
            }
        }
        if(!makananFound){
            System.out.println("Makanan Tidak Ada");
            getch();
        }
    }

    static void DeleteMinuman() throws NumberFormatException, IOException{
        clear();
        if(resto.getMinuman().isEmpty()){
            System.out.println("Tidak Ada Minuman, Tidak Dapat Menghapus Minuman");
            getch();
            return;
        }
        resto.displayMinuman(input);
        System.out.print("Masukkan Minuman Yang Ingin Dihapus : ");
        String namaMinuman = input.readLine();
        boolean minumanFound = false;
        for(int i = 0; i < resto.getMinuman().size(); i++){
            if(resto.getMinuman().get(i).getNama().equalsIgnoreCase(namaMinuman)){
                minumanFound = true;
                resto.getMinuman().remove(i);
                System.out.println("");
                System.out.println("Minuman Telah Dihapus");
                getch();
            }
        }
        if(!minumanFound){
            System.out.println("Minuman Tidak Ada");
            getch();
        }
    }

    static void DeleteSnack() throws NumberFormatException, IOException{
        clear();
        if(resto.getSnack().isEmpty()){
            System.out.println("Tidak Ada Snack, Tidak Dapat Menghapus Snack");
            getch();
            return;
        }
        resto.displaySnack(input);
        System.out.print("Masukkan Snack Yang Ingin Dihapus : ");
        String namaSnack = input.readLine();
        boolean snackFound = false;
        for(int i = 0; i < resto.getSnack().size(); i++){
            if(resto.getSnack().get(i).getNama().equalsIgnoreCase(namaSnack)){
                snackFound = true;
                resto.getSnack().remove(i);
                System.out.println("");
                System.out.println("Snack Telah Dihapus");
                getch();
            }
        }
        if(!snackFound){
            System.out.println("Snack Tidak Ada");
            getch();
        }
    }
}
