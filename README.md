<h1 align="center">🧮 JavaLarikInterpolasi</h1>
<p align="center">
  <b>Manipulasi Larik dan Pencarian Interpolasi di Java</b><br>
  <sub>Proyek edukatif dengan kelas larik, pengujian, dan algoritma pencarian efisien</sub>
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-17-red?logo=oracle)](https://www.oracle.com/java/)
[![Algorithms](https://img.shields.io/badge/Algorithm-Interpolation%20Search-blue)]()
[![Search](https://img.shields.io/badge/Search-Binary%20%26%20Sequential-orange)]()
[![Author](https://img.shields.io/badge/Author-MBAHSINGO22-blue)](https://github.com/MBAHSINGO22)

</div>

---

## 📖 Deskripsi Proyek

**JavaLarikInterpolasi** adalah repositori edukatif Java yang berfokus pada:
- Struktur data array (larik) dengan berbagai metode manipulasi
- Pengujian array melalui program utama (`LarikMain.java`)
- Implementasi algoritma pencarian:
  - Sequential Search
  - Binary Search
  - Interpolation Search

---

## 📂 Struktur Proyek

```
JavaLarikInterpolasi/
├── Larik.java                  # Kelas array dengan metode sorting, pencarian, dsb
├── LarikMain.java              # Program utama untuk pengujian array
├── PencarianInterpolasi.java  # Implementasi algoritma Interpolation Search
└── README.md                   # Dokumentasi proyek
```

---

## 🧰 Teknologi

- Java 17+
- IDE (IntelliJ, NetBeans, Eclipse) atau terminal Java

---

## 🚀 Cara Menjalankan

1️⃣ **Kompilasi semua file Java**
```bash
javac Larik.java LarikMain.java PencarianInterpolasi.java
```

2️⃣ **Jalankan program utama larik**
```bash
java LarikMain
```

3️⃣ **(Opsional) Jalankan pencarian interpolasi secara terpisah**
```bash
java PencarianInterpolasi
```

---

## 🔍 Metode Pencarian

| Metode               | Kelebihan                               | Kelemahan                     |
|----------------------|------------------------------------------|-------------------------------|
| Sequential Search    | Mudah diterapkan, tidak perlu diurutkan  | Lambat untuk data besar       |
| Binary Search        | Cepat untuk data urut                   | Butuh pengurutan terlebih dahulu |
| Interpolation Search | Cepat untuk data urut & merata distribusi | Kurang efektif jika data tidak merata |

---

## 📌 Contoh Output (simulasi)

```
Data: [10, 20, 30, 40, 50]

== Sequential Search ==
Mencari 30... Ditemukan pada indeks 2

== Binary Search ==
Mencari 30... Ditemukan pada indeks 2

== Interpolation Search ==
Mencari 30... Ditemukan pada indeks 2
```

---

## 👨‍💻 Author

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)

---

## 📄 Lisensi

Proyek ini dibuat untuk keperluan edukasi dan pembelajaran algoritma pencarian di Java.
