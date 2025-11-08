# Tugas Dokumentasi JavaDocs: Proyek Kalkulator

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaDocs](https://img.shields.io/badge/JavaDocs-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![HTML](https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white)

Ini adalah proyek submisi untuk tugas mata kuliah **Clean Code dan Design Pattern** dengan topik implementasi dokumentasi kode menggunakan JavaDocs.

---

## 1. Deskripsi Proyek

Proyek ini berisi sebuah kelas Java sederhana bernama `kalkulator.java`. Kelas ini dibuat untuk mendemonstrasikan cara kerja dan praktik terbaik dalam menulis komentar dokumentasi standar Java.

**File Kode Sumber:**

- `kalkulator.java`

---

## 2. Penjelasan Implementasi JavaDocs

Dokumentasi JavaDocs telah diimplementasikan pada seluruh kelas dan metode untuk menjelaskan fungsionalitasnya.

Tag-tag utama yang digunakan meliputi:

- **Deskripsi Kelas:** Penjelasan umum di tingkat kelas mengenai apa fungsi dari kelas `kalkulator`.
- **Deskripsi Metode:** Penjelasan singkat untuk setiap metode (`tambah` dan `bagi`) mengenai apa yang dilakukan metode tersebut.
- **`@param`**: Digunakan untuk menjelaskan setiap parameter input yang diterima oleh metode (misalnya, `int a` dan `int b`).
- **`@return`**: Digunakan untuk menjelaskan nilai keluaran (hasil) yang dikembalikan oleh metode.
- **`@throws`**: Digunakan secara spesifik pada metode `bagi` untuk memberi peringatan bahwa metode tersebut dapat melempar `IllegalArgumentException` jika terjadi pembagian dengan nol.

---

## 3. Cara Menjalankan

### A. Melihat Hasil Dokumentasi

Semua file dokumentasi HTML yang telah di-generate oleh `javadoc` terletak di dalam folder `/docs`.

Untuk melihat hasil akhir dokumentasi:

1.  Buka folder `/docs` di dalam repositori ini.
2.  File utama untuk memulai adalah **`index.html`**.

> **Live Demo:**
> [[https://salmanfrs.github.io/Tugas_CCDP_JavaDocs_10122145](https://salmanfrs.github.io/Tugas_CCDP_JavaDocs_10122145)]

### B. Menjalankan Ulang Perintah `javadoc`

Jika Anda ingin membuat ulang file dokumentasi, Anda dapat menggunakan perintah berikut di terminal dari folder utama proyek:

```bash
javadoc -d docs Kalkulator.java
```
