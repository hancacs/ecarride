package dev.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MigrationsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class MigrationsId implements java.io.Serializable {

	// Fields

	private String migration;
	private Integer batch;

	// Constructors

	/** default constructor */
	public MigrationsId() {
	}

	/** full constructor */
	public MigrationsId(String migration, Integer batch) {
		this.migration = migration;
		this.batch = batch;
	}

	// Property accessors

	@Column(name = "migration", nullable = false)

	public String getMigration() {
		return this.migration;
	}

	public void setMigration(String migration) {
		this.migration = migration;
	}

	@Column(name = "batch", nullable = false)

	public Integer getBatch() {
		return this.batch;
	}

	public void setBatch(Integer batch) {
		this.batch = batch;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MigrationsId))
			return false;
		MigrationsId castOther = (MigrationsId) other;

		return ((this.getMigration() == castOther.getMigration()) || (this.getMigration() != null
				&& castOther.getMigration() != null && this.getMigration().equals(castOther.getMigration())))
				&& ((this.getBatch() == castOther.getBatch()) || (this.getBatch() != null
						&& castOther.getBatch() != null && this.getBatch().equals(castOther.getBatch())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMigration() == null ? 0 : this.getMigration().hashCode());
		result = 37 * result + (getBatch() == null ? 0 : this.getBatch().hashCode());
		return result;
	}

}