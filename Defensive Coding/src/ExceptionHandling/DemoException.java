package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class DemoException {
    public static void main(String[] args) {
        int i, j, k=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i = 0;


        int[] a = new int[4];

        i = 8;
        j=10;
        try{
            j = Integer.parseInt(br.readLine());
            k = i/j;
            for (int c = 0; c<4;c++){
                a[c]= c+1;
            }
        }catch (IOException u){
            System.out.println("IO");
        } catch(ArithmeticException b){
            System.out.println("Divison by 0");
        }catch (ArrayIndexOutOfBoundsException o){
            System.out.println("max no of value is 4");
        }catch (Exception e){
            System.out.println("Unknown exception");
        }finally {
            System.out.println("BYEE");
        }

        System.out.println(k);
    }
}
