package DesafioPokemon;

import java.util.Random;
import java.util.Scanner;

public class Pokemon {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();

        // Personagem selecionaveis pelo jogador 

        String pikachu = "Pikachu";
        String charmander = "Charmander";
        String squirtle = "Squirtle";

        // Personagens inimigos

        String chicorita = "Chicorita";
        String syndaquil = "Syndaquil";
        String crocodile = "Crocodile";

        // Relatorio da partida

        int contadorDeAtaquePlayer = 0;
        int contadorDeAtaqueInimigo = 0;
        int contadorDeAtaqueEspecial = 0;

        int danoCausadoPeloPlayer = 0;
        int danoCausadoPeloInimigo = 0;

        // Condições do loop while

        boolean lutando = true;
        boolean jogando = true;
        

        // Menu Principal do Game

         while(jogando) {

            System.out.println("================================================");
            System.out.println("Selecione uma das opçoes");
            System.out.println("1 - Jogar ");
            System.out.println("2 - Sair");
            

            String opcao = scanner.nextLine();

            

            switch (opcao) {
                case "1":

        // Seleçao de personagem do jogador

        lutando = true;

        contadorDeAtaquePlayer = 0;
        contadorDeAtaqueInimigo = 0;
        contadorDeAtaqueEspecial = 0;

        danoCausadoPeloPlayer = 0;
        danoCausadoPeloInimigo = 0;

        System.out.println("================================================");
            
        System.out.println("Escolha um pokemon");
        System.out.println("1 - Pikachu");
        System.out.println("2 - Charmander");
        System.out.println("3 - Squirtle");


        String personagemSelecionado = scanner.nextLine();

        if(personagemSelecionado.equals("1")) {

            personagemSelecionado = pikachu;
        }else if (personagemSelecionado.equals("2")) {

            personagemSelecionado = charmander;

            
        }else if(personagemSelecionado.equals("3")) {

            personagemSelecionado = squirtle;
        }else {

            System.out.println("Pokemon invalido");
        }
        
        // Dados do jogador
        System.out.println("================================================");
        int vidaDoJogador = 100;
        int defesaDoJogador = random.nextInt(1,10);
        int ataqueDoJogador = random.nextInt(10,20);
        boolean defesaDoPlayer = true;

        System.out.println("Informações Do Jogador");
        System.out.println("Pokemon Escolhido: " + personagemSelecionado);
        System.out.println("Vida " + vidaDoJogador);
        System.out.println("Defesa: " + defesaDoJogador);
        System.out.println("Ataque: " + ataqueDoJogador);

        System.out.println("================================================");

        // Dados do adversario

        int personagemInimigo = random.nextInt(0, 10);

        if(personagemInimigo >= 0 && personagemInimigo <= 3) {

            System.out.println("O inimigo e " + chicorita);
        }else if(personagemInimigo >= 4 && personagemInimigo <= 6) {

            System.out.println("O inimigo e " + syndaquil);
        }else{

            System.out.println("O inimigo e " + crocodile);
        }

        
        int vidaDoInimigo = 100;
        int defesaDoInimigo = random.nextInt(1,10);
        int ataqueDoInimigo = random.nextInt(10, 20);
        boolean estaDefendendo = false;

        System.out.println("Vida do inimigo: " + vidaDoInimigo);
        System.out.println("Defesa Do inimigo: " + defesaDoInimigo);
        System.out.println("Dano Do inimigo: " + ataqueDoInimigo);

        System.out.println("================================================");

        // Campo de batalha

        while (lutando) {

            // Painel de batalha

            System.out.println("================================================");
            System.out.println("Status da batalha");
            System.out.println("");
            System.out.println("Vida atual do jogador: " + vidaDoJogador);
            System.out.println("================================================");
            System.out.println("Vida atual do inimigo: " + vidaDoInimigo);
            System.out.println("================================================");

            // Opção do jogador

            System.out.println("Selecione uma opçao: ");
            System.out.println("1 - Lutar");
            System.out.println("2 - Defender");
            System.out.println("3 - Fugir");

            int opcaoDoPlayer = scanner.nextInt();
            scanner.nextLine();

            // Se o jogador fugir nao acontece batalha

            if(opcaoDoPlayer == 3) {

                System.out.println("================================================");
                System.out.println("Voce Fugiu");
                lutando = false;
                break;
            }

            int defendeu = random.nextInt(0,10);

            if (defendeu >= 1 && defendeu <= 5 && defendeu != 0) {

                defesaDoPlayer =  true;
                
            }else if(defendeu >= 6 && defendeu <= 10 && defendeu != 0){

                defesaDoPlayer = false;
            }

            System.out.println("================================================");
            System.out.println("Rodada do player");
            System.out.println("");
            
            
            switch (opcaoDoPlayer) {
                case 1:

                if(defesaDoInimigo > ataqueDoJogador) {

                    System.out.println("O inimigo defendeu o ataque");

                }else {

                    System.out.println("Voce atacou o inimigo");

                    vidaDoInimigo = (vidaDoInimigo) - (ataqueDoJogador - defesaDoInimigo);
                    contadorDeAtaquePlayer++;
                    danoCausadoPeloPlayer = danoCausadoPeloPlayer + (ataqueDoJogador - defesaDoInimigo);

                }
                
                break;
                
                case 2:

                    if(defesaDoPlayer == true && defendeu != 0) {

                        System.out.println("Voce esta defendendo");

                        vidaDoJogador = (vidaDoJogador) - (ataqueDoInimigo / 2);

                        danoCausadoPeloInimigo = danoCausadoPeloInimigo + (ataqueDoInimigo / 2);

                        break;
                    }else if(defesaDoPlayer == false && defendeu != 0) {

                        System.out.println("A defesa falhou");
                        vidaDoJogador = (vidaDoJogador - ataqueDoInimigo);

                        danoCausadoPeloInimigo = danoCausadoPeloInimigo + (vidaDoJogador - ataqueDoInimigo);

                        break;
                    }else if(vidaDoJogador <= 95) {

                        
                        System.out.println("Player recuperou vida");
                        vidaDoJogador = vidaDoJogador + 5;
                        break;
                    }
                default:
                        
                        System.out.println("Opçao invalida");
                        break;
            }

            // Opçao do adversario

            int opcaoDoInimigo = random.nextInt(1, 11);

            int inimigoDefendeu = random.nextInt(0, 10);

            if(inimigoDefendeu >= 1 && inimigoDefendeu <= 5 && inimigoDefendeu != 0) {

                estaDefendendo = true;
            }else if(inimigoDefendeu >= 6 && inimigoDefendeu <= 10 && inimigoDefendeu != 0){

                estaDefendendo = false;
            }

            System.out.println("================================================");
            System.out.println("Rodada do adversario");
            System.out.println("");
            switch (opcaoDoInimigo) {
                case 1:
                case 2:
                case 3:
                case 7:
                
                
                if(ataqueDoInimigo < defesaDoJogador) {

                        System.out.println("O player defendeu o ataque");
                    }else {

                        System.out.println("Voce recebeu um ataque inimigo");
                        vidaDoJogador = (vidaDoJogador) - (ataqueDoInimigo - defesaDoJogador);

                        contadorDeAtaqueInimigo++;

                        danoCausadoPeloInimigo = danoCausadoPeloInimigo + (ataqueDoInimigo - defesaDoJogador);
                    }
                    
                    
                    break;
                case 4:
                case 5:
                case 6:
                case 8:

                    if(estaDefendendo == true && inimigoDefendeu != 0) {

                        System.out.println("O inimigo esta defendendo");

                        vidaDoInimigo = (vidaDoInimigo) - (ataqueDoJogador / 2);

                        danoCausadoPeloPlayer = danoCausadoPeloPlayer + (ataqueDoJogador / 2);

                        break;
                    }else if(estaDefendendo == false && inimigoDefendeu != 0){ 

                        System.out.println("A defesa falhou");
                        vidaDoInimigo = (vidaDoInimigo - ataqueDoJogador);

                        danoCausadoPeloPlayer = danoCausadoPeloPlayer + (vidaDoInimigo - ataqueDoJogador);

                        break;
                    }else if(vidaDoInimigo <= 95){
                            
                        System.out.println("O inimigo recuperou vida");
                        vidaDoInimigo = vidaDoInimigo + 5;
                        break;
                    }
                
                case 9:
                case 10:

                    System.out.println("O inimigo deu um ataque especial");

                    vidaDoJogador = vidaDoJogador - (ataqueDoInimigo * 2);

                    contadorDeAtaqueEspecial++;

                    danoCausadoPeloInimigo = danoCausadoPeloInimigo + (ataqueDoInimigo * 2);
                    break;
                
                default:

                    System.out.println("Opção invalida");
                    break;
            }

            if(vidaDoInimigo >= 100) {

                vidaDoInimigo = 100;
            }else if (vidaDoJogador >= 100) {

                vidaDoJogador = 100;
            }

            if(vidaDoInimigo <= 0 || vidaDoJogador <= 0) {

                System.out.println("");
                System.out.println("Fim de jogo");
                lutando = false;
                break;
            }
        }

        if(vidaDoInimigo > vidaDoJogador) {

            System.out.println("");
            System.out.println("Voce perdeu");
            System.out.println("");
            System.out.println("Relatorio da partida");
            System.out.println("================================================");

            if(vidaDoJogador <= 0) {

                vidaDoJogador = 0;
            }
            System.out.println("Vida restante do inimigo: " + vidaDoInimigo);
            System.out.println("Dano recebido: " + danoCausadoPeloPlayer);
            System.out.println("Dano causado: " + danoCausadoPeloInimigo);
            System.out.println("Ataques realizados: " + contadorDeAtaqueInimigo);
            System.out.println("Ataques especiais realizados: " + contadorDeAtaqueEspecial);

            System.out.println("================================================");

            System.out.println("Vida Restante do player: " + vidaDoJogador);
            System.out.println("Ataques realizados do player: " + contadorDeAtaquePlayer);
        }else if(vidaDoInimigo == vidaDoJogador){

            System.out.println("");
        }else {

            System.out.println("");
            System.out.println("Voce venceu");
            System.out.println("");

            System.out.println("Relatorio da partida");
            System.out.println("================================================");

            if(vidaDoInimigo <= 0) {

                vidaDoInimigo = 0;
            }

            System.out.println("Vida Restante do player: " + vidaDoJogador);
            System.out.println("Ataques realizados do player: " + contadorDeAtaquePlayer);
            
            System.out.println("Dano recebido: " + danoCausadoPeloInimigo);
            System.out.println("Dano causado: " + danoCausadoPeloPlayer);

            System.out.println("================================================");

            System.out.println("Vida restante do inimigo: " + vidaDoInimigo);
            System.out.println("Ataques realizados: " + contadorDeAtaqueInimigo);
            System.out.println("Ataques especiais realizados: " + contadorDeAtaqueEspecial);
        }

            break;

            case "2":

        System.out.println("Voce saiu do jogo");
        jogando = false;

        break;

        default:

            System.out.println("Opçao ivalida");
            break;
        }
        
        }

        scanner.close();
        
    }
    
}
