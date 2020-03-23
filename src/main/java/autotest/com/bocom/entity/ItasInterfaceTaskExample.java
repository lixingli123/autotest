package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasInterfaceTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasInterfaceTaskExample() {
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

        public Criteria andCqIdIsNull() {
            addCriterion("CQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andCqIdIsNotNull() {
            addCriterion("CQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCqIdEqualTo(String value) {
            addCriterion("CQ_ID =", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdNotEqualTo(String value) {
            addCriterion("CQ_ID <>", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdGreaterThan(String value) {
            addCriterion("CQ_ID >", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdGreaterThanOrEqualTo(String value) {
            addCriterion("CQ_ID >=", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdLessThan(String value) {
            addCriterion("CQ_ID <", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdLessThanOrEqualTo(String value) {
            addCriterion("CQ_ID <=", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdLike(String value) {
            addCriterion("CQ_ID like", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdNotLike(String value) {
            addCriterion("CQ_ID not like", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdIn(List<String> values) {
            addCriterion("CQ_ID in", values, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdNotIn(List<String> values) {
            addCriterion("CQ_ID not in", values, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdBetween(String value1, String value2) {
            addCriterion("CQ_ID between", value1, value2, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdNotBetween(String value1, String value2) {
            addCriterion("CQ_ID not between", value1, value2, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqNoIsNull() {
            addCriterion("CQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andCqNoIsNotNull() {
            addCriterion("CQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCqNoEqualTo(Integer value) {
            addCriterion("CQ_NO =", value, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoNotEqualTo(Integer value) {
            addCriterion("CQ_NO <>", value, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoGreaterThan(Integer value) {
            addCriterion("CQ_NO >", value, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("CQ_NO >=", value, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoLessThan(Integer value) {
            addCriterion("CQ_NO <", value, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoLessThanOrEqualTo(Integer value) {
            addCriterion("CQ_NO <=", value, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoIn(List<Integer> values) {
            addCriterion("CQ_NO in", values, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoNotIn(List<Integer> values) {
            addCriterion("CQ_NO not in", values, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoBetween(Integer value1, Integer value2) {
            addCriterion("CQ_NO between", value1, value2, "cqNo");
            return (Criteria) this;
        }

        public Criteria andCqNoNotBetween(Integer value1, Integer value2) {
            addCriterion("CQ_NO not between", value1, value2, "cqNo");
            return (Criteria) this;
        }

        public Criteria andPrdDateIsNull() {
            addCriterion("PRD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrdDateIsNotNull() {
            addCriterion("PRD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrdDateEqualTo(String value) {
            addCriterion("PRD_DATE =", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateNotEqualTo(String value) {
            addCriterion("PRD_DATE <>", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateGreaterThan(String value) {
            addCriterion("PRD_DATE >", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_DATE >=", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateLessThan(String value) {
            addCriterion("PRD_DATE <", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateLessThanOrEqualTo(String value) {
            addCriterion("PRD_DATE <=", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateLike(String value) {
            addCriterion("PRD_DATE like", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateNotLike(String value) {
            addCriterion("PRD_DATE not like", value, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateIn(List<String> values) {
            addCriterion("PRD_DATE in", values, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateNotIn(List<String> values) {
            addCriterion("PRD_DATE not in", values, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateBetween(String value1, String value2) {
            addCriterion("PRD_DATE between", value1, value2, "prdDate");
            return (Criteria) this;
        }

        public Criteria andPrdDateNotBetween(String value1, String value2) {
            addCriterion("PRD_DATE not between", value1, value2, "prdDate");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNull() {
            addCriterion("APPLY_USER is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNotNull() {
            addCriterion("APPLY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEqualTo(String value) {
            addCriterion("APPLY_USER =", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotEqualTo(String value) {
            addCriterion("APPLY_USER <>", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThan(String value) {
            addCriterion("APPLY_USER >", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_USER >=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThan(String value) {
            addCriterion("APPLY_USER <", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThanOrEqualTo(String value) {
            addCriterion("APPLY_USER <=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLike(String value) {
            addCriterion("APPLY_USER like", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotLike(String value) {
            addCriterion("APPLY_USER not like", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserIn(List<String> values) {
            addCriterion("APPLY_USER in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotIn(List<String> values) {
            addCriterion("APPLY_USER not in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserBetween(String value1, String value2) {
            addCriterion("APPLY_USER between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotBetween(String value1, String value2) {
            addCriterion("APPLY_USER not between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(String value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(String value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(String value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(String value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLike(String value) {
            addCriterion("APPLY_DATE like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotLike(String value) {
            addCriterion("APPLY_DATE not like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<String> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<String> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(String value1, String value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(String value1, String value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIsNull() {
            addCriterion("SYSTEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIsNotNull() {
            addCriterion("SYSTEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemCodeEqualTo(String value) {
            addCriterion("SYSTEM_CODE =", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotEqualTo(String value) {
            addCriterion("SYSTEM_CODE <>", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThan(String value) {
            addCriterion("SYSTEM_CODE >", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_CODE >=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThan(String value) {
            addCriterion("SYSTEM_CODE <", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_CODE <=", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeLike(String value) {
            addCriterion("SYSTEM_CODE like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotLike(String value) {
            addCriterion("SYSTEM_CODE not like", value, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeIn(List<String> values) {
            addCriterion("SYSTEM_CODE in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotIn(List<String> values) {
            addCriterion("SYSTEM_CODE not in", values, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeBetween(String value1, String value2) {
            addCriterion("SYSTEM_CODE between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemCodeNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_CODE not between", value1, value2, "systemCode");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNull() {
            addCriterion("SYSTEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNotNull() {
            addCriterion("SYSTEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSystemNameEqualTo(String value) {
            addCriterion("SYSTEM_NAME =", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotEqualTo(String value) {
            addCriterion("SYSTEM_NAME <>", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThan(String value) {
            addCriterion("SYSTEM_NAME >", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_NAME >=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThan(String value) {
            addCriterion("SYSTEM_NAME <", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_NAME <=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLike(String value) {
            addCriterion("SYSTEM_NAME like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotLike(String value) {
            addCriterion("SYSTEM_NAME not like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameIn(List<String> values) {
            addCriterion("SYSTEM_NAME in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotIn(List<String> values) {
            addCriterion("SYSTEM_NAME not in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameBetween(String value1, String value2) {
            addCriterion("SYSTEM_NAME between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_NAME not between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("SYSTEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("SYSTEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(String value) {
            addCriterion("SYSTEM_TYPE =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(String value) {
            addCriterion("SYSTEM_TYPE <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(String value) {
            addCriterion("SYSTEM_TYPE >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TYPE >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(String value) {
            addCriterion("SYSTEM_TYPE <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TYPE <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLike(String value) {
            addCriterion("SYSTEM_TYPE like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotLike(String value) {
            addCriterion("SYSTEM_TYPE not like", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<String> values) {
            addCriterion("SYSTEM_TYPE in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<String> values) {
            addCriterion("SYSTEM_TYPE not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(String value1, String value2) {
            addCriterion("SYSTEM_TYPE between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_TYPE not between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("SERVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("SERVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("SERVICE_CODE =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("SERVICE_CODE <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("SERVICE_CODE >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("SERVICE_CODE <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("SERVICE_CODE like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("SERVICE_CODE not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("SERVICE_CODE in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("SERVICE_CODE not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNull() {
            addCriterion("ASSET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNotNull() {
            addCriterion("ASSET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeEqualTo(String value) {
            addCriterion("ASSET_TYPE =", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotEqualTo(String value) {
            addCriterion("ASSET_TYPE <>", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThan(String value) {
            addCriterion("ASSET_TYPE >", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSET_TYPE >=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThan(String value) {
            addCriterion("ASSET_TYPE <", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThanOrEqualTo(String value) {
            addCriterion("ASSET_TYPE <=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLike(String value) {
            addCriterion("ASSET_TYPE like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotLike(String value) {
            addCriterion("ASSET_TYPE not like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIn(List<String> values) {
            addCriterion("ASSET_TYPE in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotIn(List<String> values) {
            addCriterion("ASSET_TYPE not in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeBetween(String value1, String value2) {
            addCriterion("ASSET_TYPE between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotBetween(String value1, String value2) {
            addCriterion("ASSET_TYPE not between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("CHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("CHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("CHANGE_TYPE =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("CHANGE_TYPE <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("CHANGE_TYPE >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("CHANGE_TYPE <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("CHANGE_TYPE like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("CHANGE_TYPE not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("CHANGE_TYPE in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("CHANGE_TYPE not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeDescIsNull() {
            addCriterion("CHANGE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andChangeDescIsNotNull() {
            addCriterion("CHANGE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDescEqualTo(String value) {
            addCriterion("CHANGE_DESC =", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotEqualTo(String value) {
            addCriterion("CHANGE_DESC <>", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescGreaterThan(String value) {
            addCriterion("CHANGE_DESC >", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_DESC >=", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescLessThan(String value) {
            addCriterion("CHANGE_DESC <", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_DESC <=", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescLike(String value) {
            addCriterion("CHANGE_DESC like", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotLike(String value) {
            addCriterion("CHANGE_DESC not like", value, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescIn(List<String> values) {
            addCriterion("CHANGE_DESC in", values, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotIn(List<String> values) {
            addCriterion("CHANGE_DESC not in", values, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescBetween(String value1, String value2) {
            addCriterion("CHANGE_DESC between", value1, value2, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andChangeDescNotBetween(String value1, String value2) {
            addCriterion("CHANGE_DESC not between", value1, value2, "changeDesc");
            return (Criteria) this;
        }

        public Criteria andApiMasterIsNull() {
            addCriterion("API_MASTER is null");
            return (Criteria) this;
        }

        public Criteria andApiMasterIsNotNull() {
            addCriterion("API_MASTER is not null");
            return (Criteria) this;
        }

        public Criteria andApiMasterEqualTo(Integer value) {
            addCriterion("API_MASTER =", value, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterNotEqualTo(Integer value) {
            addCriterion("API_MASTER <>", value, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterGreaterThan(Integer value) {
            addCriterion("API_MASTER >", value, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("API_MASTER >=", value, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterLessThan(Integer value) {
            addCriterion("API_MASTER <", value, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterLessThanOrEqualTo(Integer value) {
            addCriterion("API_MASTER <=", value, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterIn(List<Integer> values) {
            addCriterion("API_MASTER in", values, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterNotIn(List<Integer> values) {
            addCriterion("API_MASTER not in", values, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterBetween(Integer value1, Integer value2) {
            addCriterion("API_MASTER between", value1, value2, "apiMaster");
            return (Criteria) this;
        }

        public Criteria andApiMasterNotBetween(Integer value1, Integer value2) {
            addCriterion("API_MASTER not between", value1, value2, "apiMaster");
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

        public Criteria andReqSystemCodeIsNull() {
            addCriterion("REQ_SYSTEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeIsNotNull() {
            addCriterion("REQ_SYSTEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeEqualTo(String value) {
            addCriterion("REQ_SYSTEM_CODE =", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeNotEqualTo(String value) {
            addCriterion("REQ_SYSTEM_CODE <>", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeGreaterThan(String value) {
            addCriterion("REQ_SYSTEM_CODE >", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SYSTEM_CODE >=", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeLessThan(String value) {
            addCriterion("REQ_SYSTEM_CODE <", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeLessThanOrEqualTo(String value) {
            addCriterion("REQ_SYSTEM_CODE <=", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeLike(String value) {
            addCriterion("REQ_SYSTEM_CODE like", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeNotLike(String value) {
            addCriterion("REQ_SYSTEM_CODE not like", value, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeIn(List<String> values) {
            addCriterion("REQ_SYSTEM_CODE in", values, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeNotIn(List<String> values) {
            addCriterion("REQ_SYSTEM_CODE not in", values, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeBetween(String value1, String value2) {
            addCriterion("REQ_SYSTEM_CODE between", value1, value2, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemCodeNotBetween(String value1, String value2) {
            addCriterion("REQ_SYSTEM_CODE not between", value1, value2, "reqSystemCode");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameIsNull() {
            addCriterion("REQ_SYSTEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameIsNotNull() {
            addCriterion("REQ_SYSTEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameEqualTo(String value) {
            addCriterion("REQ_SYSTEM_NAME =", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameNotEqualTo(String value) {
            addCriterion("REQ_SYSTEM_NAME <>", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameGreaterThan(String value) {
            addCriterion("REQ_SYSTEM_NAME >", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SYSTEM_NAME >=", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameLessThan(String value) {
            addCriterion("REQ_SYSTEM_NAME <", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameLessThanOrEqualTo(String value) {
            addCriterion("REQ_SYSTEM_NAME <=", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameLike(String value) {
            addCriterion("REQ_SYSTEM_NAME like", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameNotLike(String value) {
            addCriterion("REQ_SYSTEM_NAME not like", value, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameIn(List<String> values) {
            addCriterion("REQ_SYSTEM_NAME in", values, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameNotIn(List<String> values) {
            addCriterion("REQ_SYSTEM_NAME not in", values, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameBetween(String value1, String value2) {
            addCriterion("REQ_SYSTEM_NAME between", value1, value2, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemNameNotBetween(String value1, String value2) {
            addCriterion("REQ_SYSTEM_NAME not between", value1, value2, "reqSystemName");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeIsNull() {
            addCriterion("REQ_SYSTEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeIsNotNull() {
            addCriterion("REQ_SYSTEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeEqualTo(String value) {
            addCriterion("REQ_SYSTEM_TYPE =", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeNotEqualTo(String value) {
            addCriterion("REQ_SYSTEM_TYPE <>", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeGreaterThan(String value) {
            addCriterion("REQ_SYSTEM_TYPE >", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SYSTEM_TYPE >=", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeLessThan(String value) {
            addCriterion("REQ_SYSTEM_TYPE <", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeLessThanOrEqualTo(String value) {
            addCriterion("REQ_SYSTEM_TYPE <=", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeLike(String value) {
            addCriterion("REQ_SYSTEM_TYPE like", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeNotLike(String value) {
            addCriterion("REQ_SYSTEM_TYPE not like", value, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeIn(List<String> values) {
            addCriterion("REQ_SYSTEM_TYPE in", values, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeNotIn(List<String> values) {
            addCriterion("REQ_SYSTEM_TYPE not in", values, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeBetween(String value1, String value2) {
            addCriterion("REQ_SYSTEM_TYPE between", value1, value2, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqSystemTypeNotBetween(String value1, String value2) {
            addCriterion("REQ_SYSTEM_TYPE not between", value1, value2, "reqSystemType");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeIsNull() {
            addCriterion("REQ_SERVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeIsNotNull() {
            addCriterion("REQ_SERVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeEqualTo(String value) {
            addCriterion("REQ_SERVICE_CODE =", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeNotEqualTo(String value) {
            addCriterion("REQ_SERVICE_CODE <>", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeGreaterThan(String value) {
            addCriterion("REQ_SERVICE_CODE >", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SERVICE_CODE >=", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeLessThan(String value) {
            addCriterion("REQ_SERVICE_CODE <", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("REQ_SERVICE_CODE <=", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeLike(String value) {
            addCriterion("REQ_SERVICE_CODE like", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeNotLike(String value) {
            addCriterion("REQ_SERVICE_CODE not like", value, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeIn(List<String> values) {
            addCriterion("REQ_SERVICE_CODE in", values, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeNotIn(List<String> values) {
            addCriterion("REQ_SERVICE_CODE not in", values, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeBetween(String value1, String value2) {
            addCriterion("REQ_SERVICE_CODE between", value1, value2, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceCodeNotBetween(String value1, String value2) {
            addCriterion("REQ_SERVICE_CODE not between", value1, value2, "reqServiceCode");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameIsNull() {
            addCriterion("REQ_SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameIsNotNull() {
            addCriterion("REQ_SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameEqualTo(String value) {
            addCriterion("REQ_SERVICE_NAME =", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameNotEqualTo(String value) {
            addCriterion("REQ_SERVICE_NAME <>", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameGreaterThan(String value) {
            addCriterion("REQ_SERVICE_NAME >", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SERVICE_NAME >=", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameLessThan(String value) {
            addCriterion("REQ_SERVICE_NAME <", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameLessThanOrEqualTo(String value) {
            addCriterion("REQ_SERVICE_NAME <=", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameLike(String value) {
            addCriterion("REQ_SERVICE_NAME like", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameNotLike(String value) {
            addCriterion("REQ_SERVICE_NAME not like", value, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameIn(List<String> values) {
            addCriterion("REQ_SERVICE_NAME in", values, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameNotIn(List<String> values) {
            addCriterion("REQ_SERVICE_NAME not in", values, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameBetween(String value1, String value2) {
            addCriterion("REQ_SERVICE_NAME between", value1, value2, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andReqServiceNameNotBetween(String value1, String value2) {
            addCriterion("REQ_SERVICE_NAME not between", value1, value2, "reqServiceName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andApiCodeIsNull() {
            addCriterion("API_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApiCodeIsNotNull() {
            addCriterion("API_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApiCodeEqualTo(String value) {
            addCriterion("API_CODE =", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotEqualTo(String value) {
            addCriterion("API_CODE <>", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeGreaterThan(String value) {
            addCriterion("API_CODE >", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("API_CODE >=", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeLessThan(String value) {
            addCriterion("API_CODE <", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeLessThanOrEqualTo(String value) {
            addCriterion("API_CODE <=", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeLike(String value) {
            addCriterion("API_CODE like", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotLike(String value) {
            addCriterion("API_CODE not like", value, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeIn(List<String> values) {
            addCriterion("API_CODE in", values, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotIn(List<String> values) {
            addCriterion("API_CODE not in", values, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeBetween(String value1, String value2) {
            addCriterion("API_CODE between", value1, value2, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiCodeNotBetween(String value1, String value2) {
            addCriterion("API_CODE not between", value1, value2, "apiCode");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNull() {
            addCriterion("API_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApiNameIsNotNull() {
            addCriterion("API_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApiNameEqualTo(String value) {
            addCriterion("API_NAME =", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotEqualTo(String value) {
            addCriterion("API_NAME <>", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThan(String value) {
            addCriterion("API_NAME >", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameGreaterThanOrEqualTo(String value) {
            addCriterion("API_NAME >=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThan(String value) {
            addCriterion("API_NAME <", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLessThanOrEqualTo(String value) {
            addCriterion("API_NAME <=", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameLike(String value) {
            addCriterion("API_NAME like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotLike(String value) {
            addCriterion("API_NAME not like", value, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameIn(List<String> values) {
            addCriterion("API_NAME in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotIn(List<String> values) {
            addCriterion("API_NAME not in", values, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameBetween(String value1, String value2) {
            addCriterion("API_NAME between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiNameNotBetween(String value1, String value2) {
            addCriterion("API_NAME not between", value1, value2, "apiName");
            return (Criteria) this;
        }

        public Criteria andApiDescIsNull() {
            addCriterion("API_DESC is null");
            return (Criteria) this;
        }

        public Criteria andApiDescIsNotNull() {
            addCriterion("API_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andApiDescEqualTo(String value) {
            addCriterion("API_DESC =", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotEqualTo(String value) {
            addCriterion("API_DESC <>", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescGreaterThan(String value) {
            addCriterion("API_DESC >", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescGreaterThanOrEqualTo(String value) {
            addCriterion("API_DESC >=", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLessThan(String value) {
            addCriterion("API_DESC <", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLessThanOrEqualTo(String value) {
            addCriterion("API_DESC <=", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescLike(String value) {
            addCriterion("API_DESC like", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotLike(String value) {
            addCriterion("API_DESC not like", value, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescIn(List<String> values) {
            addCriterion("API_DESC in", values, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotIn(List<String> values) {
            addCriterion("API_DESC not in", values, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescBetween(String value1, String value2) {
            addCriterion("API_DESC between", value1, value2, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiDescNotBetween(String value1, String value2) {
            addCriterion("API_DESC not between", value1, value2, "apiDesc");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNull() {
            addCriterion("API_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApiTypeIsNotNull() {
            addCriterion("API_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApiTypeEqualTo(String value) {
            addCriterion("API_TYPE =", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotEqualTo(String value) {
            addCriterion("API_TYPE <>", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThan(String value) {
            addCriterion("API_TYPE >", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("API_TYPE >=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThan(String value) {
            addCriterion("API_TYPE <", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLessThanOrEqualTo(String value) {
            addCriterion("API_TYPE <=", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeLike(String value) {
            addCriterion("API_TYPE like", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotLike(String value) {
            addCriterion("API_TYPE not like", value, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeIn(List<String> values) {
            addCriterion("API_TYPE in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotIn(List<String> values) {
            addCriterion("API_TYPE not in", values, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeBetween(String value1, String value2) {
            addCriterion("API_TYPE between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiTypeNotBetween(String value1, String value2) {
            addCriterion("API_TYPE not between", value1, value2, "apiType");
            return (Criteria) this;
        }

        public Criteria andApiNatureIsNull() {
            addCriterion("API_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andApiNatureIsNotNull() {
            addCriterion("API_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andApiNatureEqualTo(String value) {
            addCriterion("API_NATURE =", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureNotEqualTo(String value) {
            addCriterion("API_NATURE <>", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureGreaterThan(String value) {
            addCriterion("API_NATURE >", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureGreaterThanOrEqualTo(String value) {
            addCriterion("API_NATURE >=", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureLessThan(String value) {
            addCriterion("API_NATURE <", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureLessThanOrEqualTo(String value) {
            addCriterion("API_NATURE <=", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureLike(String value) {
            addCriterion("API_NATURE like", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureNotLike(String value) {
            addCriterion("API_NATURE not like", value, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureIn(List<String> values) {
            addCriterion("API_NATURE in", values, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureNotIn(List<String> values) {
            addCriterion("API_NATURE not in", values, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureBetween(String value1, String value2) {
            addCriterion("API_NATURE between", value1, value2, "apiNature");
            return (Criteria) this;
        }

        public Criteria andApiNatureNotBetween(String value1, String value2) {
            addCriterion("API_NATURE not between", value1, value2, "apiNature");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("FILE_URL is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("FILE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("FILE_URL =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("FILE_URL <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("FILE_URL >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_URL >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("FILE_URL <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("FILE_URL <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("FILE_URL like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("FILE_URL not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("FILE_URL in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("FILE_URL not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("FILE_URL between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("FILE_URL not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateIsNull() {
            addCriterion("SCHEMA_FINISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateIsNotNull() {
            addCriterion("SCHEMA_FINISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateEqualTo(String value) {
            addCriterion("SCHEMA_FINISH_DATE =", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateNotEqualTo(String value) {
            addCriterion("SCHEMA_FINISH_DATE <>", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateGreaterThan(String value) {
            addCriterion("SCHEMA_FINISH_DATE >", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEMA_FINISH_DATE >=", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateLessThan(String value) {
            addCriterion("SCHEMA_FINISH_DATE <", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateLessThanOrEqualTo(String value) {
            addCriterion("SCHEMA_FINISH_DATE <=", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateLike(String value) {
            addCriterion("SCHEMA_FINISH_DATE like", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateNotLike(String value) {
            addCriterion("SCHEMA_FINISH_DATE not like", value, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateIn(List<String> values) {
            addCriterion("SCHEMA_FINISH_DATE in", values, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateNotIn(List<String> values) {
            addCriterion("SCHEMA_FINISH_DATE not in", values, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateBetween(String value1, String value2) {
            addCriterion("SCHEMA_FINISH_DATE between", value1, value2, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andSchemaFinishDateNotBetween(String value1, String value2) {
            addCriterion("SCHEMA_FINISH_DATE not between", value1, value2, "schemaFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateIsNull() {
            addCriterion("ACTUAL_FINISH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateIsNotNull() {
            addCriterion("ACTUAL_FINISH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateEqualTo(String value) {
            addCriterion("ACTUAL_FINISH_DATE =", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateNotEqualTo(String value) {
            addCriterion("ACTUAL_FINISH_DATE <>", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateGreaterThan(String value) {
            addCriterion("ACTUAL_FINISH_DATE >", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUAL_FINISH_DATE >=", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateLessThan(String value) {
            addCriterion("ACTUAL_FINISH_DATE <", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateLessThanOrEqualTo(String value) {
            addCriterion("ACTUAL_FINISH_DATE <=", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateLike(String value) {
            addCriterion("ACTUAL_FINISH_DATE like", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateNotLike(String value) {
            addCriterion("ACTUAL_FINISH_DATE not like", value, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateIn(List<String> values) {
            addCriterion("ACTUAL_FINISH_DATE in", values, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateNotIn(List<String> values) {
            addCriterion("ACTUAL_FINISH_DATE not in", values, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateBetween(String value1, String value2) {
            addCriterion("ACTUAL_FINISH_DATE between", value1, value2, "actualFinishDate");
            return (Criteria) this;
        }

        public Criteria andActualFinishDateNotBetween(String value1, String value2) {
            addCriterion("ACTUAL_FINISH_DATE not between", value1, value2, "actualFinishDate");
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