package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasMethodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasMethodExample() {
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

        public Criteria andMethodIdIsNull() {
            addCriterion("METHOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andMethodIdIsNotNull() {
            addCriterion("METHOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMethodIdEqualTo(Integer value) {
            addCriterion("METHOD_ID =", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotEqualTo(Integer value) {
            addCriterion("METHOD_ID <>", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdGreaterThan(Integer value) {
            addCriterion("METHOD_ID >", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("METHOD_ID >=", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdLessThan(Integer value) {
            addCriterion("METHOD_ID <", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("METHOD_ID <=", value, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdIn(List<Integer> values) {
            addCriterion("METHOD_ID in", values, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotIn(List<Integer> values) {
            addCriterion("METHOD_ID not in", values, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("METHOD_ID between", value1, value2, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("METHOD_ID not between", value1, value2, "methodId");
            return (Criteria) this;
        }

        public Criteria andMethodCodeIsNull() {
            addCriterion("METHOD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMethodCodeIsNotNull() {
            addCriterion("METHOD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMethodCodeEqualTo(String value) {
            addCriterion("METHOD_CODE =", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeNotEqualTo(String value) {
            addCriterion("METHOD_CODE <>", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeGreaterThan(String value) {
            addCriterion("METHOD_CODE >", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_CODE >=", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeLessThan(String value) {
            addCriterion("METHOD_CODE <", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeLessThanOrEqualTo(String value) {
            addCriterion("METHOD_CODE <=", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeLike(String value) {
            addCriterion("METHOD_CODE like", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeNotLike(String value) {
            addCriterion("METHOD_CODE not like", value, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeIn(List<String> values) {
            addCriterion("METHOD_CODE in", values, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeNotIn(List<String> values) {
            addCriterion("METHOD_CODE not in", values, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeBetween(String value1, String value2) {
            addCriterion("METHOD_CODE between", value1, value2, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodCodeNotBetween(String value1, String value2) {
            addCriterion("METHOD_CODE not between", value1, value2, "methodCode");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("METHOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("METHOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("METHOD_NAME =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("METHOD_NAME <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("METHOD_NAME >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("METHOD_NAME <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("METHOD_NAME <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("METHOD_NAME like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("METHOD_NAME not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("METHOD_NAME in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("METHOD_NAME not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("METHOD_NAME between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("METHOD_NAME not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andParamCountIsNull() {
            addCriterion("PARAM_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andParamCountIsNotNull() {
            addCriterion("PARAM_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andParamCountEqualTo(String value) {
            addCriterion("PARAM_COUNT =", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountNotEqualTo(String value) {
            addCriterion("PARAM_COUNT <>", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountGreaterThan(String value) {
            addCriterion("PARAM_COUNT >", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_COUNT >=", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountLessThan(String value) {
            addCriterion("PARAM_COUNT <", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountLessThanOrEqualTo(String value) {
            addCriterion("PARAM_COUNT <=", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountLike(String value) {
            addCriterion("PARAM_COUNT like", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountNotLike(String value) {
            addCriterion("PARAM_COUNT not like", value, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountIn(List<String> values) {
            addCriterion("PARAM_COUNT in", values, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountNotIn(List<String> values) {
            addCriterion("PARAM_COUNT not in", values, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountBetween(String value1, String value2) {
            addCriterion("PARAM_COUNT between", value1, value2, "paramCount");
            return (Criteria) this;
        }

        public Criteria andParamCountNotBetween(String value1, String value2) {
            addCriterion("PARAM_COUNT not between", value1, value2, "paramCount");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIsNull() {
            addCriterion("METHOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIsNotNull() {
            addCriterion("METHOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMethodTypeEqualTo(String value) {
            addCriterion("METHOD_TYPE =", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotEqualTo(String value) {
            addCriterion("METHOD_TYPE <>", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThan(String value) {
            addCriterion("METHOD_TYPE >", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_TYPE >=", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThan(String value) {
            addCriterion("METHOD_TYPE <", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThanOrEqualTo(String value) {
            addCriterion("METHOD_TYPE <=", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLike(String value) {
            addCriterion("METHOD_TYPE like", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotLike(String value) {
            addCriterion("METHOD_TYPE not like", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIn(List<String> values) {
            addCriterion("METHOD_TYPE in", values, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotIn(List<String> values) {
            addCriterion("METHOD_TYPE not in", values, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeBetween(String value1, String value2) {
            addCriterion("METHOD_TYPE between", value1, value2, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotBetween(String value1, String value2) {
            addCriterion("METHOD_TYPE not between", value1, value2, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodStausIsNull() {
            addCriterion("METHOD_STAUS is null");
            return (Criteria) this;
        }

        public Criteria andMethodStausIsNotNull() {
            addCriterion("METHOD_STAUS is not null");
            return (Criteria) this;
        }

        public Criteria andMethodStausEqualTo(String value) {
            addCriterion("METHOD_STAUS =", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausNotEqualTo(String value) {
            addCriterion("METHOD_STAUS <>", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausGreaterThan(String value) {
            addCriterion("METHOD_STAUS >", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_STAUS >=", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausLessThan(String value) {
            addCriterion("METHOD_STAUS <", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausLessThanOrEqualTo(String value) {
            addCriterion("METHOD_STAUS <=", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausLike(String value) {
            addCriterion("METHOD_STAUS like", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausNotLike(String value) {
            addCriterion("METHOD_STAUS not like", value, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausIn(List<String> values) {
            addCriterion("METHOD_STAUS in", values, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausNotIn(List<String> values) {
            addCriterion("METHOD_STAUS not in", values, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausBetween(String value1, String value2) {
            addCriterion("METHOD_STAUS between", value1, value2, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodStausNotBetween(String value1, String value2) {
            addCriterion("METHOD_STAUS not between", value1, value2, "methodStaus");
            return (Criteria) this;
        }

        public Criteria andMethodDescIsNull() {
            addCriterion("METHOD_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMethodDescIsNotNull() {
            addCriterion("METHOD_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMethodDescEqualTo(String value) {
            addCriterion("METHOD_DESC =", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotEqualTo(String value) {
            addCriterion("METHOD_DESC <>", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescGreaterThan(String value) {
            addCriterion("METHOD_DESC >", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescGreaterThanOrEqualTo(String value) {
            addCriterion("METHOD_DESC >=", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescLessThan(String value) {
            addCriterion("METHOD_DESC <", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescLessThanOrEqualTo(String value) {
            addCriterion("METHOD_DESC <=", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescLike(String value) {
            addCriterion("METHOD_DESC like", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotLike(String value) {
            addCriterion("METHOD_DESC not like", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescIn(List<String> values) {
            addCriterion("METHOD_DESC in", values, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotIn(List<String> values) {
            addCriterion("METHOD_DESC not in", values, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescBetween(String value1, String value2) {
            addCriterion("METHOD_DESC between", value1, value2, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotBetween(String value1, String value2) {
            addCriterion("METHOD_DESC not between", value1, value2, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescIsNull() {
            addCriterion("PARAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andParamDescIsNotNull() {
            addCriterion("PARAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andParamDescEqualTo(String value) {
            addCriterion("PARAM_DESC =", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotEqualTo(String value) {
            addCriterion("PARAM_DESC <>", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescGreaterThan(String value) {
            addCriterion("PARAM_DESC >", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_DESC >=", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLessThan(String value) {
            addCriterion("PARAM_DESC <", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLessThanOrEqualTo(String value) {
            addCriterion("PARAM_DESC <=", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescLike(String value) {
            addCriterion("PARAM_DESC like", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotLike(String value) {
            addCriterion("PARAM_DESC not like", value, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescIn(List<String> values) {
            addCriterion("PARAM_DESC in", values, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotIn(List<String> values) {
            addCriterion("PARAM_DESC not in", values, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescBetween(String value1, String value2) {
            addCriterion("PARAM_DESC between", value1, value2, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andParamDescNotBetween(String value1, String value2) {
            addCriterion("PARAM_DESC not between", value1, value2, "paramDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescIsNull() {
            addCriterion("EXAMPLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andExampleDescIsNotNull() {
            addCriterion("EXAMPLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andExampleDescEqualTo(String value) {
            addCriterion("EXAMPLE_DESC =", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescNotEqualTo(String value) {
            addCriterion("EXAMPLE_DESC <>", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescGreaterThan(String value) {
            addCriterion("EXAMPLE_DESC >", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMPLE_DESC >=", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescLessThan(String value) {
            addCriterion("EXAMPLE_DESC <", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescLessThanOrEqualTo(String value) {
            addCriterion("EXAMPLE_DESC <=", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescLike(String value) {
            addCriterion("EXAMPLE_DESC like", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescNotLike(String value) {
            addCriterion("EXAMPLE_DESC not like", value, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescIn(List<String> values) {
            addCriterion("EXAMPLE_DESC in", values, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescNotIn(List<String> values) {
            addCriterion("EXAMPLE_DESC not in", values, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescBetween(String value1, String value2) {
            addCriterion("EXAMPLE_DESC between", value1, value2, "exampleDesc");
            return (Criteria) this;
        }

        public Criteria andExampleDescNotBetween(String value1, String value2) {
            addCriterion("EXAMPLE_DESC not between", value1, value2, "exampleDesc");
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