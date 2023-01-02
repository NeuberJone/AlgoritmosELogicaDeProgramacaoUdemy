import java.util.Locale; // Biblioteca que o Locale pertence

public class saidaDeDados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o separador dos valores float como ponto e não virgula

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 5800.5;
        altura = 1.72;
        genero = 'F';
        nome = "Maria Silva";

        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + String.format("%.2f", salario)); // String.format("%.2f", variavel) 
        System.out.println("Altura: " + String.format("%.2f", altura));   // formata a quantidade de casas cecimais do float
        System.out.println("Genero: " + genero);
        System.out.println("Nome: " + nome);

    }
    
}
