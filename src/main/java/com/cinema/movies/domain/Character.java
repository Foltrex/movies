package com.cinema.movies.domain;

import lombok.Getter;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "character")
@Getter
public class Character extends AbstractEntity {

	private String name;
	private String surname;
	@Column(name = "image_path")
	private String imagePath;
	private String description;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "multimedia_id")
	private Multimedia multimedia;

	@Override
	public String toString() {
		return "Character{" +
				super.toString() +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", imagePath='" + imagePath + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
