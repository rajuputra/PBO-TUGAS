import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Program Raju
        int jumlah;
        int x ;
        int banyak;
        int a, b, c, d;
        String[] nama = new String[5];
        float[][] nilai = new float[5][10];
        float[] hasil = new float[5];
        do {
            System.out.println("Program menghitung nilai rata2 mahasiswa");
            System.out.println("Masukkan jumlah mahasiswa : ");
            Scanner in = new Scanner(System.in);
            jumlah = in.nextInt();
            int i=0;
            while (i<jumlah){
                System.out.println("Masukkan nama mahasiswa ke-"+ (i+1) +" : ");
                nama[i] = in.nextLine();
                i++;
            }
            for ( i=0; i<jumlah; i++){
                hasil[i] = 0;
            }
            System.out.println("Masukkan banyak nilai : ");
            banyak = in.nextInt();
            for ( i=0; i<jumlah; i++){
                System.out.println("Nilai siswa ke-"+ (i+1) );
                for (int j=0; j<banyak; j++){
                    System.out.println("Masukkan nilai ke-"+ (j+1) +" : ");
                    nilai[i][j] = in.nextFloat();
                }
            }
            System.out.println("Pilih operasi : ");
            System.out.println("1. Hitung rata2\n2. Keluar");
            x = in.nextInt();
            if (x==1){
                for ( i=0; i<jumlah; i++){
                    for (int j=0; j<banyak; j++){
                        hasil[i] = hasil[i] + nilai[i][j];
                    }
                }
                System.out.println("Nilai rata2nya adalah : ");
                for (i=0; i<jumlah; i++){
                    System.out.println("Anak ke "+ (i+1) +" : " +hasil[i]/banyak);
                }
            }

        }while (jumlah!=0);
    }

}