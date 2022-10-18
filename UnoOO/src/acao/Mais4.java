package acao;
import base.Roda;
import base.Jogada;
/**
 * @author RobertoFortes
 * @since 17/10/2022
 * @version 3.0
 */

public class Mais4 extends Acao {
/**
 * @deprecated
 * @param roda representa objeto do tipo referente a classe Roda que funciona de forma cíclica;
 * @param jogada representa objeto do tipo referente a classe Jogada;
 * @param n representa o inteiro que indica a quantidade de vezes que a carta Mais4 foi acumulada/repetida;
 */

/**
 * Falta buscar conhecimento dos outros integrantes para implementar a troca de cor
 * A primeira chamada de roda.proximoJogador() significa a passagem de Acao para o proximo jogador;
 * Ao final, chama-se a função "roda.pular()" para passar-se a vez para o jogador após o que comprou as cartas;
 */
  
  public String getAcao(){
    return "Mais4";
  }

  public void realizar(Roda roda, Jogada jogada, int n) {
    jogada.mudarCor(); /** Precisamos conversar com outros integrantes para realizar mudanças nessa etapa */
    int x;
    x = roda.proximoJogador();  /** jogador 1 -> jogador 2 --- a função retorna inteiro que identifica o jogador */
    for(int cont = 0; cont < n*4 ; cont++){
      roda.comprarCarta(roda.jogadores[x]); /** jogador 2 recebe cartas --- acessa-se o jogador correspondente no vetor */
    }
    roda.pular(); /**  jogador 2 -> jogador 3 */
  }

  /**
  * foi adicionada a função getAcao tipo String;
  */
<<<<<<< HEAD
  public String getAcao(){
    return "Mais4";
  }

  /**
   * @param roda
   */
=======
  

  /**
  Todas as funções a partir deste comentário são para evitar bugs e alertar sobre uso errado da cartaAção
  */
>>>>>>> c7e343bdb56ff406879cfb441ce9abf7d8bdf560
  public void realizar (Roda roda) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }

  /**
   * @param jogada
   */
  public void realizar (Jogada jogada) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }

  /**
   * @param roda
   * @param n
   */
  public void realizar(Roda roda, int n) {
    System.out.println("Você está utilizando os parâmetros errados");
    return;
  }

  void realizar(Jogada jogada, Roda roda, int n) {
    
  }


}