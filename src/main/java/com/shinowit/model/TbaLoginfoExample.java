package com.shinowit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbaLoginfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public TbaLoginfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setCustomCriteria(String customCriteria) {
        this.customCriteria=customCriteria;
    }

    public String getCustomCriteria() {
        return this.customCriteria;
    }

    public int getSkipRecordCount() {
        int count=(this.pageIndex-1)*this.pageSize;
        if (count<0){
             count=0;
        }
        return count;
    }

    public int getEndRecordCount() {
        return this.pageIndex*this.pageSize;
    }

    public TbaLoginfoExample(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperidIsNull() {
            addCriterion("OperID is null");
            return (Criteria) this;
        }

        public Criteria andOperidIsNotNull() {
            addCriterion("OperID is not null");
            return (Criteria) this;
        }

        public Criteria andOperidEqualTo(String value) {
            addCriterion("OperID =", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotEqualTo(String value) {
            addCriterion("OperID <>", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThan(String value) {
            addCriterion("OperID >", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidGreaterThanOrEqualTo(String value) {
            addCriterion("OperID >=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThan(String value) {
            addCriterion("OperID <", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLessThanOrEqualTo(String value) {
            addCriterion("OperID <=", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidLike(String value) {
            addCriterion("OperID like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotLike(String value) {
            addCriterion("OperID not like", value, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidIn(List<String> values) {
            addCriterion("OperID in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotIn(List<String> values) {
            addCriterion("OperID not in", values, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidBetween(String value1, String value2) {
            addCriterion("OperID between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andOperidNotBetween(String value1, String value2) {
            addCriterion("OperID not between", value1, value2, "operid");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNull() {
            addCriterion("MenuID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("MenuID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(String value) {
            addCriterion("MenuID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(String value) {
            addCriterion("MenuID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(String value) {
            addCriterion("MenuID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(String value) {
            addCriterion("MenuID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(String value) {
            addCriterion("MenuID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(String value) {
            addCriterion("MenuID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLike(String value) {
            addCriterion("MenuID like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotLike(String value) {
            addCriterion("MenuID not like", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<String> values) {
            addCriterion("MenuID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<String> values) {
            addCriterion("MenuID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(String value1, String value2) {
            addCriterion("MenuID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(String value1, String value2) {
            addCriterion("MenuID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNull() {
            addCriterion("LogTime is null");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNotNull() {
            addCriterion("LogTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogtimeEqualTo(Date value) {
            addCriterion("LogTime =", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotEqualTo(Date value) {
            addCriterion("LogTime <>", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThan(Date value) {
            addCriterion("LogTime >", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LogTime >=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThan(Date value) {
            addCriterion("LogTime <", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThanOrEqualTo(Date value) {
            addCriterion("LogTime <=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeIn(List<Date> values) {
            addCriterion("LogTime in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotIn(List<Date> values) {
            addCriterion("LogTime not in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeBetween(Date value1, Date value2) {
            addCriterion("LogTime between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotBetween(Date value1, Date value2) {
            addCriterion("LogTime not between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andOperidLikeInsensitive(String value) {
            addCriterion("upper(OperID) like", value.toUpperCase(), "operid");
            return (Criteria) this;
        }

        public Criteria andMenuidLikeInsensitive(String value) {
            addCriterion("upper(MenuID) like", value.toUpperCase(), "menuid");
            return (Criteria) this;
        }

        public Criteria andIpLikeInsensitive(String value) {
            addCriterion("upper(IP) like", value.toUpperCase(), "ip");
            return (Criteria) this;
        }

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(Content) like", value.toUpperCase(), "content");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 29 09:56:18 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBa_LogInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
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