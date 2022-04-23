/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronComportamiento.Iterator;

/**
 *
 * @author Keylor P
 */
public class NumerosArmstrong {

    /**
     * @param args the command line arguments
     */

    //5n+4
    public static void main(String[] args) {//1
       int[] numeros;//1
        numeros = numerosArmstrong();//1
        
        for(int i = 0; i < numeros.length;i++){//4n+1
            System.out.println(numeros[i]);//1n
        }
    }
    //8n+8
    public static int[] numerosArmstrong(){//1
        int[] numeros = new int[17];//2
        int num = 0;//1
        int cont = 0;//1
        while(num <= 10000){//2n
            if(checkArmstrong(num)){//1n
                numeros[cont] = num;//2n
                cont++;//2n
            }
            num++;//2
        }
        return numeros;//1
    }
    //12n+6
    public static boolean  checkArmstrong(int x){ //1
        int l = 0;//1
        int n = x; //1
        while(n!=0){//1n
            l++; //2n
            n = n/10;//1n
        }
        int sum=0;//1
        int num = x;//1
        while(num!=0){ //1n
            int digit = num%10;//2n 
            sum += Math.pow(digit, l); //3n
            num = num/10; //2n
        }
        return(sum == x); //1
 }

}
