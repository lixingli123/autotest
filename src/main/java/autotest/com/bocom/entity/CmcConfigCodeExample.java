package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmcConfigCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmcConfigCodeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConfigCodeIsNull() {
            addCriterion("CONFIG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andConfigCodeIsNotNull() {
            addCriterion("CONFIG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andConfigCodeEqualTo(String value) {
            addCriterion("CONFIG_CODE =", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotEqualTo(String value) {
            addCriterion("CONFIG_CODE <>", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeGreaterThan(String value) {
            addCriterion("CONFIG_CODE >", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_CODE >=", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeLessThan(String value) {
            addCriterion("CONFIG_CODE <", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_CODE <=", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeLike(String value) {
            addCriterion("CONFIG_CODE like", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotLike(String value) {
            addCriterion("CONFIG_CODE not like", value, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeIn(List<String> values) {
            addCriterion("CONFIG_CODE in", values, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotIn(List<String> values) {
            addCriterion("CONFIG_CODE not in", values, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeBetween(String value1, String value2) {
            addCriterion("CONFIG_CODE between", value1, value2, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigCodeNotBetween(String value1, String value2) {
            addCriterion("CONFIG_CODE not between", value1, value2, "configCode");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNull() {
            addCriterion("CONFIG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNotNull() {
            addCriterion("CONFIG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("CONFIG_NAME =", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("CONFIG_NAME <>", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("CONFIG_NAME >", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_NAME >=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThan(String value) {
            addCriterion("CONFIG_NAME <", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_NAME <=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLike(String value) {
            addCriterion("CONFIG_NAME like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotLike(String value) {
            addCriterion("CONFIG_NAME not like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameIn(List<String> values) {
            addCriterion("CONFIG_NAME in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotIn(List<String> values) {
            addCriterion("CONFIG_NAME not in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("CONFIG_NAME between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("CONFIG_NAME not between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigValueIsNull() {
            addCriterion("CONFIG_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andConfigValueIsNotNull() {
            addCriterion("CONFIG_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andConfigValueEqualTo(String value) {
            addCriterion("CONFIG_VALUE =", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotEqualTo(String value) {
            addCriterion("CONFIG_VALUE <>", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThan(String value) {
            addCriterion("CONFIG_VALUE >", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_VALUE >=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThan(String value) {
            addCriterion("CONFIG_VALUE <", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_VALUE <=", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueLike(String value) {
            addCriterion("CONFIG_VALUE like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotLike(String value) {
            addCriterion("CONFIG_VALUE not like", value, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueIn(List<String> values) {
            addCriterion("CONFIG_VALUE in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotIn(List<String> values) {
            addCriterion("CONFIG_VALUE not in", values, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueBetween(String value1, String value2) {
            addCriterion("CONFIG_VALUE between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigValueNotBetween(String value1, String value2) {
            addCriterion("CONFIG_VALUE not between", value1, value2, "configValue");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchIsNull() {
            addCriterion("CONFIG_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchIsNotNull() {
            addCriterion("CONFIG_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchEqualTo(String value) {
            addCriterion("CONFIG_SWITCH =", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchNotEqualTo(String value) {
            addCriterion("CONFIG_SWITCH <>", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchGreaterThan(String value) {
            addCriterion("CONFIG_SWITCH >", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_SWITCH >=", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchLessThan(String value) {
            addCriterion("CONFIG_SWITCH <", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_SWITCH <=", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchLike(String value) {
            addCriterion("CONFIG_SWITCH like", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchNotLike(String value) {
            addCriterion("CONFIG_SWITCH not like", value, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchIn(List<String> values) {
            addCriterion("CONFIG_SWITCH in", values, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchNotIn(List<String> values) {
            addCriterion("CONFIG_SWITCH not in", values, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchBetween(String value1, String value2) {
            addCriterion("CONFIG_SWITCH between", value1, value2, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigSwitchNotBetween(String value1, String value2) {
            addCriterion("CONFIG_SWITCH not between", value1, value2, "configSwitch");
            return (Criteria) this;
        }

        public Criteria andConfigUtilIsNull() {
            addCriterion("CONFIG_UTIL is null");
            return (Criteria) this;
        }

        public Criteria andConfigUtilIsNotNull() {
            addCriterion("CONFIG_UTIL is not null");
            return (Criteria) this;
        }

        public Criteria andConfigUtilEqualTo(String value) {
            addCriterion("CONFIG_UTIL =", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilNotEqualTo(String value) {
            addCriterion("CONFIG_UTIL <>", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilGreaterThan(String value) {
            addCriterion("CONFIG_UTIL >", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIG_UTIL >=", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilLessThan(String value) {
            addCriterion("CONFIG_UTIL <", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilLessThanOrEqualTo(String value) {
            addCriterion("CONFIG_UTIL <=", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilLike(String value) {
            addCriterion("CONFIG_UTIL like", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilNotLike(String value) {
            addCriterion("CONFIG_UTIL not like", value, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilIn(List<String> values) {
            addCriterion("CONFIG_UTIL in", values, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilNotIn(List<String> values) {
            addCriterion("CONFIG_UTIL not in", values, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilBetween(String value1, String value2) {
            addCriterion("CONFIG_UTIL between", value1, value2, "configUtil");
            return (Criteria) this;
        }

        public Criteria andConfigUtilNotBetween(String value1, String value2) {
            addCriterion("CONFIG_UTIL not between", value1, value2, "configUtil");
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