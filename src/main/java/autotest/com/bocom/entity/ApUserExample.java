package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApUserExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdIsNull() {
            addCriterion("APP_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdIsNotNull() {
            addCriterion("APP_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdEqualTo(Integer value) {
            addCriterion("APP_ORG_ID =", value, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdNotEqualTo(Integer value) {
            addCriterion("APP_ORG_ID <>", value, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdGreaterThan(Integer value) {
            addCriterion("APP_ORG_ID >", value, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APP_ORG_ID >=", value, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdLessThan(Integer value) {
            addCriterion("APP_ORG_ID <", value, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("APP_ORG_ID <=", value, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdIn(List<Integer> values) {
            addCriterion("APP_ORG_ID in", values, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdNotIn(List<Integer> values) {
            addCriterion("APP_ORG_ID not in", values, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("APP_ORG_ID between", value1, value2, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andAppOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APP_ORG_ID not between", value1, value2, "appOrgId");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andAuthModeIsNull() {
            addCriterion("AUTH_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAuthModeIsNotNull() {
            addCriterion("AUTH_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthModeEqualTo(String value) {
            addCriterion("AUTH_MODE =", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotEqualTo(String value) {
            addCriterion("AUTH_MODE <>", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeGreaterThan(String value) {
            addCriterion("AUTH_MODE >", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTH_MODE >=", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeLessThan(String value) {
            addCriterion("AUTH_MODE <", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeLessThanOrEqualTo(String value) {
            addCriterion("AUTH_MODE <=", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeLike(String value) {
            addCriterion("AUTH_MODE like", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotLike(String value) {
            addCriterion("AUTH_MODE not like", value, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeIn(List<String> values) {
            addCriterion("AUTH_MODE in", values, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotIn(List<String> values) {
            addCriterion("AUTH_MODE not in", values, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeBetween(String value1, String value2) {
            addCriterion("AUTH_MODE between", value1, value2, "authMode");
            return (Criteria) this;
        }

        public Criteria andAuthModeNotBetween(String value1, String value2) {
            addCriterion("AUTH_MODE not between", value1, value2, "authMode");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andSpellNameIsNull() {
            addCriterion("SPELL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpellNameIsNotNull() {
            addCriterion("SPELL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpellNameEqualTo(String value) {
            addCriterion("SPELL_NAME =", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameNotEqualTo(String value) {
            addCriterion("SPELL_NAME <>", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameGreaterThan(String value) {
            addCriterion("SPELL_NAME >", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPELL_NAME >=", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameLessThan(String value) {
            addCriterion("SPELL_NAME <", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameLessThanOrEqualTo(String value) {
            addCriterion("SPELL_NAME <=", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameLike(String value) {
            addCriterion("SPELL_NAME like", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameNotLike(String value) {
            addCriterion("SPELL_NAME not like", value, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameIn(List<String> values) {
            addCriterion("SPELL_NAME in", values, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameNotIn(List<String> values) {
            addCriterion("SPELL_NAME not in", values, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameBetween(String value1, String value2) {
            addCriterion("SPELL_NAME between", value1, value2, "spellName");
            return (Criteria) this;
        }

        public Criteria andSpellNameNotBetween(String value1, String value2) {
            addCriterion("SPELL_NAME not between", value1, value2, "spellName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("FIRST_NAME =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("FIRST_NAME <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("FIRST_NAME >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("FIRST_NAME <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("FIRST_NAME like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("FIRST_NAME not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("FIRST_NAME in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("FIRST_NAME not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("FIRST_NAME between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameIsNull() {
            addCriterion("MIDDLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMiddleNameIsNotNull() {
            addCriterion("MIDDLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleNameEqualTo(String value) {
            addCriterion("MIDDLE_NAME =", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotEqualTo(String value) {
            addCriterion("MIDDLE_NAME <>", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameGreaterThan(String value) {
            addCriterion("MIDDLE_NAME >", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_NAME >=", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameLessThan(String value) {
            addCriterion("MIDDLE_NAME <", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_NAME <=", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameLike(String value) {
            addCriterion("MIDDLE_NAME like", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotLike(String value) {
            addCriterion("MIDDLE_NAME not like", value, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameIn(List<String> values) {
            addCriterion("MIDDLE_NAME in", values, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotIn(List<String> values) {
            addCriterion("MIDDLE_NAME not in", values, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameBetween(String value1, String value2) {
            addCriterion("MIDDLE_NAME between", value1, value2, "middleName");
            return (Criteria) this;
        }

        public Criteria andMiddleNameNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_NAME not between", value1, value2, "middleName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("LAST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("LAST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("LAST_NAME =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("LAST_NAME <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("LAST_NAME >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("LAST_NAME <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("LAST_NAME like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("LAST_NAME not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("LAST_NAME in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("LAST_NAME not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("LAST_NAME between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeIsNull() {
            addCriterion("USER_ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeIsNotNull() {
            addCriterion("USER_ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeEqualTo(String value) {
            addCriterion("USER_ID_TYPE =", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeNotEqualTo(String value) {
            addCriterion("USER_ID_TYPE <>", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeGreaterThan(String value) {
            addCriterion("USER_ID_TYPE >", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID_TYPE >=", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeLessThan(String value) {
            addCriterion("USER_ID_TYPE <", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_ID_TYPE <=", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeLike(String value) {
            addCriterion("USER_ID_TYPE like", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeNotLike(String value) {
            addCriterion("USER_ID_TYPE not like", value, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeIn(List<String> values) {
            addCriterion("USER_ID_TYPE in", values, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeNotIn(List<String> values) {
            addCriterion("USER_ID_TYPE not in", values, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeBetween(String value1, String value2) {
            addCriterion("USER_ID_TYPE between", value1, value2, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdTypeNotBetween(String value1, String value2) {
            addCriterion("USER_ID_TYPE not between", value1, value2, "userIdType");
            return (Criteria) this;
        }

        public Criteria andUserIdNoIsNull() {
            addCriterion("USER_ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserIdNoIsNotNull() {
            addCriterion("USER_ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdNoEqualTo(String value) {
            addCriterion("USER_ID_NO =", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoNotEqualTo(String value) {
            addCriterion("USER_ID_NO <>", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoGreaterThan(String value) {
            addCriterion("USER_ID_NO >", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID_NO >=", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoLessThan(String value) {
            addCriterion("USER_ID_NO <", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoLessThanOrEqualTo(String value) {
            addCriterion("USER_ID_NO <=", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoLike(String value) {
            addCriterion("USER_ID_NO like", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoNotLike(String value) {
            addCriterion("USER_ID_NO not like", value, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoIn(List<String> values) {
            addCriterion("USER_ID_NO in", values, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoNotIn(List<String> values) {
            addCriterion("USER_ID_NO not in", values, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoBetween(String value1, String value2) {
            addCriterion("USER_ID_NO between", value1, value2, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserIdNoNotBetween(String value1, String value2) {
            addCriterion("USER_ID_NO not between", value1, value2, "userIdNo");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("USER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("USER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(String value) {
            addCriterion("USER_LEVEL =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(String value) {
            addCriterion("USER_LEVEL <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(String value) {
            addCriterion("USER_LEVEL >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(String value) {
            addCriterion("USER_LEVEL <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLike(String value) {
            addCriterion("USER_LEVEL like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotLike(String value) {
            addCriterion("USER_LEVEL not like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<String> values) {
            addCriterion("USER_LEVEL in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<String> values) {
            addCriterion("USER_LEVEL not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(String value1, String value2) {
            addCriterion("USER_LEVEL between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(String value1, String value2) {
            addCriterion("USER_LEVEL not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateIsNull() {
            addCriterion("USER_EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateIsNotNull() {
            addCriterion("USER_EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateEqualTo(Date value) {
            addCriterion("USER_EFFECTIVE_DATE =", value, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateNotEqualTo(Date value) {
            addCriterion("USER_EFFECTIVE_DATE <>", value, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateGreaterThan(Date value) {
            addCriterion("USER_EFFECTIVE_DATE >", value, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_EFFECTIVE_DATE >=", value, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateLessThan(Date value) {
            addCriterion("USER_EFFECTIVE_DATE <", value, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_EFFECTIVE_DATE <=", value, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateIn(List<Date> values) {
            addCriterion("USER_EFFECTIVE_DATE in", values, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateNotIn(List<Date> values) {
            addCriterion("USER_EFFECTIVE_DATE not in", values, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateBetween(Date value1, Date value2) {
            addCriterion("USER_EFFECTIVE_DATE between", value1, value2, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andUserEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_EFFECTIVE_DATE not between", value1, value2, "userEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusIsNull() {
            addCriterion("APP_USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusIsNotNull() {
            addCriterion("APP_USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusEqualTo(String value) {
            addCriterion("APP_USER_STATUS =", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusNotEqualTo(String value) {
            addCriterion("APP_USER_STATUS <>", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusGreaterThan(String value) {
            addCriterion("APP_USER_STATUS >", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("APP_USER_STATUS >=", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusLessThan(String value) {
            addCriterion("APP_USER_STATUS <", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusLessThanOrEqualTo(String value) {
            addCriterion("APP_USER_STATUS <=", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusLike(String value) {
            addCriterion("APP_USER_STATUS like", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusNotLike(String value) {
            addCriterion("APP_USER_STATUS not like", value, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusIn(List<String> values) {
            addCriterion("APP_USER_STATUS in", values, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusNotIn(List<String> values) {
            addCriterion("APP_USER_STATUS not in", values, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusBetween(String value1, String value2) {
            addCriterion("APP_USER_STATUS between", value1, value2, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andAppUserStatusNotBetween(String value1, String value2) {
            addCriterion("APP_USER_STATUS not between", value1, value2, "appUserStatus");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateIsNull() {
            addCriterion("USER_EXPIRE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateIsNotNull() {
            addCriterion("USER_EXPIRE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateEqualTo(Date value) {
            addCriterion("USER_EXPIRE_DATE =", value, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateNotEqualTo(Date value) {
            addCriterion("USER_EXPIRE_DATE <>", value, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateGreaterThan(Date value) {
            addCriterion("USER_EXPIRE_DATE >", value, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_EXPIRE_DATE >=", value, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateLessThan(Date value) {
            addCriterion("USER_EXPIRE_DATE <", value, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_EXPIRE_DATE <=", value, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateIn(List<Date> values) {
            addCriterion("USER_EXPIRE_DATE in", values, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateNotIn(List<Date> values) {
            addCriterion("USER_EXPIRE_DATE not in", values, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateBetween(Date value1, Date value2) {
            addCriterion("USER_EXPIRE_DATE between", value1, value2, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andUserExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_EXPIRE_DATE not between", value1, value2, "userExpireDate");
            return (Criteria) this;
        }

        public Criteria andKindGroupIsNull() {
            addCriterion("KIND_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andKindGroupIsNotNull() {
            addCriterion("KIND_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andKindGroupEqualTo(String value) {
            addCriterion("KIND_GROUP =", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupNotEqualTo(String value) {
            addCriterion("KIND_GROUP <>", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupGreaterThan(String value) {
            addCriterion("KIND_GROUP >", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupGreaterThanOrEqualTo(String value) {
            addCriterion("KIND_GROUP >=", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupLessThan(String value) {
            addCriterion("KIND_GROUP <", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupLessThanOrEqualTo(String value) {
            addCriterion("KIND_GROUP <=", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupLike(String value) {
            addCriterion("KIND_GROUP like", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupNotLike(String value) {
            addCriterion("KIND_GROUP not like", value, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupIn(List<String> values) {
            addCriterion("KIND_GROUP in", values, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupNotIn(List<String> values) {
            addCriterion("KIND_GROUP not in", values, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupBetween(String value1, String value2) {
            addCriterion("KIND_GROUP between", value1, value2, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andKindGroupNotBetween(String value1, String value2) {
            addCriterion("KIND_GROUP not between", value1, value2, "kindGroup");
            return (Criteria) this;
        }

        public Criteria andTellerLevelIsNull() {
            addCriterion("TELLER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andTellerLevelIsNotNull() {
            addCriterion("TELLER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andTellerLevelEqualTo(String value) {
            addCriterion("TELLER_LEVEL =", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelNotEqualTo(String value) {
            addCriterion("TELLER_LEVEL <>", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelGreaterThan(String value) {
            addCriterion("TELLER_LEVEL >", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("TELLER_LEVEL >=", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelLessThan(String value) {
            addCriterion("TELLER_LEVEL <", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelLessThanOrEqualTo(String value) {
            addCriterion("TELLER_LEVEL <=", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelLike(String value) {
            addCriterion("TELLER_LEVEL like", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelNotLike(String value) {
            addCriterion("TELLER_LEVEL not like", value, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelIn(List<String> values) {
            addCriterion("TELLER_LEVEL in", values, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelNotIn(List<String> values) {
            addCriterion("TELLER_LEVEL not in", values, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelBetween(String value1, String value2) {
            addCriterion("TELLER_LEVEL between", value1, value2, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andTellerLevelNotBetween(String value1, String value2) {
            addCriterion("TELLER_LEVEL not between", value1, value2, "tellerLevel");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIsNull() {
            addCriterion("CELL_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIsNotNull() {
            addCriterion("CELL_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneEqualTo(String value) {
            addCriterion("CELL_PHONE =", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotEqualTo(String value) {
            addCriterion("CELL_PHONE <>", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneGreaterThan(String value) {
            addCriterion("CELL_PHONE >", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("CELL_PHONE >=", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLessThan(String value) {
            addCriterion("CELL_PHONE <", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLessThanOrEqualTo(String value) {
            addCriterion("CELL_PHONE <=", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLike(String value) {
            addCriterion("CELL_PHONE like", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotLike(String value) {
            addCriterion("CELL_PHONE not like", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIn(List<String> values) {
            addCriterion("CELL_PHONE in", values, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotIn(List<String> values) {
            addCriterion("CELL_PHONE not in", values, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneBetween(String value1, String value2) {
            addCriterion("CELL_PHONE between", value1, value2, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotBetween(String value1, String value2) {
            addCriterion("CELL_PHONE not between", value1, value2, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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