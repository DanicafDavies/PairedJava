package com.qa;

public class Series {

        public String getDuration() {
            return duration;
        }
        public void setDuration(String duration) {
            this.duration = duration;
        }
        public int getRating() {
            return rating;
        }
        public void setRating(int rating) {
            this.rating = rating;
        }
        public String getStreamingTitle() {
            return streamingTitle;
        }
        public void setStreamingTitle(String streamingTitle) {
            this.streamingTitle = streamingTitle;
        }

       // @Override
        public Series(String StreamingTitle, int rating, String Duration ) {
            this.setStreamingTitle("Groundhog Day");
            this.setRating(13);
            this.setDuration("4 Seasons");
        }

        String streamingTitle;
        String title;
    String duration;
        int rating;
        int year;
        int ageRating;
    }

