package com.cinema.movies.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "country")
@Getter
public class Country extends AbstractEntity {

	private String name;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "countries")
	private Set<Multimedia> multimedia = new HashSet<>();

	@Override
	public String toString() {
		return "Country{" +
				super.toString() +
				", name='" + name + '\'' +
				'}';
	}
}
