package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasTransferExample() {
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

        public Criteria andTransferIdIsNull() {
            addCriterion("TRANSFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransferIdIsNotNull() {
            addCriterion("TRANSFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferIdEqualTo(Integer value) {
            addCriterion("TRANSFER_ID =", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotEqualTo(Integer value) {
            addCriterion("TRANSFER_ID <>", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThan(Integer value) {
            addCriterion("TRANSFER_ID >", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSFER_ID >=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThan(Integer value) {
            addCriterion("TRANSFER_ID <", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSFER_ID <=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdIn(List<Integer> values) {
            addCriterion("TRANSFER_ID in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotIn(List<Integer> values) {
            addCriterion("TRANSFER_ID not in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFER_ID between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSFER_ID not between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferNoIsNull() {
            addCriterion("TRANSFER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransferNoIsNotNull() {
            addCriterion("TRANSFER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNoEqualTo(String value) {
            addCriterion("TRANSFER_NO =", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotEqualTo(String value) {
            addCriterion("TRANSFER_NO <>", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoGreaterThan(String value) {
            addCriterion("TRANSFER_NO >", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NO >=", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoLessThan(String value) {
            addCriterion("TRANSFER_NO <", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NO <=", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoLike(String value) {
            addCriterion("TRANSFER_NO like", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotLike(String value) {
            addCriterion("TRANSFER_NO not like", value, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoIn(List<String> values) {
            addCriterion("TRANSFER_NO in", values, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotIn(List<String> values) {
            addCriterion("TRANSFER_NO not in", values, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoBetween(String value1, String value2) {
            addCriterion("TRANSFER_NO between", value1, value2, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNoNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_NO not between", value1, value2, "transferNo");
            return (Criteria) this;
        }

        public Criteria andTransferNameIsNull() {
            addCriterion("TRANSFER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTransferNameIsNotNull() {
            addCriterion("TRANSFER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTransferNameEqualTo(String value) {
            addCriterion("TRANSFER_NAME =", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotEqualTo(String value) {
            addCriterion("TRANSFER_NAME <>", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThan(String value) {
            addCriterion("TRANSFER_NAME >", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NAME >=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThan(String value) {
            addCriterion("TRANSFER_NAME <", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_NAME <=", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameLike(String value) {
            addCriterion("TRANSFER_NAME like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotLike(String value) {
            addCriterion("TRANSFER_NAME not like", value, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameIn(List<String> values) {
            addCriterion("TRANSFER_NAME in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotIn(List<String> values) {
            addCriterion("TRANSFER_NAME not in", values, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameBetween(String value1, String value2) {
            addCriterion("TRANSFER_NAME between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferNameNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_NAME not between", value1, value2, "transferName");
            return (Criteria) this;
        }

        public Criteria andTransferExportIsNull() {
            addCriterion("TRANSFER_EXPORT is null");
            return (Criteria) this;
        }

        public Criteria andTransferExportIsNotNull() {
            addCriterion("TRANSFER_EXPORT is not null");
            return (Criteria) this;
        }

        public Criteria andTransferExportEqualTo(String value) {
            addCriterion("TRANSFER_EXPORT =", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportNotEqualTo(String value) {
            addCriterion("TRANSFER_EXPORT <>", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportGreaterThan(String value) {
            addCriterion("TRANSFER_EXPORT >", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_EXPORT >=", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportLessThan(String value) {
            addCriterion("TRANSFER_EXPORT <", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_EXPORT <=", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportLike(String value) {
            addCriterion("TRANSFER_EXPORT like", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportNotLike(String value) {
            addCriterion("TRANSFER_EXPORT not like", value, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportIn(List<String> values) {
            addCriterion("TRANSFER_EXPORT in", values, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportNotIn(List<String> values) {
            addCriterion("TRANSFER_EXPORT not in", values, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportBetween(String value1, String value2) {
            addCriterion("TRANSFER_EXPORT between", value1, value2, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferExportNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_EXPORT not between", value1, value2, "transferExport");
            return (Criteria) this;
        }

        public Criteria andTransferDescIsNull() {
            addCriterion("TRANSFER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTransferDescIsNotNull() {
            addCriterion("TRANSFER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDescEqualTo(String value) {
            addCriterion("TRANSFER_DESC =", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescNotEqualTo(String value) {
            addCriterion("TRANSFER_DESC <>", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescGreaterThan(String value) {
            addCriterion("TRANSFER_DESC >", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_DESC >=", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescLessThan(String value) {
            addCriterion("TRANSFER_DESC <", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_DESC <=", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescLike(String value) {
            addCriterion("TRANSFER_DESC like", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescNotLike(String value) {
            addCriterion("TRANSFER_DESC not like", value, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescIn(List<String> values) {
            addCriterion("TRANSFER_DESC in", values, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescNotIn(List<String> values) {
            addCriterion("TRANSFER_DESC not in", values, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescBetween(String value1, String value2) {
            addCriterion("TRANSFER_DESC between", value1, value2, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andTransferDescNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_DESC not between", value1, value2, "transferDesc");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("CASE_NO like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("CASE_NO not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
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