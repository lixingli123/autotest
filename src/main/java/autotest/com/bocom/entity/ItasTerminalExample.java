package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasTerminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasTerminalExample() {
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

        public Criteria andTerminalIdIsNull() {
            addCriterion("TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(Integer value) {
            addCriterion("TERMINAL_ID =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(Integer value) {
            addCriterion("TERMINAL_ID <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(Integer value) {
            addCriterion("TERMINAL_ID >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TERMINAL_ID >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(Integer value) {
            addCriterion("TERMINAL_ID <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(Integer value) {
            addCriterion("TERMINAL_ID <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<Integer> values) {
            addCriterion("TERMINAL_ID in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<Integer> values) {
            addCriterion("TERMINAL_ID not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(Integer value1, Integer value2) {
            addCriterion("TERMINAL_ID between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TERMINAL_ID not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNull() {
            addCriterion("TERMINAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNotNull() {
            addCriterion("TERMINAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameEqualTo(String value) {
            addCriterion("TERMINAL_NAME =", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotEqualTo(String value) {
            addCriterion("TERMINAL_NAME <>", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThan(String value) {
            addCriterion("TERMINAL_NAME >", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_NAME >=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThan(String value) {
            addCriterion("TERMINAL_NAME <", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_NAME <=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLike(String value) {
            addCriterion("TERMINAL_NAME like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotLike(String value) {
            addCriterion("TERMINAL_NAME not like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIn(List<String> values) {
            addCriterion("TERMINAL_NAME in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotIn(List<String> values) {
            addCriterion("TERMINAL_NAME not in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameBetween(String value1, String value2) {
            addCriterion("TERMINAL_NAME between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_NAME not between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalIpIsNull() {
            addCriterion("TERMINAL_IP is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIpIsNotNull() {
            addCriterion("TERMINAL_IP is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIpEqualTo(String value) {
            addCriterion("TERMINAL_IP =", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotEqualTo(String value) {
            addCriterion("TERMINAL_IP <>", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpGreaterThan(String value) {
            addCriterion("TERMINAL_IP >", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_IP >=", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpLessThan(String value) {
            addCriterion("TERMINAL_IP <", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_IP <=", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpLike(String value) {
            addCriterion("TERMINAL_IP like", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotLike(String value) {
            addCriterion("TERMINAL_IP not like", value, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpIn(List<String> values) {
            addCriterion("TERMINAL_IP in", values, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotIn(List<String> values) {
            addCriterion("TERMINAL_IP not in", values, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpBetween(String value1, String value2) {
            addCriterion("TERMINAL_IP between", value1, value2, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalIpNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_IP not between", value1, value2, "terminalIp");
            return (Criteria) this;
        }

        public Criteria andTerminalPortIsNull() {
            addCriterion("TERMINAL_PORT is null");
            return (Criteria) this;
        }

        public Criteria andTerminalPortIsNotNull() {
            addCriterion("TERMINAL_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalPortEqualTo(String value) {
            addCriterion("TERMINAL_PORT =", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortNotEqualTo(String value) {
            addCriterion("TERMINAL_PORT <>", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortGreaterThan(String value) {
            addCriterion("TERMINAL_PORT >", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_PORT >=", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortLessThan(String value) {
            addCriterion("TERMINAL_PORT <", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_PORT <=", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortLike(String value) {
            addCriterion("TERMINAL_PORT like", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortNotLike(String value) {
            addCriterion("TERMINAL_PORT not like", value, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortIn(List<String> values) {
            addCriterion("TERMINAL_PORT in", values, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortNotIn(List<String> values) {
            addCriterion("TERMINAL_PORT not in", values, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortBetween(String value1, String value2) {
            addCriterion("TERMINAL_PORT between", value1, value2, "terminalPort");
            return (Criteria) this;
        }

        public Criteria andTerminalPortNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_PORT not between", value1, value2, "terminalPort");
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

        public Criteria andTerminalTypeIsNull() {
            addCriterion("TERMINAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("TERMINAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("TERMINAL_TYPE =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("TERMINAL_TYPE >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("TERMINAL_TYPE <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("TERMINAL_TYPE like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("TERMINAL_TYPE not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("TERMINAL_TYPE in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("TERMINAL_TYPE not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalUserIsNull() {
            addCriterion("TERMINAL_USER is null");
            return (Criteria) this;
        }

        public Criteria andTerminalUserIsNotNull() {
            addCriterion("TERMINAL_USER is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalUserEqualTo(String value) {
            addCriterion("TERMINAL_USER =", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserNotEqualTo(String value) {
            addCriterion("TERMINAL_USER <>", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserGreaterThan(String value) {
            addCriterion("TERMINAL_USER >", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_USER >=", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserLessThan(String value) {
            addCriterion("TERMINAL_USER <", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_USER <=", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserLike(String value) {
            addCriterion("TERMINAL_USER like", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserNotLike(String value) {
            addCriterion("TERMINAL_USER not like", value, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserIn(List<String> values) {
            addCriterion("TERMINAL_USER in", values, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserNotIn(List<String> values) {
            addCriterion("TERMINAL_USER not in", values, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserBetween(String value1, String value2) {
            addCriterion("TERMINAL_USER between", value1, value2, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalUserNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_USER not between", value1, value2, "terminalUser");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdIsNull() {
            addCriterion("TERMINAL_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdIsNotNull() {
            addCriterion("TERMINAL_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdEqualTo(String value) {
            addCriterion("TERMINAL_PASSWD =", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdNotEqualTo(String value) {
            addCriterion("TERMINAL_PASSWD <>", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdGreaterThan(String value) {
            addCriterion("TERMINAL_PASSWD >", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_PASSWD >=", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdLessThan(String value) {
            addCriterion("TERMINAL_PASSWD <", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_PASSWD <=", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdLike(String value) {
            addCriterion("TERMINAL_PASSWD like", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdNotLike(String value) {
            addCriterion("TERMINAL_PASSWD not like", value, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdIn(List<String> values) {
            addCriterion("TERMINAL_PASSWD in", values, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdNotIn(List<String> values) {
            addCriterion("TERMINAL_PASSWD not in", values, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdBetween(String value1, String value2) {
            addCriterion("TERMINAL_PASSWD between", value1, value2, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andTerminalPasswdNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_PASSWD not between", value1, value2, "terminalPasswd");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNull() {
            addCriterion("PROCESS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIsNotNull() {
            addCriterion("PROCESS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStatusEqualTo(String value) {
            addCriterion("PROCESS_STATUS =", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotEqualTo(String value) {
            addCriterion("PROCESS_STATUS <>", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThan(String value) {
            addCriterion("PROCESS_STATUS >", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATUS >=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThan(String value) {
            addCriterion("PROCESS_STATUS <", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATUS <=", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusLike(String value) {
            addCriterion("PROCESS_STATUS like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotLike(String value) {
            addCriterion("PROCESS_STATUS not like", value, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusIn(List<String> values) {
            addCriterion("PROCESS_STATUS in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotIn(List<String> values) {
            addCriterion("PROCESS_STATUS not in", values, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusBetween(String value1, String value2) {
            addCriterion("PROCESS_STATUS between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessStatusNotBetween(String value1, String value2) {
            addCriterion("PROCESS_STATUS not between", value1, value2, "processStatus");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("PROCESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("PROCESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(Integer value) {
            addCriterion("PROCESS_ID =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(Integer value) {
            addCriterion("PROCESS_ID <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(Integer value) {
            addCriterion("PROCESS_ID >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROCESS_ID >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(Integer value) {
            addCriterion("PROCESS_ID <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROCESS_ID <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<Integer> values) {
            addCriterion("PROCESS_ID in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<Integer> values) {
            addCriterion("PROCESS_ID not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(Integer value1, Integer value2) {
            addCriterion("PROCESS_ID between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROCESS_ID not between", value1, value2, "processId");
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