import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowDoMilhao {

    private static final String[] QUESTIONS = {
            "Qual é o maior animal terrestre?",
            "Qual é o menor país do mundo?",
            "Quem escreveu o livro Dom Quixote?",
            "Qual é o maior planeta do Sistema Solar?",
            "Qual é o país com a maior população do mundo?",
            "Quem foi o primeiro presidente do Brasil?",
            "Qual é o nome do cientista que descobriu a lei da gravidade?",
            "Qual é o nome do personagem principal do livro O Pequeno Príncipe?",
            "Qual é o nome do maior deserto do mundo?",
            "Qual é o nome do rio que banha a cidade do Rio de Janeiro?"
    };

    private static final String[][] ANSWERS = {
            {"A) Elefante", "B) Girafa", "C) Rinoceronte", "D) Hipopótamo"},
            {"A) Mônaco", "B) Nauru", "C) Tuvalu", "D) Vaticano"},
            {"A) Miguel de Cervantes", "B) William Shakespeare", "C) Dante Alighieri", "D) Machado de Assis"},
            {"A) Marte", "B) Saturno", "C) Júpiter", "D) Netuno"},
            {"A) Índia", "B) Estados Unidos", "C) China", "D) Rússia"},
            {"A) Deodoro da Fonseca", "B) Floriano Peixoto", "C) Prudente de Morais", "D) Getúlio Vargas"},
            {"A) Albert Einstein", "B) Isaac Newton", "C) Galileu Galilei", "D) Stephen Hawking"},
            {"A) O Pequeno Príncipe", "B) O Pequeno Príncipe", "C) O Pequeno Príncipe", "D) O Pequeno Príncipe"},
            {"A) Saara", "B) Atacama", "C) Gobi", "D) Antártico"},
            {"A) Amazonas", "B) Tietê", "C) São Francisco", "D) Paraíba do Sul"}
    };

    private static final int[] CORRECT_ANSWERS = {0, 1, 0, 2, 2, 0, 1, 0, 0, 3};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        int currentQuestion = 0;

        System.out.println("Bem-vindo ao Show do Milhão!");
        System.out.println("Responda corretamente às 10 perguntas para ganhar o prêmio máximo de R$1.000.000!");

        while (currentQuestion < QUESTIONS.length) {
            System.out.println("Pergunta " + (currentQuestion + 1) + ": " + QUESTIONS[currentQuestion]);
            for (int i = 0; i < ANSWERS[currentQuestion].length; i++) {
                System.out.println(ANSWERS[currentQuestion][i]);
            }
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(String.valueOf((char) (CORRECT_ANSWERS[currentQuestion] + 'A')))) {
                System.out.println("Resposta correta! Você ganhou R$" + (currentQuestion + 1) * 100000);
                scores.add((currentQuestion + 1) * 100000);
                currentQuestion++;
            } else {
                System.out.println("Resposta incorreta! Você perdeu o jogo.");
                break;
            }
        }

        if (currentQuestion == QUESTIONS.length) {
            System.out.println("Parabéns! Você ganhou o prêmio máximo de R$1.000.000!");
        }

        System.out.println("Sua pontuação final foi: R$" + scores.stream().mapToInt(Integer::intValue).sum());
    }
}