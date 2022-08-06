package com.cinema.movies.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "genre")
@Getter
public class Genre extends AbstractEntity {

	private String name;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "genres")
	private Set<Multimedia> multimedia = new HashSet<>();

	@Override
	public String toString() {
		return "Genre{" +
				super.toString() +
				", name='" + name + '\'' +
				'}';
	}
}
