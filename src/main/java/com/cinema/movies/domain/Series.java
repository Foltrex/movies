package com.cinema.movies.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "series")
@PrimaryKeyJoinColumn(name = "multimedia_id")
@Getter
public class Series extends Multimedia {
	@Column(name = "seasons_amount")
	private int seasonsAmount;
	@Column(name = "series_amount")
	private int seriesAmount;
	@Column(name = "broadcast_start")
	private Date broadcastStart;
	@Column(name = "broadcast_end")
	private Date broadcastEnd;

	@Override
	public String toString() {
		return "Series{" +
				super.toString() +
				", seasonsAmount=" + seasonsAmount +
				", seriesAmount=" + seriesAmount +
				", broadcastStart=" + broadcastStart +
				", broadcastEnd=" + broadcastEnd +
				'}';
	}
}
