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

        public Series() { this("Netflix", 13, "15 Seasons"); }

        public Series(String StreamingTitle, int rating, String Duration ) {
            this.streamingTitle = StreamingTitle;
            this.rating = rating;
            this.duration = Duration;
        }

        String streamingTitle;
        String title;
    String duration;
        int rating;
        int year;
        int ageRating;

@Override
public String toString() {
    return "Series{" +
            "streamingTitle='" + streamingTitle + '\'' +
            ", title='" + title + '\'' +
            ", duration='" + duration + '\'' +
            ", rating=" + rating +
            ", year=" + year +
            ", ageRating=" + ageRating +
            '}';
}
}

