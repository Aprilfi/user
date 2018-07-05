package com.yidu.surewin.system.domain;

import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("areaId like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("areaId not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postCode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postCode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postCode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postCode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postCode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postCode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postCode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postCode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postCode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postCode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postCode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postCode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postCode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeIsNull() {
            addCriterion("simpleCode is null");
            return (Criteria) this;
        }

        public Criteria andSimplecodeIsNotNull() {
            addCriterion("simpleCode is not null");
            return (Criteria) this;
        }

        public Criteria andSimplecodeEqualTo(String value) {
            addCriterion("simpleCode =", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotEqualTo(String value) {
            addCriterion("simpleCode <>", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeGreaterThan(String value) {
            addCriterion("simpleCode >", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeGreaterThanOrEqualTo(String value) {
            addCriterion("simpleCode >=", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeLessThan(String value) {
            addCriterion("simpleCode <", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeLessThanOrEqualTo(String value) {
            addCriterion("simpleCode <=", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeLike(String value) {
            addCriterion("simpleCode like", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotLike(String value) {
            addCriterion("simpleCode not like", value, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeIn(List<String> values) {
            addCriterion("simpleCode in", values, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotIn(List<String> values) {
            addCriterion("simpleCode not in", values, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeBetween(String value1, String value2) {
            addCriterion("simpleCode between", value1, value2, "simplecode");
            return (Criteria) this;
        }

        public Criteria andSimplecodeNotBetween(String value1, String value2) {
            addCriterion("simpleCode not between", value1, value2, "simplecode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("cityCode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("cityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("cityCode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("cityCode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("cityCode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("cityCode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("cityCode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("cityCode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("cityCode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("cityCode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("cityCode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("cityCode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("cityCode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("cityCode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andOutportidIsNull() {
            addCriterion("outPortId is null");
            return (Criteria) this;
        }

        public Criteria andOutportidIsNotNull() {
            addCriterion("outPortId is not null");
            return (Criteria) this;
        }

        public Criteria andOutportidEqualTo(String value) {
            addCriterion("outPortId =", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidNotEqualTo(String value) {
            addCriterion("outPortId <>", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidGreaterThan(String value) {
            addCriterion("outPortId >", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidGreaterThanOrEqualTo(String value) {
            addCriterion("outPortId >=", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidLessThan(String value) {
            addCriterion("outPortId <", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidLessThanOrEqualTo(String value) {
            addCriterion("outPortId <=", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidLike(String value) {
            addCriterion("outPortId like", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidNotLike(String value) {
            addCriterion("outPortId not like", value, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidIn(List<String> values) {
            addCriterion("outPortId in", values, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidNotIn(List<String> values) {
            addCriterion("outPortId not in", values, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidBetween(String value1, String value2) {
            addCriterion("outPortId between", value1, value2, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportidNotBetween(String value1, String value2) {
            addCriterion("outPortId not between", value1, value2, "outportid");
            return (Criteria) this;
        }

        public Criteria andOutportIsNull() {
            addCriterion("outPort is null");
            return (Criteria) this;
        }

        public Criteria andOutportIsNotNull() {
            addCriterion("outPort is not null");
            return (Criteria) this;
        }

        public Criteria andOutportEqualTo(String value) {
            addCriterion("outPort =", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportNotEqualTo(String value) {
            addCriterion("outPort <>", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportGreaterThan(String value) {
            addCriterion("outPort >", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportGreaterThanOrEqualTo(String value) {
            addCriterion("outPort >=", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportLessThan(String value) {
            addCriterion("outPort <", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportLessThanOrEqualTo(String value) {
            addCriterion("outPort <=", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportLike(String value) {
            addCriterion("outPort like", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportNotLike(String value) {
            addCriterion("outPort not like", value, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportIn(List<String> values) {
            addCriterion("outPort in", values, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportNotIn(List<String> values) {
            addCriterion("outPort not in", values, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportBetween(String value1, String value2) {
            addCriterion("outPort between", value1, value2, "outport");
            return (Criteria) this;
        }

        public Criteria andOutportNotBetween(String value1, String value2) {
            addCriterion("outPort not between", value1, value2, "outport");
            return (Criteria) this;
        }

        public Criteria andInportidIsNull() {
            addCriterion("inPortId is null");
            return (Criteria) this;
        }

        public Criteria andInportidIsNotNull() {
            addCriterion("inPortId is not null");
            return (Criteria) this;
        }

        public Criteria andInportidEqualTo(String value) {
            addCriterion("inPortId =", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidNotEqualTo(String value) {
            addCriterion("inPortId <>", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidGreaterThan(String value) {
            addCriterion("inPortId >", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidGreaterThanOrEqualTo(String value) {
            addCriterion("inPortId >=", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidLessThan(String value) {
            addCriterion("inPortId <", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidLessThanOrEqualTo(String value) {
            addCriterion("inPortId <=", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidLike(String value) {
            addCriterion("inPortId like", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidNotLike(String value) {
            addCriterion("inPortId not like", value, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidIn(List<String> values) {
            addCriterion("inPortId in", values, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidNotIn(List<String> values) {
            addCriterion("inPortId not in", values, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidBetween(String value1, String value2) {
            addCriterion("inPortId between", value1, value2, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportidNotBetween(String value1, String value2) {
            addCriterion("inPortId not between", value1, value2, "inportid");
            return (Criteria) this;
        }

        public Criteria andInportIsNull() {
            addCriterion("inPort is null");
            return (Criteria) this;
        }

        public Criteria andInportIsNotNull() {
            addCriterion("inPort is not null");
            return (Criteria) this;
        }

        public Criteria andInportEqualTo(String value) {
            addCriterion("inPort =", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportNotEqualTo(String value) {
            addCriterion("inPort <>", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportGreaterThan(String value) {
            addCriterion("inPort >", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportGreaterThanOrEqualTo(String value) {
            addCriterion("inPort >=", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportLessThan(String value) {
            addCriterion("inPort <", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportLessThanOrEqualTo(String value) {
            addCriterion("inPort <=", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportLike(String value) {
            addCriterion("inPort like", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportNotLike(String value) {
            addCriterion("inPort not like", value, "inport");
            return (Criteria) this;
        }

        public Criteria andInportIn(List<String> values) {
            addCriterion("inPort in", values, "inport");
            return (Criteria) this;
        }

        public Criteria andInportNotIn(List<String> values) {
            addCriterion("inPort not in", values, "inport");
            return (Criteria) this;
        }

        public Criteria andInportBetween(String value1, String value2) {
            addCriterion("inPort between", value1, value2, "inport");
            return (Criteria) this;
        }

        public Criteria andInportNotBetween(String value1, String value2) {
            addCriterion("inPort not between", value1, value2, "inport");
            return (Criteria) this;
        }

        public Criteria andServiceareaIsNull() {
            addCriterion("serviceArea is null");
            return (Criteria) this;
        }

        public Criteria andServiceareaIsNotNull() {
            addCriterion("serviceArea is not null");
            return (Criteria) this;
        }

        public Criteria andServiceareaEqualTo(String value) {
            addCriterion("serviceArea =", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaNotEqualTo(String value) {
            addCriterion("serviceArea <>", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaGreaterThan(String value) {
            addCriterion("serviceArea >", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaGreaterThanOrEqualTo(String value) {
            addCriterion("serviceArea >=", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaLessThan(String value) {
            addCriterion("serviceArea <", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaLessThanOrEqualTo(String value) {
            addCriterion("serviceArea <=", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaLike(String value) {
            addCriterion("serviceArea like", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaNotLike(String value) {
            addCriterion("serviceArea not like", value, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaIn(List<String> values) {
            addCriterion("serviceArea in", values, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaNotIn(List<String> values) {
            addCriterion("serviceArea not in", values, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaBetween(String value1, String value2) {
            addCriterion("serviceArea between", value1, value2, "servicearea");
            return (Criteria) this;
        }

        public Criteria andServiceareaNotBetween(String value1, String value2) {
            addCriterion("serviceArea not between", value1, value2, "servicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaIsNull() {
            addCriterion("unserviceArea is null");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaIsNotNull() {
            addCriterion("unserviceArea is not null");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaEqualTo(String value) {
            addCriterion("unserviceArea =", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaNotEqualTo(String value) {
            addCriterion("unserviceArea <>", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaGreaterThan(String value) {
            addCriterion("unserviceArea >", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaGreaterThanOrEqualTo(String value) {
            addCriterion("unserviceArea >=", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaLessThan(String value) {
            addCriterion("unserviceArea <", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaLessThanOrEqualTo(String value) {
            addCriterion("unserviceArea <=", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaLike(String value) {
            addCriterion("unserviceArea like", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaNotLike(String value) {
            addCriterion("unserviceArea not like", value, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaIn(List<String> values) {
            addCriterion("unserviceArea in", values, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaNotIn(List<String> values) {
            addCriterion("unserviceArea not in", values, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaBetween(String value1, String value2) {
            addCriterion("unserviceArea between", value1, value2, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andUnserviceareaNotBetween(String value1, String value2) {
            addCriterion("unserviceArea not between", value1, value2, "unservicearea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaIsNull() {
            addCriterion("specialArea is null");
            return (Criteria) this;
        }

        public Criteria andSpecialareaIsNotNull() {
            addCriterion("specialArea is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialareaEqualTo(String value) {
            addCriterion("specialArea =", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaNotEqualTo(String value) {
            addCriterion("specialArea <>", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaGreaterThan(String value) {
            addCriterion("specialArea >", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaGreaterThanOrEqualTo(String value) {
            addCriterion("specialArea >=", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaLessThan(String value) {
            addCriterion("specialArea <", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaLessThanOrEqualTo(String value) {
            addCriterion("specialArea <=", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaLike(String value) {
            addCriterion("specialArea like", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaNotLike(String value) {
            addCriterion("specialArea not like", value, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaIn(List<String> values) {
            addCriterion("specialArea in", values, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaNotIn(List<String> values) {
            addCriterion("specialArea not in", values, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaBetween(String value1, String value2) {
            addCriterion("specialArea between", value1, value2, "specialarea");
            return (Criteria) this;
        }

        public Criteria andSpecialareaNotBetween(String value1, String value2) {
            addCriterion("specialArea not between", value1, value2, "specialarea");
            return (Criteria) this;
        }

        public Criteria andOuternetIsNull() {
            addCriterion("outerNet is null");
            return (Criteria) this;
        }

        public Criteria andOuternetIsNotNull() {
            addCriterion("outerNet is not null");
            return (Criteria) this;
        }

        public Criteria andOuternetEqualTo(String value) {
            addCriterion("outerNet =", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetNotEqualTo(String value) {
            addCriterion("outerNet <>", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetGreaterThan(String value) {
            addCriterion("outerNet >", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetGreaterThanOrEqualTo(String value) {
            addCriterion("outerNet >=", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetLessThan(String value) {
            addCriterion("outerNet <", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetLessThanOrEqualTo(String value) {
            addCriterion("outerNet <=", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetLike(String value) {
            addCriterion("outerNet like", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetNotLike(String value) {
            addCriterion("outerNet not like", value, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetIn(List<String> values) {
            addCriterion("outerNet in", values, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetNotIn(List<String> values) {
            addCriterion("outerNet not in", values, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetBetween(String value1, String value2) {
            addCriterion("outerNet between", value1, value2, "outernet");
            return (Criteria) this;
        }

        public Criteria andOuternetNotBetween(String value1, String value2) {
            addCriterion("outerNet not between", value1, value2, "outernet");
            return (Criteria) this;
        }

        public Criteria andSuburbsIsNull() {
            addCriterion("suburbs is null");
            return (Criteria) this;
        }

        public Criteria andSuburbsIsNotNull() {
            addCriterion("suburbs is not null");
            return (Criteria) this;
        }

        public Criteria andSuburbsEqualTo(String value) {
            addCriterion("suburbs =", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsNotEqualTo(String value) {
            addCriterion("suburbs <>", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsGreaterThan(String value) {
            addCriterion("suburbs >", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsGreaterThanOrEqualTo(String value) {
            addCriterion("suburbs >=", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsLessThan(String value) {
            addCriterion("suburbs <", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsLessThanOrEqualTo(String value) {
            addCriterion("suburbs <=", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsLike(String value) {
            addCriterion("suburbs like", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsNotLike(String value) {
            addCriterion("suburbs not like", value, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsIn(List<String> values) {
            addCriterion("suburbs in", values, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsNotIn(List<String> values) {
            addCriterion("suburbs not in", values, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsBetween(String value1, String value2) {
            addCriterion("suburbs between", value1, value2, "suburbs");
            return (Criteria) this;
        }

        public Criteria andSuburbsNotBetween(String value1, String value2) {
            addCriterion("suburbs not between", value1, value2, "suburbs");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNull() {
            addCriterion("areaLevel is null");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNotNull() {
            addCriterion("areaLevel is not null");
            return (Criteria) this;
        }

        public Criteria andArealevelEqualTo(String value) {
            addCriterion("areaLevel =", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotEqualTo(String value) {
            addCriterion("areaLevel <>", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThan(String value) {
            addCriterion("areaLevel >", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThanOrEqualTo(String value) {
            addCriterion("areaLevel >=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThan(String value) {
            addCriterion("areaLevel <", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThanOrEqualTo(String value) {
            addCriterion("areaLevel <=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLike(String value) {
            addCriterion("areaLevel like", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotLike(String value) {
            addCriterion("areaLevel not like", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelIn(List<String> values) {
            addCriterion("areaLevel in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotIn(List<String> values) {
            addCriterion("areaLevel not in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelBetween(String value1, String value2) {
            addCriterion("areaLevel between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotBetween(String value1, String value2) {
            addCriterion("areaLevel not between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andZoneIsNull() {
            addCriterion("zone is null");
            return (Criteria) this;
        }

        public Criteria andZoneIsNotNull() {
            addCriterion("zone is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEqualTo(String value) {
            addCriterion("zone =", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotEqualTo(String value) {
            addCriterion("zone <>", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThan(String value) {
            addCriterion("zone >", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThanOrEqualTo(String value) {
            addCriterion("zone >=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThan(String value) {
            addCriterion("zone <", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThanOrEqualTo(String value) {
            addCriterion("zone <=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLike(String value) {
            addCriterion("zone like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotLike(String value) {
            addCriterion("zone not like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneIn(List<String> values) {
            addCriterion("zone in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotIn(List<String> values) {
            addCriterion("zone not in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneBetween(String value1, String value2) {
            addCriterion("zone between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotBetween(String value1, String value2) {
            addCriterion("zone not between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andCitylevelIsNull() {
            addCriterion("cityLevel is null");
            return (Criteria) this;
        }

        public Criteria andCitylevelIsNotNull() {
            addCriterion("cityLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCitylevelEqualTo(String value) {
            addCriterion("cityLevel =", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotEqualTo(String value) {
            addCriterion("cityLevel <>", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelGreaterThan(String value) {
            addCriterion("cityLevel >", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelGreaterThanOrEqualTo(String value) {
            addCriterion("cityLevel >=", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLessThan(String value) {
            addCriterion("cityLevel <", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLessThanOrEqualTo(String value) {
            addCriterion("cityLevel <=", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelLike(String value) {
            addCriterion("cityLevel like", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotLike(String value) {
            addCriterion("cityLevel not like", value, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelIn(List<String> values) {
            addCriterion("cityLevel in", values, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotIn(List<String> values) {
            addCriterion("cityLevel not in", values, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelBetween(String value1, String value2) {
            addCriterion("cityLevel between", value1, value2, "citylevel");
            return (Criteria) this;
        }

        public Criteria andCitylevelNotBetween(String value1, String value2) {
            addCriterion("cityLevel not between", value1, value2, "citylevel");
            return (Criteria) this;
        }

        public Criteria andPortsIsNull() {
            addCriterion("ports is null");
            return (Criteria) this;
        }

        public Criteria andPortsIsNotNull() {
            addCriterion("ports is not null");
            return (Criteria) this;
        }

        public Criteria andPortsEqualTo(String value) {
            addCriterion("ports =", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotEqualTo(String value) {
            addCriterion("ports <>", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsGreaterThan(String value) {
            addCriterion("ports >", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsGreaterThanOrEqualTo(String value) {
            addCriterion("ports >=", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsLessThan(String value) {
            addCriterion("ports <", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsLessThanOrEqualTo(String value) {
            addCriterion("ports <=", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsLike(String value) {
            addCriterion("ports like", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotLike(String value) {
            addCriterion("ports not like", value, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsIn(List<String> values) {
            addCriterion("ports in", values, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotIn(List<String> values) {
            addCriterion("ports not in", values, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsBetween(String value1, String value2) {
            addCriterion("ports between", value1, value2, "ports");
            return (Criteria) this;
        }

        public Criteria andPortsNotBetween(String value1, String value2) {
            addCriterion("ports not between", value1, value2, "ports");
            return (Criteria) this;
        }

        public Criteria andUseableIsNull() {
            addCriterion("useable is null");
            return (Criteria) this;
        }

        public Criteria andUseableIsNotNull() {
            addCriterion("useable is not null");
            return (Criteria) this;
        }

        public Criteria andUseableEqualTo(String value) {
            addCriterion("useable =", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableNotEqualTo(String value) {
            addCriterion("useable <>", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableGreaterThan(String value) {
            addCriterion("useable >", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableGreaterThanOrEqualTo(String value) {
            addCriterion("useable >=", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableLessThan(String value) {
            addCriterion("useable <", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableLessThanOrEqualTo(String value) {
            addCriterion("useable <=", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableLike(String value) {
            addCriterion("useable like", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableNotLike(String value) {
            addCriterion("useable not like", value, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableIn(List<String> values) {
            addCriterion("useable in", values, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableNotIn(List<String> values) {
            addCriterion("useable not in", values, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableBetween(String value1, String value2) {
            addCriterion("useable between", value1, value2, "useable");
            return (Criteria) this;
        }

        public Criteria andUseableNotBetween(String value1, String value2) {
            addCriterion("useable not between", value1, value2, "useable");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}