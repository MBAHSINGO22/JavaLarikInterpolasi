package PERTEMUAN3;

public class PencarianInterpolasi {

    // Metode Pencarian Interpolasi
    public static int PencarianInterpolasi(int[] array, int x) {
        // Mendefinisikan variabel low dan high untuk menentukan rentang pencarian
        int low = 0, high = (array.length - 1);

        // Menggunakan algoritma interpolation search
        while (low <= high && x >= array[low] && x <= array[high]) {
            // Jika low dan high menunjuk ke elemen yang sama
            if (low == high) {
                // Jika elemen sama dengan x, kembalikan indeksnya
                if (array[low] == x) return low;
                // Jika tidak ada elemen yang cocok, kembalikan -1
                return -1;
            }

            // Menghitung posisi yang diharapkan berdasarkan interpolasi
            int pos = low + (((high - low) / (array[high] - array[low])) * (x - array[low]));

            // Jika elemen di posisi yang diharapkan sama dengan x, kembalikan posisi tersebut
            if (array[pos] == x)
                return pos;

            // Jika elemen di posisi yang diharapkan lebih kecil dari x, geser low ke posisi setelah pos
            if (array[pos] < x)
                low = pos + 1;

            // Jika elemen di posisi yang diharapkan lebih besar dari x, geser high ke posisi sebelum pos
            else
                high = pos - 1;
        }
        // Jika tidak ada elemen yang cocok, kembalikan -1
        return -1;
    }

    // Metode Main
    public static void main(String[] args) {
        // Mendefinisikan array integer
        int[] array = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        // Mendefinisikan elemen yang dicari
        int x = 18;

        // Memanggil metode PencarianInterpolasi untuk mencari elemen x dalam array
        int index = PencarianInterpolasi(array, x);

        // Menampilkan hasil pencarian
        if (index == -1)
            System.out.println("Elemen tidak ditemukan dalam array");
        else
            System.out.println("Elemen ditemukan pada indeks: " + index);
    }
}
