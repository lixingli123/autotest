package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.List;

public class ItasApiDiffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasApiDiffExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApiIdIsNull() {
            addCriterion("API_ID is null");
            return (Criteria) this;
        }

        public Criteria andApiIdIsNotNull() {
            addCriterion("API_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApiIdEqualTo(Integer value) {
            addCriterion("API_ID =", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotEqualTo(Integer value) {
            addCriterion("API_ID <>", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThan(Integer value) {
            addCriterion("API_ID >", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("API_ID >=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThan(Integer value) {
            addCriterion("API_ID <", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdLessThanOrEqualTo(Integer value) {
            addCriterion("API_ID <=", value, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdIn(List<Integer> values) {
            addCriterion("API_ID in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotIn(List<Integer> values) {
            addCriterion("API_ID not in", values, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdBetween(Integer value1, Integer value2) {
            addCriterion("API_ID between", value1, value2, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("API_ID not between", value1, value2, "apiId");
            return (Criteria) this;
        }

        public Criteria andApiBasedIsNull() {
            addCriterion("API_BASED is null");
            return (Criteria) this;
        }

        public Criteria andApiBasedIsNotNull() {
            addCriterion("API_BASED is not null");
            return (Criteria) this;
        }

        public Criteria andApiBasedEqualTo(Integer value) {
            addCriterion("API_BASED =", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedNotEqualTo(Integer value) {
            addCriterion("API_BASED <>", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedGreaterThan(Integer value) {
            addCriterion("API_BASED >", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedGreaterThanOrEqualTo(Integer value) {
            addCriterion("API_BASED >=", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedLessThan(Integer value) {
            addCriterion("API_BASED <", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedLessThanOrEqualTo(Integer value) {
            addCriterion("API_BASED <=", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedIn(List<Integer> values) {
            addCriterion("API_BASED in", values, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedNotIn(List<Integer> values) {
            addCriterion("API_BASED not in", values, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedBetween(Integer value1, Integer value2) {
            addCriterion("API_BASED between", value1, value2, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedNotBetween(Integer value1, Integer value2) {
            addCriterion("API_BASED not between", value1, value2, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiSectionIsNull() {
            addCriterion("API_SECTION is null");
            return (Criteria) this;
        }

        public Criteria andApiSectionIsNotNull() {
            addCriterion("API_SECTION is not null");
            return (Criteria) this;
        }

        public Criteria andApiSectionEqualTo(String value) {
            addCriterion("API_SECTION =", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionNotEqualTo(String value) {
            addCriterion("API_SECTION <>", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionGreaterThan(String value) {
            addCriterion("API_SECTION >", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionGreaterThanOrEqualTo(String value) {
            addCriterion("API_SECTION >=", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionLessThan(String value) {
            addCriterion("API_SECTION <", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionLessThanOrEqualTo(String value) {
            addCriterion("API_SECTION <=", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionLike(String value) {
            addCriterion("API_SECTION like", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionNotLike(String value) {
            addCriterion("API_SECTION not like", value, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionIn(List<String> values) {
            addCriterion("API_SECTION in", values, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionNotIn(List<String> values) {
            addCriterion("API_SECTION not in", values, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionBetween(String value1, String value2) {
            addCriterion("API_SECTION between", value1, value2, "apiSection");
            return (Criteria) this;
        }

        public Criteria andApiSectionNotBetween(String value1, String value2) {
            addCriterion("API_SECTION not between", value1, value2, "apiSection");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("CHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("CHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("CHANGE_TYPE =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("CHANGE_TYPE <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("CHANGE_TYPE >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("CHANGE_TYPE <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("CHANGE_TYPE like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("CHANGE_TYPE not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("CHANGE_TYPE in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("CHANGE_TYPE not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNull() {
            addCriterion("FIELD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNotNull() {
            addCriterion("FIELD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIdEqualTo(Integer value) {
            addCriterion("FIELD_ID =", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotEqualTo(Integer value) {
            addCriterion("FIELD_ID <>", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThan(Integer value) {
            addCriterion("FIELD_ID >", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FIELD_ID >=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThan(Integer value) {
            addCriterion("FIELD_ID <", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThanOrEqualTo(Integer value) {
            addCriterion("FIELD_ID <=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIn(List<Integer> values) {
            addCriterion("FIELD_ID in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotIn(List<Integer> values) {
            addCriterion("FIELD_ID not in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_ID between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FIELD_ID not between", value1, value2, "fieldId");
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