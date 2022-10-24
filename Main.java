package Sesi5PBO;

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan nama dosen : ");
        String nama = scanner.nextLine();
        System.out.print("masukan alamat dosen : ");

        String alamat = scanner.nextLine();

        Dosen dosen = new Dosen(nama, alamat);

        for(int j = 0; j < 3; j++){
            System.out.print("masukan mata kuliah yang diampu: ");
            String matkul = scanner.nextLine();
            dosen.addCourse(matkul);
        }

        System.out.println(dosen);

    }
}
