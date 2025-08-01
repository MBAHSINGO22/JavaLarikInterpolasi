package PERTEMUAN3;


public class Larik {
    // Metode cetak yang menerima array integer sebagai argumen
    public static void cetak(int[] array) {
        // Iterasi melalui setiap elemen dalam array
        for (int i = 0; i < array.length; i++) {
            // Mencetak elemen array ke komputer
            System.out.println(array[i]);
        }
    }

    // Metode pencarian beruntun (sequential search)
    public static int sequentialSearch(int[] array, int target) {
        // Iterasi melalui setiap elemen dalam array
        for (int i = 0; i < array.length; i++) {
            // Jika elemen saat ini sama dengan target, kembalikan indeksnya
            if (array[i] == target) {
                return i; // Mengembalikan indeks tempat elemen ditemukan
            }
        }
        // Jika tidak ada elemen yang cocok, kembalikan -1
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }

    // Metode pencarian biner (binary search)
    public static int binarySearch(int[] array, int target) {
        // Inisialisasi indeks kiri dan kanan
        int left = 0;
        int right = array.length - 1;

        // Iterasi sampai indeks kiri kurang dari atau sama dengan indeks kanan
        while (left <= right) {
            // Menghitung indeks tengah
            int mid = left + (right - left) / 2;

            // Jika elemen tengah sama dengan target, kembalikan indeksnya
            if (array[mid] == target) {
                return mid; // Mengembalikan indeks tempat elemen ditemukan
            } else if (array[mid] < target) {
                // Jika elemen tengah kurang dari target, geser indeks kiri ke kanan dari indeks tengah
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // Jika tidak ada elemen yang cocok, kembalikan -1
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }
}
