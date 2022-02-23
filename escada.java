import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class escada {
    public static void main(String args[]) { 
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        List<String> escada = new ArrayList<>();

        for (int i=0; i<n; i++){
            if (i==n-1){
                escada.add("*".repeat(i+1));
            } else {
               escada.add(" ".repeat(n-i-1)+"*".repeat(i+1));
            }
        }

        for (String e : escada){
            System.out.printf("%s\n",e);
        }
        
    }
}

