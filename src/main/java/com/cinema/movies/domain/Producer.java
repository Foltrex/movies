package com.cinema.movies.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "producer")
@Getter
public class Producer extends AbstractEntity {

	private String name;
	private String surname;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(
			name = "multimedia_producer",
			joinColumns = @JoinColumn(name = "producer_id"),
			inverseJoinColumns = @JoinColumn(name = "multimedia_id")
	)
	private Set<Multimedia> multimedia = new HashSet<>();


	@Override
	public String toString() {
		return "Producer{" +
				super.toString() +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}
