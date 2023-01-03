package J00_Interview_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class I18_Hacker_Diline_Cevir {
 /*
  Interwiew
  Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız.
  Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar.
   Genellikle çevirdikleri harfler şu şekilde:
  s -> 5
  a -> 4
  e -> 3
  t -> 1
  o -> 0

  OUTPUT :
   hackerDili("java ile hersey guzel")
   h4ck3rd1l1("j4v4 1l3 h3r53y guz3l")


     */

    public static void main(String[] args) {

        //1. YOl  hoca cozumu

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str =scan.nextLine().toLowerCase();

        String[] arr = new String[str.length()];


        for (int i=0; i<str.length();i++){

            arr[i] = str.substring(i,i+1);
            System.out.print(arr[i]);
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("s")){
                arr[i] = "5";
            }
            if (arr[i].equals("a")){
                arr[i] = "4";
            }
            if (arr[i].equals("e")){
                arr[i] = "3";
            }
            if (arr[i].equals("t")){
                arr[i] = "1";
            }
            if (arr[i].equals("o")){
                arr[i] = "0";
            }
        }

        System.out.println(Arrays.toString(arr));



        //2.YOl Benim cozumum

        Scanner scann = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String strr =scann.nextLine().toLowerCase();
        String[] arrr = strr.split("");

        int idx=0;
        for (String w: arrr){

            switch (w) {
                case "s":
                    arrr[idx]="5";
                    idx++;
                    break;
                case "a":
                    arrr[idx]= "4";
                    idx++;
                    break;
                case "e":
                    arrr[idx] = "3";
                    idx++;
                    break;
                case "t":
                    arrr[idx] = "1";
                    idx++;
                    break;
                case "o":
                    arrr[idx] = "0";
                    idx++;
                    break;
                default:
                    arrr[idx]=w;
                    idx++;
            }
        }
        System.out.println(Arrays.toString(arrr));



    }


            }
