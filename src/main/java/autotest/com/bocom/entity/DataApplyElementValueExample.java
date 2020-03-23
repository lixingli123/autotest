package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.List;

public class DataApplyElementValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataApplyElementValueExample() {
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

        public Criteria andElementValueIdIsNull() {
            addCriterion("ELEMENT_VALUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andElementValueIdIsNotNull() {
            addCriterion("ELEMENT_VALUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andElementValueIdEqualTo(Integer value) {
            addCriterion("ELEMENT_VALUE_ID =", value, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdNotEqualTo(Integer value) {
            addCriterion("ELEMENT_VALUE_ID <>", value, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdGreaterThan(Integer value) {
            addCriterion("ELEMENT_VALUE_ID >", value, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ELEMENT_VALUE_ID >=", value, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdLessThan(Integer value) {
            addCriterion("ELEMENT_VALUE_ID <", value, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("ELEMENT_VALUE_ID <=", value, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdIn(List<Integer> values) {
            addCriterion("ELEMENT_VALUE_ID in", values, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdNotIn(List<Integer> values) {
            addCriterion("ELEMENT_VALUE_ID not in", values, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdBetween(Integer value1, Integer value2) {
            addCriterion("ELEMENT_VALUE_ID between", value1, value2, "elementValueId");
            return (Criteria) this;
        }

        public Criteria andElementValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ELEMENT_VALUE_ID not between", value1, value2, "elementValueId");
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

        public Criteria andElementNameIsNull() {
            addCriterion("ELEMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andElementNameIsNotNull() {
            addCriterion("ELEMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andElementNameEqualTo(String value) {
            addCriterion("ELEMENT_NAME =", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotEqualTo(String value) {
            addCriterion("ELEMENT_NAME <>", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameGreaterThan(String value) {
            addCriterion("ELEMENT_NAME >", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_NAME >=", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLessThan(String value) {
            addCriterion("ELEMENT_NAME <", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_NAME <=", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLike(String value) {
            addCriterion("ELEMENT_NAME like", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotLike(String value) {
            addCriterion("ELEMENT_NAME not like", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameIn(List<String> values) {
            addCriterion("ELEMENT_NAME in", values, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotIn(List<String> values) {
            addCriterion("ELEMENT_NAME not in", values, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameBetween(String value1, String value2) {
            addCriterion("ELEMENT_NAME between", value1, value2, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_NAME not between", value1, value2, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementDescIsNull() {
            addCriterion("ELEMENT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andElementDescIsNotNull() {
            addCriterion("ELEMENT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andElementDescEqualTo(String value) {
            addCriterion("ELEMENT_DESC =", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescNotEqualTo(String value) {
            addCriterion("ELEMENT_DESC <>", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescGreaterThan(String value) {
            addCriterion("ELEMENT_DESC >", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_DESC >=", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescLessThan(String value) {
            addCriterion("ELEMENT_DESC <", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_DESC <=", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescLike(String value) {
            addCriterion("ELEMENT_DESC like", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescNotLike(String value) {
            addCriterion("ELEMENT_DESC not like", value, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescIn(List<String> values) {
            addCriterion("ELEMENT_DESC in", values, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescNotIn(List<String> values) {
            addCriterion("ELEMENT_DESC not in", values, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescBetween(String value1, String value2) {
            addCriterion("ELEMENT_DESC between", value1, value2, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementDescNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_DESC not between", value1, value2, "elementDesc");
            return (Criteria) this;
        }

        public Criteria andElementValueIsNull() {
            addCriterion("ELEMENT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andElementValueIsNotNull() {
            addCriterion("ELEMENT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andElementValueEqualTo(String value) {
            addCriterion("ELEMENT_VALUE =", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueNotEqualTo(String value) {
            addCriterion("ELEMENT_VALUE <>", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueGreaterThan(String value) {
            addCriterion("ELEMENT_VALUE >", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueGreaterThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE >=", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueLessThan(String value) {
            addCriterion("ELEMENT_VALUE <", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueLessThanOrEqualTo(String value) {
            addCriterion("ELEMENT_VALUE <=", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueLike(String value) {
            addCriterion("ELEMENT_VALUE like", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueNotLike(String value) {
            addCriterion("ELEMENT_VALUE not like", value, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueIn(List<String> values) {
            addCriterion("ELEMENT_VALUE in", values, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueNotIn(List<String> values) {
            addCriterion("ELEMENT_VALUE not in", values, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE between", value1, value2, "elementValue");
            return (Criteria) this;
        }

        public Criteria andElementValueNotBetween(String value1, String value2) {
            addCriterion("ELEMENT_VALUE not between", value1, value2, "elementValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNull() {
            addCriterion("DEFAULT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIsNotNull() {
            addCriterion("DEFAULT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultValueEqualTo(String value) {
            addCriterion("DEFAULT_VALUE =", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotEqualTo(String value) {
            addCriterion("DEFAULT_VALUE <>", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThan(String value) {
            addCriterion("DEFAULT_VALUE >", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_VALUE >=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThan(String value) {
            addCriterion("DEFAULT_VALUE <", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_VALUE <=", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueLike(String value) {
            addCriterion("DEFAULT_VALUE like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotLike(String value) {
            addCriterion("DEFAULT_VALUE not like", value, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueIn(List<String> values) {
            addCriterion("DEFAULT_VALUE in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotIn(List<String> values) {
            addCriterion("DEFAULT_VALUE not in", values, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueBetween(String value1, String value2) {
            addCriterion("DEFAULT_VALUE between", value1, value2, "defaultValue");
            return (Criteria) this;
        }

        public Criteria andDefaultValueNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_VALUE not between", value1, value2, "defaultValue");
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