package com.cinema.movies.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.*;


@Entity
@Table(name = "character")
@Getter
public class Character implements Identifiable {
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	private String name;
	private String surname;
	@Column(name = "image_path")
	private String imagePath;
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "multimedia_id")
	private Multimedia multimedia;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Character character)) {
			return false;
		}
		return id != null && id.equals(character.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Character{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", imagePath='" + imagePath + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
