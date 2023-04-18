public class BeerSong {
    public static void main (String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){

            if (beerNum == 1){
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + "of beer on the wall");
            System.out.println(beerNum + " " + word + "of beer");
            System.out.println("take one down");
            System.out.println("Pass it arround");
            beerNum = beerNum - 1;

            if (beerNum > 0){
                System.out.println(beerNum + " " + word + "of the beer on the wall");
            }
            else{
                System.out.println("No more bottles pf beer on the wall");
            }



        }
    }
}