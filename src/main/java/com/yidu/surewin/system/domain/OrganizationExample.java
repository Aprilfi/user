package com.yidu.surewin.system.domain;

import java.util.ArrayList;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOrganizationidIsNull() {
            addCriterion("organizationId is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("organizationId is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("organizationId =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("organizationId <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("organizationId >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("organizationId >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("organizationId <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("organizationId <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("organizationId like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("organizationId not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("organizationId in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("organizationId not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("organizationId between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("organizationId not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameIsNull() {
            addCriterion("organizatinName is null");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameIsNotNull() {
            addCriterion("organizatinName is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameEqualTo(String value) {
            addCriterion("organizatinName =", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameNotEqualTo(String value) {
            addCriterion("organizatinName <>", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameGreaterThan(String value) {
            addCriterion("organizatinName >", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameGreaterThanOrEqualTo(String value) {
            addCriterion("organizatinName >=", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameLessThan(String value) {
            addCriterion("organizatinName <", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameLessThanOrEqualTo(String value) {
            addCriterion("organizatinName <=", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameLike(String value) {
            addCriterion("organizatinName like", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameNotLike(String value) {
            addCriterion("organizatinName not like", value, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameIn(List<String> values) {
            addCriterion("organizatinName in", values, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameNotIn(List<String> values) {
            addCriterion("organizatinName not in", values, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameBetween(String value1, String value2) {
            addCriterion("organizatinName between", value1, value2, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andOrganizatinnameNotBetween(String value1, String value2) {
            addCriterion("organizatinName not between", value1, value2, "organizatinname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentId like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentId not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNull() {
            addCriterion("parentName is null");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNotNull() {
            addCriterion("parentName is not null");
            return (Criteria) this;
        }

        public Criteria andParentnameEqualTo(String value) {
            addCriterion("parentName =", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotEqualTo(String value) {
            addCriterion("parentName <>", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThan(String value) {
            addCriterion("parentName >", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThanOrEqualTo(String value) {
            addCriterion("parentName >=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThan(String value) {
            addCriterion("parentName <", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThanOrEqualTo(String value) {
            addCriterion("parentName <=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLike(String value) {
            addCriterion("parentName like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotLike(String value) {
            addCriterion("parentName not like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameIn(List<String> values) {
            addCriterion("parentName in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotIn(List<String> values) {
            addCriterion("parentName not in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameBetween(String value1, String value2) {
            addCriterion("parentName between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotBetween(String value1, String value2) {
            addCriterion("parentName not between", value1, value2, "parentname");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andConnectphoneIsNull() {
            addCriterion("connectPhone is null");
            return (Criteria) this;
        }

        public Criteria andConnectphoneIsNotNull() {
            addCriterion("connectPhone is not null");
            return (Criteria) this;
        }

        public Criteria andConnectphoneEqualTo(String value) {
            addCriterion("connectPhone =", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotEqualTo(String value) {
            addCriterion("connectPhone <>", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneGreaterThan(String value) {
            addCriterion("connectPhone >", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneGreaterThanOrEqualTo(String value) {
            addCriterion("connectPhone >=", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneLessThan(String value) {
            addCriterion("connectPhone <", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneLessThanOrEqualTo(String value) {
            addCriterion("connectPhone <=", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneLike(String value) {
            addCriterion("connectPhone like", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotLike(String value) {
            addCriterion("connectPhone not like", value, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneIn(List<String> values) {
            addCriterion("connectPhone in", values, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotIn(List<String> values) {
            addCriterion("connectPhone not in", values, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneBetween(String value1, String value2) {
            addCriterion("connectPhone between", value1, value2, "connectphone");
            return (Criteria) this;
        }

        public Criteria andConnectphoneNotBetween(String value1, String value2) {
            addCriterion("connectPhone not between", value1, value2, "connectphone");
            return (Criteria) this;
        }

        public Criteria andManageridIsNull() {
            addCriterion("managerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(String value) {
            addCriterion("managerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(String value) {
            addCriterion("managerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(String value) {
            addCriterion("managerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(String value) {
            addCriterion("managerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(String value) {
            addCriterion("managerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(String value) {
            addCriterion("managerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLike(String value) {
            addCriterion("managerId like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotLike(String value) {
            addCriterion("managerId not like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<String> values) {
            addCriterion("managerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<String> values) {
            addCriterion("managerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(String value1, String value2) {
            addCriterion("managerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(String value1, String value2) {
            addCriterion("managerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNull() {
            addCriterion("managerName is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("managerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("managerName =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("managerName <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("managerName >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("managerName >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("managerName <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("managerName <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("managerName like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("managerName not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("managerName in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("managerName not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("managerName between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("managerName not between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeIsNull() {
            addCriterion("organizationType is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeIsNotNull() {
            addCriterion("organizationType is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeEqualTo(String value) {
            addCriterion("organizationType =", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotEqualTo(String value) {
            addCriterion("organizationType <>", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeGreaterThan(String value) {
            addCriterion("organizationType >", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("organizationType >=", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeLessThan(String value) {
            addCriterion("organizationType <", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeLessThanOrEqualTo(String value) {
            addCriterion("organizationType <=", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeLike(String value) {
            addCriterion("organizationType like", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotLike(String value) {
            addCriterion("organizationType not like", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeIn(List<String> values) {
            addCriterion("organizationType in", values, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotIn(List<String> values) {
            addCriterion("organizationType not in", values, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeBetween(String value1, String value2) {
            addCriterion("organizationType between", value1, value2, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotBetween(String value1, String value2) {
            addCriterion("organizationType not between", value1, value2, "organizationtype");
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