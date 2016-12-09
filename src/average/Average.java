/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package average;

import java.util.Scanner;

/**
 *
 * @author jihua5758
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //l is how many decks there are
        int l=in.nextInt();
        //integers in a is the number of cards in each deck corresponding to the index
        int[]a=new int[l];
        //ave is the average number of all cards, ans is the final answer
        int ave=0,ans=0;
        //read data
        for(int i=0;i<l;i++){
            a[i]=in.nextInt();
            //add number to average
            ave+=a[i];
        }
        //calculate average
        ave/=l;
        //for each deck except for the last one
        for(int i=0;i<l-1;i++){
            //if it needs cards to become equal to average
            if(a[i]!=ave){
                //move cards
                a[i+1]-=a[i]-ave;
                //add 1 to the answer
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}
