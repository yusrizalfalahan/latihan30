/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan30.cakep;
import java.util.Scanner;
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menjawab pertanyaan 
 *                        "Kamu ngerjain sendiri latihan 17 sampe latihan 
 *                        30 ini?"
 * @author Acer
 */
public class PBO210117043Latihan30Cakep {
//    kode text color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
//    kode background color
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String jawab;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(ANSI_RED+"Kamu "+ANSI_RESET);
        System.out.print(ANSI_GREEN+"ngerjain sendiri "+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"latihan 17 sampe "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"latihan 30 ini? \n"+ANSI_RESET);
        System.out.print(ANSI_BLUE+"Jawab "+ANSI_RESET);
        System.out.print(ANSI_RED+"(Yoi/Enggak) : "+ANSI_RESET);
        jawab = scn.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(ANSI_RED+"\nCakep Bener. "+ANSI_RESET);
            System.out.print(ANSI_PURPLE+"Good Job \n"+ANSI_RESET);
        }else{
            System.out.print(ANSI_RED+"\nTetep cakep sih. "+ANSI_RESET);
            System.out.print(ANSI_CYAN+"\nSing penting paham konsep nya yee. "
                    +ANSI_RESET);
            System.out.print(ANSI_BLACK+"\nKeep the code works dude."+ANSI_RESET); 
    
}
    }
}