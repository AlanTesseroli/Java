import java.util.Scanner;

class Aluno {
    String nome;
    int idade;
    float media;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos você gostaria de cadastrar: ");
        int x = scanner.nextInt();

        Aluno[] turma = new Aluno[x];
        for (int i = 0; i < turma.length; i++) {
            turma[i] = new Aluno();
            Scanner scannerName = new Scanner(System.in);
            Scanner scannerAge = new Scanner(System.in);
            Scanner scannerAvr = new Scanner(System.in);

            System.out.print("Digite o nome do aluno: ");
            String alunoName = scannerName.next();
            turma[i].nome = alunoName;

            System.out.print("Digite a idade do aluno: ");
            int alunoAge = scannerAge.nextInt();
            turma[i].idade = alunoAge;

            System.out.print("Digite a média do aluno: ");
            float alunoAvr = scannerAvr.nextFloat();
            turma[i].media = alunoAvr;

            System.out.println("O " + (i+1) + "º aluno(a) " + turma[i].nome + ", tem " + turma[i].idade + " anos e tem a média igual a " + turma[i].media);
        }


        System.out.println("Os alunos foram: ");;

        for (int i = 0; i < turma.length; i++){
            System.out.println("O " + (i+1) + "º aluno(a) " + turma[i].nome + ", tem " + turma[i].idade + " anos e tem a média igual a " + turma[i].media);
        }

        scanner.close();

        System.out.println("FIM DO PROGRAMA");
    }

}
