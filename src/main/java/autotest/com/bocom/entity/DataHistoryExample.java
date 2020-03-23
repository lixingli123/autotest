package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataHistoryExample() {
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

        public Criteria andHistoryIdIsNull() {
            addCriterion("HISTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIsNotNull() {
            addCriterion("HISTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdEqualTo(Integer value) {
            addCriterion("HISTORY_ID =", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotEqualTo(Integer value) {
            addCriterion("HISTORY_ID <>", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThan(Integer value) {
            addCriterion("HISTORY_ID >", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HISTORY_ID >=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThan(Integer value) {
            addCriterion("HISTORY_ID <", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("HISTORY_ID <=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIn(List<Integer> values) {
            addCriterion("HISTORY_ID in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotIn(List<Integer> values) {
            addCriterion("HISTORY_ID not in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdBetween(Integer value1, Integer value2) {
            addCriterion("HISTORY_ID between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HISTORY_ID not between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andUseTimeIsNull() {
            addCriterion("USE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("USE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(Date value) {
            addCriterion("USE_TIME =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(Date value) {
            addCriterion("USE_TIME <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(Date value) {
            addCriterion("USE_TIME >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USE_TIME >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(Date value) {
            addCriterion("USE_TIME <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(Date value) {
            addCriterion("USE_TIME <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<Date> values) {
            addCriterion("USE_TIME in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<Date> values) {
            addCriterion("USE_TIME not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(Date value1, Date value2) {
            addCriterion("USE_TIME between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(Date value1, Date value2) {
            addCriterion("USE_TIME not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andAttribure1IsNull() {
            addCriterion("ATTRIBURE1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribure1IsNotNull() {
            addCriterion("ATTRIBURE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribure1EqualTo(String value) {
            addCriterion("ATTRIBURE1 =", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1NotEqualTo(String value) {
            addCriterion("ATTRIBURE1 <>", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1GreaterThan(String value) {
            addCriterion("ATTRIBURE1 >", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE1 >=", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1LessThan(String value) {
            addCriterion("ATTRIBURE1 <", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE1 <=", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1Like(String value) {
            addCriterion("ATTRIBURE1 like", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1NotLike(String value) {
            addCriterion("ATTRIBURE1 not like", value, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1In(List<String> values) {
            addCriterion("ATTRIBURE1 in", values, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1NotIn(List<String> values) {
            addCriterion("ATTRIBURE1 not in", values, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1Between(String value1, String value2) {
            addCriterion("ATTRIBURE1 between", value1, value2, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure1NotBetween(String value1, String value2) {
            addCriterion("ATTRIBURE1 not between", value1, value2, "attribure1");
            return (Criteria) this;
        }

        public Criteria andAttribure2IsNull() {
            addCriterion("ATTRIBURE2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribure2IsNotNull() {
            addCriterion("ATTRIBURE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribure2EqualTo(String value) {
            addCriterion("ATTRIBURE2 =", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2NotEqualTo(String value) {
            addCriterion("ATTRIBURE2 <>", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2GreaterThan(String value) {
            addCriterion("ATTRIBURE2 >", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE2 >=", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2LessThan(String value) {
            addCriterion("ATTRIBURE2 <", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE2 <=", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2Like(String value) {
            addCriterion("ATTRIBURE2 like", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2NotLike(String value) {
            addCriterion("ATTRIBURE2 not like", value, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2In(List<String> values) {
            addCriterion("ATTRIBURE2 in", values, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2NotIn(List<String> values) {
            addCriterion("ATTRIBURE2 not in", values, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2Between(String value1, String value2) {
            addCriterion("ATTRIBURE2 between", value1, value2, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure2NotBetween(String value1, String value2) {
            addCriterion("ATTRIBURE2 not between", value1, value2, "attribure2");
            return (Criteria) this;
        }

        public Criteria andAttribure3IsNull() {
            addCriterion("ATTRIBURE3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribure3IsNotNull() {
            addCriterion("ATTRIBURE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribure3EqualTo(String value) {
            addCriterion("ATTRIBURE3 =", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3NotEqualTo(String value) {
            addCriterion("ATTRIBURE3 <>", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3GreaterThan(String value) {
            addCriterion("ATTRIBURE3 >", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE3 >=", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3LessThan(String value) {
            addCriterion("ATTRIBURE3 <", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE3 <=", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3Like(String value) {
            addCriterion("ATTRIBURE3 like", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3NotLike(String value) {
            addCriterion("ATTRIBURE3 not like", value, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3In(List<String> values) {
            addCriterion("ATTRIBURE3 in", values, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3NotIn(List<String> values) {
            addCriterion("ATTRIBURE3 not in", values, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3Between(String value1, String value2) {
            addCriterion("ATTRIBURE3 between", value1, value2, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBURE3 not between", value1, value2, "attribure3");
            return (Criteria) this;
        }

        public Criteria andAttribure4IsNull() {
            addCriterion("ATTRIBURE4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribure4IsNotNull() {
            addCriterion("ATTRIBURE4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribure4EqualTo(String value) {
            addCriterion("ATTRIBURE4 =", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4NotEqualTo(String value) {
            addCriterion("ATTRIBURE4 <>", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4GreaterThan(String value) {
            addCriterion("ATTRIBURE4 >", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE4 >=", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4LessThan(String value) {
            addCriterion("ATTRIBURE4 <", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE4 <=", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4Like(String value) {
            addCriterion("ATTRIBURE4 like", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4NotLike(String value) {
            addCriterion("ATTRIBURE4 not like", value, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4In(List<String> values) {
            addCriterion("ATTRIBURE4 in", values, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4NotIn(List<String> values) {
            addCriterion("ATTRIBURE4 not in", values, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4Between(String value1, String value2) {
            addCriterion("ATTRIBURE4 between", value1, value2, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure4NotBetween(String value1, String value2) {
            addCriterion("ATTRIBURE4 not between", value1, value2, "attribure4");
            return (Criteria) this;
        }

        public Criteria andAttribure5IsNull() {
            addCriterion("ATTRIBURE5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribure5IsNotNull() {
            addCriterion("ATTRIBURE5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribure5EqualTo(String value) {
            addCriterion("ATTRIBURE5 =", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5NotEqualTo(String value) {
            addCriterion("ATTRIBURE5 <>", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5GreaterThan(String value) {
            addCriterion("ATTRIBURE5 >", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE5 >=", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5LessThan(String value) {
            addCriterion("ATTRIBURE5 <", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBURE5 <=", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5Like(String value) {
            addCriterion("ATTRIBURE5 like", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5NotLike(String value) {
            addCriterion("ATTRIBURE5 not like", value, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5In(List<String> values) {
            addCriterion("ATTRIBURE5 in", values, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5NotIn(List<String> values) {
            addCriterion("ATTRIBURE5 not in", values, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5Between(String value1, String value2) {
            addCriterion("ATTRIBURE5 between", value1, value2, "attribure5");
            return (Criteria) this;
        }

        public Criteria andAttribure5NotBetween(String value1, String value2) {
            addCriterion("ATTRIBURE5 not between", value1, value2, "attribure5");
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