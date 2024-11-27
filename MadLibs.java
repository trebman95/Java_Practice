public class MadLibs {
    /*
     * This program generates a mad libbed
     * story.
     * Author: Tre'
     * Date: 9/9/1995
     */
    public static void main(String[] args) {
        String name1 = "Tre'";
        String name2 = "Juliet";
        int number = 1966;
        String place1 = "Charlotte";
        String adjective1 = "amazing";
        String adjective2 = "good";
        String adjective3 = "swell";
        String verb1 = "move";
        String noun1 = "human";
        String noun2 = "peace";
        String noun3 = "chair";
        String noun4 = "indian";
        String noun5 = "ice cream";
        String noun6 = "monkey";
        double lilDecimal = 81.7;
        char initial = 'T';
        boolean love = true;

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6
                + "s ruled the world. With a population of " + lilDecimal
                + "billion people. In the end, we know our love is " + love + "Our son will be initial with a "
                + initial;

        System.out.println(story);
    }

}
