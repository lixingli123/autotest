package autotest.com.bocom.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasApiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasApiExample() {
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

        public Criteria andApiKeyIsNull() {
            addCriterion("API_KEY is null");
            return (Criteria) this;
        }

        public Criteria andApiKeyIsNotNull() {
            addCriterion("API_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andApiKeyEqualTo(Integer value) {
            addCriterion("API_KEY =", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyNotEqualTo(Integer value) {
            addCriterion("API_KEY <>", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyGreaterThan(Integer value) {
            addCriterion("API_KEY >", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("API_KEY >=", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyLessThan(Integer value) {
            addCriterion("API_KEY <", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyLessThanOrEqualTo(Integer value) {
            addCriterion("API_KEY <=", value, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyIn(List<Integer> values) {
            addCriterion("API_KEY in", values, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyNotIn(List<Integer> values) {
            addCriterion("API_KEY not in", values, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyBetween(Integer value1, Integer value2) {
            addCriterion("API_KEY between", value1, value2, "apiKey");
            return (Criteria) this;
        }

        public Criteria andApiKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("API_KEY not between", value1, value2, "apiKey");
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

        public Criteria andSystemIdIsNull() {
            addCriterion("SYSTEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("SYSTEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(Integer value) {
            addCriterion("SYSTEM_ID =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(Integer value) {
            addCriterion("SYSTEM_ID <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(Integer value) {
            addCriterion("SYSTEM_ID >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYSTEM_ID >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(Integer value) {
            addCriterion("SYSTEM_ID <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("SYSTEM_ID <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<Integer> values) {
            addCriterion("SYSTEM_ID in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<Integer> values) {
            addCriterion("SYSTEM_ID not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("SYSTEM_ID between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SYSTEM_ID not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("SERVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("SERVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Integer value) {
            addCriterion("SERVICE_ID =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Integer value) {
            addCriterion("SERVICE_ID <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Integer value) {
            addCriterion("SERVICE_ID >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_ID >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Integer value) {
            addCriterion("SERVICE_ID <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_ID <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Integer> values) {
            addCriterion("SERVICE_ID in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Integer> values) {
            addCriterion("SERVICE_ID not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_ID between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_ID not between", value1, value2, "serviceId");
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

        public Criteria andApiTesterIsNull() {
            addCriterion("API_TESTER is null");
            return (Criteria) this;
        }

        public Criteria andApiTesterIsNotNull() {
            addCriterion("API_TESTER is not null");
            return (Criteria) this;
        }

        public Criteria andApiTesterEqualTo(Integer value) {
            addCriterion("API_TESTER =", value, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterNotEqualTo(Integer value) {
            addCriterion("API_TESTER <>", value, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterGreaterThan(Integer value) {
            addCriterion("API_TESTER >", value, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterGreaterThanOrEqualTo(Integer value) {
            addCriterion("API_TESTER >=", value, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterLessThan(Integer value) {
            addCriterion("API_TESTER <", value, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterLessThanOrEqualTo(Integer value) {
            addCriterion("API_TESTER <=", value, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterIn(List<Integer> values) {
            addCriterion("API_TESTER in", values, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterNotIn(List<Integer> values) {
            addCriterion("API_TESTER not in", values, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterBetween(Integer value1, Integer value2) {
            addCriterion("API_TESTER between", value1, value2, "apiTester");
            return (Criteria) this;
        }

        public Criteria andApiTesterNotBetween(Integer value1, Integer value2) {
            addCriterion("API_TESTER not between", value1, value2, "apiTester");
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

        public Criteria andApiVersionIsNull() {
            addCriterion("API_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andApiVersionIsNotNull() {
            addCriterion("API_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andApiVersionEqualTo(BigDecimal value) {
            addCriterion("API_VERSION =", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotEqualTo(BigDecimal value) {
            addCriterion("API_VERSION <>", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionGreaterThan(BigDecimal value) {
            addCriterion("API_VERSION >", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("API_VERSION >=", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLessThan(BigDecimal value) {
            addCriterion("API_VERSION <", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("API_VERSION <=", value, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionIn(List<BigDecimal> values) {
            addCriterion("API_VERSION in", values, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotIn(List<BigDecimal> values) {
            addCriterion("API_VERSION not in", values, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("API_VERSION between", value1, value2, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("API_VERSION not between", value1, value2, "apiVersion");
            return (Criteria) this;
        }

        public Criteria andApiActivedIsNull() {
            addCriterion("API_ACTIVED is null");
            return (Criteria) this;
        }

        public Criteria andApiActivedIsNotNull() {
            addCriterion("API_ACTIVED is not null");
            return (Criteria) this;
        }

        public Criteria andApiActivedEqualTo(String value) {
            addCriterion("API_ACTIVED =", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedNotEqualTo(String value) {
            addCriterion("API_ACTIVED <>", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedGreaterThan(String value) {
            addCriterion("API_ACTIVED >", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedGreaterThanOrEqualTo(String value) {
            addCriterion("API_ACTIVED >=", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedLessThan(String value) {
            addCriterion("API_ACTIVED <", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedLessThanOrEqualTo(String value) {
            addCriterion("API_ACTIVED <=", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedLike(String value) {
            addCriterion("API_ACTIVED like", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedNotLike(String value) {
            addCriterion("API_ACTIVED not like", value, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedIn(List<String> values) {
            addCriterion("API_ACTIVED in", values, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedNotIn(List<String> values) {
            addCriterion("API_ACTIVED not in", values, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedBetween(String value1, String value2) {
            addCriterion("API_ACTIVED between", value1, value2, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiActivedNotBetween(String value1, String value2) {
            addCriterion("API_ACTIVED not between", value1, value2, "apiActived");
            return (Criteria) this;
        }

        public Criteria andApiFlagIsNull() {
            addCriterion("API_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andApiFlagIsNotNull() {
            addCriterion("API_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andApiFlagEqualTo(String value) {
            addCriterion("API_FLAG =", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagNotEqualTo(String value) {
            addCriterion("API_FLAG <>", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagGreaterThan(String value) {
            addCriterion("API_FLAG >", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagGreaterThanOrEqualTo(String value) {
            addCriterion("API_FLAG >=", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagLessThan(String value) {
            addCriterion("API_FLAG <", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagLessThanOrEqualTo(String value) {
            addCriterion("API_FLAG <=", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagLike(String value) {
            addCriterion("API_FLAG like", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagNotLike(String value) {
            addCriterion("API_FLAG not like", value, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagIn(List<String> values) {
            addCriterion("API_FLAG in", values, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagNotIn(List<String> values) {
            addCriterion("API_FLAG not in", values, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagBetween(String value1, String value2) {
            addCriterion("API_FLAG between", value1, value2, "apiFlag");
            return (Criteria) this;
        }

        public Criteria andApiFlagNotBetween(String value1, String value2) {
            addCriterion("API_FLAG not between", value1, value2, "apiFlag");
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

        public Criteria andApiBasedIsNull() {
            addCriterion("API_BASED is null");
            return (Criteria) this;
        }

        public Criteria andApiBasedIsNotNull() {
            addCriterion("API_BASED is not null");
            return (Criteria) this;
        }

        public Criteria andApiBasedEqualTo(Integer value) {
            addCriterion("API_BASED =", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedNotEqualTo(Integer value) {
            addCriterion("API_BASED <>", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedGreaterThan(Integer value) {
            addCriterion("API_BASED >", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedGreaterThanOrEqualTo(Integer value) {
            addCriterion("API_BASED >=", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedLessThan(Integer value) {
            addCriterion("API_BASED <", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedLessThanOrEqualTo(Integer value) {
            addCriterion("API_BASED <=", value, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedIn(List<Integer> values) {
            addCriterion("API_BASED in", values, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedNotIn(List<Integer> values) {
            addCriterion("API_BASED not in", values, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedBetween(Integer value1, Integer value2) {
            addCriterion("API_BASED between", value1, value2, "apiBased");
            return (Criteria) this;
        }

        public Criteria andApiBasedNotBetween(Integer value1, Integer value2) {
            addCriterion("API_BASED not between", value1, value2, "apiBased");
            return (Criteria) this;
        }

        public Criteria andChangeVersionIsNull() {
            addCriterion("CHANGE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andChangeVersionIsNotNull() {
            addCriterion("CHANGE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andChangeVersionEqualTo(String value) {
            addCriterion("CHANGE_VERSION =", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionNotEqualTo(String value) {
            addCriterion("CHANGE_VERSION <>", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionGreaterThan(String value) {
            addCriterion("CHANGE_VERSION >", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_VERSION >=", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionLessThan(String value) {
            addCriterion("CHANGE_VERSION <", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_VERSION <=", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionLike(String value) {
            addCriterion("CHANGE_VERSION like", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionNotLike(String value) {
            addCriterion("CHANGE_VERSION not like", value, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionIn(List<String> values) {
            addCriterion("CHANGE_VERSION in", values, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionNotIn(List<String> values) {
            addCriterion("CHANGE_VERSION not in", values, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionBetween(String value1, String value2) {
            addCriterion("CHANGE_VERSION between", value1, value2, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andChangeVersionNotBetween(String value1, String value2) {
            addCriterion("CHANGE_VERSION not between", value1, value2, "changeVersion");
            return (Criteria) this;
        }

        public Criteria andApiStatusIsNull() {
            addCriterion("API_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andApiStatusIsNotNull() {
            addCriterion("API_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApiStatusEqualTo(String value) {
            addCriterion("API_STATUS =", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotEqualTo(String value) {
            addCriterion("API_STATUS <>", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusGreaterThan(String value) {
            addCriterion("API_STATUS >", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusGreaterThanOrEqualTo(String value) {
            addCriterion("API_STATUS >=", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLessThan(String value) {
            addCriterion("API_STATUS <", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLessThanOrEqualTo(String value) {
            addCriterion("API_STATUS <=", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusLike(String value) {
            addCriterion("API_STATUS like", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotLike(String value) {
            addCriterion("API_STATUS not like", value, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusIn(List<String> values) {
            addCriterion("API_STATUS in", values, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotIn(List<String> values) {
            addCriterion("API_STATUS not in", values, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusBetween(String value1, String value2) {
            addCriterion("API_STATUS between", value1, value2, "apiStatus");
            return (Criteria) this;
        }

        public Criteria andApiStatusNotBetween(String value1, String value2) {
            addCriterion("API_STATUS not between", value1, value2, "apiStatus");
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