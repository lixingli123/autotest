package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasEngineParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasEngineParamExample() {
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

        public Criteria andItasEngineParamIdIsNull() {
            addCriterion("ITAS_ENGINE_PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdIsNotNull() {
            addCriterion("ITAS_ENGINE_PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdEqualTo(Integer value) {
            addCriterion("ITAS_ENGINE_PARAM_ID =", value, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdNotEqualTo(Integer value) {
            addCriterion("ITAS_ENGINE_PARAM_ID <>", value, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdGreaterThan(Integer value) {
            addCriterion("ITAS_ENGINE_PARAM_ID >", value, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITAS_ENGINE_PARAM_ID >=", value, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdLessThan(Integer value) {
            addCriterion("ITAS_ENGINE_PARAM_ID <", value, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdLessThanOrEqualTo(Integer value) {
            addCriterion("ITAS_ENGINE_PARAM_ID <=", value, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdIn(List<Integer> values) {
            addCriterion("ITAS_ENGINE_PARAM_ID in", values, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdNotIn(List<Integer> values) {
            addCriterion("ITAS_ENGINE_PARAM_ID not in", values, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdBetween(Integer value1, Integer value2) {
            addCriterion("ITAS_ENGINE_PARAM_ID between", value1, value2, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ITAS_ENGINE_PARAM_ID not between", value1, value2, "itasEngineParamId");
            return (Criteria) this;
        }

        public Criteria andEngineIdIsNull() {
            addCriterion("ENGINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEngineIdIsNotNull() {
            addCriterion("ENGINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEngineIdEqualTo(Integer value) {
            addCriterion("ENGINE_ID =", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotEqualTo(Integer value) {
            addCriterion("ENGINE_ID <>", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThan(Integer value) {
            addCriterion("ENGINE_ID >", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENGINE_ID >=", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThan(Integer value) {
            addCriterion("ENGINE_ID <", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENGINE_ID <=", value, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdIn(List<Integer> values) {
            addCriterion("ENGINE_ID in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotIn(List<Integer> values) {
            addCriterion("ENGINE_ID not in", values, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdBetween(Integer value1, Integer value2) {
            addCriterion("ENGINE_ID between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andEngineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENGINE_ID not between", value1, value2, "engineId");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameIsNull() {
            addCriterion("ITAS_ENGINE_PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameIsNotNull() {
            addCriterion("ITAS_ENGINE_PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME =", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameNotEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME <>", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameGreaterThan(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME >", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME >=", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameLessThan(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME <", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameLessThanOrEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME <=", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameLike(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME like", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameNotLike(String value) {
            addCriterion("ITAS_ENGINE_PARAM_NAME not like", value, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameIn(List<String> values) {
            addCriterion("ITAS_ENGINE_PARAM_NAME in", values, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameNotIn(List<String> values) {
            addCriterion("ITAS_ENGINE_PARAM_NAME not in", values, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameBetween(String value1, String value2) {
            addCriterion("ITAS_ENGINE_PARAM_NAME between", value1, value2, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamNameNotBetween(String value1, String value2) {
            addCriterion("ITAS_ENGINE_PARAM_NAME not between", value1, value2, "itasEngineParamName");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueIsNull() {
            addCriterion("ITAS_ENGINE_PARAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueIsNotNull() {
            addCriterion("ITAS_ENGINE_PARAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE =", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueNotEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE <>", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueGreaterThan(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE >", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE >=", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueLessThan(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE <", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueLessThanOrEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE <=", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueLike(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE like", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueNotLike(String value) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE not like", value, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueIn(List<String> values) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE in", values, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueNotIn(List<String> values) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE not in", values, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueBetween(String value1, String value2) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE between", value1, value2, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamValueNotBetween(String value1, String value2) {
            addCriterion("ITAS_ENGINE_PARAM_VALUE not between", value1, value2, "itasEngineParamValue");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescIsNull() {
            addCriterion("ITAS_ENGINE_PARAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescIsNotNull() {
            addCriterion("ITAS_ENGINE_PARAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC =", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescNotEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC <>", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescGreaterThan(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC >", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescGreaterThanOrEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC >=", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescLessThan(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC <", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescLessThanOrEqualTo(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC <=", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescLike(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC like", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescNotLike(String value) {
            addCriterion("ITAS_ENGINE_PARAM_DESC not like", value, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescIn(List<String> values) {
            addCriterion("ITAS_ENGINE_PARAM_DESC in", values, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescNotIn(List<String> values) {
            addCriterion("ITAS_ENGINE_PARAM_DESC not in", values, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescBetween(String value1, String value2) {
            addCriterion("ITAS_ENGINE_PARAM_DESC between", value1, value2, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andItasEngineParamDescNotBetween(String value1, String value2) {
            addCriterion("ITAS_ENGINE_PARAM_DESC not between", value1, value2, "itasEngineParamDesc");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andReviserIsNull() {
            addCriterion("REVISER is null");
            return (Criteria) this;
        }

        public Criteria andReviserIsNotNull() {
            addCriterion("REVISER is not null");
            return (Criteria) this;
        }

        public Criteria andReviserEqualTo(Integer value) {
            addCriterion("REVISER =", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserNotEqualTo(Integer value) {
            addCriterion("REVISER <>", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserGreaterThan(Integer value) {
            addCriterion("REVISER >", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserGreaterThanOrEqualTo(Integer value) {
            addCriterion("REVISER >=", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserLessThan(Integer value) {
            addCriterion("REVISER <", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserLessThanOrEqualTo(Integer value) {
            addCriterion("REVISER <=", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserIn(List<Integer> values) {
            addCriterion("REVISER in", values, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserNotIn(List<Integer> values) {
            addCriterion("REVISER not in", values, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserBetween(Integer value1, Integer value2) {
            addCriterion("REVISER between", value1, value2, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserNotBetween(Integer value1, Integer value2) {
            addCriterion("REVISER not between", value1, value2, "reviser");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedIsNull() {
            addCriterion("TIME_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedIsNotNull() {
            addCriterion("TIME_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedEqualTo(Date value) {
            addCriterion("TIME_CREATED =", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedNotEqualTo(Date value) {
            addCriterion("TIME_CREATED <>", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedGreaterThan(Date value) {
            addCriterion("TIME_CREATED >", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_CREATED >=", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedLessThan(Date value) {
            addCriterion("TIME_CREATED <", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedLessThanOrEqualTo(Date value) {
            addCriterion("TIME_CREATED <=", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedIn(List<Date> values) {
            addCriterion("TIME_CREATED in", values, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedNotIn(List<Date> values) {
            addCriterion("TIME_CREATED not in", values, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedBetween(Date value1, Date value2) {
            addCriterion("TIME_CREATED between", value1, value2, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedNotBetween(Date value1, Date value2) {
            addCriterion("TIME_CREATED not between", value1, value2, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedIsNull() {
            addCriterion("TIME_REVISED is null");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedIsNotNull() {
            addCriterion("TIME_REVISED is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedEqualTo(Date value) {
            addCriterion("TIME_REVISED =", value, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedNotEqualTo(Date value) {
            addCriterion("TIME_REVISED <>", value, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedGreaterThan(Date value) {
            addCriterion("TIME_REVISED >", value, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_REVISED >=", value, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedLessThan(Date value) {
            addCriterion("TIME_REVISED <", value, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedLessThanOrEqualTo(Date value) {
            addCriterion("TIME_REVISED <=", value, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedIn(List<Date> values) {
            addCriterion("TIME_REVISED in", values, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedNotIn(List<Date> values) {
            addCriterion("TIME_REVISED not in", values, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedBetween(Date value1, Date value2) {
            addCriterion("TIME_REVISED between", value1, value2, "timeRevised");
            return (Criteria) this;
        }

        public Criteria andTimeRevisedNotBetween(Date value1, Date value2) {
            addCriterion("TIME_REVISED not between", value1, value2, "timeRevised");
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