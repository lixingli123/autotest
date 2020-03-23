package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasVariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasVariableExample() {
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

        public Criteria andVarIdIsNull() {
            addCriterion("VAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andVarIdIsNotNull() {
            addCriterion("VAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVarIdEqualTo(Integer value) {
            addCriterion("VAR_ID =", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdNotEqualTo(Integer value) {
            addCriterion("VAR_ID <>", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdGreaterThan(Integer value) {
            addCriterion("VAR_ID >", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VAR_ID >=", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdLessThan(Integer value) {
            addCriterion("VAR_ID <", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdLessThanOrEqualTo(Integer value) {
            addCriterion("VAR_ID <=", value, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdIn(List<Integer> values) {
            addCriterion("VAR_ID in", values, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdNotIn(List<Integer> values) {
            addCriterion("VAR_ID not in", values, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdBetween(Integer value1, Integer value2) {
            addCriterion("VAR_ID between", value1, value2, "varId");
            return (Criteria) this;
        }

        public Criteria andVarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VAR_ID not between", value1, value2, "varId");
            return (Criteria) this;
        }

        public Criteria andVarNameIsNull() {
            addCriterion("VAR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVarNameIsNotNull() {
            addCriterion("VAR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVarNameEqualTo(String value) {
            addCriterion("VAR_NAME =", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotEqualTo(String value) {
            addCriterion("VAR_NAME <>", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameGreaterThan(String value) {
            addCriterion("VAR_NAME >", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_NAME >=", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLessThan(String value) {
            addCriterion("VAR_NAME <", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLessThanOrEqualTo(String value) {
            addCriterion("VAR_NAME <=", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLike(String value) {
            addCriterion("VAR_NAME like", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotLike(String value) {
            addCriterion("VAR_NAME not like", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameIn(List<String> values) {
            addCriterion("VAR_NAME in", values, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotIn(List<String> values) {
            addCriterion("VAR_NAME not in", values, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameBetween(String value1, String value2) {
            addCriterion("VAR_NAME between", value1, value2, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotBetween(String value1, String value2) {
            addCriterion("VAR_NAME not between", value1, value2, "varName");
            return (Criteria) this;
        }

        public Criteria andVarValueIsNull() {
            addCriterion("VAR_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andVarValueIsNotNull() {
            addCriterion("VAR_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andVarValueEqualTo(String value) {
            addCriterion("VAR_VALUE =", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotEqualTo(String value) {
            addCriterion("VAR_VALUE <>", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueGreaterThan(String value) {
            addCriterion("VAR_VALUE >", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_VALUE >=", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueLessThan(String value) {
            addCriterion("VAR_VALUE <", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueLessThanOrEqualTo(String value) {
            addCriterion("VAR_VALUE <=", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueLike(String value) {
            addCriterion("VAR_VALUE like", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotLike(String value) {
            addCriterion("VAR_VALUE not like", value, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueIn(List<String> values) {
            addCriterion("VAR_VALUE in", values, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotIn(List<String> values) {
            addCriterion("VAR_VALUE not in", values, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueBetween(String value1, String value2) {
            addCriterion("VAR_VALUE between", value1, value2, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarValueNotBetween(String value1, String value2) {
            addCriterion("VAR_VALUE not between", value1, value2, "varValue");
            return (Criteria) this;
        }

        public Criteria andVarNatureIsNull() {
            addCriterion("VAR_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andVarNatureIsNotNull() {
            addCriterion("VAR_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andVarNatureEqualTo(String value) {
            addCriterion("VAR_NATURE =", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureNotEqualTo(String value) {
            addCriterion("VAR_NATURE <>", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureGreaterThan(String value) {
            addCriterion("VAR_NATURE >", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_NATURE >=", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureLessThan(String value) {
            addCriterion("VAR_NATURE <", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureLessThanOrEqualTo(String value) {
            addCriterion("VAR_NATURE <=", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureLike(String value) {
            addCriterion("VAR_NATURE like", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureNotLike(String value) {
            addCriterion("VAR_NATURE not like", value, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureIn(List<String> values) {
            addCriterion("VAR_NATURE in", values, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureNotIn(List<String> values) {
            addCriterion("VAR_NATURE not in", values, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureBetween(String value1, String value2) {
            addCriterion("VAR_NATURE between", value1, value2, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarNatureNotBetween(String value1, String value2) {
            addCriterion("VAR_NATURE not between", value1, value2, "varNature");
            return (Criteria) this;
        }

        public Criteria andVarTypeIsNull() {
            addCriterion("VAR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVarTypeIsNotNull() {
            addCriterion("VAR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVarTypeEqualTo(String value) {
            addCriterion("VAR_TYPE =", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotEqualTo(String value) {
            addCriterion("VAR_TYPE <>", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeGreaterThan(String value) {
            addCriterion("VAR_TYPE >", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_TYPE >=", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeLessThan(String value) {
            addCriterion("VAR_TYPE <", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeLessThanOrEqualTo(String value) {
            addCriterion("VAR_TYPE <=", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeLike(String value) {
            addCriterion("VAR_TYPE like", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotLike(String value) {
            addCriterion("VAR_TYPE not like", value, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeIn(List<String> values) {
            addCriterion("VAR_TYPE in", values, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotIn(List<String> values) {
            addCriterion("VAR_TYPE not in", values, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeBetween(String value1, String value2) {
            addCriterion("VAR_TYPE between", value1, value2, "varType");
            return (Criteria) this;
        }

        public Criteria andVarTypeNotBetween(String value1, String value2) {
            addCriterion("VAR_TYPE not between", value1, value2, "varType");
            return (Criteria) this;
        }

        public Criteria andVarStatusIsNull() {
            addCriterion("VAR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVarStatusIsNotNull() {
            addCriterion("VAR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVarStatusEqualTo(String value) {
            addCriterion("VAR_STATUS =", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusNotEqualTo(String value) {
            addCriterion("VAR_STATUS <>", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusGreaterThan(String value) {
            addCriterion("VAR_STATUS >", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_STATUS >=", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusLessThan(String value) {
            addCriterion("VAR_STATUS <", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusLessThanOrEqualTo(String value) {
            addCriterion("VAR_STATUS <=", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusLike(String value) {
            addCriterion("VAR_STATUS like", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusNotLike(String value) {
            addCriterion("VAR_STATUS not like", value, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusIn(List<String> values) {
            addCriterion("VAR_STATUS in", values, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusNotIn(List<String> values) {
            addCriterion("VAR_STATUS not in", values, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusBetween(String value1, String value2) {
            addCriterion("VAR_STATUS between", value1, value2, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarStatusNotBetween(String value1, String value2) {
            addCriterion("VAR_STATUS not between", value1, value2, "varStatus");
            return (Criteria) this;
        }

        public Criteria andVarDescIsNull() {
            addCriterion("VAR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVarDescIsNotNull() {
            addCriterion("VAR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVarDescEqualTo(String value) {
            addCriterion("VAR_DESC =", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotEqualTo(String value) {
            addCriterion("VAR_DESC <>", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescGreaterThan(String value) {
            addCriterion("VAR_DESC >", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_DESC >=", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescLessThan(String value) {
            addCriterion("VAR_DESC <", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescLessThanOrEqualTo(String value) {
            addCriterion("VAR_DESC <=", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescLike(String value) {
            addCriterion("VAR_DESC like", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotLike(String value) {
            addCriterion("VAR_DESC not like", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescIn(List<String> values) {
            addCriterion("VAR_DESC in", values, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotIn(List<String> values) {
            addCriterion("VAR_DESC not in", values, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescBetween(String value1, String value2) {
            addCriterion("VAR_DESC between", value1, value2, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotBetween(String value1, String value2) {
            addCriterion("VAR_DESC not between", value1, value2, "varDesc");
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

        public Criteria andVarValuePathIsNull() {
            addCriterion("VAR_VALUE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andVarValuePathIsNotNull() {
            addCriterion("VAR_VALUE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andVarValuePathEqualTo(String value) {
            addCriterion("VAR_VALUE_PATH =", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathNotEqualTo(String value) {
            addCriterion("VAR_VALUE_PATH <>", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathGreaterThan(String value) {
            addCriterion("VAR_VALUE_PATH >", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathGreaterThanOrEqualTo(String value) {
            addCriterion("VAR_VALUE_PATH >=", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathLessThan(String value) {
            addCriterion("VAR_VALUE_PATH <", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathLessThanOrEqualTo(String value) {
            addCriterion("VAR_VALUE_PATH <=", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathLike(String value) {
            addCriterion("VAR_VALUE_PATH like", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathNotLike(String value) {
            addCriterion("VAR_VALUE_PATH not like", value, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathIn(List<String> values) {
            addCriterion("VAR_VALUE_PATH in", values, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathNotIn(List<String> values) {
            addCriterion("VAR_VALUE_PATH not in", values, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathBetween(String value1, String value2) {
            addCriterion("VAR_VALUE_PATH between", value1, value2, "varValuePath");
            return (Criteria) this;
        }

        public Criteria andVarValuePathNotBetween(String value1, String value2) {
            addCriterion("VAR_VALUE_PATH not between", value1, value2, "varValuePath");
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