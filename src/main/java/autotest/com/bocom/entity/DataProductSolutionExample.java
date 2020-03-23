package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataProductSolutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataProductSolutionExample() {
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

        public Criteria andSolutionIdIsNull() {
            addCriterion("SOLUTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSolutionIdIsNotNull() {
            addCriterion("SOLUTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionIdEqualTo(Integer value) {
            addCriterion("SOLUTION_ID =", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotEqualTo(Integer value) {
            addCriterion("SOLUTION_ID <>", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdGreaterThan(Integer value) {
            addCriterion("SOLUTION_ID >", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOLUTION_ID >=", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdLessThan(Integer value) {
            addCriterion("SOLUTION_ID <", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdLessThanOrEqualTo(Integer value) {
            addCriterion("SOLUTION_ID <=", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdIn(List<Integer> values) {
            addCriterion("SOLUTION_ID in", values, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotIn(List<Integer> values) {
            addCriterion("SOLUTION_ID not in", values, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdBetween(Integer value1, Integer value2) {
            addCriterion("SOLUTION_ID between", value1, value2, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SOLUTION_ID not between", value1, value2, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionNameIsNull() {
            addCriterion("SOLUTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSolutionNameIsNotNull() {
            addCriterion("SOLUTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionNameEqualTo(String value) {
            addCriterion("SOLUTION_NAME =", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotEqualTo(String value) {
            addCriterion("SOLUTION_NAME <>", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameGreaterThan(String value) {
            addCriterion("SOLUTION_NAME >", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_NAME >=", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameLessThan(String value) {
            addCriterion("SOLUTION_NAME <", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_NAME <=", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameLike(String value) {
            addCriterion("SOLUTION_NAME like", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotLike(String value) {
            addCriterion("SOLUTION_NAME not like", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameIn(List<String> values) {
            addCriterion("SOLUTION_NAME in", values, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotIn(List<String> values) {
            addCriterion("SOLUTION_NAME not in", values, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameBetween(String value1, String value2) {
            addCriterion("SOLUTION_NAME between", value1, value2, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_NAME not between", value1, value2, "solutionName");
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

        public Criteria andSolutionDescIsNull() {
            addCriterion("SOLUTION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSolutionDescIsNotNull() {
            addCriterion("SOLUTION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionDescEqualTo(String value) {
            addCriterion("SOLUTION_DESC =", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescNotEqualTo(String value) {
            addCriterion("SOLUTION_DESC <>", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescGreaterThan(String value) {
            addCriterion("SOLUTION_DESC >", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_DESC >=", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescLessThan(String value) {
            addCriterion("SOLUTION_DESC <", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_DESC <=", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescLike(String value) {
            addCriterion("SOLUTION_DESC like", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescNotLike(String value) {
            addCriterion("SOLUTION_DESC not like", value, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescIn(List<String> values) {
            addCriterion("SOLUTION_DESC in", values, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescNotIn(List<String> values) {
            addCriterion("SOLUTION_DESC not in", values, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescBetween(String value1, String value2) {
            addCriterion("SOLUTION_DESC between", value1, value2, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionDescNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_DESC not between", value1, value2, "solutionDesc");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeIsNull() {
            addCriterion("SOLUTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeIsNotNull() {
            addCriterion("SOLUTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeEqualTo(String value) {
            addCriterion("SOLUTION_TYPE =", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeNotEqualTo(String value) {
            addCriterion("SOLUTION_TYPE <>", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeGreaterThan(String value) {
            addCriterion("SOLUTION_TYPE >", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_TYPE >=", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeLessThan(String value) {
            addCriterion("SOLUTION_TYPE <", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_TYPE <=", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeLike(String value) {
            addCriterion("SOLUTION_TYPE like", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeNotLike(String value) {
            addCriterion("SOLUTION_TYPE not like", value, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeIn(List<String> values) {
            addCriterion("SOLUTION_TYPE in", values, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeNotIn(List<String> values) {
            addCriterion("SOLUTION_TYPE not in", values, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeBetween(String value1, String value2) {
            addCriterion("SOLUTION_TYPE between", value1, value2, "solutionType");
            return (Criteria) this;
        }

        public Criteria andSolutionTypeNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_TYPE not between", value1, value2, "solutionType");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionIsNull() {
            addCriterion("DEFAULT_SOLUTION is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionIsNotNull() {
            addCriterion("DEFAULT_SOLUTION is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionEqualTo(String value) {
            addCriterion("DEFAULT_SOLUTION =", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionNotEqualTo(String value) {
            addCriterion("DEFAULT_SOLUTION <>", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionGreaterThan(String value) {
            addCriterion("DEFAULT_SOLUTION >", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_SOLUTION >=", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionLessThan(String value) {
            addCriterion("DEFAULT_SOLUTION <", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_SOLUTION <=", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionLike(String value) {
            addCriterion("DEFAULT_SOLUTION like", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionNotLike(String value) {
            addCriterion("DEFAULT_SOLUTION not like", value, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionIn(List<String> values) {
            addCriterion("DEFAULT_SOLUTION in", values, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionNotIn(List<String> values) {
            addCriterion("DEFAULT_SOLUTION not in", values, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionBetween(String value1, String value2) {
            addCriterion("DEFAULT_SOLUTION between", value1, value2, "defaultSolution");
            return (Criteria) this;
        }

        public Criteria andDefaultSolutionNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_SOLUTION not between", value1, value2, "defaultSolution");
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

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("CREATOR_ID =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("CREATOR_ID <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("CREATOR_ID >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("CREATOR_ID <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("CREATOR_ID <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("CREATOR_ID in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("CREATOR_ID not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATOR_ID not between", value1, value2, "creatorId");
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

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNull() {
            addCriterion("MODIFIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andModifierIdIsNotNull() {
            addCriterion("MODIFIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModifierIdEqualTo(Integer value) {
            addCriterion("MODIFIER_ID =", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotEqualTo(Integer value) {
            addCriterion("MODIFIER_ID <>", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThan(Integer value) {
            addCriterion("MODIFIER_ID >", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MODIFIER_ID >=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThan(Integer value) {
            addCriterion("MODIFIER_ID <", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdLessThanOrEqualTo(Integer value) {
            addCriterion("MODIFIER_ID <=", value, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdIn(List<Integer> values) {
            addCriterion("MODIFIER_ID in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotIn(List<Integer> values) {
            addCriterion("MODIFIER_ID not in", values, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdBetween(Integer value1, Integer value2) {
            addCriterion("MODIFIER_ID between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MODIFIER_ID not between", value1, value2, "modifierId");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
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