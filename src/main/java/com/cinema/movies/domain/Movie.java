package com.cinema.movies.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;
import java.time.Duration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "movie")
public class Movie extends Multimedia implements Identifiable {
	@Column(name = "release_date")
	private Date releaseDate;
	private Type type;
	private Duration duration;

	public enum Type {
		FILM("film"),
		CARTOON("cartoon");

		private final String typeName;

		Type(String typeName) {
			this.typeName = typeName;
		}

		public Type valueOfTypeName(String typeName) {
			return Type.valueOf(typeName.toUpperCase());
		}

		public String getTypeName() {
			return typeName;
		}
	}

	@Override
	public String toString() {
		return "Movie{" +
				super.toString() +
				", releaseDate=" + releaseDate +
				", type=" + type +
				", duration=" + duration +
				'}';
	}
}
