package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasEngineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasEngineExample() {
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

        public Criteria andEngineNameIsNull() {
            addCriterion("ENGINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEngineNameIsNotNull() {
            addCriterion("ENGINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNameEqualTo(String value) {
            addCriterion("ENGINE_NAME =", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotEqualTo(String value) {
            addCriterion("ENGINE_NAME <>", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameGreaterThan(String value) {
            addCriterion("ENGINE_NAME >", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_NAME >=", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameLessThan(String value) {
            addCriterion("ENGINE_NAME <", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_NAME <=", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameLike(String value) {
            addCriterion("ENGINE_NAME like", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotLike(String value) {
            addCriterion("ENGINE_NAME not like", value, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameIn(List<String> values) {
            addCriterion("ENGINE_NAME in", values, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotIn(List<String> values) {
            addCriterion("ENGINE_NAME not in", values, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameBetween(String value1, String value2) {
            addCriterion("ENGINE_NAME between", value1, value2, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineNameNotBetween(String value1, String value2) {
            addCriterion("ENGINE_NAME not between", value1, value2, "engineName");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNull() {
            addCriterion("ENGINE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIsNotNull() {
            addCriterion("ENGINE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineTypeEqualTo(Integer value) {
            addCriterion("ENGINE_TYPE =", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotEqualTo(Integer value) {
            addCriterion("ENGINE_TYPE <>", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThan(Integer value) {
            addCriterion("ENGINE_TYPE >", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENGINE_TYPE >=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThan(Integer value) {
            addCriterion("ENGINE_TYPE <", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ENGINE_TYPE <=", value, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeIn(List<Integer> values) {
            addCriterion("ENGINE_TYPE in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotIn(List<Integer> values) {
            addCriterion("ENGINE_TYPE not in", values, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeBetween(Integer value1, Integer value2) {
            addCriterion("ENGINE_TYPE between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ENGINE_TYPE not between", value1, value2, "engineType");
            return (Criteria) this;
        }

        public Criteria andEngineStatusIsNull() {
            addCriterion("ENGINE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEngineStatusIsNotNull() {
            addCriterion("ENGINE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEngineStatusEqualTo(Integer value) {
            addCriterion("ENGINE_STATUS =", value, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusNotEqualTo(Integer value) {
            addCriterion("ENGINE_STATUS <>", value, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusGreaterThan(Integer value) {
            addCriterion("ENGINE_STATUS >", value, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENGINE_STATUS >=", value, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusLessThan(Integer value) {
            addCriterion("ENGINE_STATUS <", value, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ENGINE_STATUS <=", value, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusIn(List<Integer> values) {
            addCriterion("ENGINE_STATUS in", values, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusNotIn(List<Integer> values) {
            addCriterion("ENGINE_STATUS not in", values, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusBetween(Integer value1, Integer value2) {
            addCriterion("ENGINE_STATUS between", value1, value2, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ENGINE_STATUS not between", value1, value2, "engineStatus");
            return (Criteria) this;
        }

        public Criteria andEngineDescIsNull() {
            addCriterion("ENGINE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andEngineDescIsNotNull() {
            addCriterion("ENGINE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andEngineDescEqualTo(String value) {
            addCriterion("ENGINE_DESC =", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescNotEqualTo(String value) {
            addCriterion("ENGINE_DESC <>", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescGreaterThan(String value) {
            addCriterion("ENGINE_DESC >", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_DESC >=", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescLessThan(String value) {
            addCriterion("ENGINE_DESC <", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_DESC <=", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescLike(String value) {
            addCriterion("ENGINE_DESC like", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescNotLike(String value) {
            addCriterion("ENGINE_DESC not like", value, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescIn(List<String> values) {
            addCriterion("ENGINE_DESC in", values, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescNotIn(List<String> values) {
            addCriterion("ENGINE_DESC not in", values, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescBetween(String value1, String value2) {
            addCriterion("ENGINE_DESC between", value1, value2, "engineDesc");
            return (Criteria) this;
        }

        public Criteria andEngineDescNotBetween(String value1, String value2) {
            addCriterion("ENGINE_DESC not between", value1, value2, "engineDesc");
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