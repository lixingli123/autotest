package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestCaseExample() {
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

        public Criteria andTestCaseIdIsNull() {
            addCriterion("TEST_CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdIsNotNull() {
            addCriterion("TEST_CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdEqualTo(Integer value) {
            addCriterion("TEST_CASE_ID =", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdNotEqualTo(Integer value) {
            addCriterion("TEST_CASE_ID <>", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdGreaterThan(Integer value) {
            addCriterion("TEST_CASE_ID >", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_CASE_ID >=", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdLessThan(Integer value) {
            addCriterion("TEST_CASE_ID <", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_CASE_ID <=", value, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdIn(List<Integer> values) {
            addCriterion("TEST_CASE_ID in", values, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdNotIn(List<Integer> values) {
            addCriterion("TEST_CASE_ID not in", values, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("TEST_CASE_ID between", value1, value2, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andTestCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_CASE_ID not between", value1, value2, "testCaseId");
            return (Criteria) this;
        }

        public Criteria andScopeIdIsNull() {
            addCriterion("SCOPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andScopeIdIsNotNull() {
            addCriterion("SCOPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScopeIdEqualTo(Integer value) {
            addCriterion("SCOPE_ID =", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotEqualTo(Integer value) {
            addCriterion("SCOPE_ID <>", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdGreaterThan(Integer value) {
            addCriterion("SCOPE_ID >", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCOPE_ID >=", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdLessThan(Integer value) {
            addCriterion("SCOPE_ID <", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SCOPE_ID <=", value, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdIn(List<Integer> values) {
            addCriterion("SCOPE_ID in", values, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotIn(List<Integer> values) {
            addCriterion("SCOPE_ID not in", values, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdBetween(Integer value1, Integer value2) {
            addCriterion("SCOPE_ID between", value1, value2, "scopeId");
            return (Criteria) this;
        }

        public Criteria andScopeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SCOPE_ID not between", value1, value2, "scopeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("TEST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("TEST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(Integer value) {
            addCriterion("TEST_TYPE =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(Integer value) {
            addCriterion("TEST_TYPE <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(Integer value) {
            addCriterion("TEST_TYPE >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_TYPE >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(Integer value) {
            addCriterion("TEST_TYPE <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_TYPE <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<Integer> values) {
            addCriterion("TEST_TYPE in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<Integer> values) {
            addCriterion("TEST_TYPE not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(Integer value1, Integer value2) {
            addCriterion("TEST_TYPE between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_TYPE not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNull() {
            addCriterion("CASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNotNull() {
            addCriterion("CASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeEqualTo(Integer value) {
            addCriterion("CASE_TYPE =", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotEqualTo(Integer value) {
            addCriterion("CASE_TYPE <>", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThan(Integer value) {
            addCriterion("CASE_TYPE >", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_TYPE >=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThan(Integer value) {
            addCriterion("CASE_TYPE <", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_TYPE <=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIn(List<Integer> values) {
            addCriterion("CASE_TYPE in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotIn(List<Integer> values) {
            addCriterion("CASE_TYPE not in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeBetween(Integer value1, Integer value2) {
            addCriterion("CASE_TYPE between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_TYPE not between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionIsNull() {
            addCriterion("EXECUTE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionIsNotNull() {
            addCriterion("EXECUTE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionEqualTo(String value) {
            addCriterion("EXECUTE_CONDITION =", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionNotEqualTo(String value) {
            addCriterion("EXECUTE_CONDITION <>", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionGreaterThan(String value) {
            addCriterion("EXECUTE_CONDITION >", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTE_CONDITION >=", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionLessThan(String value) {
            addCriterion("EXECUTE_CONDITION <", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionLessThanOrEqualTo(String value) {
            addCriterion("EXECUTE_CONDITION <=", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionLike(String value) {
            addCriterion("EXECUTE_CONDITION like", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionNotLike(String value) {
            addCriterion("EXECUTE_CONDITION not like", value, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionIn(List<String> values) {
            addCriterion("EXECUTE_CONDITION in", values, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionNotIn(List<String> values) {
            addCriterion("EXECUTE_CONDITION not in", values, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionBetween(String value1, String value2) {
            addCriterion("EXECUTE_CONDITION between", value1, value2, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteConditionNotBetween(String value1, String value2) {
            addCriterion("EXECUTE_CONDITION not between", value1, value2, "executeCondition");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceIsNull() {
            addCriterion("EXECUTE_ENTRANCE is null");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceIsNotNull() {
            addCriterion("EXECUTE_ENTRANCE is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceEqualTo(String value) {
            addCriterion("EXECUTE_ENTRANCE =", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceNotEqualTo(String value) {
            addCriterion("EXECUTE_ENTRANCE <>", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceGreaterThan(String value) {
            addCriterion("EXECUTE_ENTRANCE >", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTE_ENTRANCE >=", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceLessThan(String value) {
            addCriterion("EXECUTE_ENTRANCE <", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceLessThanOrEqualTo(String value) {
            addCriterion("EXECUTE_ENTRANCE <=", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceLike(String value) {
            addCriterion("EXECUTE_ENTRANCE like", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceNotLike(String value) {
            addCriterion("EXECUTE_ENTRANCE not like", value, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceIn(List<String> values) {
            addCriterion("EXECUTE_ENTRANCE in", values, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceNotIn(List<String> values) {
            addCriterion("EXECUTE_ENTRANCE not in", values, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceBetween(String value1, String value2) {
            addCriterion("EXECUTE_ENTRANCE between", value1, value2, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andExecuteEntranceNotBetween(String value1, String value2) {
            addCriterion("EXECUTE_ENTRANCE not between", value1, value2, "executeEntrance");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("TARGET is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("TARGET =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("TARGET <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("TARGET >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("TARGET <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("TARGET <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("TARGET like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("TARGET not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("TARGET in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("TARGET not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("TARGET between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("TARGET not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andPreconditionIsNull() {
            addCriterion("PRECONDITION is null");
            return (Criteria) this;
        }

        public Criteria andPreconditionIsNotNull() {
            addCriterion("PRECONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andPreconditionEqualTo(String value) {
            addCriterion("PRECONDITION =", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionNotEqualTo(String value) {
            addCriterion("PRECONDITION <>", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionGreaterThan(String value) {
            addCriterion("PRECONDITION >", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionGreaterThanOrEqualTo(String value) {
            addCriterion("PRECONDITION >=", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionLessThan(String value) {
            addCriterion("PRECONDITION <", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionLessThanOrEqualTo(String value) {
            addCriterion("PRECONDITION <=", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionLike(String value) {
            addCriterion("PRECONDITION like", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionNotLike(String value) {
            addCriterion("PRECONDITION not like", value, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionIn(List<String> values) {
            addCriterion("PRECONDITION in", values, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionNotIn(List<String> values) {
            addCriterion("PRECONDITION not in", values, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionBetween(String value1, String value2) {
            addCriterion("PRECONDITION between", value1, value2, "precondition");
            return (Criteria) this;
        }

        public Criteria andPreconditionNotBetween(String value1, String value2) {
            addCriterion("PRECONDITION not between", value1, value2, "precondition");
            return (Criteria) this;
        }

        public Criteria andDataReqIsNull() {
            addCriterion("DATA_REQ is null");
            return (Criteria) this;
        }

        public Criteria andDataReqIsNotNull() {
            addCriterion("DATA_REQ is not null");
            return (Criteria) this;
        }

        public Criteria andDataReqEqualTo(String value) {
            addCriterion("DATA_REQ =", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqNotEqualTo(String value) {
            addCriterion("DATA_REQ <>", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqGreaterThan(String value) {
            addCriterion("DATA_REQ >", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_REQ >=", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqLessThan(String value) {
            addCriterion("DATA_REQ <", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqLessThanOrEqualTo(String value) {
            addCriterion("DATA_REQ <=", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqLike(String value) {
            addCriterion("DATA_REQ like", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqNotLike(String value) {
            addCriterion("DATA_REQ not like", value, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqIn(List<String> values) {
            addCriterion("DATA_REQ in", values, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqNotIn(List<String> values) {
            addCriterion("DATA_REQ not in", values, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqBetween(String value1, String value2) {
            addCriterion("DATA_REQ between", value1, value2, "dataReq");
            return (Criteria) this;
        }

        public Criteria andDataReqNotBetween(String value1, String value2) {
            addCriterion("DATA_REQ not between", value1, value2, "dataReq");
            return (Criteria) this;
        }

        public Criteria andStepsIsNull() {
            addCriterion("STEPS is null");
            return (Criteria) this;
        }

        public Criteria andStepsIsNotNull() {
            addCriterion("STEPS is not null");
            return (Criteria) this;
        }

        public Criteria andStepsEqualTo(String value) {
            addCriterion("STEPS =", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotEqualTo(String value) {
            addCriterion("STEPS <>", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsGreaterThan(String value) {
            addCriterion("STEPS >", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsGreaterThanOrEqualTo(String value) {
            addCriterion("STEPS >=", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLessThan(String value) {
            addCriterion("STEPS <", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLessThanOrEqualTo(String value) {
            addCriterion("STEPS <=", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsLike(String value) {
            addCriterion("STEPS like", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotLike(String value) {
            addCriterion("STEPS not like", value, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsIn(List<String> values) {
            addCriterion("STEPS in", values, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotIn(List<String> values) {
            addCriterion("STEPS not in", values, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsBetween(String value1, String value2) {
            addCriterion("STEPS between", value1, value2, "steps");
            return (Criteria) this;
        }

        public Criteria andStepsNotBetween(String value1, String value2) {
            addCriterion("STEPS not between", value1, value2, "steps");
            return (Criteria) this;
        }

        public Criteria andExpectationIsNull() {
            addCriterion("EXPECTATION is null");
            return (Criteria) this;
        }

        public Criteria andExpectationIsNotNull() {
            addCriterion("EXPECTATION is not null");
            return (Criteria) this;
        }

        public Criteria andExpectationEqualTo(String value) {
            addCriterion("EXPECTATION =", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationNotEqualTo(String value) {
            addCriterion("EXPECTATION <>", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationGreaterThan(String value) {
            addCriterion("EXPECTATION >", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationGreaterThanOrEqualTo(String value) {
            addCriterion("EXPECTATION >=", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationLessThan(String value) {
            addCriterion("EXPECTATION <", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationLessThanOrEqualTo(String value) {
            addCriterion("EXPECTATION <=", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationLike(String value) {
            addCriterion("EXPECTATION like", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationNotLike(String value) {
            addCriterion("EXPECTATION not like", value, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationIn(List<String> values) {
            addCriterion("EXPECTATION in", values, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationNotIn(List<String> values) {
            addCriterion("EXPECTATION not in", values, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationBetween(String value1, String value2) {
            addCriterion("EXPECTATION between", value1, value2, "expectation");
            return (Criteria) this;
        }

        public Criteria andExpectationNotBetween(String value1, String value2) {
            addCriterion("EXPECTATION not between", value1, value2, "expectation");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorIsNull() {
            addCriterion("TASK_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorIsNotNull() {
            addCriterion("TASK_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorEqualTo(String value) {
            addCriterion("TASK_CREATOR =", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorNotEqualTo(String value) {
            addCriterion("TASK_CREATOR <>", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorGreaterThan(String value) {
            addCriterion("TASK_CREATOR >", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CREATOR >=", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorLessThan(String value) {
            addCriterion("TASK_CREATOR <", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorLessThanOrEqualTo(String value) {
            addCriterion("TASK_CREATOR <=", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorLike(String value) {
            addCriterion("TASK_CREATOR like", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorNotLike(String value) {
            addCriterion("TASK_CREATOR not like", value, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorIn(List<String> values) {
            addCriterion("TASK_CREATOR in", values, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorNotIn(List<String> values) {
            addCriterion("TASK_CREATOR not in", values, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorBetween(String value1, String value2) {
            addCriterion("TASK_CREATOR between", value1, value2, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatorNotBetween(String value1, String value2) {
            addCriterion("TASK_CREATOR not between", value1, value2, "taskCreator");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeIsNull() {
            addCriterion("TASK_CREATEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeIsNotNull() {
            addCriterion("TASK_CREATEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeEqualTo(Date value) {
            addCriterion("TASK_CREATEDTIME =", value, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeNotEqualTo(Date value) {
            addCriterion("TASK_CREATEDTIME <>", value, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeGreaterThan(Date value) {
            addCriterion("TASK_CREATEDTIME >", value, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASK_CREATEDTIME >=", value, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeLessThan(Date value) {
            addCriterion("TASK_CREATEDTIME <", value, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("TASK_CREATEDTIME <=", value, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeIn(List<Date> values) {
            addCriterion("TASK_CREATEDTIME in", values, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeNotIn(List<Date> values) {
            addCriterion("TASK_CREATEDTIME not in", values, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("TASK_CREATEDTIME between", value1, value2, "taskCreatedtime");
            return (Criteria) this;
        }

        public Criteria andTaskCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("TASK_CREATEDTIME not between", value1, value2, "taskCreatedtime");
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

        public Criteria andReuseFlagIsNull() {
            addCriterion("REUSE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReuseFlagIsNotNull() {
            addCriterion("REUSE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReuseFlagEqualTo(Integer value) {
            addCriterion("REUSE_FLAG =", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagNotEqualTo(Integer value) {
            addCriterion("REUSE_FLAG <>", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagGreaterThan(Integer value) {
            addCriterion("REUSE_FLAG >", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("REUSE_FLAG >=", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagLessThan(Integer value) {
            addCriterion("REUSE_FLAG <", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagLessThanOrEqualTo(Integer value) {
            addCriterion("REUSE_FLAG <=", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagIn(List<Integer> values) {
            addCriterion("REUSE_FLAG in", values, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagNotIn(List<Integer> values) {
            addCriterion("REUSE_FLAG not in", values, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagBetween(Integer value1, Integer value2) {
            addCriterion("REUSE_FLAG between", value1, value2, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("REUSE_FLAG not between", value1, value2, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andIsChangedIsNull() {
            addCriterion("IS_CHANGED is null");
            return (Criteria) this;
        }

        public Criteria andIsChangedIsNotNull() {
            addCriterion("IS_CHANGED is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangedEqualTo(Integer value) {
            addCriterion("IS_CHANGED =", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedNotEqualTo(Integer value) {
            addCriterion("IS_CHANGED <>", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedGreaterThan(Integer value) {
            addCriterion("IS_CHANGED >", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_CHANGED >=", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedLessThan(Integer value) {
            addCriterion("IS_CHANGED <", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_CHANGED <=", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedIn(List<Integer> values) {
            addCriterion("IS_CHANGED in", values, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedNotIn(List<Integer> values) {
            addCriterion("IS_CHANGED not in", values, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedBetween(Integer value1, Integer value2) {
            addCriterion("IS_CHANGED between", value1, value2, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_CHANGED not between", value1, value2, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIsNull() {
            addCriterion("IS_EXECUTED is null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIsNotNull() {
            addCriterion("IS_EXECUTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedEqualTo(Integer value) {
            addCriterion("IS_EXECUTED =", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotEqualTo(Integer value) {
            addCriterion("IS_EXECUTED <>", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedGreaterThan(Integer value) {
            addCriterion("IS_EXECUTED >", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_EXECUTED >=", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedLessThan(Integer value) {
            addCriterion("IS_EXECUTED <", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_EXECUTED <=", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIn(List<Integer> values) {
            addCriterion("IS_EXECUTED in", values, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotIn(List<Integer> values) {
            addCriterion("IS_EXECUTED not in", values, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedBetween(Integer value1, Integer value2) {
            addCriterion("IS_EXECUTED between", value1, value2, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_EXECUTED not between", value1, value2, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseIsNull() {
            addCriterion("IS_TEST_BASE is null");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseIsNotNull() {
            addCriterion("IS_TEST_BASE is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseEqualTo(Integer value) {
            addCriterion("IS_TEST_BASE =", value, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseNotEqualTo(Integer value) {
            addCriterion("IS_TEST_BASE <>", value, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseGreaterThan(Integer value) {
            addCriterion("IS_TEST_BASE >", value, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_TEST_BASE >=", value, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseLessThan(Integer value) {
            addCriterion("IS_TEST_BASE <", value, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseLessThanOrEqualTo(Integer value) {
            addCriterion("IS_TEST_BASE <=", value, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseIn(List<Integer> values) {
            addCriterion("IS_TEST_BASE in", values, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseNotIn(List<Integer> values) {
            addCriterion("IS_TEST_BASE not in", values, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseBetween(Integer value1, Integer value2) {
            addCriterion("IS_TEST_BASE between", value1, value2, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andIsTestBaseNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_TEST_BASE not between", value1, value2, "isTestBase");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIsNull() {
            addCriterion("CASE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIsNotNull() {
            addCriterion("CASE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLevelEqualTo(String value) {
            addCriterion("CASE_LEVEL =", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotEqualTo(String value) {
            addCriterion("CASE_LEVEL <>", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelGreaterThan(String value) {
            addCriterion("CASE_LEVEL >", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_LEVEL >=", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLessThan(String value) {
            addCriterion("CASE_LEVEL <", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLessThanOrEqualTo(String value) {
            addCriterion("CASE_LEVEL <=", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLike(String value) {
            addCriterion("CASE_LEVEL like", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotLike(String value) {
            addCriterion("CASE_LEVEL not like", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIn(List<String> values) {
            addCriterion("CASE_LEVEL in", values, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotIn(List<String> values) {
            addCriterion("CASE_LEVEL not in", values, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelBetween(String value1, String value2) {
            addCriterion("CASE_LEVEL between", value1, value2, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotBetween(String value1, String value2) {
            addCriterion("CASE_LEVEL not between", value1, value2, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseVersionIsNull() {
            addCriterion("CASE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andCaseVersionIsNotNull() {
            addCriterion("CASE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCaseVersionEqualTo(String value) {
            addCriterion("CASE_VERSION =", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionNotEqualTo(String value) {
            addCriterion("CASE_VERSION <>", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionGreaterThan(String value) {
            addCriterion("CASE_VERSION >", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_VERSION >=", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionLessThan(String value) {
            addCriterion("CASE_VERSION <", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionLessThanOrEqualTo(String value) {
            addCriterion("CASE_VERSION <=", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionLike(String value) {
            addCriterion("CASE_VERSION like", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionNotLike(String value) {
            addCriterion("CASE_VERSION not like", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionIn(List<String> values) {
            addCriterion("CASE_VERSION in", values, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionNotIn(List<String> values) {
            addCriterion("CASE_VERSION not in", values, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionBetween(String value1, String value2) {
            addCriterion("CASE_VERSION between", value1, value2, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionNotBetween(String value1, String value2) {
            addCriterion("CASE_VERSION not between", value1, value2, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andAttachInfoIsNull() {
            addCriterion("ATTACH_INFO is null");
            return (Criteria) this;
        }

        public Criteria andAttachInfoIsNotNull() {
            addCriterion("ATTACH_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andAttachInfoEqualTo(String value) {
            addCriterion("ATTACH_INFO =", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoNotEqualTo(String value) {
            addCriterion("ATTACH_INFO <>", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoGreaterThan(String value) {
            addCriterion("ATTACH_INFO >", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_INFO >=", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoLessThan(String value) {
            addCriterion("ATTACH_INFO <", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_INFO <=", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoLike(String value) {
            addCriterion("ATTACH_INFO like", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoNotLike(String value) {
            addCriterion("ATTACH_INFO not like", value, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoIn(List<String> values) {
            addCriterion("ATTACH_INFO in", values, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoNotIn(List<String> values) {
            addCriterion("ATTACH_INFO not in", values, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoBetween(String value1, String value2) {
            addCriterion("ATTACH_INFO between", value1, value2, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andAttachInfoNotBetween(String value1, String value2) {
            addCriterion("ATTACH_INFO not between", value1, value2, "attachInfo");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNull() {
            addCriterion("FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("FUNC_ID =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("FUNC_ID <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("FUNC_ID >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("FUNC_ID <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("FUNC_ID in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("FUNC_ID not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andBaseResultIsNull() {
            addCriterion("BASE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andBaseResultIsNotNull() {
            addCriterion("BASE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andBaseResultEqualTo(Integer value) {
            addCriterion("BASE_RESULT =", value, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultNotEqualTo(Integer value) {
            addCriterion("BASE_RESULT <>", value, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultGreaterThan(Integer value) {
            addCriterion("BASE_RESULT >", value, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("BASE_RESULT >=", value, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultLessThan(Integer value) {
            addCriterion("BASE_RESULT <", value, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultLessThanOrEqualTo(Integer value) {
            addCriterion("BASE_RESULT <=", value, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultIn(List<Integer> values) {
            addCriterion("BASE_RESULT in", values, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultNotIn(List<Integer> values) {
            addCriterion("BASE_RESULT not in", values, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultBetween(Integer value1, Integer value2) {
            addCriterion("BASE_RESULT between", value1, value2, "baseResult");
            return (Criteria) this;
        }

        public Criteria andBaseResultNotBetween(Integer value1, Integer value2) {
            addCriterion("BASE_RESULT not between", value1, value2, "baseResult");
            return (Criteria) this;
        }

        public Criteria andUntestReasonIsNull() {
            addCriterion("UNTEST_REASON is null");
            return (Criteria) this;
        }

        public Criteria andUntestReasonIsNotNull() {
            addCriterion("UNTEST_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andUntestReasonEqualTo(Integer value) {
            addCriterion("UNTEST_REASON =", value, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonNotEqualTo(Integer value) {
            addCriterion("UNTEST_REASON <>", value, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonGreaterThan(Integer value) {
            addCriterion("UNTEST_REASON >", value, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNTEST_REASON >=", value, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonLessThan(Integer value) {
            addCriterion("UNTEST_REASON <", value, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonLessThanOrEqualTo(Integer value) {
            addCriterion("UNTEST_REASON <=", value, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonIn(List<Integer> values) {
            addCriterion("UNTEST_REASON in", values, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonNotIn(List<Integer> values) {
            addCriterion("UNTEST_REASON not in", values, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonBetween(Integer value1, Integer value2) {
            addCriterion("UNTEST_REASON between", value1, value2, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUntestReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("UNTEST_REASON not between", value1, value2, "untestReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonIsNull() {
            addCriterion("UNEXECUTE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonIsNotNull() {
            addCriterion("UNEXECUTE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonEqualTo(String value) {
            addCriterion("UNEXECUTE_REASON =", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonNotEqualTo(String value) {
            addCriterion("UNEXECUTE_REASON <>", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonGreaterThan(String value) {
            addCriterion("UNEXECUTE_REASON >", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonGreaterThanOrEqualTo(String value) {
            addCriterion("UNEXECUTE_REASON >=", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonLessThan(String value) {
            addCriterion("UNEXECUTE_REASON <", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonLessThanOrEqualTo(String value) {
            addCriterion("UNEXECUTE_REASON <=", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonLike(String value) {
            addCriterion("UNEXECUTE_REASON like", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonNotLike(String value) {
            addCriterion("UNEXECUTE_REASON not like", value, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonIn(List<String> values) {
            addCriterion("UNEXECUTE_REASON in", values, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonNotIn(List<String> values) {
            addCriterion("UNEXECUTE_REASON not in", values, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonBetween(String value1, String value2) {
            addCriterion("UNEXECUTE_REASON between", value1, value2, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andUnexecuteReasonNotBetween(String value1, String value2) {
            addCriterion("UNEXECUTE_REASON not between", value1, value2, "unexecuteReason");
            return (Criteria) this;
        }

        public Criteria andExecuterIsNull() {
            addCriterion("EXECUTER is null");
            return (Criteria) this;
        }

        public Criteria andExecuterIsNotNull() {
            addCriterion("EXECUTER is not null");
            return (Criteria) this;
        }

        public Criteria andExecuterEqualTo(String value) {
            addCriterion("EXECUTER =", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterNotEqualTo(String value) {
            addCriterion("EXECUTER <>", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterGreaterThan(String value) {
            addCriterion("EXECUTER >", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTER >=", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterLessThan(String value) {
            addCriterion("EXECUTER <", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterLessThanOrEqualTo(String value) {
            addCriterion("EXECUTER <=", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterLike(String value) {
            addCriterion("EXECUTER like", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterNotLike(String value) {
            addCriterion("EXECUTER not like", value, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterIn(List<String> values) {
            addCriterion("EXECUTER in", values, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterNotIn(List<String> values) {
            addCriterion("EXECUTER not in", values, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterBetween(String value1, String value2) {
            addCriterion("EXECUTER between", value1, value2, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterNotBetween(String value1, String value2) {
            addCriterion("EXECUTER not between", value1, value2, "executer");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointIsNull() {
            addCriterion("EXECUTER_ENDPOINT is null");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointIsNotNull() {
            addCriterion("EXECUTER_ENDPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointEqualTo(String value) {
            addCriterion("EXECUTER_ENDPOINT =", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointNotEqualTo(String value) {
            addCriterion("EXECUTER_ENDPOINT <>", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointGreaterThan(String value) {
            addCriterion("EXECUTER_ENDPOINT >", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTER_ENDPOINT >=", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointLessThan(String value) {
            addCriterion("EXECUTER_ENDPOINT <", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointLessThanOrEqualTo(String value) {
            addCriterion("EXECUTER_ENDPOINT <=", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointLike(String value) {
            addCriterion("EXECUTER_ENDPOINT like", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointNotLike(String value) {
            addCriterion("EXECUTER_ENDPOINT not like", value, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointIn(List<String> values) {
            addCriterion("EXECUTER_ENDPOINT in", values, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointNotIn(List<String> values) {
            addCriterion("EXECUTER_ENDPOINT not in", values, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointBetween(String value1, String value2) {
            addCriterion("EXECUTER_ENDPOINT between", value1, value2, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andExecuterEndpointNotBetween(String value1, String value2) {
            addCriterion("EXECUTER_ENDPOINT not between", value1, value2, "executerEndpoint");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andExecuteDescIsNull() {
            addCriterion("EXECUTE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andExecuteDescIsNotNull() {
            addCriterion("EXECUTE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteDescEqualTo(String value) {
            addCriterion("EXECUTE_DESC =", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescNotEqualTo(String value) {
            addCriterion("EXECUTE_DESC <>", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescGreaterThan(String value) {
            addCriterion("EXECUTE_DESC >", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTE_DESC >=", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescLessThan(String value) {
            addCriterion("EXECUTE_DESC <", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescLessThanOrEqualTo(String value) {
            addCriterion("EXECUTE_DESC <=", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescLike(String value) {
            addCriterion("EXECUTE_DESC like", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescNotLike(String value) {
            addCriterion("EXECUTE_DESC not like", value, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescIn(List<String> values) {
            addCriterion("EXECUTE_DESC in", values, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescNotIn(List<String> values) {
            addCriterion("EXECUTE_DESC not in", values, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescBetween(String value1, String value2) {
            addCriterion("EXECUTE_DESC between", value1, value2, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andExecuteDescNotBetween(String value1, String value2) {
            addCriterion("EXECUTE_DESC not between", value1, value2, "executeDesc");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNull() {
            addCriterion("RETURN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("RETURN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeEqualTo(Integer value) {
            addCriterion("RETURN_CODE =", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotEqualTo(Integer value) {
            addCriterion("RETURN_CODE <>", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThan(Integer value) {
            addCriterion("RETURN_CODE >", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETURN_CODE >=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThan(Integer value) {
            addCriterion("RETURN_CODE <", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(Integer value) {
            addCriterion("RETURN_CODE <=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIn(List<Integer> values) {
            addCriterion("RETURN_CODE in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotIn(List<Integer> values) {
            addCriterion("RETURN_CODE not in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeBetween(Integer value1, Integer value2) {
            addCriterion("RETURN_CODE between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("RETURN_CODE not between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andSuccussCountIsNull() {
            addCriterion("SUCCUSS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSuccussCountIsNotNull() {
            addCriterion("SUCCUSS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSuccussCountEqualTo(Integer value) {
            addCriterion("SUCCUSS_COUNT =", value, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountNotEqualTo(Integer value) {
            addCriterion("SUCCUSS_COUNT <>", value, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountGreaterThan(Integer value) {
            addCriterion("SUCCUSS_COUNT >", value, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUCCUSS_COUNT >=", value, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountLessThan(Integer value) {
            addCriterion("SUCCUSS_COUNT <", value, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountLessThanOrEqualTo(Integer value) {
            addCriterion("SUCCUSS_COUNT <=", value, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountIn(List<Integer> values) {
            addCriterion("SUCCUSS_COUNT in", values, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountNotIn(List<Integer> values) {
            addCriterion("SUCCUSS_COUNT not in", values, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountBetween(Integer value1, Integer value2) {
            addCriterion("SUCCUSS_COUNT between", value1, value2, "succussCount");
            return (Criteria) this;
        }

        public Criteria andSuccussCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SUCCUSS_COUNT not between", value1, value2, "succussCount");
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