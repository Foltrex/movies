package com.cinema.movies.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "producer")
@Getter
public class Producer implements Identifiable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Setter(AccessLevel.NONE)
	private Long id;
	private String name;
	private String surname;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "multimedia_producer",
			joinColumns = @JoinColumn(name = "producer_id"),
			inverseJoinColumns = @JoinColumn(name = "multimedia_id")
	)
	private Set<Multimedia> multimedia;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Producer producer)) {
			return false;
		}
		return id != null && id.equals(producer.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Producer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}
