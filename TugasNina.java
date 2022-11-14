
package tugasnina;

import java.util.Scanner;

public class TugasNina {
    public static void main(String[] args)throws Exception{
                Scanner input = new Scanner (System.in);
                int numbers1, numbers2, choice, result= 0;
                System.out.println("program kalkulator sederhana");
                System.out.println("1. penjumlahan");
                System.out.println("2. pengurangan");
                System.out.println("3. pembagian");
                System.out.println("4. perkalian");
                System.out.println("5. sisa bagi");
                System.out.println("---------------");
                
                //input data
                System.out.println("Masukkan angka Pertama:");
                numbers1 = input.nextInt();
                System.out.println("Masukkan Angka Kedua:");
                numbers2 = input.nextInt();
                
                //pilih operasi
                System.out.println("Masukkan operasi:");
                choice = input.nextInt();
                switch(choice){
                    case 1: result = numbers1 + numbers2; break;
                    case 2: result = numbers1 - numbers2; break;
                    case 3: result = numbers1 / numbers2; break;
                    case 4: result = numbers1 * numbers2; break;
                    case 5: result = numbers1 % numbers2; break;
                    default : System.out.println("salah masukkan pilihan harap baca pilihan di menu");
                }
                System.out.println("Hasil:" + result);
                        
            }
        }
    
