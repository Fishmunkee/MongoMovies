package com.sparta.spartamongodbfinalproject.model.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer;
import com.sparta.spartamongodbfinalproject.model.entities.movies.Award;
import com.sparta.spartamongodbfinalproject.model.entities.movies.Imdb;
import com.sparta.spartamongodbfinalproject.model.entities.movies.Tomato;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.DateOperators;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Date;
import java.util.List;

import static java.time.temporal.WeekFields.ISO;

@Document("movies")
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Movie {

    @MongoId(FieldType.OBJECT_ID)
    @Id
    private String id;

    private String plot;

    //    genres Array
    private List<String> genres;

//    runtime 1
    @JsonProperty("runtime")
    private Integer runtime;

    //cast Array
    private List<String> cast;

    //num_mflix_comments 0
    @JsonProperty("num_mflix_comment")
    private Integer num_mflix_comments;

    //    title"Blacksmith Scene"
    private String title;

    //fullplot"A stationary camera looks at a large anvil with a blacksmith behind it…"
    private String fullplot;

    //    countries Array
    private List<String> countries;

    //released 1893-05-09T00:00:00.000+00:00
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @JsonProperty("released")
    private Date released;

    //directors Array
    private List<String> directors;

    //rated "UNRATED"
    private String rated;

    //awards Object
    private Award awards;

    //lastupdated : "2015-08-26 00:03:50.133000000"
    //attern = "yyyy-MM-dd HH:mm:ss.SS"
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS'000000'")
    private String lastupdated;

    //year : 1893
    @JsonProperty("year")
    private String year;
    //    imdb :Object
    private Imdb imdb;

    //type "movie"
    private String type;

    //tomatoes : Object
    private Tomato tomatoes;
}
