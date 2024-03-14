/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusok;



public class Metodusok {

    
    public static void main(String[] args) {
        PrimszamVagyNem();
        EgeszPrimszamVagyNem();
    }

    private static void PrimszamVagyNem() {
        int szam = (int)(Math.random()*300);
        Boolean prim = true;
        
        if(szam == 0 || szam == 1){
            System.out.println(szam + "\nNem prím!!!");
            prim = false;
        }
        else{
            for (int i = 2; i <= Math.sqrt(szam); i++) {
                if(szam % i == 0){
                    prim = false;
                    System.out.println(szam + "\nNem prím!!!");
                break;
                }
            }
        }
        if(prim == true){
            System.out.println(szam + "\nPrím!!!!");
        }
    }
    
    
    private static void EgeszPrimszamVagyNem() {
        int[] szamok = {20,37,7,8,21,11,245,237};
        boolean prim = true;
        
        for (int i = 0; i < szamok.length; i++) {
            
        }
        if(prim == true){
                System.out.println(szamok + "\nPrím!!!!");
            }
            else{
                System.out.println(szamok + "\nNem prím!!!");
            }
    }
    
}
