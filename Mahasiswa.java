package Sesi5PBO;

import java.util.ArrayList;

public class Mahasiswa extends Person {

private int jumlahmatkul;
    private ArrayList<String> matakuliah;
    private ArrayList<Integer> nilailList;

    public Mahasiswa (String name, String address){
        super(name, address);
        matakuliah = new ArrayList<>();
        nilailList = new ArrayList<>();
        
    }

    public void addmatakuliahGrade(String matakuliah, int grade){
        this.matakuliah.add(matakuliah);
        this.nilailList.add(grade);
        jumlahmatkul++;
        
    }

    public void printnilailList(){
        for(int j = 0; j < jumlahmatkul; j++){
            System.out.println("matakuliah: " + matakuliah.get(j) + " " + "grade: " + nilailList.get(j));
        }
    }

    public double getAverageGrade(){
        int jumlah = 0;
        for (int j = 0; j < jumlahmatkul; j++) {
            jumlah += nilailList.get(j);
        }

        return jumlah / jumlahmatkul;
    }

    public String toString(){
        return
        super.toString() + 
        "Jumlah matkul diambil : " + this.jumlahmatkul + 
        "\nRata-rata nilai : " + getAverageGrade();
    }    
}
