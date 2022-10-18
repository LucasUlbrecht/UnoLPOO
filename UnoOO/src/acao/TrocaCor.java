package acao;
import base.Roda;
import base.Jogada;
/**
 * @author Vinicius 
 * @version 2.0
 */

public class TrocaCor extends Acao {
  /**
   * @deprecated 
   * @param jogada representa objeto do tipo referente a classe Jogada
   * Na função "realizar", supostamente deve utilizar "jogada.mudarCor", de forma que altere para a cor desejada  
   */

  public void realizar(Jogada jogada) {
    jogada.mudarCor();
  }
  public String getAcao(){
    return "TrocaCor";
  }
  public void realizar (Roda roda) {
    return;
  }
  public void realizar(Roda roda, int n) {
    return;
  }
  public void realizar (Jogada jogada, Roda roda, int n) {
    return;
  }
}
