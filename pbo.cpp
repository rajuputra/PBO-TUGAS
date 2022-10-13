#include <iostream>
using namespace std;
int main(){
	//program raju
	int jumlah;
	int x;
	int banyak;
	string nama[5];
	float nilai[5][10];
	float hasil[5];
	do{
		cout << "Program Menghitung Nilai Rata2 Mahasiswa\n";
		cout << "Masukkan jumlah mahasiswa : ";
		cin >> jumlah;
		int i=0;
		while(i<jumlah){
			cout << "Masukkan nama mahasiswa ke-" <<i+1 <<" : ";
			cin >> nama[i];
			i++;
		}
		for(int i=0; i<jumlah; i++){
			hasil[i] = 0;
		}
		cout << "Masukkan banyak nilai : ";
		cin >> banyak;
		for(int i=0; i<jumlah; i++){
			cout << "Nilai siswa ke-" <<i+1<< endl;
			for(int j=0; j<banyak; j++){
				cout << "Masukkan nilai ke-" << j+1 << " : ";
				cin >> nilai[i][j];
			}
		}
		cout << "Pilih operasi : \n";
		cout << "1. Hitung rata2\n2. Keluar\n";
		cin >> x;
		if(x==1){
			for(int i=0; i<jumlah; i++){
				for(int j=0; j<banyak; j++){
					hasil [i] = hasil[i] + nilai[i][j];
				}
			}
			cout << "Nilai rata2 nya adalah : " << endl;
			for(int i=0; i<jumlah; i++){
				cout << "Anak ke "<<i+1 << " : " << hasil[i]/banyak << endl;
			}
		}
		else{
			return 0;
		}
		
	}while(jumlah!=0);	

}
