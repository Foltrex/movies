package com.cinema.movies.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "series")
@Getter
public class Series extends Multimedia implements Identifiable {
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
