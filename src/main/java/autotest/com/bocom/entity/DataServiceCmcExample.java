package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.List;

public class DataServiceCmcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataServiceCmcExample() {
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

        public Criteria andCmcTaskIdIsNull() {
            addCriterion("CMC_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdIsNotNull() {
            addCriterion("CMC_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdEqualTo(Integer value) {
            addCriterion("CMC_TASK_ID =", value, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdNotEqualTo(Integer value) {
            addCriterion("CMC_TASK_ID <>", value, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdGreaterThan(Integer value) {
            addCriterion("CMC_TASK_ID >", value, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CMC_TASK_ID >=", value, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdLessThan(Integer value) {
            addCriterion("CMC_TASK_ID <", value, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("CMC_TASK_ID <=", value, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdIn(List<Integer> values) {
            addCriterion("CMC_TASK_ID in", values, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdNotIn(List<Integer> values) {
            addCriterion("CMC_TASK_ID not in", values, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("CMC_TASK_ID between", value1, value2, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CMC_TASK_ID not between", value1, value2, "cmcTaskId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdIsNull() {
            addCriterion("CMC_CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdIsNotNull() {
            addCriterion("CMC_CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdEqualTo(Integer value) {
            addCriterion("CMC_CASE_ID =", value, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdNotEqualTo(Integer value) {
            addCriterion("CMC_CASE_ID <>", value, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdGreaterThan(Integer value) {
            addCriterion("CMC_CASE_ID >", value, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CMC_CASE_ID >=", value, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdLessThan(Integer value) {
            addCriterion("CMC_CASE_ID <", value, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("CMC_CASE_ID <=", value, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdIn(List<Integer> values) {
            addCriterion("CMC_CASE_ID in", values, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdNotIn(List<Integer> values) {
            addCriterion("CMC_CASE_ID not in", values, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("CMC_CASE_ID between", value1, value2, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andCmcCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CMC_CASE_ID not between", value1, value2, "cmcCaseId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdIsNull() {
            addCriterion("DATA_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdIsNotNull() {
            addCriterion("DATA_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdEqualTo(Integer value) {
            addCriterion("DATA_TASK_ID =", value, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdNotEqualTo(Integer value) {
            addCriterion("DATA_TASK_ID <>", value, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdGreaterThan(Integer value) {
            addCriterion("DATA_TASK_ID >", value, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_TASK_ID >=", value, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdLessThan(Integer value) {
            addCriterion("DATA_TASK_ID <", value, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_TASK_ID <=", value, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdIn(List<Integer> values) {
            addCriterion("DATA_TASK_ID in", values, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdNotIn(List<Integer> values) {
            addCriterion("DATA_TASK_ID not in", values, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TASK_ID between", value1, value2, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andDataTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TASK_ID not between", value1, value2, "dataTaskId");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("ATTRIBUTE1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("ATTRIBUTE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("ATTRIBUTE1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("ATTRIBUTE1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("ATTRIBUTE1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("ATTRIBUTE1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("ATTRIBUTE1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("ATTRIBUTE1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("ATTRIBUTE1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("ATTRIBUTE1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("ATTRIBUTE2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("ATTRIBUTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("ATTRIBUTE2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("ATTRIBUTE2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("ATTRIBUTE2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("ATTRIBUTE2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("ATTRIBUTE2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("ATTRIBUTE2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("ATTRIBUTE2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("ATTRIBUTE2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE2 not between", value1, value2, "attribute2");
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