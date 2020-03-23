package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataSubTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataSubTaskExample() {
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

        public Criteria andSubTaskTypeIsNull() {
            addCriterion("SUB_TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeIsNotNull() {
            addCriterion("SUB_TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeEqualTo(String value) {
            addCriterion("SUB_TASK_TYPE =", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeNotEqualTo(String value) {
            addCriterion("SUB_TASK_TYPE <>", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeGreaterThan(String value) {
            addCriterion("SUB_TASK_TYPE >", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_TASK_TYPE >=", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeLessThan(String value) {
            addCriterion("SUB_TASK_TYPE <", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("SUB_TASK_TYPE <=", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeLike(String value) {
            addCriterion("SUB_TASK_TYPE like", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeNotLike(String value) {
            addCriterion("SUB_TASK_TYPE not like", value, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeIn(List<String> values) {
            addCriterion("SUB_TASK_TYPE in", values, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeNotIn(List<String> values) {
            addCriterion("SUB_TASK_TYPE not in", values, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeBetween(String value1, String value2) {
            addCriterion("SUB_TASK_TYPE between", value1, value2, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andSubTaskTypeNotBetween(String value1, String value2) {
            addCriterion("SUB_TASK_TYPE not between", value1, value2, "subTaskType");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNull() {
            addCriterion("BUSINESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("BUSINESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("BUSINESS_ID =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("BUSINESS_ID <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("BUSINESS_ID >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_ID >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("BUSINESS_ID <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_ID <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("BUSINESS_ID in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("BUSINESS_ID not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_ID between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_ID not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("PRODUCT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("PRODUCT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(String value) {
            addCriterion("PRODUCT_STATUS =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(String value) {
            addCriterion("PRODUCT_STATUS <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(String value) {
            addCriterion("PRODUCT_STATUS >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STATUS >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(String value) {
            addCriterion("PRODUCT_STATUS <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_STATUS <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLike(String value) {
            addCriterion("PRODUCT_STATUS like", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotLike(String value) {
            addCriterion("PRODUCT_STATUS not like", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<String> values) {
            addCriterion("PRODUCT_STATUS in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<String> values) {
            addCriterion("PRODUCT_STATUS not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(String value1, String value2) {
            addCriterion("PRODUCT_STATUS between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_STATUS not between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusIsNull() {
            addCriterion("TASK_CURRENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusIsNotNull() {
            addCriterion("TASK_CURRENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusEqualTo(String value) {
            addCriterion("TASK_CURRENT_STATUS =", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusNotEqualTo(String value) {
            addCriterion("TASK_CURRENT_STATUS <>", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusGreaterThan(String value) {
            addCriterion("TASK_CURRENT_STATUS >", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CURRENT_STATUS >=", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusLessThan(String value) {
            addCriterion("TASK_CURRENT_STATUS <", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("TASK_CURRENT_STATUS <=", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusLike(String value) {
            addCriterion("TASK_CURRENT_STATUS like", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusNotLike(String value) {
            addCriterion("TASK_CURRENT_STATUS not like", value, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusIn(List<String> values) {
            addCriterion("TASK_CURRENT_STATUS in", values, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusNotIn(List<String> values) {
            addCriterion("TASK_CURRENT_STATUS not in", values, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusBetween(String value1, String value2) {
            addCriterion("TASK_CURRENT_STATUS between", value1, value2, "taskCurrentStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("TASK_CURRENT_STATUS not between", value1, value2, "taskCurrentStatus");
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

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
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