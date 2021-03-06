package com.jfinalshop.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAreaFreightConfig<M extends BaseAreaFreightConfig<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setCreatedDate(java.util.Date createdDate) {
		set("created_date", createdDate);
	}

	public java.util.Date getCreatedDate() {
		return get("created_date");
	}

	public void setLastModifiedDate(java.util.Date lastModifiedDate) {
		set("last_modified_date", lastModifiedDate);
	}

	public java.util.Date getLastModifiedDate() {
		return get("last_modified_date");
	}

	public void setVersion(java.lang.Long version) {
		set("version", version);
	}

	public java.lang.Long getVersion() {
		return getLong("version");
	}

	public void setContinuePrice(java.math.BigDecimal continuePrice) {
		set("continue_price", continuePrice);
	}

	public java.math.BigDecimal getContinuePrice() {
		return get("continue_price");
	}

	public void setContinueWeight(java.lang.Integer continueWeight) {
		set("continue_weight", continueWeight);
	}

	public java.lang.Integer getContinueWeight() {
		return getInt("continue_weight");
	}

	public void setFirstPrice(java.math.BigDecimal firstPrice) {
		set("first_price", firstPrice);
	}

	public java.math.BigDecimal getFirstPrice() {
		return get("first_price");
	}

	public void setFirstWeight(java.lang.Integer firstWeight) {
		set("first_weight", firstWeight);
	}

	public java.lang.Integer getFirstWeight() {
		return getInt("first_weight");
	}

	public void setShippingMethodId(java.lang.Long shippingMethodId) {
		set("shipping_method_id", shippingMethodId);
	}

	public java.lang.Long getShippingMethodId() {
		return getLong("shipping_method_id");
	}

	public void setStoreId(java.lang.Long storeId) {
		set("store_id", storeId);
	}

	public java.lang.Long getStoreId() {
		return getLong("store_id");
	}

	public void setAreaId(java.lang.Long areaId) {
		set("area_id", areaId);
	}

	public java.lang.Long getAreaId() {
		return getLong("area_id");
	}

}
