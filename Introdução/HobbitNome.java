class Hobbits{
    String name;
public static void main(String [] args){
    Hobbits[ ] h = new Hobbits[3];
    int z = -1;
    while (z < 3){
        z = z + 1;
        h[z] = new Hobbits();
        h[z].name = "Bilbo";
        if (z == 1){
            h[z].name = "Frodo";
        } 
        if (z == 2){
            h[z].name = "Samwise";
        }
        System.out.println(h[z].name + " é um bom nome para Hobbit");
        if (z == 2){
            break;
        }
    }
    System.out.println("O PROGRAMA ACABOU!");
}

}

