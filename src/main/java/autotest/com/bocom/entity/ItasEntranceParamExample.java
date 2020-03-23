package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.List;

public class ItasEntranceParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasEntranceParamExample() {
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

        public Criteria andEntranceParamIdIsNull() {
            addCriterion("ENTRANCE_PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdIsNotNull() {
            addCriterion("ENTRANCE_PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdEqualTo(Integer value) {
            addCriterion("ENTRANCE_PARAM_ID =", value, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdNotEqualTo(Integer value) {
            addCriterion("ENTRANCE_PARAM_ID <>", value, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdGreaterThan(Integer value) {
            addCriterion("ENTRANCE_PARAM_ID >", value, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTRANCE_PARAM_ID >=", value, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdLessThan(Integer value) {
            addCriterion("ENTRANCE_PARAM_ID <", value, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTRANCE_PARAM_ID <=", value, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdIn(List<Integer> values) {
            addCriterion("ENTRANCE_PARAM_ID in", values, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdNotIn(List<Integer> values) {
            addCriterion("ENTRANCE_PARAM_ID not in", values, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTRANCE_PARAM_ID between", value1, value2, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceParamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTRANCE_PARAM_ID not between", value1, value2, "entranceParamId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdIsNull() {
            addCriterion("ENTRANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntranceIdIsNotNull() {
            addCriterion("ENTRANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceIdEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID =", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdNotEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID <>", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdGreaterThan(Integer value) {
            addCriterion("ENTRANCE_ID >", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID >=", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdLessThan(Integer value) {
            addCriterion("ENTRANCE_ID <", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID <=", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdIn(List<Integer> values) {
            addCriterion("ENTRANCE_ID in", values, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdNotIn(List<Integer> values) {
            addCriterion("ENTRANCE_ID not in", values, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTRANCE_ID between", value1, value2, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTRANCE_ID not between", value1, value2, "entranceId");
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

        public Criteria andParamValueIsNull() {
            addCriterion("PARAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParamValueIsNotNull() {
            addCriterion("PARAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParamValueEqualTo(String value) {
            addCriterion("PARAM_VALUE =", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotEqualTo(String value) {
            addCriterion("PARAM_VALUE <>", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThan(String value) {
            addCriterion("PARAM_VALUE >", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_VALUE >=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThan(String value) {
            addCriterion("PARAM_VALUE <", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThanOrEqualTo(String value) {
            addCriterion("PARAM_VALUE <=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLike(String value) {
            addCriterion("PARAM_VALUE like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotLike(String value) {
            addCriterion("PARAM_VALUE not like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueIn(List<String> values) {
            addCriterion("PARAM_VALUE in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotIn(List<String> values) {
            addCriterion("PARAM_VALUE not in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueBetween(String value1, String value2) {
            addCriterion("PARAM_VALUE between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotBetween(String value1, String value2) {
            addCriterion("PARAM_VALUE not between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamDescIsNull() {
            addCriterion("PARAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andParamDescIsNotNull() {
            addCriterion("PARAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andParamDescEqualTo(String value) {
            addCriterion("PARAM_DESC =", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotEqualTo(String value) {
            addCriterion("PARAM_DESC <>", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescGreaterThan(String value) {
            addCriterion("PARAM_DESC >", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_DESC >=", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLessThan(String value) {
            addCriterion("PARAM_DESC <", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLessThanOrEqualTo(String value) {
            addCriterion("PARAM_DESC <=", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLike(String value) {
            addCriterion("PARAM_DESC like", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotLike(String value) {
            addCriterion("PARAM_DESC not like", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescIn(List<String> values) {
            addCriterion("PARAM_DESC in", values, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotIn(List<String> values) {
            addCriterion("PARAM_DESC not in", values, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescBetween(String value1, String value2) {
            addCriterion("PARAM_DESC between", value1, value2, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotBetween(String value1, String value2) {
            addCriterion("PARAM_DESC not between", value1, value2, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParametricIsNull() {
            addCriterion("PARAMETRIC is null");
            return (Criteria) this;
        }

        public Criteria andParametricIsNotNull() {
            addCriterion("PARAMETRIC is not null");
            return (Criteria) this;
        }

        public Criteria andParametricEqualTo(String value) {
            addCriterion("PARAMETRIC =", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricNotEqualTo(String value) {
            addCriterion("PARAMETRIC <>", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricGreaterThan(String value) {
            addCriterion("PARAMETRIC >", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETRIC >=", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricLessThan(String value) {
            addCriterion("PARAMETRIC <", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricLessThanOrEqualTo(String value) {
            addCriterion("PARAMETRIC <=", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricLike(String value) {
            addCriterion("PARAMETRIC like", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricNotLike(String value) {
            addCriterion("PARAMETRIC not like", value, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricIn(List<String> values) {
            addCriterion("PARAMETRIC in", values, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricNotIn(List<String> values) {
            addCriterion("PARAMETRIC not in", values, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricBetween(String value1, String value2) {
            addCriterion("PARAMETRIC between", value1, value2, "parametric");
            return (Criteria) this;
        }

        public Criteria andParametricNotBetween(String value1, String value2) {
            addCriterion("PARAMETRIC not between", value1, value2, "parametric");
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