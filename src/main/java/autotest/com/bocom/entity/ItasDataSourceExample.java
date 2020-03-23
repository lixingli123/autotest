package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasDataSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasDataSourceExample() {
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

        public Criteria andSourceIdIsNull() {
            addCriterion("SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(Integer value) {
            addCriterion("SOURCE_ID =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(Integer value) {
            addCriterion("SOURCE_ID <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(Integer value) {
            addCriterion("SOURCE_ID >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_ID >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(Integer value) {
            addCriterion("SOURCE_ID <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_ID <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<Integer> values) {
            addCriterion("SOURCE_ID in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<Integer> values) {
            addCriterion("SOURCE_ID not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_ID between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_ID not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNull() {
            addCriterion("SOURCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSourceNameIsNotNull() {
            addCriterion("SOURCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSourceNameEqualTo(String value) {
            addCriterion("SOURCE_NAME =", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotEqualTo(String value) {
            addCriterion("SOURCE_NAME <>", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThan(String value) {
            addCriterion("SOURCE_NAME >", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_NAME >=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThan(String value) {
            addCriterion("SOURCE_NAME <", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_NAME <=", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameLike(String value) {
            addCriterion("SOURCE_NAME like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotLike(String value) {
            addCriterion("SOURCE_NAME not like", value, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameIn(List<String> values) {
            addCriterion("SOURCE_NAME in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotIn(List<String> values) {
            addCriterion("SOURCE_NAME not in", values, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameBetween(String value1, String value2) {
            addCriterion("SOURCE_NAME between", value1, value2, "sourceName");
            return (Criteria) this;
        }

        public Criteria andSourceNameNotBetween(String value1, String value2) {
            addCriterion("SOURCE_NAME not between", value1, value2, "sourceName");
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

        public Criteria andSourceTypeIsNull() {
            addCriterion("SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("SOURCE_TYPE <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("SOURCE_TYPE >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("SOURCE_TYPE <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("SOURCE_TYPE like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("SOURCE_TYPE not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("SOURCE_TYPE in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("SOURCE_TYPE not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceStatusIsNull() {
            addCriterion("SOURCE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSourceStatusIsNotNull() {
            addCriterion("SOURCE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSourceStatusEqualTo(String value) {
            addCriterion("SOURCE_STATUS =", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusNotEqualTo(String value) {
            addCriterion("SOURCE_STATUS <>", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusGreaterThan(String value) {
            addCriterion("SOURCE_STATUS >", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_STATUS >=", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusLessThan(String value) {
            addCriterion("SOURCE_STATUS <", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_STATUS <=", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusLike(String value) {
            addCriterion("SOURCE_STATUS like", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusNotLike(String value) {
            addCriterion("SOURCE_STATUS not like", value, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusIn(List<String> values) {
            addCriterion("SOURCE_STATUS in", values, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusNotIn(List<String> values) {
            addCriterion("SOURCE_STATUS not in", values, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusBetween(String value1, String value2) {
            addCriterion("SOURCE_STATUS between", value1, value2, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceStatusNotBetween(String value1, String value2) {
            addCriterion("SOURCE_STATUS not between", value1, value2, "sourceStatus");
            return (Criteria) this;
        }

        public Criteria andSourceDriverIsNull() {
            addCriterion("SOURCE_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andSourceDriverIsNotNull() {
            addCriterion("SOURCE_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDriverEqualTo(String value) {
            addCriterion("SOURCE_DRIVER =", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverNotEqualTo(String value) {
            addCriterion("SOURCE_DRIVER <>", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverGreaterThan(String value) {
            addCriterion("SOURCE_DRIVER >", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_DRIVER >=", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverLessThan(String value) {
            addCriterion("SOURCE_DRIVER <", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_DRIVER <=", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverLike(String value) {
            addCriterion("SOURCE_DRIVER like", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverNotLike(String value) {
            addCriterion("SOURCE_DRIVER not like", value, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverIn(List<String> values) {
            addCriterion("SOURCE_DRIVER in", values, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverNotIn(List<String> values) {
            addCriterion("SOURCE_DRIVER not in", values, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverBetween(String value1, String value2) {
            addCriterion("SOURCE_DRIVER between", value1, value2, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceDriverNotBetween(String value1, String value2) {
            addCriterion("SOURCE_DRIVER not between", value1, value2, "sourceDriver");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIsNull() {
            addCriterion("SOURCE_URL is null");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIsNotNull() {
            addCriterion("SOURCE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSourceUrlEqualTo(String value) {
            addCriterion("SOURCE_URL =", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotEqualTo(String value) {
            addCriterion("SOURCE_URL <>", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlGreaterThan(String value) {
            addCriterion("SOURCE_URL >", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_URL >=", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLessThan(String value) {
            addCriterion("SOURCE_URL <", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_URL <=", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlLike(String value) {
            addCriterion("SOURCE_URL like", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotLike(String value) {
            addCriterion("SOURCE_URL not like", value, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlIn(List<String> values) {
            addCriterion("SOURCE_URL in", values, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotIn(List<String> values) {
            addCriterion("SOURCE_URL not in", values, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlBetween(String value1, String value2) {
            addCriterion("SOURCE_URL between", value1, value2, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUrlNotBetween(String value1, String value2) {
            addCriterion("SOURCE_URL not between", value1, value2, "sourceUrl");
            return (Criteria) this;
        }

        public Criteria andSourceUserIsNull() {
            addCriterion("SOURCE_USER is null");
            return (Criteria) this;
        }

        public Criteria andSourceUserIsNotNull() {
            addCriterion("SOURCE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSourceUserEqualTo(String value) {
            addCriterion("SOURCE_USER =", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserNotEqualTo(String value) {
            addCriterion("SOURCE_USER <>", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserGreaterThan(String value) {
            addCriterion("SOURCE_USER >", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_USER >=", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserLessThan(String value) {
            addCriterion("SOURCE_USER <", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_USER <=", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserLike(String value) {
            addCriterion("SOURCE_USER like", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserNotLike(String value) {
            addCriterion("SOURCE_USER not like", value, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserIn(List<String> values) {
            addCriterion("SOURCE_USER in", values, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserNotIn(List<String> values) {
            addCriterion("SOURCE_USER not in", values, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserBetween(String value1, String value2) {
            addCriterion("SOURCE_USER between", value1, value2, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourceUserNotBetween(String value1, String value2) {
            addCriterion("SOURCE_USER not between", value1, value2, "sourceUser");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdIsNull() {
            addCriterion("SOURCE_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdIsNotNull() {
            addCriterion("SOURCE_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdEqualTo(String value) {
            addCriterion("SOURCE_PASSWD =", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdNotEqualTo(String value) {
            addCriterion("SOURCE_PASSWD <>", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdGreaterThan(String value) {
            addCriterion("SOURCE_PASSWD >", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_PASSWD >=", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdLessThan(String value) {
            addCriterion("SOURCE_PASSWD <", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_PASSWD <=", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdLike(String value) {
            addCriterion("SOURCE_PASSWD like", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdNotLike(String value) {
            addCriterion("SOURCE_PASSWD not like", value, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdIn(List<String> values) {
            addCriterion("SOURCE_PASSWD in", values, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdNotIn(List<String> values) {
            addCriterion("SOURCE_PASSWD not in", values, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdBetween(String value1, String value2) {
            addCriterion("SOURCE_PASSWD between", value1, value2, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourcePasswdNotBetween(String value1, String value2) {
            addCriterion("SOURCE_PASSWD not between", value1, value2, "sourcePasswd");
            return (Criteria) this;
        }

        public Criteria andSourceDescIsNull() {
            addCriterion("SOURCE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSourceDescIsNotNull() {
            addCriterion("SOURCE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSourceDescEqualTo(String value) {
            addCriterion("SOURCE_DESC =", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescNotEqualTo(String value) {
            addCriterion("SOURCE_DESC <>", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescGreaterThan(String value) {
            addCriterion("SOURCE_DESC >", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_DESC >=", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescLessThan(String value) {
            addCriterion("SOURCE_DESC <", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_DESC <=", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescLike(String value) {
            addCriterion("SOURCE_DESC like", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescNotLike(String value) {
            addCriterion("SOURCE_DESC not like", value, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescIn(List<String> values) {
            addCriterion("SOURCE_DESC in", values, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescNotIn(List<String> values) {
            addCriterion("SOURCE_DESC not in", values, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescBetween(String value1, String value2) {
            addCriterion("SOURCE_DESC between", value1, value2, "sourceDesc");
            return (Criteria) this;
        }

        public Criteria andSourceDescNotBetween(String value1, String value2) {
            addCriterion("SOURCE_DESC not between", value1, value2, "sourceDesc");
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