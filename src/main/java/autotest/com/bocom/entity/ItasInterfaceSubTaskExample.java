package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasInterfaceSubTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasInterfaceSubTaskExample() {
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

        public Criteria andSubTaskIdIsNull() {
            addCriterion("SUB_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdIsNotNull() {
            addCriterion("SUB_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdEqualTo(Integer value) {
            addCriterion("SUB_TASK_ID =", value, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdNotEqualTo(Integer value) {
            addCriterion("SUB_TASK_ID <>", value, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdGreaterThan(Integer value) {
            addCriterion("SUB_TASK_ID >", value, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_TASK_ID >=", value, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdLessThan(Integer value) {
            addCriterion("SUB_TASK_ID <", value, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_TASK_ID <=", value, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdIn(List<Integer> values) {
            addCriterion("SUB_TASK_ID in", values, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdNotIn(List<Integer> values) {
            addCriterion("SUB_TASK_ID not in", values, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("SUB_TASK_ID between", value1, value2, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andSubTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_TASK_ID not between", value1, value2, "subTaskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCteateTimeIsNull() {
            addCriterion("CTEATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCteateTimeIsNotNull() {
            addCriterion("CTEATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCteateTimeEqualTo(Date value) {
            addCriterion("CTEATE_TIME =", value, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeNotEqualTo(Date value) {
            addCriterion("CTEATE_TIME <>", value, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeGreaterThan(Date value) {
            addCriterion("CTEATE_TIME >", value, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CTEATE_TIME >=", value, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeLessThan(Date value) {
            addCriterion("CTEATE_TIME <", value, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CTEATE_TIME <=", value, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeIn(List<Date> values) {
            addCriterion("CTEATE_TIME in", values, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeNotIn(List<Date> values) {
            addCriterion("CTEATE_TIME not in", values, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeBetween(Date value1, Date value2) {
            addCriterion("CTEATE_TIME between", value1, value2, "cteateTime");
            return (Criteria) this;
        }

        public Criteria andCteateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CTEATE_TIME not between", value1, value2, "cteateTime");
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