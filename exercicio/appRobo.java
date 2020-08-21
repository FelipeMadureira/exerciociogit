package exercicio;

import java.util.Scanner;

public class appRobo {
    public static void main(String[] args) {
        char mov;
        
        Robo r1 = new Robo("Robo R1", "Brasil", 0, 0);
        Scanner teclado = new Scanner(System.in);

        r1.exibirDadosRobo();

        mov = 'i'; //iniciar variavel
        while (mov != 'x') {
            System.out.println("\nMovimentação do robô:\nd - direira / e - esquerda / s - subir / f - descer / i - informações Robô / x - encerrar");
            mov = teclado.nextLine().charAt(0);

            if (mov == 'd'){
                r1.controlaX("Soma");
                r1.exibirPosicao();
            }

            if (mov == 'e'){
                r1.controlaX("Subtrair");
                r1.exibirPosicao();
            }

            if (mov == 's'){
                r1.controlaY("Soma");
                r1.exibirPosicao();
            }

            if (mov == 'f'){
                r1.controlaY("Subtrair");
                r1.exibirPosicao();
            }

            if (mov == 'i'){
                r1.exibirDadosRobo();
            }
        }

        teclado.close();
    }
}