package dev.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TaxiZonePriceMatrix entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "taxi_zone_price_matrix", catalog = "ecarride_db_foreign_key")

public class TaxiZonePriceMatrix implements java.io.Serializable {

	// Fields

	private TaxiZonePriceMatrixId id;

	// Constructors

	/** default constructor */
	public TaxiZonePriceMatrix() {
	}

	/** full constructor */
	public TaxiZonePriceMatrix(TaxiZonePriceMatrixId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "baseId", column = @Column(name = "base_id", nullable = false) ),
			@AttributeOverride(name = "companyId", column = @Column(name = "company_id", nullable = false) ),
			@AttributeOverride(name = "zoneInit", column = @Column(name = "zone_init", nullable = false, length = 20) ),
			@AttributeOverride(name = "zoneEnd", column = @Column(name = "zone_end", nullable = false, length = 20) ),
			@AttributeOverride(name = "price", column = @Column(name = "price", nullable = false) ) })

	public TaxiZonePriceMatrixId getId() {
		return this.id;
	}

	public void setId(TaxiZonePriceMatrixId id) {
		this.id = id;
	}

}