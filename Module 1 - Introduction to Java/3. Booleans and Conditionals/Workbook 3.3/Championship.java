public class Championship {
    public static void main(String[] args) {

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;

        if (margin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if(margin > 0){
            System.out.println("In second place we have Gryffindor!");
        } else if(margin >= -100){
            System.out.println("In third place we have Gryffindor!");
        } else{
            System.out.println("In fourth place we have Gryffindor!");
        }
    }
}