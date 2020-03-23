package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.List;

public class ItasCaseElementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasCaseElementExample() {
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

        public Criteria andCaseIdIsNull() {
            addCriterion("CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("CASE_ID =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("CASE_ID <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("CASE_ID >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_ID >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("CASE_ID <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_ID <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("CASE_ID in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("CASE_ID not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("CASE_ID between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_ID not between", value1, value2, "caseId");
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

        public Criteria andElementFromIsNull() {
            addCriterion("ELEMENT_FROM is null");
            return (Criteria) this;
        }

        public Criteria andElementFromIsNotNull() {
            addCriterion("ELEMENT_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andElementFromEqualTo(String value) {
            addCriterion("ELEMENT_FROM =", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromNotEqualTo(String value) {
            addCriterion("ELEMENT_FROM <>", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromGreaterThan(String value) {
            addCriterion("ELEMENT_FROM >", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_FROM >=", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromLessThan(String value) {
            addCriterion("ELEMENT_FROM <", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_FROM <=", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromLike(String value) {
            addCriterion("ELEMENT_FROM like", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromNotLike(String value) {
            addCriterion("ELEMENT_FROM not like", value, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromIn(List<String> values) {
            addCriterion("ELEMENT_FROM in", values, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromNotIn(List<String> values) {
            addCriterion("ELEMENT_FROM not in", values, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromBetween(String value1, String value2) {
            addCriterion("ELEMENT_FROM between", value1, value2, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementFromNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_FROM not between", value1, value2, "elementFrom");
            return (Criteria) this;
        }

        public Criteria andElementKeyIsNull() {
            addCriterion("ELEMENT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andElementKeyIsNotNull() {
            addCriterion("ELEMENT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andElementKeyEqualTo(String value) {
            addCriterion("ELEMENT_KEY =", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyNotEqualTo(String value) {
            addCriterion("ELEMENT_KEY <>", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyGreaterThan(String value) {
            addCriterion("ELEMENT_KEY >", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_KEY >=", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyLessThan(String value) {
            addCriterion("ELEMENT_KEY <", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_KEY <=", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyLike(String value) {
            addCriterion("ELEMENT_KEY like", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyNotLike(String value) {
            addCriterion("ELEMENT_KEY not like", value, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyIn(List<String> values) {
            addCriterion("ELEMENT_KEY in", values, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyNotIn(List<String> values) {
            addCriterion("ELEMENT_KEY not in", values, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyBetween(String value1, String value2) {
            addCriterion("ELEMENT_KEY between", value1, value2, "elementKey");
            return (Criteria) this;
        }

        public Criteria andElementKeyNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_KEY not between", value1, value2, "elementKey");
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

        public Criteria andElementTypeIsNull() {
            addCriterion("ELEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andElementTypeIsNotNull() {
            addCriterion("ELEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andElementTypeEqualTo(String value) {
            addCriterion("ELEMENT_TYPE =", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotEqualTo(String value) {
            addCriterion("ELEMENT_TYPE <>", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThan(String value) {
            addCriterion("ELEMENT_TYPE >", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_TYPE >=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThan(String value) {
            addCriterion("ELEMENT_TYPE <", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_TYPE <=", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeLike(String value) {
            addCriterion("ELEMENT_TYPE like", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotLike(String value) {
            addCriterion("ELEMENT_TYPE not like", value, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeIn(List<String> values) {
            addCriterion("ELEMENT_TYPE in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotIn(List<String> values) {
            addCriterion("ELEMENT_TYPE not in", values, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeBetween(String value1, String value2) {
            addCriterion("ELEMENT_TYPE between", value1, value2, "elementType");
            return (Criteria) this;
        }

        public Criteria andElementTypeNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_TYPE not between", value1, value2, "elementType");
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