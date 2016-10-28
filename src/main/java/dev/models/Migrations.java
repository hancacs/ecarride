package dev.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Migrations entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "migrations", catalog = "ecarride_db_foreign_key")

public class Migrations implements java.io.Serializable {

	// Fields

	private MigrationsId id;

	// Constructors

	/** default constructor */
	public Migrations() {
	}

	/** full constructor */
	public Migrations(MigrationsId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "migration", column = @Column(name = "migration", nullable = false) ),
			@AttributeOverride(name = "batch", column = @Column(name = "batch", nullable = false) ) })

	public MigrationsId getId() {
		return this.id;
	}

	public void setId(MigrationsId id) {
		this.id = id;
	}

}