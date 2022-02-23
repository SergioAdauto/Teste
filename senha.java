import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Senha:");
        String senha = teclado.next();
        if (senha != null) {
            
    /*
     * REGRAS:
     * Possui no mínimo 6 caracteres.
     * Contém no mínimo 1 digito.
     * Contém no mínimo 1 letra em minúsculo.
     * Contém no mínimo 1 letra em maiúsculo.
     * Contém no mínimo 1 caractere especial. Os caracteres especiais são:
     * !@#$%^&*()-+
     */
            if (senha.length() < 6) {
                System.out.println(6 - senha.length());
            } else{
                boolean num = false;
                boolean maiuscula = false;
                boolean minuscula = false;
                boolean caracteres = false;
                for (char cont : senha.toCharArray()) {
                    if (cont >= '0' && cont <= '9') {
                        num = true;
                    } else if (cont >= 'A' && cont <= 'Z') {
                        maiuscula = true;
                    } else if (cont >= 'a' && cont <= 'z') {
                        minuscula = true;
                    } else {
                        caracteres = true;
                    }
                }
                if (num && maiuscula && minuscula && caracteres){
                    System.out.println("Senha forte");
                }else if (!num && maiuscula && minuscula && caracteres) {
                    System.out.println("Faltou colocar números na senha");
                }else if (num && !maiuscula && minuscula && caracteres){
                    System.out.println("Falta colocou uma letra Maiúscula");
                }else if (num && maiuscula && !minuscula && caracteres){
                    System.out.println("Falta colocou uma letra minúscula");
                }else if (num && maiuscula && minuscula && !caracteres){
                    System.out.println("Falta colocou um caractere especial");
                }

            }
        }else {
            System.out.println(6);
        }
    }
}
