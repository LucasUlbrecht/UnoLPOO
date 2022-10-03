package acao;
import base.Roda;
//import base.Jogada;

public class Mais4 extends Acao {
  public Mais4() {
  }

  public void compra4(Roda roda) {
    for(int cont = 0; cont<4 ; cont++){
    roda.comprarCarta(roda.proximoJogador());
    //Jogada.mudarCor();
    //retorna a função comprarCarta N vezes, contabilizando a quantidade de repetições de mais 4
  }
  roda.pular();//pula-se a vez de quem compra
}
