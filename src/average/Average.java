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
        int l=in.nextInt();
        int[]a=new int[l];
        int ave=0,ans=0;
        for(int i=0;i<l;i++){
            a[i]=in.nextInt();
            ave+=a[i];
        }
        ave/=l;
        for(int i=0;i<l-1;i++){
            if(a[i]!=ave){
                a[i+1]-=a[i]-ave;
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}
