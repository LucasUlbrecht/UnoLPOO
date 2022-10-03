package acao;
import base.Roda;

public class Inverter extends Acao {
  public Inverter() {
  }

  public void inversao(Roda roda) {
    roda.inverter();
    //recebe o sentido e inverte, retornando a jogada para o jogador anterior
    //pode ser cumulativo, invertendo-se varias vezes o sentido e passando a jogada
    //para o jogador resultante das constantes trocas
  }
}
