/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan30.cakep;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R <farhan.10119023@mahasiswa.unikom.ac.id>
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner;

public class IF110119023Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_PINK = "\u001B[35;1m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        System.out.println(ANSI_RED.concat("Kamu ").concat(ANSI_GREEN).concat("ngerjain "
                + "sendiri ").concat(ANSI_YELLOW).concat("latihan 17 sampe ").
                concat(ANSI_BLUE).concat("latihan 30 ini?"));
        Scanner scan = new Scanner(System.in);
        System.out.print("Jawab ".concat(ANSI_RED).concat("(Yoi/Enggak) : "));
        String jawab = scan.next();
        System.out.println();
        
        switch(jawab.toLowerCase()){
            case "yoi":
                System.out.println("Cakep Bener. ".concat(ANSI_PINK).concat("Good job"));
                break;
            case "enggak":
                System.out.println(ANSI_RED.concat("Tetep cakep sih."));
                System.out.println(ANSI_CYAN.concat("Sing penting paham konsepnya yee."));
                System.out.println(ANSI_RESET.concat("Keep the code works dude"));
                break;
        }
    }

}
