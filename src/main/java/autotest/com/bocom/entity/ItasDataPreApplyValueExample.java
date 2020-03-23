package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.List;

public class ItasDataPreApplyValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasDataPreApplyValueExample() {
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

        public Criteria andElementIdIsNull() {
            addCriterion("ELEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andElementIdIsNotNull() {
            addCriterion("ELEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andElementIdEqualTo(Integer value) {
            addCriterion("ELEMENT_ID =", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotEqualTo(Integer value) {
            addCriterion("ELEMENT_ID <>", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThan(Integer value) {
            addCriterion("ELEMENT_ID >", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ELEMENT_ID >=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThan(Integer value) {
            addCriterion("ELEMENT_ID <", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdLessThanOrEqualTo(Integer value) {
            addCriterion("ELEMENT_ID <=", value, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdIn(List<Integer> values) {
            addCriterion("ELEMENT_ID in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotIn(List<Integer> values) {
            addCriterion("ELEMENT_ID not in", values, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdBetween(Integer value1, Integer value2) {
            addCriterion("ELEMENT_ID between", value1, value2, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ELEMENT_ID not between", value1, value2, "elementId");
            return (Criteria) this;
        }

        public Criteria andElementNameIsNull() {
            addCriterion("ELEMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andElementNameIsNotNull() {
            addCriterion("ELEMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andElementNameEqualTo(String value) {
            addCriterion("ELEMENT_NAME =", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotEqualTo(String value) {
            addCriterion("ELEMENT_NAME <>", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameGreaterThan(String value) {
            addCriterion("ELEMENT_NAME >", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_NAME >=", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLessThan(String value) {
            addCriterion("ELEMENT_NAME <", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_NAME <=", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLike(String value) {
            addCriterion("ELEMENT_NAME like", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotLike(String value) {
            addCriterion("ELEMENT_NAME not like", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameIn(List<String> values) {
            addCriterion("ELEMENT_NAME in", values, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotIn(List<String> values) {
            addCriterion("ELEMENT_NAME not in", values, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameBetween(String value1, String value2) {
            addCriterion("ELEMENT_NAME between", value1, value2, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_NAME not between", value1, value2, "elementName");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("APPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("APPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("APPLY_ID =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("APPLY_ID <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("APPLY_ID >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPLY_ID >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("APPLY_ID <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("APPLY_ID <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("APPLY_ID in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("APPLY_ID not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_ID between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_ID not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeIsNull() {
            addCriterion("ELEMENT_VALUE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeIsNotNull() {
            addCriterion("ELEMENT_VALUE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_TYPE =", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeNotEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_TYPE <>", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeGreaterThan(String value) {
            addCriterion("ELEMENT_VALUE_TYPE >", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_TYPE >=", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeLessThan(String value) {
            addCriterion("ELEMENT_VALUE_TYPE <", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_TYPE <=", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeLike(String value) {
            addCriterion("ELEMENT_VALUE_TYPE like", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeNotLike(String value) {
            addCriterion("ELEMENT_VALUE_TYPE not like", value, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_TYPE in", values, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeNotIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_TYPE not in", values, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_TYPE between", value1, value2, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueTypeNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_TYPE not between", value1, value2, "elementValueType");
            return (Criteria) this;
        }

        public Criteria andElementValueStringIsNull() {
            addCriterion("ELEMENT_VALUE_STRING is null");
            return (Criteria) this;
        }

        public Criteria andElementValueStringIsNotNull() {
            addCriterion("ELEMENT_VALUE_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andElementValueStringEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_STRING =", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringNotEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_STRING <>", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringGreaterThan(String value) {
            addCriterion("ELEMENT_VALUE_STRING >", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_STRING >=", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringLessThan(String value) {
            addCriterion("ELEMENT_VALUE_STRING <", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_STRING <=", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringLike(String value) {
            addCriterion("ELEMENT_VALUE_STRING like", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringNotLike(String value) {
            addCriterion("ELEMENT_VALUE_STRING not like", value, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_STRING in", values, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringNotIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_STRING not in", values, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_STRING between", value1, value2, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueStringNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_STRING not between", value1, value2, "elementValueString");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexIsNull() {
            addCriterion("ELEMENT_VALUE_COMPLEX is null");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexIsNotNull() {
            addCriterion("ELEMENT_VALUE_COMPLEX is not null");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX =", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexNotEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX <>", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexGreaterThan(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX >", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX >=", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexLessThan(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX <", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX <=", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexLike(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX like", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexNotLike(String value) {
            addCriterion("ELEMENT_VALUE_COMPLEX not like", value, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_COMPLEX in", values, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexNotIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_COMPLEX not in", values, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_COMPLEX between", value1, value2, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueComplexNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_COMPLEX not between", value1, value2, "elementValueComplex");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkIsNull() {
            addCriterion("ELEMENT_VALUE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkIsNotNull() {
            addCriterion("ELEMENT_VALUE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_REMARK =", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkNotEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_REMARK <>", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkGreaterThan(String value) {
            addCriterion("ELEMENT_VALUE_REMARK >", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_REMARK >=", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkLessThan(String value) {
            addCriterion("ELEMENT_VALUE_REMARK <", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE_REMARK <=", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkLike(String value) {
            addCriterion("ELEMENT_VALUE_REMARK like", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkNotLike(String value) {
            addCriterion("ELEMENT_VALUE_REMARK not like", value, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_REMARK in", values, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkNotIn(List<String> values) {
            addCriterion("ELEMENT_VALUE_REMARK not in", values, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_REMARK between", value1, value2, "elementValueRemark");
            return (Criteria) this;
        }

        public Criteria andElementValueRemarkNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE_REMARK not between", value1, value2, "elementValueRemark");
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