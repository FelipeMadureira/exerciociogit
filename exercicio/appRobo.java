package exercicio;

import java.util.Scanner;

public class appRobo {
    public static void main(String[] args) {
        String mov;
        
        Robo r1 = new Robo("Robo R1", "Brasil", 0, 0);
        Scanner teclado = new Scanner(System.in);

        r1.exibirDadosRobo();

        mov = "i"; //iniciar variavel
        while (mov.charAt(0) != 'x') {
            System.out.println("\nMovimentação do robô:\nd - direira / e - esquerda / s - subir / f - descer / i - Informações Robô / x - encerrar");
            mov = teclado.nextLine();

            if (mov.charAt(0) == 'd'){
                r1.controlaX("Soma");
                r1.exibirPosicao();
            }

            if (mov.charAt(0) == 'e'){
                r1.controlaX("Subtrair");
                r1.exibirPosicao();
            }

            if (mov.charAt(0) == 's'){
                r1.controlaY("Soma");
                r1.exibirPosicao();
            }

            if (mov.charAt(0) == 'f'){
                r1.controlaY("Subtrair");
                r1.exibirPosicao();
            }

            if (mov.charAt(0) == 'i'){
                r1.exibirDadosRobo();
            }
        }

        teclado.close();
    }
}