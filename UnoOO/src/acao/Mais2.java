package acao;
import base.Roda;

public class Mais2 extends Acao {

  public Mais2() {
  }

  public void Soma(Roda roda) { 
    for(int cont = 0; cont<2 ; cont++){
    roda.comprarCarta(roda.proximoJogador());
    //retorna a função comprar carta N vezes, contabilizando a repetição dos +2
  }
  roda.pular(); //pula-se a vez de quem compra as cartas
}
