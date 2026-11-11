package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputDemo {
    public static void main(String[] args) throws Exception {


        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {

            String str = br.readLine();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
