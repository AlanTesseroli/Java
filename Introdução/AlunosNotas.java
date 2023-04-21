class Aluno {
    String name;
    float nota;
    int numchamada; 
    
    public static void main(String[] args) {
        Aluno[] turma = new Aluno[5];
        int x = -1;
        while (x < 4) {
            x += 1;
            turma[x] = new Aluno();
            if (x == 0) {
                turma[x].name = "João";
                turma[x].nota = 9.5f;
                turma[x].numchamada = 24;
            }
            if (x == 1) {
                turma[x].name = "Amanda";
                turma[x].nota = 7.3f;
                turma[x].numchamada = 20;
            }
            if (x == 2) {
                turma[x].name = "Alan";
                turma[x].nota = 6.3f;
                turma[x].numchamada = 1;
            }
            if (x == 3) {
                turma[x].name = "Aquiles";
                turma[x].nota = 9.7f;
                turma[x].numchamada = 4;
            }
            if (x == 4) {
                turma[x].name = "Mario";
                turma[x].nota = 8f;
                turma[x].numchamada = 17;
            }
            System.out.println(turma[x].name + ", nº " + turma[x].numchamada + " tirou " + turma[x].nota + " na prova de matemática!");
        }
    }
}
