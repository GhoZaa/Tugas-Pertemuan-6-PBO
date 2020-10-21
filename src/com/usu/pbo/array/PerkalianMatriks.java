package com.usu.pbo.array;

import java.util.Scanner;

/*
    @author
    Nama    : Muhammad Ghozali
    NIM     : 191401065

    Mata kuliah : Pemograman Berorientsi Objek / Java
    Dosen       : Handrizal,S.Si.M.Comp.Sc.
 */

/*
    Program Perkalian Matrix
 */

public class PerkalianMatriks {

    public static void main(String[] args) {

        int barisMatrixA, kolomMatrixA, barisMatrixB, kolomMatrixB, i, j, k, jumlah = 0;
        int[][] matriksA = new int[12][12];
        int[][] matriksB = new int[12][12];
        int[][] hasil = new int[12][12];
        boolean isRunning;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("\n-------- Program Perkalian Matriks -----------\n");

            boolean isNotValid = true;

            while (isNotValid) {
                // User input banyak baris dari matriks A
                System.out.print("Masukkan banyak baris Matriks A = ");
                barisMatrixA = input.nextInt();
                // User input banyak kolom dari matriks A
                System.out.print("Masukkan banyak kolom Matriks A = ");
                kolomMatrixA = input.nextInt();

                // User input banyak baris dari matriks B
                System.out.print("Masukkan banyak baris Matriks B = ");
                barisMatrixB = input.nextInt();
                // User input banyak kolom dari matriks B
                System.out.print("Masukkan banyak kolom Matriks B = ");
                kolomMatrixB = input.nextInt();

                if (kolomMatrixA != barisMatrixB) {
                    System.out.println("Tidak dapat melakukan perkalian matriks!!");
                    System.out.println("Untuk perkalian matriks, Matriks A harus sama dengan banyak baris Matriks B!!");
                    System.out.println("Silahkan input ulang!\n");
                } else {
                    // User menginputkan elemen dari matriks A
                    System.out.println("\nMasukkan elemen matriks A " + barisMatrixA + "x" + kolomMatrixA + " : ");
                    for (i = 0; i < barisMatrixA; i++) {
                        for (j = 0; j < kolomMatrixA; j++) {
                            System.out.print("A[" + i + "][" + j + "] = ");
                            matriksA[i][j] = input.nextInt();
                        }
                    }

                    // User menginputkan elemen dari matriks B
                    System.out.println("\nMasukkan elemen matriks A " + barisMatrixB + "x" + kolomMatrixB + " : ");
                    System.out.println("\nMasukkan elemen matriks B: ");
                    for (i = 0; i < barisMatrixB; i++) {
                        for (j = 0; j < kolomMatrixB; j++) {
                            System.out.print("B[" + i + "][" + j + "] = ");
                            matriksB[i][j] = input.nextInt();
                        }
                    }

                    // proses perkalian matriks
                    for (i = 0; i < barisMatrixA; i++) {
                        for (j = 0; j < kolomMatrixB; j++) {
                            for (k = 0; k < barisMatrixB; k++) {
                                jumlah = jumlah + matriksA[i][k] * matriksB[k][j];
                            }
                            hasil[i][j] = jumlah;
                            jumlah = 0;
                        }
                    }

                    // cetak hasil perkalian matriks
                    System.out.println("\nHasil perkalian Matriks A dengan Matriks B: ");
                    for (i = 0; i < barisMatrixA; i++) {
                        for (j = 0; j < kolomMatrixB; j++) {
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }

                    isNotValid = false;
                }
            }

            // User input apakah ingin mengulang program atau tidak
            System.out.println("\nApakah Anda ingin mengulang program perkalian matriks?");
            System.out.print("Jawab (ya/tidak): ");
            String jawab = input.next();

            jawab = jawab.toLowerCase();

            isRunning = jawab.equalsIgnoreCase("ya");

        } while (isRunning);

        System.out.println("\nTerimakasih telah menggunakan program ini... :)");

    }
}
