package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

    private String title;
    private String year;
    private String imdbID;
    private String poster;

    public Movie() {
        //Jackson deserialize
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Year")
    public String getYear() {
        return year;
    }

    @JsonProperty("imdbID")
    public String getImdbID() {
        return imdbID;
    }

//    @JsonIgnore
//    public FilterType getFilterType() {
//        return filterType;
//    }

    @JsonProperty("Poster")
    public String getPoster() {
        return poster;
    }
}
