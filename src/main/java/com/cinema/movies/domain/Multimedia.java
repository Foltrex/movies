package com.cinema.movies.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Entity
@Table(name = "multimedia")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Multimedia extends AbstractEntity {
    private String name;

    @Column(name = "image_path")
    private String imagePath;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "multimedia_country",
            joinColumns = @JoinColumn(name = "multimedia_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id")
    )
    private Set<Country> countries = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "multimedia_genre",
            joinColumns = @JoinColumn(name = "multimedia_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genres = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "multimedia")
    private Set<Producer> producers = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "multimedia")
    private Set<Character> characters = new HashSet<>();


    @Override
    public String toString() {
        return "id=" + super.toString() +
                ", name='" + name + '\'' +
                ", imagePath='" + imagePath + '\'';
    }
}
