package com.podbox.challenge.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {

    @JacksonXmlProperty(localName = "rank_this_week")
    public Integer rank;

    @JacksonXmlProperty(localName = "chart_item_title")
    public String title;

    public String artist;

    public String spotifyUri;

    public Track() {
    }

    public Track(Integer rank, String title, String artist) {
        this(rank, title, artist, null);
    }

    public Track(Integer rank, String title, String artist, String spotifyUri) {
        this.rank = rank;
        this.title = title;
        this.artist = artist;
        this.spotifyUri = spotifyUri;
    }
}
