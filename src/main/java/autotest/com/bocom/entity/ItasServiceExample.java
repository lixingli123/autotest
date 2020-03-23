package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasServiceExample() {
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

        public Criteria andSvcIdIsNull() {
            addCriterion("SVC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSvcIdIsNotNull() {
            addCriterion("SVC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSvcIdEqualTo(Integer value) {
            addCriterion("SVC_ID =", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdNotEqualTo(Integer value) {
            addCriterion("SVC_ID <>", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdGreaterThan(Integer value) {
            addCriterion("SVC_ID >", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_ID >=", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdLessThan(Integer value) {
            addCriterion("SVC_ID <", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_ID <=", value, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdIn(List<Integer> values) {
            addCriterion("SVC_ID in", values, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdNotIn(List<Integer> values) {
            addCriterion("SVC_ID not in", values, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdBetween(Integer value1, Integer value2) {
            addCriterion("SVC_ID between", value1, value2, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SVC_ID not between", value1, value2, "svcId");
            return (Criteria) this;
        }

        public Criteria andSvcCodeIsNull() {
            addCriterion("SVC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSvcCodeIsNotNull() {
            addCriterion("SVC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSvcCodeEqualTo(String value) {
            addCriterion("SVC_CODE =", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeNotEqualTo(String value) {
            addCriterion("SVC_CODE <>", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeGreaterThan(String value) {
            addCriterion("SVC_CODE >", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_CODE >=", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeLessThan(String value) {
            addCriterion("SVC_CODE <", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeLessThanOrEqualTo(String value) {
            addCriterion("SVC_CODE <=", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeLike(String value) {
            addCriterion("SVC_CODE like", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeNotLike(String value) {
            addCriterion("SVC_CODE not like", value, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeIn(List<String> values) {
            addCriterion("SVC_CODE in", values, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeNotIn(List<String> values) {
            addCriterion("SVC_CODE not in", values, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeBetween(String value1, String value2) {
            addCriterion("SVC_CODE between", value1, value2, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcCodeNotBetween(String value1, String value2) {
            addCriterion("SVC_CODE not between", value1, value2, "svcCode");
            return (Criteria) this;
        }

        public Criteria andSvcNameIsNull() {
            addCriterion("SVC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSvcNameIsNotNull() {
            addCriterion("SVC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSvcNameEqualTo(String value) {
            addCriterion("SVC_NAME =", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameNotEqualTo(String value) {
            addCriterion("SVC_NAME <>", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameGreaterThan(String value) {
            addCriterion("SVC_NAME >", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_NAME >=", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameLessThan(String value) {
            addCriterion("SVC_NAME <", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameLessThanOrEqualTo(String value) {
            addCriterion("SVC_NAME <=", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameLike(String value) {
            addCriterion("SVC_NAME like", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameNotLike(String value) {
            addCriterion("SVC_NAME not like", value, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameIn(List<String> values) {
            addCriterion("SVC_NAME in", values, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameNotIn(List<String> values) {
            addCriterion("SVC_NAME not in", values, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameBetween(String value1, String value2) {
            addCriterion("SVC_NAME between", value1, value2, "svcName");
            return (Criteria) this;
        }

        public Criteria andSvcNameNotBetween(String value1, String value2) {
            addCriterion("SVC_NAME not between", value1, value2, "svcName");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNull() {
            addCriterion("SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(Integer value) {
            addCriterion("SYS_ID =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(Integer value) {
            addCriterion("SYS_ID <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(Integer value) {
            addCriterion("SYS_ID >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYS_ID >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(Integer value) {
            addCriterion("SYS_ID <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(Integer value) {
            addCriterion("SYS_ID <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<Integer> values) {
            addCriterion("SYS_ID in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<Integer> values) {
            addCriterion("SYS_ID not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(Integer value1, Integer value2) {
            addCriterion("SYS_ID between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SYS_ID not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSvcTypeIsNull() {
            addCriterion("SVC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSvcTypeIsNotNull() {
            addCriterion("SVC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSvcTypeEqualTo(String value) {
            addCriterion("SVC_TYPE =", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeNotEqualTo(String value) {
            addCriterion("SVC_TYPE <>", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeGreaterThan(String value) {
            addCriterion("SVC_TYPE >", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_TYPE >=", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeLessThan(String value) {
            addCriterion("SVC_TYPE <", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeLessThanOrEqualTo(String value) {
            addCriterion("SVC_TYPE <=", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeLike(String value) {
            addCriterion("SVC_TYPE like", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeNotLike(String value) {
            addCriterion("SVC_TYPE not like", value, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeIn(List<String> values) {
            addCriterion("SVC_TYPE in", values, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeNotIn(List<String> values) {
            addCriterion("SVC_TYPE not in", values, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeBetween(String value1, String value2) {
            addCriterion("SVC_TYPE between", value1, value2, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcTypeNotBetween(String value1, String value2) {
            addCriterion("SVC_TYPE not between", value1, value2, "svcType");
            return (Criteria) this;
        }

        public Criteria andSvcStatusIsNull() {
            addCriterion("SVC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSvcStatusIsNotNull() {
            addCriterion("SVC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSvcStatusEqualTo(String value) {
            addCriterion("SVC_STATUS =", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusNotEqualTo(String value) {
            addCriterion("SVC_STATUS <>", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusGreaterThan(String value) {
            addCriterion("SVC_STATUS >", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_STATUS >=", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusLessThan(String value) {
            addCriterion("SVC_STATUS <", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusLessThanOrEqualTo(String value) {
            addCriterion("SVC_STATUS <=", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusLike(String value) {
            addCriterion("SVC_STATUS like", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusNotLike(String value) {
            addCriterion("SVC_STATUS not like", value, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusIn(List<String> values) {
            addCriterion("SVC_STATUS in", values, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusNotIn(List<String> values) {
            addCriterion("SVC_STATUS not in", values, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusBetween(String value1, String value2) {
            addCriterion("SVC_STATUS between", value1, value2, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcStatusNotBetween(String value1, String value2) {
            addCriterion("SVC_STATUS not between", value1, value2, "svcStatus");
            return (Criteria) this;
        }

        public Criteria andSvcDescIsNull() {
            addCriterion("SVC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSvcDescIsNotNull() {
            addCriterion("SVC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSvcDescEqualTo(String value) {
            addCriterion("SVC_DESC =", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotEqualTo(String value) {
            addCriterion("SVC_DESC <>", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescGreaterThan(String value) {
            addCriterion("SVC_DESC >", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescGreaterThanOrEqualTo(String value) {
            addCriterion("SVC_DESC >=", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescLessThan(String value) {
            addCriterion("SVC_DESC <", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescLessThanOrEqualTo(String value) {
            addCriterion("SVC_DESC <=", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescLike(String value) {
            addCriterion("SVC_DESC like", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotLike(String value) {
            addCriterion("SVC_DESC not like", value, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescIn(List<String> values) {
            addCriterion("SVC_DESC in", values, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotIn(List<String> values) {
            addCriterion("SVC_DESC not in", values, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescBetween(String value1, String value2) {
            addCriterion("SVC_DESC between", value1, value2, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcDescNotBetween(String value1, String value2) {
            addCriterion("SVC_DESC not between", value1, value2, "svcDesc");
            return (Criteria) this;
        }

        public Criteria andSvcMasterIsNull() {
            addCriterion("SVC_MASTER is null");
            return (Criteria) this;
        }

        public Criteria andSvcMasterIsNotNull() {
            addCriterion("SVC_MASTER is not null");
            return (Criteria) this;
        }

        public Criteria andSvcMasterEqualTo(Integer value) {
            addCriterion("SVC_MASTER =", value, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterNotEqualTo(Integer value) {
            addCriterion("SVC_MASTER <>", value, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterGreaterThan(Integer value) {
            addCriterion("SVC_MASTER >", value, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_MASTER >=", value, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterLessThan(Integer value) {
            addCriterion("SVC_MASTER <", value, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_MASTER <=", value, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterIn(List<Integer> values) {
            addCriterion("SVC_MASTER in", values, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterNotIn(List<Integer> values) {
            addCriterion("SVC_MASTER not in", values, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterBetween(Integer value1, Integer value2) {
            addCriterion("SVC_MASTER between", value1, value2, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcMasterNotBetween(Integer value1, Integer value2) {
            addCriterion("SVC_MASTER not between", value1, value2, "svcMaster");
            return (Criteria) this;
        }

        public Criteria andSvcTesterIsNull() {
            addCriterion("SVC_TESTER is null");
            return (Criteria) this;
        }

        public Criteria andSvcTesterIsNotNull() {
            addCriterion("SVC_TESTER is not null");
            return (Criteria) this;
        }

        public Criteria andSvcTesterEqualTo(Integer value) {
            addCriterion("SVC_TESTER =", value, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterNotEqualTo(Integer value) {
            addCriterion("SVC_TESTER <>", value, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterGreaterThan(Integer value) {
            addCriterion("SVC_TESTER >", value, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterGreaterThanOrEqualTo(Integer value) {
            addCriterion("SVC_TESTER >=", value, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterLessThan(Integer value) {
            addCriterion("SVC_TESTER <", value, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterLessThanOrEqualTo(Integer value) {
            addCriterion("SVC_TESTER <=", value, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterIn(List<Integer> values) {
            addCriterion("SVC_TESTER in", values, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterNotIn(List<Integer> values) {
            addCriterion("SVC_TESTER not in", values, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterBetween(Integer value1, Integer value2) {
            addCriterion("SVC_TESTER between", value1, value2, "svcTester");
            return (Criteria) this;
        }

        public Criteria andSvcTesterNotBetween(Integer value1, Integer value2) {
            addCriterion("SVC_TESTER not between", value1, value2, "svcTester");
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