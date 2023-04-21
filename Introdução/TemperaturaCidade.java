class Cidade{  // Adicionamos a classe para marcarmos os parâmetros
    String nome;
    String uf;
    Float temperatura;

    public static void main(String [] args){  // Adicionamos o parametro para mostrar
        Cidade[] Brasil = new Cidade[3]; //Criamos o Array Brasil, utilizando a classe Cidade
        int x = 0; //Adicionamos o contador para podemos fazer o System.out
        while (x < 3){ // Colocamos X < 3, pois sempre a contagem é a partir do 0
            Brasil[x] = new Cidade(); //Vamos adicionar as informações para cidade
            if (x == 0 ){
                Brasil[x].nome = "Palmas";
                Brasil[x].uf = "PR";
                Brasil[x].temperatura = 5.3f;
            }
            if (x == 1 ){
                Brasil[x].nome = "Pato Branco";
                Brasil[x].uf = "PR";
                Brasil[x].temperatura = 12.3f;
            }
            if (x == 2 ){
                Brasil[x].nome = "Abelardo Luz";
                Brasil[x].uf = "SC";
                Brasil[x].temperatura = 7.8f;
            }

            System.out.println("A cidade de " + Brasil[x].nome + "/" + Brasil[x].uf + " está com " + Brasil[x].temperatura + " ºc");
            x += 1;
        }

    }
}
