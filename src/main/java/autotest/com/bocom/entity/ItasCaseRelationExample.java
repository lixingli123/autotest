package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.List;

public class ItasCaseRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasCaseRelationExample() {
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

        public Criteria andFlowCaseIdIsNull() {
            addCriterion("FLOW_CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdIsNotNull() {
            addCriterion("FLOW_CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdEqualTo(Integer value) {
            addCriterion("FLOW_CASE_ID =", value, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdNotEqualTo(Integer value) {
            addCriterion("FLOW_CASE_ID <>", value, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdGreaterThan(Integer value) {
            addCriterion("FLOW_CASE_ID >", value, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLOW_CASE_ID >=", value, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdLessThan(Integer value) {
            addCriterion("FLOW_CASE_ID <", value, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("FLOW_CASE_ID <=", value, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdIn(List<Integer> values) {
            addCriterion("FLOW_CASE_ID in", values, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdNotIn(List<Integer> values) {
            addCriterion("FLOW_CASE_ID not in", values, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("FLOW_CASE_ID between", value1, value2, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andFlowCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FLOW_CASE_ID not between", value1, value2, "flowCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdIsNull() {
            addCriterion("SUB_CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdIsNotNull() {
            addCriterion("SUB_CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdEqualTo(Integer value) {
            addCriterion("SUB_CASE_ID =", value, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdNotEqualTo(Integer value) {
            addCriterion("SUB_CASE_ID <>", value, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdGreaterThan(Integer value) {
            addCriterion("SUB_CASE_ID >", value, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_CASE_ID >=", value, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdLessThan(Integer value) {
            addCriterion("SUB_CASE_ID <", value, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_CASE_ID <=", value, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdIn(List<Integer> values) {
            addCriterion("SUB_CASE_ID in", values, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdNotIn(List<Integer> values) {
            addCriterion("SUB_CASE_ID not in", values, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("SUB_CASE_ID between", value1, value2, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_CASE_ID not between", value1, value2, "subCaseId");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqIsNull() {
            addCriterion("SUB_CASE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqIsNotNull() {
            addCriterion("SUB_CASE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqEqualTo(Integer value) {
            addCriterion("SUB_CASE_SEQ =", value, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqNotEqualTo(Integer value) {
            addCriterion("SUB_CASE_SEQ <>", value, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqGreaterThan(Integer value) {
            addCriterion("SUB_CASE_SEQ >", value, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUB_CASE_SEQ >=", value, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqLessThan(Integer value) {
            addCriterion("SUB_CASE_SEQ <", value, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqLessThanOrEqualTo(Integer value) {
            addCriterion("SUB_CASE_SEQ <=", value, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqIn(List<Integer> values) {
            addCriterion("SUB_CASE_SEQ in", values, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqNotIn(List<Integer> values) {
            addCriterion("SUB_CASE_SEQ not in", values, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqBetween(Integer value1, Integer value2) {
            addCriterion("SUB_CASE_SEQ between", value1, value2, "subCaseSeq");
            return (Criteria) this;
        }

        public Criteria andSubCaseSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("SUB_CASE_SEQ not between", value1, value2, "subCaseSeq");
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