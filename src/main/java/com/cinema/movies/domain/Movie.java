package com.cinema.movies.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Arrays;
import java.util.Date;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "movie")
@PrimaryKeyJoinColumn(name = "multimedia_id")
@Getter
public class Movie extends Multimedia {
	@Column(name = "release_date")
	private Date releaseDate;
	private Type type;
	private Duration duration;

	public enum Type {
		FILM("film"),
		CARTOON("cartoon");

		private final String typeName;

		private static final Map<String, Type> ELEMENTS = new HashMap<>(
				Arrays.stream(Type.values())
						.collect(Collectors.toMap(Type::getTypeName, x -> x))
		);

		Type(String typeName) {
			this.typeName = typeName;
		}

		@JsonCreator
		public static Type valueOfTypeName(String typeName) {
			return ELEMENTS.get(typeName);
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
