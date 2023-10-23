package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Series BrooklynNineNine = new Series();
        BrooklynNineNine.setStreamingTitle("Netflix");
        BrooklynNineNine.setRating(15);
        System.out.println(BrooklynNineNine.getStreamingTitle());

        Series SouthPark = new Series();
        SouthPark.setStreamingTitle("Paramount");
        SouthPark.setRating(21);
        System.out.println(SouthPark.getStreamingTitle() + SouthPark.getRating());
    }
}
