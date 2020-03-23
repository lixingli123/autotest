package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasRunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasRunExample() {
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

        public Criteria andRunIdIsNull() {
            addCriterion("RUN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRunIdIsNotNull() {
            addCriterion("RUN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRunIdEqualTo(Integer value) {
            addCriterion("RUN_ID =", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdNotEqualTo(Integer value) {
            addCriterion("RUN_ID <>", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdGreaterThan(Integer value) {
            addCriterion("RUN_ID >", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RUN_ID >=", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdLessThan(Integer value) {
            addCriterion("RUN_ID <", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdLessThanOrEqualTo(Integer value) {
            addCriterion("RUN_ID <=", value, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdIn(List<Integer> values) {
            addCriterion("RUN_ID in", values, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdNotIn(List<Integer> values) {
            addCriterion("RUN_ID not in", values, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdBetween(Integer value1, Integer value2) {
            addCriterion("RUN_ID between", value1, value2, "runId");
            return (Criteria) this;
        }

        public Criteria andRunIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RUN_ID not between", value1, value2, "runId");
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

        public Criteria andTaskTypeIsNull() {
            addCriterion("TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("TASK_TYPE =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("TASK_TYPE <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("TASK_TYPE >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("TASK_TYPE <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("TASK_TYPE <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("TASK_TYPE like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("TASK_TYPE not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("TASK_TYPE in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("TASK_TYPE not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("TASK_TYPE between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("TASK_TYPE not between", value1, value2, "taskType");
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

        public Criteria andCaseTypeEqualTo(String value) {
            addCriterion("CASE_TYPE =", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotEqualTo(String value) {
            addCriterion("CASE_TYPE <>", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThan(String value) {
            addCriterion("CASE_TYPE >", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_TYPE >=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThan(String value) {
            addCriterion("CASE_TYPE <", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThanOrEqualTo(String value) {
            addCriterion("CASE_TYPE <=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLike(String value) {
            addCriterion("CASE_TYPE like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotLike(String value) {
            addCriterion("CASE_TYPE not like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIn(List<String> values) {
            addCriterion("CASE_TYPE in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotIn(List<String> values) {
            addCriterion("CASE_TYPE not in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeBetween(String value1, String value2) {
            addCriterion("CASE_TYPE between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotBetween(String value1, String value2) {
            addCriterion("CASE_TYPE not between", value1, value2, "caseType");
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

        public Criteria andCaseRunIdIsNull() {
            addCriterion("CASE_RUN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdIsNotNull() {
            addCriterion("CASE_RUN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdEqualTo(Integer value) {
            addCriterion("CASE_RUN_ID =", value, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdNotEqualTo(Integer value) {
            addCriterion("CASE_RUN_ID <>", value, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdGreaterThan(Integer value) {
            addCriterion("CASE_RUN_ID >", value, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_RUN_ID >=", value, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdLessThan(Integer value) {
            addCriterion("CASE_RUN_ID <", value, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_RUN_ID <=", value, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdIn(List<Integer> values) {
            addCriterion("CASE_RUN_ID in", values, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdNotIn(List<Integer> values) {
            addCriterion("CASE_RUN_ID not in", values, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdBetween(Integer value1, Integer value2) {
            addCriterion("CASE_RUN_ID between", value1, value2, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andCaseRunIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_RUN_ID not between", value1, value2, "caseRunId");
            return (Criteria) this;
        }

        public Criteria andRunTimesIsNull() {
            addCriterion("RUN_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andRunTimesIsNotNull() {
            addCriterion("RUN_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRunTimesEqualTo(Integer value) {
            addCriterion("RUN_TIMES =", value, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesNotEqualTo(Integer value) {
            addCriterion("RUN_TIMES <>", value, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesGreaterThan(Integer value) {
            addCriterion("RUN_TIMES >", value, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RUN_TIMES >=", value, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesLessThan(Integer value) {
            addCriterion("RUN_TIMES <", value, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesLessThanOrEqualTo(Integer value) {
            addCriterion("RUN_TIMES <=", value, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesIn(List<Integer> values) {
            addCriterion("RUN_TIMES in", values, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesNotIn(List<Integer> values) {
            addCriterion("RUN_TIMES not in", values, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesBetween(Integer value1, Integer value2) {
            addCriterion("RUN_TIMES between", value1, value2, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("RUN_TIMES not between", value1, value2, "runTimes");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNull() {
            addCriterion("RUN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRunStatusIsNotNull() {
            addCriterion("RUN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRunStatusEqualTo(String value) {
            addCriterion("RUN_STATUS =", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotEqualTo(String value) {
            addCriterion("RUN_STATUS <>", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThan(String value) {
            addCriterion("RUN_STATUS >", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_STATUS >=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThan(String value) {
            addCriterion("RUN_STATUS <", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLessThanOrEqualTo(String value) {
            addCriterion("RUN_STATUS <=", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusLike(String value) {
            addCriterion("RUN_STATUS like", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotLike(String value) {
            addCriterion("RUN_STATUS not like", value, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusIn(List<String> values) {
            addCriterion("RUN_STATUS in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotIn(List<String> values) {
            addCriterion("RUN_STATUS not in", values, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusBetween(String value1, String value2) {
            addCriterion("RUN_STATUS between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunStatusNotBetween(String value1, String value2) {
            addCriterion("RUN_STATUS not between", value1, value2, "runStatus");
            return (Criteria) this;
        }

        public Criteria andRunDurationIsNull() {
            addCriterion("RUN_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andRunDurationIsNotNull() {
            addCriterion("RUN_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andRunDurationEqualTo(Integer value) {
            addCriterion("RUN_DURATION =", value, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationNotEqualTo(Integer value) {
            addCriterion("RUN_DURATION <>", value, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationGreaterThan(Integer value) {
            addCriterion("RUN_DURATION >", value, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("RUN_DURATION >=", value, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationLessThan(Integer value) {
            addCriterion("RUN_DURATION <", value, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationLessThanOrEqualTo(Integer value) {
            addCriterion("RUN_DURATION <=", value, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationIn(List<Integer> values) {
            addCriterion("RUN_DURATION in", values, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationNotIn(List<Integer> values) {
            addCriterion("RUN_DURATION not in", values, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationBetween(Integer value1, Integer value2) {
            addCriterion("RUN_DURATION between", value1, value2, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("RUN_DURATION not between", value1, value2, "runDuration");
            return (Criteria) this;
        }

        public Criteria andRunStartIsNull() {
            addCriterion("RUN_START is null");
            return (Criteria) this;
        }

        public Criteria andRunStartIsNotNull() {
            addCriterion("RUN_START is not null");
            return (Criteria) this;
        }

        public Criteria andRunStartEqualTo(Date value) {
            addCriterion("RUN_START =", value, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartNotEqualTo(Date value) {
            addCriterion("RUN_START <>", value, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartGreaterThan(Date value) {
            addCriterion("RUN_START >", value, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartGreaterThanOrEqualTo(Date value) {
            addCriterion("RUN_START >=", value, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartLessThan(Date value) {
            addCriterion("RUN_START <", value, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartLessThanOrEqualTo(Date value) {
            addCriterion("RUN_START <=", value, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartIn(List<Date> values) {
            addCriterion("RUN_START in", values, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartNotIn(List<Date> values) {
            addCriterion("RUN_START not in", values, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartBetween(Date value1, Date value2) {
            addCriterion("RUN_START between", value1, value2, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunStartNotBetween(Date value1, Date value2) {
            addCriterion("RUN_START not between", value1, value2, "runStart");
            return (Criteria) this;
        }

        public Criteria andRunOverIsNull() {
            addCriterion("RUN_OVER is null");
            return (Criteria) this;
        }

        public Criteria andRunOverIsNotNull() {
            addCriterion("RUN_OVER is not null");
            return (Criteria) this;
        }

        public Criteria andRunOverEqualTo(Date value) {
            addCriterion("RUN_OVER =", value, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverNotEqualTo(Date value) {
            addCriterion("RUN_OVER <>", value, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverGreaterThan(Date value) {
            addCriterion("RUN_OVER >", value, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverGreaterThanOrEqualTo(Date value) {
            addCriterion("RUN_OVER >=", value, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverLessThan(Date value) {
            addCriterion("RUN_OVER <", value, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverLessThanOrEqualTo(Date value) {
            addCriterion("RUN_OVER <=", value, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverIn(List<Date> values) {
            addCriterion("RUN_OVER in", values, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverNotIn(List<Date> values) {
            addCriterion("RUN_OVER not in", values, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverBetween(Date value1, Date value2) {
            addCriterion("RUN_OVER between", value1, value2, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunOverNotBetween(Date value1, Date value2) {
            addCriterion("RUN_OVER not between", value1, value2, "runOver");
            return (Criteria) this;
        }

        public Criteria andRunEngineIsNull() {
            addCriterion("RUN_ENGINE is null");
            return (Criteria) this;
        }

        public Criteria andRunEngineIsNotNull() {
            addCriterion("RUN_ENGINE is not null");
            return (Criteria) this;
        }

        public Criteria andRunEngineEqualTo(String value) {
            addCriterion("RUN_ENGINE =", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineNotEqualTo(String value) {
            addCriterion("RUN_ENGINE <>", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineGreaterThan(String value) {
            addCriterion("RUN_ENGINE >", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_ENGINE >=", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineLessThan(String value) {
            addCriterion("RUN_ENGINE <", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineLessThanOrEqualTo(String value) {
            addCriterion("RUN_ENGINE <=", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineLike(String value) {
            addCriterion("RUN_ENGINE like", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineNotLike(String value) {
            addCriterion("RUN_ENGINE not like", value, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineIn(List<String> values) {
            addCriterion("RUN_ENGINE in", values, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineNotIn(List<String> values) {
            addCriterion("RUN_ENGINE not in", values, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineBetween(String value1, String value2) {
            addCriterion("RUN_ENGINE between", value1, value2, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunEngineNotBetween(String value1, String value2) {
            addCriterion("RUN_ENGINE not between", value1, value2, "runEngine");
            return (Criteria) this;
        }

        public Criteria andRunTesterIsNull() {
            addCriterion("RUN_TESTER is null");
            return (Criteria) this;
        }

        public Criteria andRunTesterIsNotNull() {
            addCriterion("RUN_TESTER is not null");
            return (Criteria) this;
        }

        public Criteria andRunTesterEqualTo(String value) {
            addCriterion("RUN_TESTER =", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterNotEqualTo(String value) {
            addCriterion("RUN_TESTER <>", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterGreaterThan(String value) {
            addCriterion("RUN_TESTER >", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_TESTER >=", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterLessThan(String value) {
            addCriterion("RUN_TESTER <", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterLessThanOrEqualTo(String value) {
            addCriterion("RUN_TESTER <=", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterLike(String value) {
            addCriterion("RUN_TESTER like", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterNotLike(String value) {
            addCriterion("RUN_TESTER not like", value, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterIn(List<String> values) {
            addCriterion("RUN_TESTER in", values, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterNotIn(List<String> values) {
            addCriterion("RUN_TESTER not in", values, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterBetween(String value1, String value2) {
            addCriterion("RUN_TESTER between", value1, value2, "runTester");
            return (Criteria) this;
        }

        public Criteria andRunTesterNotBetween(String value1, String value2) {
            addCriterion("RUN_TESTER not between", value1, value2, "runTester");
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

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
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