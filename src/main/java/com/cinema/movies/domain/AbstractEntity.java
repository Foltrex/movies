package com.cinema.movies.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@MappedSuperclass
@Getter
public abstract class AbstractEntity implements Identifiable<Long>, Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractEntity that)) {
            return false;
        }

        return id != null && id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : super.hashCode();
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
