package dev.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TaxiZonePriceMatrixId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class TaxiZonePriceMatrixId implements java.io.Serializable {

	// Fields

	private Integer baseId;
	private Integer companyId;
	private String zoneInit;
	private String zoneEnd;
	private Integer price;

	// Constructors

	/** default constructor */
	public TaxiZonePriceMatrixId() {
	}

	/** full constructor */
	public TaxiZonePriceMatrixId(Integer baseId, Integer companyId, String zoneInit, String zoneEnd, Integer price) {
		this.baseId = baseId;
		this.companyId = companyId;
		this.zoneInit = zoneInit;
		this.zoneEnd = zoneEnd;
		this.price = price;
	}

	// Property accessors

	@Column(name = "base_id", nullable = false)

	public Integer getBaseId() {
		return this.baseId;
	}

	public void setBaseId(Integer baseId) {
		this.baseId = baseId;
	}

	@Column(name = "company_id", nullable = false)

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "zone_init", nullable = false, length = 20)

	public String getZoneInit() {
		return this.zoneInit;
	}

	public void setZoneInit(String zoneInit) {
		this.zoneInit = zoneInit;
	}

	@Column(name = "zone_end", nullable = false, length = 20)

	public String getZoneEnd() {
		return this.zoneEnd;
	}

	public void setZoneEnd(String zoneEnd) {
		this.zoneEnd = zoneEnd;
	}

	@Column(name = "price", nullable = false)

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TaxiZonePriceMatrixId))
			return false;
		TaxiZonePriceMatrixId castOther = (TaxiZonePriceMatrixId) other;

		return ((this.getBaseId() == castOther.getBaseId()) || (this.getBaseId() != null
				&& castOther.getBaseId() != null && this.getBaseId().equals(castOther.getBaseId())))
				&& ((this.getCompanyId() == castOther.getCompanyId()) || (this.getCompanyId() != null
						&& castOther.getCompanyId() != null && this.getCompanyId().equals(castOther.getCompanyId())))
				&& ((this.getZoneInit() == castOther.getZoneInit()) || (this.getZoneInit() != null
						&& castOther.getZoneInit() != null && this.getZoneInit().equals(castOther.getZoneInit())))
				&& ((this.getZoneEnd() == castOther.getZoneEnd()) || (this.getZoneEnd() != null
						&& castOther.getZoneEnd() != null && this.getZoneEnd().equals(castOther.getZoneEnd())))
				&& ((this.getPrice() == castOther.getPrice()) || (this.getPrice() != null
						&& castOther.getPrice() != null && this.getPrice().equals(castOther.getPrice())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseId() == null ? 0 : this.getBaseId().hashCode());
		result = 37 * result + (getCompanyId() == null ? 0 : this.getCompanyId().hashCode());
		result = 37 * result + (getZoneInit() == null ? 0 : this.getZoneInit().hashCode());
		result = 37 * result + (getZoneEnd() == null ? 0 : this.getZoneEnd().hashCode());
		result = 37 * result + (getPrice() == null ? 0 : this.getPrice().hashCode());
		return result;
	}

}