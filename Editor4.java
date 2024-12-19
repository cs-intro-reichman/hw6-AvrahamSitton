import java.awt.Color; //import a laibary to art things
/*
 * 
 * 
 * 
 */
public class Editor4 {
    public static String filename; //get form the user the filename
    public static int steps;
    public static void main(String[] args) {

         filename = args[0]; //get form the user the filename
         steps = Integer.parseInt(args[1]); //get from the artist the number of the movmet steps 

        Color[][] source = Runigram.read(filename); //create an image in computer way 
        Color[][] target = Runigram.grayScaled(source); //create the 

        Runigram.setCanvas(source); //create new work place to paint on it
        Runigram.morph(source, target, steps); //let the coumputer do the rest

    }

}
