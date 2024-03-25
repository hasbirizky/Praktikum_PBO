import java.util.*;
import java.io.*;

public class Restoran {
    private List<Makanan> dataMakanan;
    private List<Minuman> dataMinuman;
    private List<Snack> dataSnack;

    public Restoran(){
        dataMakanan = new ArrayList<>();
        dataMinuman = new ArrayList<>();
        dataSnack = new ArrayList<>();
    }

    public void addMakanan(Makanan makan){
        dataMakanan.add(makan);
    }

    public void addMinuman(Minuman minum){
        dataMinuman.add(minum);
    }

    public void addSnack(Snack snack){
        dataSnack.add(snack);
    }

    public void displayMakanan(BufferedReader br) throws IOException{
        if(dataMakanan.isEmpty()){
            System.out.println("Data Makanan Tidak Ada");
            br.readLine();
        }
        else{
            for(int i = 0; i < dataMakanan.size(); i++){
                System.out.print(i+1 + ". ");
                System.out.println(dataMakanan.get(i).getNama());
                System.out.println("   " + dataMakanan.get(i).getHarga());
                System.out.println("   " + dataMakanan.get(i).getKatagori());
                System.out.println("   " + dataMakanan.get(i).getDesk());
            }
            // for(Makanan makan : dataMakanan){
            //     makan.display();
            // }
        }
    }

    public void displayMinuman(BufferedReader br) throws IOException{
        if(dataMinuman.isEmpty()){
            System.out.println("Data Minuman Tidak Ada");
            br.readLine();
        }
        else{
            for(int i = 0; i < dataMinuman.size(); i++){
                System.out.print(i+1 + ". ");
                System.out.println(dataMinuman.get(i).getNama());
                System.out.println("   " + dataMinuman.get(i).getHarga());
                System.out.println("   " + dataMinuman.get(i).getKatagori());
                System.out.println("   " + dataMinuman.get(i).getDesk());
            }
            // for(Minuman minum : dataMinuman){
            //     minum.display();
            // }
        }
    }

    public void displaySnack(BufferedReader br) throws IOException{
        if(dataSnack.isEmpty()){
            System.out.println("Data Snack Tidak Ada");
            br.readLine();
        }
        else{
            for(int i = 0; i < dataSnack.size(); i++){
                System.out.print(i+1 + ". ");
                System.out.println(dataSnack.get(i).getNama());
                System.out.println("   " + dataSnack.get(i).getHarga());
                System.out.println("   " + dataSnack.get(i).getKatagori());
                System.out.println("   " + dataSnack.get(i).getDesk());
            }
            // for(Snack snack : dataSnack){
            //     snack.display();
            // }
        }
    }

    public void deleteMakanan(int index){
        dataMakanan.remove(index);
    }

    public void deleteMinuman(int index){
        dataMinuman.remove(index);
    }

    public void deleteSnack(int index){
        dataSnack.remove(index);
    }

    public List<Makanan> getMakanan(){
        return dataMakanan;
    }

    public List<Minuman> getMinuman(){
        return dataMinuman;
    }

    public List<Snack> getSnack(){
        return dataSnack;
    }
}
