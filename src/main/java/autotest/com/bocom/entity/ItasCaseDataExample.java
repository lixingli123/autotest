package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasCaseDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasCaseDataExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(Integer value) {
            addCriterion("DATA_ID =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(Integer value) {
            addCriterion("DATA_ID <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(Integer value) {
            addCriterion("DATA_ID >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_ID >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(Integer value) {
            addCriterion("DATA_ID <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_ID <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<Integer> values) {
            addCriterion("DATA_ID in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<Integer> values) {
            addCriterion("DATA_ID not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(Integer value1, Integer value2) {
            addCriterion("DATA_ID between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_ID not between", value1, value2, "dataId");
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

        public Criteria andCaseKeyIsNull() {
            addCriterion("CASE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCaseKeyIsNotNull() {
            addCriterion("CASE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCaseKeyEqualTo(Integer value) {
            addCriterion("CASE_KEY =", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyNotEqualTo(Integer value) {
            addCriterion("CASE_KEY <>", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyGreaterThan(Integer value) {
            addCriterion("CASE_KEY >", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_KEY >=", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyLessThan(Integer value) {
            addCriterion("CASE_KEY <", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_KEY <=", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyIn(List<Integer> values) {
            addCriterion("CASE_KEY in", values, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyNotIn(List<Integer> values) {
            addCriterion("CASE_KEY not in", values, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyBetween(Integer value1, Integer value2) {
            addCriterion("CASE_KEY between", value1, value2, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_KEY not between", value1, value2, "caseKey");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNull() {
            addCriterion("ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Integer value) {
            addCriterion("ENTITY_ID =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Integer value) {
            addCriterion("ENTITY_ID <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Integer value) {
            addCriterion("ENTITY_ID >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_ID >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Integer value) {
            addCriterion("ENTITY_ID <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_ID <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Integer> values) {
            addCriterion("ENTITY_ID in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Integer> values) {
            addCriterion("ENTITY_ID not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_ID between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_ID not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("ENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("ENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(String value) {
            addCriterion("ENTITY_TYPE =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(String value) {
            addCriterion("ENTITY_TYPE <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(String value) {
            addCriterion("ENTITY_TYPE >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(String value) {
            addCriterion("ENTITY_TYPE <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLike(String value) {
            addCriterion("ENTITY_TYPE like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotLike(String value) {
            addCriterion("ENTITY_TYPE not like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<String> values) {
            addCriterion("ENTITY_TYPE in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<String> values) {
            addCriterion("ENTITY_TYPE not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andDataNatureIsNull() {
            addCriterion("DATA_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andDataNatureIsNotNull() {
            addCriterion("DATA_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andDataNatureEqualTo(String value) {
            addCriterion("DATA_NATURE =", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureNotEqualTo(String value) {
            addCriterion("DATA_NATURE <>", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureGreaterThan(String value) {
            addCriterion("DATA_NATURE >", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_NATURE >=", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureLessThan(String value) {
            addCriterion("DATA_NATURE <", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureLessThanOrEqualTo(String value) {
            addCriterion("DATA_NATURE <=", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureLike(String value) {
            addCriterion("DATA_NATURE like", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureNotLike(String value) {
            addCriterion("DATA_NATURE not like", value, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureIn(List<String> values) {
            addCriterion("DATA_NATURE in", values, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureNotIn(List<String> values) {
            addCriterion("DATA_NATURE not in", values, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureBetween(String value1, String value2) {
            addCriterion("DATA_NATURE between", value1, value2, "dataNature");
            return (Criteria) this;
        }

        public Criteria andDataNatureNotBetween(String value1, String value2) {
            addCriterion("DATA_NATURE not between", value1, value2, "dataNature");
            return (Criteria) this;
        }

        public Criteria andListIdIsNull() {
            addCriterion("LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(String value) {
            addCriterion("LIST_ID =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(String value) {
            addCriterion("LIST_ID <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(String value) {
            addCriterion("LIST_ID >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_ID >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(String value) {
            addCriterion("LIST_ID <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(String value) {
            addCriterion("LIST_ID <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLike(String value) {
            addCriterion("LIST_ID like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotLike(String value) {
            addCriterion("LIST_ID not like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<String> values) {
            addCriterion("LIST_ID in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<String> values) {
            addCriterion("LIST_ID not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(String value1, String value2) {
            addCriterion("LIST_ID between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(String value1, String value2) {
            addCriterion("LIST_ID not between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListRowIsNull() {
            addCriterion("LIST_ROW is null");
            return (Criteria) this;
        }

        public Criteria andListRowIsNotNull() {
            addCriterion("LIST_ROW is not null");
            return (Criteria) this;
        }

        public Criteria andListRowEqualTo(String value) {
            addCriterion("LIST_ROW =", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowNotEqualTo(String value) {
            addCriterion("LIST_ROW <>", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowGreaterThan(String value) {
            addCriterion("LIST_ROW >", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_ROW >=", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowLessThan(String value) {
            addCriterion("LIST_ROW <", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowLessThanOrEqualTo(String value) {
            addCriterion("LIST_ROW <=", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowLike(String value) {
            addCriterion("LIST_ROW like", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowNotLike(String value) {
            addCriterion("LIST_ROW not like", value, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowIn(List<String> values) {
            addCriterion("LIST_ROW in", values, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowNotIn(List<String> values) {
            addCriterion("LIST_ROW not in", values, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowBetween(String value1, String value2) {
            addCriterion("LIST_ROW between", value1, value2, "listRow");
            return (Criteria) this;
        }

        public Criteria andListRowNotBetween(String value1, String value2) {
            addCriterion("LIST_ROW not between", value1, value2, "listRow");
            return (Criteria) this;
        }

        public Criteria andFieldKeyIsNull() {
            addCriterion("FIELD_KEY is null");
            return (Criteria) this;
        }

        public Criteria andFieldKeyIsNotNull() {
            addCriterion("FIELD_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andFieldKeyEqualTo(String value) {
            addCriterion("FIELD_KEY =", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyNotEqualTo(String value) {
            addCriterion("FIELD_KEY <>", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyGreaterThan(String value) {
            addCriterion("FIELD_KEY >", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_KEY >=", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyLessThan(String value) {
            addCriterion("FIELD_KEY <", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyLessThanOrEqualTo(String value) {
            addCriterion("FIELD_KEY <=", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyLike(String value) {
            addCriterion("FIELD_KEY like", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyNotLike(String value) {
            addCriterion("FIELD_KEY not like", value, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyIn(List<String> values) {
            addCriterion("FIELD_KEY in", values, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyNotIn(List<String> values) {
            addCriterion("FIELD_KEY not in", values, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyBetween(String value1, String value2) {
            addCriterion("FIELD_KEY between", value1, value2, "fieldKey");
            return (Criteria) this;
        }

        public Criteria andFieldKeyNotBetween(String value1, String value2) {
            addCriterion("FIELD_KEY not between", value1, value2, "fieldKey");
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

        public Criteria andFieldIdEqualTo(String value) {
            addCriterion("FIELD_ID =", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotEqualTo(String value) {
            addCriterion("FIELD_ID <>", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThan(String value) {
            addCriterion("FIELD_ID >", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_ID >=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThan(String value) {
            addCriterion("FIELD_ID <", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThanOrEqualTo(String value) {
            addCriterion("FIELD_ID <=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLike(String value) {
            addCriterion("FIELD_ID like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotLike(String value) {
            addCriterion("FIELD_ID not like", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIn(List<String> values) {
            addCriterion("FIELD_ID in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotIn(List<String> values) {
            addCriterion("FIELD_ID not in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdBetween(String value1, String value2) {
            addCriterion("FIELD_ID between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotBetween(String value1, String value2) {
            addCriterion("FIELD_ID not between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldFromIsNull() {
            addCriterion("FIELD_FROM is null");
            return (Criteria) this;
        }

        public Criteria andFieldFromIsNotNull() {
            addCriterion("FIELD_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andFieldFromEqualTo(String value) {
            addCriterion("FIELD_FROM =", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromNotEqualTo(String value) {
            addCriterion("FIELD_FROM <>", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromGreaterThan(String value) {
            addCriterion("FIELD_FROM >", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_FROM >=", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromLessThan(String value) {
            addCriterion("FIELD_FROM <", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromLessThanOrEqualTo(String value) {
            addCriterion("FIELD_FROM <=", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromLike(String value) {
            addCriterion("FIELD_FROM like", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromNotLike(String value) {
            addCriterion("FIELD_FROM not like", value, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromIn(List<String> values) {
            addCriterion("FIELD_FROM in", values, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromNotIn(List<String> values) {
            addCriterion("FIELD_FROM not in", values, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromBetween(String value1, String value2) {
            addCriterion("FIELD_FROM between", value1, value2, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andFieldFromNotBetween(String value1, String value2) {
            addCriterion("FIELD_FROM not between", value1, value2, "fieldFrom");
            return (Criteria) this;
        }

        public Criteria andActNameIsNull() {
            addCriterion("ACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("ACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("ACT_NAME =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("ACT_NAME <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("ACT_NAME >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NAME >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("ACT_NAME <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("ACT_NAME <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("ACT_NAME like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("ACT_NAME not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("ACT_NAME in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("ACT_NAME not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("ACT_NAME between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("ACT_NAME not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActSeqIsNull() {
            addCriterion("ACT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andActSeqIsNotNull() {
            addCriterion("ACT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andActSeqEqualTo(Integer value) {
            addCriterion("ACT_SEQ =", value, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqNotEqualTo(Integer value) {
            addCriterion("ACT_SEQ <>", value, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqGreaterThan(Integer value) {
            addCriterion("ACT_SEQ >", value, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACT_SEQ >=", value, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqLessThan(Integer value) {
            addCriterion("ACT_SEQ <", value, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqLessThanOrEqualTo(Integer value) {
            addCriterion("ACT_SEQ <=", value, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqIn(List<Integer> values) {
            addCriterion("ACT_SEQ in", values, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqNotIn(List<Integer> values) {
            addCriterion("ACT_SEQ not in", values, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqBetween(Integer value1, Integer value2) {
            addCriterion("ACT_SEQ between", value1, value2, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("ACT_SEQ not between", value1, value2, "actSeq");
            return (Criteria) this;
        }

        public Criteria andActTypIsNull() {
            addCriterion("ACT_TYP is null");
            return (Criteria) this;
        }

        public Criteria andActTypIsNotNull() {
            addCriterion("ACT_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andActTypEqualTo(String value) {
            addCriterion("ACT_TYP =", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypNotEqualTo(String value) {
            addCriterion("ACT_TYP <>", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypGreaterThan(String value) {
            addCriterion("ACT_TYP >", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_TYP >=", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypLessThan(String value) {
            addCriterion("ACT_TYP <", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypLessThanOrEqualTo(String value) {
            addCriterion("ACT_TYP <=", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypLike(String value) {
            addCriterion("ACT_TYP like", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypNotLike(String value) {
            addCriterion("ACT_TYP not like", value, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypIn(List<String> values) {
            addCriterion("ACT_TYP in", values, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypNotIn(List<String> values) {
            addCriterion("ACT_TYP not in", values, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypBetween(String value1, String value2) {
            addCriterion("ACT_TYP between", value1, value2, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActTypNotBetween(String value1, String value2) {
            addCriterion("ACT_TYP not between", value1, value2, "actTyp");
            return (Criteria) this;
        }

        public Criteria andActStrIsNull() {
            addCriterion("ACT_STR is null");
            return (Criteria) this;
        }

        public Criteria andActStrIsNotNull() {
            addCriterion("ACT_STR is not null");
            return (Criteria) this;
        }

        public Criteria andActStrEqualTo(String value) {
            addCriterion("ACT_STR =", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrNotEqualTo(String value) {
            addCriterion("ACT_STR <>", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrGreaterThan(String value) {
            addCriterion("ACT_STR >", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_STR >=", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrLessThan(String value) {
            addCriterion("ACT_STR <", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrLessThanOrEqualTo(String value) {
            addCriterion("ACT_STR <=", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrLike(String value) {
            addCriterion("ACT_STR like", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrNotLike(String value) {
            addCriterion("ACT_STR not like", value, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrIn(List<String> values) {
            addCriterion("ACT_STR in", values, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrNotIn(List<String> values) {
            addCriterion("ACT_STR not in", values, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrBetween(String value1, String value2) {
            addCriterion("ACT_STR between", value1, value2, "actStr");
            return (Criteria) this;
        }

        public Criteria andActStrNotBetween(String value1, String value2) {
            addCriterion("ACT_STR not between", value1, value2, "actStr");
            return (Criteria) this;
        }

        public Criteria andDataTypIsNull() {
            addCriterion("DATA_TYP is null");
            return (Criteria) this;
        }

        public Criteria andDataTypIsNotNull() {
            addCriterion("DATA_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypEqualTo(String value) {
            addCriterion("DATA_TYP =", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypNotEqualTo(String value) {
            addCriterion("DATA_TYP <>", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypGreaterThan(String value) {
            addCriterion("DATA_TYP >", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TYP >=", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypLessThan(String value) {
            addCriterion("DATA_TYP <", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypLessThanOrEqualTo(String value) {
            addCriterion("DATA_TYP <=", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypLike(String value) {
            addCriterion("DATA_TYP like", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypNotLike(String value) {
            addCriterion("DATA_TYP not like", value, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypIn(List<String> values) {
            addCriterion("DATA_TYP in", values, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypNotIn(List<String> values) {
            addCriterion("DATA_TYP not in", values, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypBetween(String value1, String value2) {
            addCriterion("DATA_TYP between", value1, value2, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataTypNotBetween(String value1, String value2) {
            addCriterion("DATA_TYP not between", value1, value2, "dataTyp");
            return (Criteria) this;
        }

        public Criteria andDataRemIsNull() {
            addCriterion("DATA_REM is null");
            return (Criteria) this;
        }

        public Criteria andDataRemIsNotNull() {
            addCriterion("DATA_REM is not null");
            return (Criteria) this;
        }

        public Criteria andDataRemEqualTo(String value) {
            addCriterion("DATA_REM =", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemNotEqualTo(String value) {
            addCriterion("DATA_REM <>", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemGreaterThan(String value) {
            addCriterion("DATA_REM >", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_REM >=", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemLessThan(String value) {
            addCriterion("DATA_REM <", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemLessThanOrEqualTo(String value) {
            addCriterion("DATA_REM <=", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemLike(String value) {
            addCriterion("DATA_REM like", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemNotLike(String value) {
            addCriterion("DATA_REM not like", value, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemIn(List<String> values) {
            addCriterion("DATA_REM in", values, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemNotIn(List<String> values) {
            addCriterion("DATA_REM not in", values, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemBetween(String value1, String value2) {
            addCriterion("DATA_REM between", value1, value2, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataRemNotBetween(String value1, String value2) {
            addCriterion("DATA_REM not between", value1, value2, "dataRem");
            return (Criteria) this;
        }

        public Criteria andDataUsageIsNull() {
            addCriterion("DATA_USAGE is null");
            return (Criteria) this;
        }

        public Criteria andDataUsageIsNotNull() {
            addCriterion("DATA_USAGE is not null");
            return (Criteria) this;
        }

        public Criteria andDataUsageEqualTo(String value) {
            addCriterion("DATA_USAGE =", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageNotEqualTo(String value) {
            addCriterion("DATA_USAGE <>", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageGreaterThan(String value) {
            addCriterion("DATA_USAGE >", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_USAGE >=", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageLessThan(String value) {
            addCriterion("DATA_USAGE <", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageLessThanOrEqualTo(String value) {
            addCriterion("DATA_USAGE <=", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageLike(String value) {
            addCriterion("DATA_USAGE like", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageNotLike(String value) {
            addCriterion("DATA_USAGE not like", value, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageIn(List<String> values) {
            addCriterion("DATA_USAGE in", values, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageNotIn(List<String> values) {
            addCriterion("DATA_USAGE not in", values, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageBetween(String value1, String value2) {
            addCriterion("DATA_USAGE between", value1, value2, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andDataUsageNotBetween(String value1, String value2) {
            addCriterion("DATA_USAGE not between", value1, value2, "dataUsage");
            return (Criteria) this;
        }

        public Criteria andCreateIsNull() {
            addCriterion("CREATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateIsNotNull() {
            addCriterion("CREATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateEqualTo(Integer value) {
            addCriterion("CREATE =", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateNotEqualTo(Integer value) {
            addCriterion("CREATE <>", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateGreaterThan(Integer value) {
            addCriterion("CREATE >", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE >=", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateLessThan(Integer value) {
            addCriterion("CREATE <", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE <=", value, "create");
            return (Criteria) this;
        }

        public Criteria andCreateIn(List<Integer> values) {
            addCriterion("CREATE in", values, "create");
            return (Criteria) this;
        }

        public Criteria andCreateNotIn(List<Integer> values) {
            addCriterion("CREATE not in", values, "create");
            return (Criteria) this;
        }

        public Criteria andCreateBetween(Integer value1, Integer value2) {
            addCriterion("CREATE between", value1, value2, "create");
            return (Criteria) this;
        }

        public Criteria andCreateNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE not between", value1, value2, "create");
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

        public Criteria andDataDictIsNull() {
            addCriterion("DATA_DICT is null");
            return (Criteria) this;
        }

        public Criteria andDataDictIsNotNull() {
            addCriterion("DATA_DICT is not null");
            return (Criteria) this;
        }

        public Criteria andDataDictEqualTo(Integer value) {
            addCriterion("DATA_DICT =", value, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictNotEqualTo(Integer value) {
            addCriterion("DATA_DICT <>", value, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictGreaterThan(Integer value) {
            addCriterion("DATA_DICT >", value, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_DICT >=", value, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictLessThan(Integer value) {
            addCriterion("DATA_DICT <", value, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_DICT <=", value, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictIn(List<Integer> values) {
            addCriterion("DATA_DICT in", values, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictNotIn(List<Integer> values) {
            addCriterion("DATA_DICT not in", values, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictBetween(Integer value1, Integer value2) {
            addCriterion("DATA_DICT between", value1, value2, "dataDict");
            return (Criteria) this;
        }

        public Criteria andDataDictNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_DICT not between", value1, value2, "dataDict");
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