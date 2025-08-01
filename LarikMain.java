package PERTEMUAN3;

// Mengimpor kelas Arrays untuk menggunakan metode sort()
import java.util.Arrays;

// Mendefinisikan kelas LarikMain
public class LarikMain {
    // Metode main yang merupakan titik awal untuk mengeksekusi program
    public static void main(String[] args) {
        // Mendefinisikan array integer
        int[] data = {5, 8, 26, 15, 11, 31};

        // Mengurutkan array menggunakan Arrays.sort()
        Arrays.sort(data);

        // Menampilkan array yang sudah diurutkan
        System.out.println("Array yang sudah diurutkan:");
        // Memanggil metode cetak dari kelas Larik untuk mencetak array
        Larik.cetak(data);

        // Contoh penggunaan metode pencarian beruntun
        // Memanggil metode sequentialSearch dari kelas Larik untuk mencari elemen 26 dalam array
        int index = Larik.sequentialSearch(data, 26);
        // Menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + index + " menggunakan sequential search.");
        } else {
            System.out.println("Elemen tidak ditemukan menggunakan sequential search.");
        }

        // Contoh penggunaan metode pencarian biner
        // Memanggil metode binarySearch dari kelas Larik untuk mencari elemen 26 dalam array
        index = Larik.binarySearch(data, 26);
        // Menampilkan hasil pencarian
        if (index != -1) {
            System.out.println("Elemen ditemukan pada indeks: " + index + " menggunakan binary search.");
        } else {
            System.out.println("Elemen tidak ditemukan menggunakan binary search.");
        }

    }
}

