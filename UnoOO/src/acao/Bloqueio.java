package Acao;
import base.Roda;

public class Bloqueio extends Acao {
  public Bloqueio() {
    
  }

  public void block(Roda roda) {
    roda.pular();
    //Identifica o próximo jogador e não permite sua jogada, logo, passando para o próximo jogador
    //pode ser cumulativo
  }
}