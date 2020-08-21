package exercicio;

public class Robo {
    private String nomeRobo, origem;
    private int posX, posY;

    //Construtor
    public Robo(String nomeRobo, String origem, int posX, int posY){
        this.nomeRobo = nomeRobo;
        this.origem = origem;
        this.posX = posX;
        this.posY = posY;
    }

    //metodos
    public void exibirDadosRobo(){
        System.out.println("Nome: " + nomeRobo);
        System.out.println("Origem: " + origem);
        exibirPosicao();
    }

    public void exibirPosicao(){
        System.out.println("Posição do robo (X/Y) " + posX + "/" + posY);
    }

    public void controlaX(String comando){
        if (comando.equals("Soma")){
            if (posX < 6){
                posX++;
            }
        } else {
            if (posX > -6){
                posX--;
            }
        }
    }

    void controlaY(String comando){
        if (comando.equals("Soma")){
            if (posY < 6){
                posY++;
            }
        } else {
            if (posY > -6){
                posY--;
            }
        }
    }
}