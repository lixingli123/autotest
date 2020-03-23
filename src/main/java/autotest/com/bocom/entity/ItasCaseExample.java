package autotest.com.bocom.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasCaseExample() {
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

        public Criteria andCaseIdIsNull() {
            addCriterion("CASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("CASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("CASE_ID =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("CASE_ID <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("CASE_ID >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_ID >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("CASE_ID <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_ID <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("CASE_ID in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("CASE_ID not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("CASE_ID between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_ID not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseKeyIsNull() {
            addCriterion("CASE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCaseKeyIsNotNull() {
            addCriterion("CASE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCaseKeyEqualTo(Integer value) {
            addCriterion("CASE_KEY =", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyNotEqualTo(Integer value) {
            addCriterion("CASE_KEY <>", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyGreaterThan(Integer value) {
            addCriterion("CASE_KEY >", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_KEY >=", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyLessThan(Integer value) {
            addCriterion("CASE_KEY <", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_KEY <=", value, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyIn(List<Integer> values) {
            addCriterion("CASE_KEY in", values, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyNotIn(List<Integer> values) {
            addCriterion("CASE_KEY not in", values, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyBetween(Integer value1, Integer value2) {
            addCriterion("CASE_KEY between", value1, value2, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_KEY not between", value1, value2, "caseKey");
            return (Criteria) this;
        }

        public Criteria andCaseKindIsNull() {
            addCriterion("CASE_KIND is null");
            return (Criteria) this;
        }

        public Criteria andCaseKindIsNotNull() {
            addCriterion("CASE_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andCaseKindEqualTo(String value) {
            addCriterion("CASE_KIND =", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindNotEqualTo(String value) {
            addCriterion("CASE_KIND <>", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindGreaterThan(String value) {
            addCriterion("CASE_KIND >", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_KIND >=", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindLessThan(String value) {
            addCriterion("CASE_KIND <", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindLessThanOrEqualTo(String value) {
            addCriterion("CASE_KIND <=", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindLike(String value) {
            addCriterion("CASE_KIND like", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindNotLike(String value) {
            addCriterion("CASE_KIND not like", value, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindIn(List<String> values) {
            addCriterion("CASE_KIND in", values, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindNotIn(List<String> values) {
            addCriterion("CASE_KIND not in", values, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindBetween(String value1, String value2) {
            addCriterion("CASE_KIND between", value1, value2, "caseKind");
            return (Criteria) this;
        }

        public Criteria andCaseKindNotBetween(String value1, String value2) {
            addCriterion("CASE_KIND not between", value1, value2, "caseKind");
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

        public Criteria andCaseNameIsNull() {
            addCriterion("CASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCaseNameIsNotNull() {
            addCriterion("CASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNameEqualTo(String value) {
            addCriterion("CASE_NAME =", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotEqualTo(String value) {
            addCriterion("CASE_NAME <>", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThan(String value) {
            addCriterion("CASE_NAME >", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NAME >=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThan(String value) {
            addCriterion("CASE_NAME <", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLessThanOrEqualTo(String value) {
            addCriterion("CASE_NAME <=", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameLike(String value) {
            addCriterion("CASE_NAME like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotLike(String value) {
            addCriterion("CASE_NAME not like", value, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameIn(List<String> values) {
            addCriterion("CASE_NAME in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotIn(List<String> values) {
            addCriterion("CASE_NAME not in", values, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameBetween(String value1, String value2) {
            addCriterion("CASE_NAME between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseNameNotBetween(String value1, String value2) {
            addCriterion("CASE_NAME not between", value1, value2, "caseName");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNull() {
            addCriterion("CASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNotNull() {
            addCriterion("CASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeEqualTo(String value) {
            addCriterion("CASE_TYPE =", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotEqualTo(String value) {
            addCriterion("CASE_TYPE <>", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThan(String value) {
            addCriterion("CASE_TYPE >", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_TYPE >=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThan(String value) {
            addCriterion("CASE_TYPE <", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThanOrEqualTo(String value) {
            addCriterion("CASE_TYPE <=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLike(String value) {
            addCriterion("CASE_TYPE like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotLike(String value) {
            addCriterion("CASE_TYPE not like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIn(List<String> values) {
            addCriterion("CASE_TYPE in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotIn(List<String> values) {
            addCriterion("CASE_TYPE not in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeBetween(String value1, String value2) {
            addCriterion("CASE_TYPE between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotBetween(String value1, String value2) {
            addCriterion("CASE_TYPE not between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseNatureIsNull() {
            addCriterion("CASE_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andCaseNatureIsNotNull() {
            addCriterion("CASE_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNatureEqualTo(String value) {
            addCriterion("CASE_NATURE =", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureNotEqualTo(String value) {
            addCriterion("CASE_NATURE <>", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureGreaterThan(String value) {
            addCriterion("CASE_NATURE >", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NATURE >=", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureLessThan(String value) {
            addCriterion("CASE_NATURE <", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureLessThanOrEqualTo(String value) {
            addCriterion("CASE_NATURE <=", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureLike(String value) {
            addCriterion("CASE_NATURE like", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureNotLike(String value) {
            addCriterion("CASE_NATURE not like", value, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureIn(List<String> values) {
            addCriterion("CASE_NATURE in", values, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureNotIn(List<String> values) {
            addCriterion("CASE_NATURE not in", values, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureBetween(String value1, String value2) {
            addCriterion("CASE_NATURE between", value1, value2, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseNatureNotBetween(String value1, String value2) {
            addCriterion("CASE_NATURE not between", value1, value2, "caseNature");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNull() {
            addCriterion("CASE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNotNull() {
            addCriterion("CASE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusEqualTo(String value) {
            addCriterion("CASE_STATUS =", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotEqualTo(String value) {
            addCriterion("CASE_STATUS <>", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThan(String value) {
            addCriterion("CASE_STATUS >", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_STATUS >=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThan(String value) {
            addCriterion("CASE_STATUS <", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("CASE_STATUS <=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLike(String value) {
            addCriterion("CASE_STATUS like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotLike(String value) {
            addCriterion("CASE_STATUS not like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIn(List<String> values) {
            addCriterion("CASE_STATUS in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotIn(List<String> values) {
            addCriterion("CASE_STATUS not in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusBetween(String value1, String value2) {
            addCriterion("CASE_STATUS between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotBetween(String value1, String value2) {
            addCriterion("CASE_STATUS not between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedIsNull() {
            addCriterion("CASE_FINISHED is null");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedIsNotNull() {
            addCriterion("CASE_FINISHED is not null");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedEqualTo(String value) {
            addCriterion("CASE_FINISHED =", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedNotEqualTo(String value) {
            addCriterion("CASE_FINISHED <>", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedGreaterThan(String value) {
            addCriterion("CASE_FINISHED >", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_FINISHED >=", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedLessThan(String value) {
            addCriterion("CASE_FINISHED <", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedLessThanOrEqualTo(String value) {
            addCriterion("CASE_FINISHED <=", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedLike(String value) {
            addCriterion("CASE_FINISHED like", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedNotLike(String value) {
            addCriterion("CASE_FINISHED not like", value, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedIn(List<String> values) {
            addCriterion("CASE_FINISHED in", values, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedNotIn(List<String> values) {
            addCriterion("CASE_FINISHED not in", values, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedBetween(String value1, String value2) {
            addCriterion("CASE_FINISHED between", value1, value2, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseFinishedNotBetween(String value1, String value2) {
            addCriterion("CASE_FINISHED not between", value1, value2, "caseFinished");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeIsNull() {
            addCriterion("CASE_TEST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeIsNotNull() {
            addCriterion("CASE_TEST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeEqualTo(String value) {
            addCriterion("CASE_TEST_TYPE =", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeNotEqualTo(String value) {
            addCriterion("CASE_TEST_TYPE <>", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeGreaterThan(String value) {
            addCriterion("CASE_TEST_TYPE >", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_TEST_TYPE >=", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeLessThan(String value) {
            addCriterion("CASE_TEST_TYPE <", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeLessThanOrEqualTo(String value) {
            addCriterion("CASE_TEST_TYPE <=", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeLike(String value) {
            addCriterion("CASE_TEST_TYPE like", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeNotLike(String value) {
            addCriterion("CASE_TEST_TYPE not like", value, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeIn(List<String> values) {
            addCriterion("CASE_TEST_TYPE in", values, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeNotIn(List<String> values) {
            addCriterion("CASE_TEST_TYPE not in", values, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeBetween(String value1, String value2) {
            addCriterion("CASE_TEST_TYPE between", value1, value2, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseTestTypeNotBetween(String value1, String value2) {
            addCriterion("CASE_TEST_TYPE not between", value1, value2, "caseTestType");
            return (Criteria) this;
        }

        public Criteria andCaseMasterIsNull() {
            addCriterion("CASE_MASTER is null");
            return (Criteria) this;
        }

        public Criteria andCaseMasterIsNotNull() {
            addCriterion("CASE_MASTER is not null");
            return (Criteria) this;
        }

        public Criteria andCaseMasterEqualTo(Integer value) {
            addCriterion("CASE_MASTER =", value, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterNotEqualTo(Integer value) {
            addCriterion("CASE_MASTER <>", value, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterGreaterThan(Integer value) {
            addCriterion("CASE_MASTER >", value, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_MASTER >=", value, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterLessThan(Integer value) {
            addCriterion("CASE_MASTER <", value, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_MASTER <=", value, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterIn(List<Integer> values) {
            addCriterion("CASE_MASTER in", values, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterNotIn(List<Integer> values) {
            addCriterion("CASE_MASTER not in", values, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterBetween(Integer value1, Integer value2) {
            addCriterion("CASE_MASTER between", value1, value2, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseMasterNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_MASTER not between", value1, value2, "caseMaster");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIsNull() {
            addCriterion("CASE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIsNotNull() {
            addCriterion("CASE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCaseLevelEqualTo(String value) {
            addCriterion("CASE_LEVEL =", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotEqualTo(String value) {
            addCriterion("CASE_LEVEL <>", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelGreaterThan(String value) {
            addCriterion("CASE_LEVEL >", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_LEVEL >=", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLessThan(String value) {
            addCriterion("CASE_LEVEL <", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLessThanOrEqualTo(String value) {
            addCriterion("CASE_LEVEL <=", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelLike(String value) {
            addCriterion("CASE_LEVEL like", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotLike(String value) {
            addCriterion("CASE_LEVEL not like", value, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelIn(List<String> values) {
            addCriterion("CASE_LEVEL in", values, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotIn(List<String> values) {
            addCriterion("CASE_LEVEL not in", values, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelBetween(String value1, String value2) {
            addCriterion("CASE_LEVEL between", value1, value2, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseLevelNotBetween(String value1, String value2) {
            addCriterion("CASE_LEVEL not between", value1, value2, "caseLevel");
            return (Criteria) this;
        }

        public Criteria andCaseBasedIsNull() {
            addCriterion("CASE_BASED is null");
            return (Criteria) this;
        }

        public Criteria andCaseBasedIsNotNull() {
            addCriterion("CASE_BASED is not null");
            return (Criteria) this;
        }

        public Criteria andCaseBasedEqualTo(Integer value) {
            addCriterion("CASE_BASED =", value, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedNotEqualTo(Integer value) {
            addCriterion("CASE_BASED <>", value, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedGreaterThan(Integer value) {
            addCriterion("CASE_BASED >", value, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_BASED >=", value, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedLessThan(Integer value) {
            addCriterion("CASE_BASED <", value, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_BASED <=", value, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedIn(List<Integer> values) {
            addCriterion("CASE_BASED in", values, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedNotIn(List<Integer> values) {
            addCriterion("CASE_BASED not in", values, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedBetween(Integer value1, Integer value2) {
            addCriterion("CASE_BASED between", value1, value2, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseBasedNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_BASED not between", value1, value2, "caseBased");
            return (Criteria) this;
        }

        public Criteria andCaseActivedIsNull() {
            addCriterion("CASE_ACTIVED is null");
            return (Criteria) this;
        }

        public Criteria andCaseActivedIsNotNull() {
            addCriterion("CASE_ACTIVED is not null");
            return (Criteria) this;
        }

        public Criteria andCaseActivedEqualTo(String value) {
            addCriterion("CASE_ACTIVED =", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedNotEqualTo(String value) {
            addCriterion("CASE_ACTIVED <>", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedGreaterThan(String value) {
            addCriterion("CASE_ACTIVED >", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_ACTIVED >=", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedLessThan(String value) {
            addCriterion("CASE_ACTIVED <", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedLessThanOrEqualTo(String value) {
            addCriterion("CASE_ACTIVED <=", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedLike(String value) {
            addCriterion("CASE_ACTIVED like", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedNotLike(String value) {
            addCriterion("CASE_ACTIVED not like", value, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedIn(List<String> values) {
            addCriterion("CASE_ACTIVED in", values, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedNotIn(List<String> values) {
            addCriterion("CASE_ACTIVED not in", values, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedBetween(String value1, String value2) {
            addCriterion("CASE_ACTIVED between", value1, value2, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseActivedNotBetween(String value1, String value2) {
            addCriterion("CASE_ACTIVED not between", value1, value2, "caseActived");
            return (Criteria) this;
        }

        public Criteria andCaseVersionIsNull() {
            addCriterion("CASE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andCaseVersionIsNotNull() {
            addCriterion("CASE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andCaseVersionEqualTo(BigDecimal value) {
            addCriterion("CASE_VERSION =", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionNotEqualTo(BigDecimal value) {
            addCriterion("CASE_VERSION <>", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionGreaterThan(BigDecimal value) {
            addCriterion("CASE_VERSION >", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASE_VERSION >=", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionLessThan(BigDecimal value) {
            addCriterion("CASE_VERSION <", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASE_VERSION <=", value, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionIn(List<BigDecimal> values) {
            addCriterion("CASE_VERSION in", values, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionNotIn(List<BigDecimal> values) {
            addCriterion("CASE_VERSION not in", values, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASE_VERSION between", value1, value2, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASE_VERSION not between", value1, value2, "caseVersion");
            return (Criteria) this;
        }

        public Criteria andCaseChangedIsNull() {
            addCriterion("CASE_CHANGED is null");
            return (Criteria) this;
        }

        public Criteria andCaseChangedIsNotNull() {
            addCriterion("CASE_CHANGED is not null");
            return (Criteria) this;
        }

        public Criteria andCaseChangedEqualTo(String value) {
            addCriterion("CASE_CHANGED =", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedNotEqualTo(String value) {
            addCriterion("CASE_CHANGED <>", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedGreaterThan(String value) {
            addCriterion("CASE_CHANGED >", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_CHANGED >=", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedLessThan(String value) {
            addCriterion("CASE_CHANGED <", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedLessThanOrEqualTo(String value) {
            addCriterion("CASE_CHANGED <=", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedLike(String value) {
            addCriterion("CASE_CHANGED like", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedNotLike(String value) {
            addCriterion("CASE_CHANGED not like", value, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedIn(List<String> values) {
            addCriterion("CASE_CHANGED in", values, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedNotIn(List<String> values) {
            addCriterion("CASE_CHANGED not in", values, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedBetween(String value1, String value2) {
            addCriterion("CASE_CHANGED between", value1, value2, "caseChanged");
            return (Criteria) this;
        }

        public Criteria andCaseChangedNotBetween(String value1, String value2) {
            addCriterion("CASE_CHANGED not between", value1, value2, "caseChanged");
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

        public Criteria andFlowIdIsNull() {
            addCriterion("FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(Integer value) {
            addCriterion("FLOW_ID =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(Integer value) {
            addCriterion("FLOW_ID <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(Integer value) {
            addCriterion("FLOW_ID >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLOW_ID >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(Integer value) {
            addCriterion("FLOW_ID <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("FLOW_ID <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<Integer> values) {
            addCriterion("FLOW_ID in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<Integer> values) {
            addCriterion("FLOW_ID not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("FLOW_ID between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FLOW_ID not between", value1, value2, "flowId");
            return (Criteria) this;
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

        public Criteria andReqSysIdIsNull() {
            addCriterion("REQ_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andReqSysIdIsNotNull() {
            addCriterion("REQ_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReqSysIdEqualTo(Integer value) {
            addCriterion("REQ_SYS_ID =", value, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdNotEqualTo(Integer value) {
            addCriterion("REQ_SYS_ID <>", value, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdGreaterThan(Integer value) {
            addCriterion("REQ_SYS_ID >", value, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REQ_SYS_ID >=", value, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdLessThan(Integer value) {
            addCriterion("REQ_SYS_ID <", value, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdLessThanOrEqualTo(Integer value) {
            addCriterion("REQ_SYS_ID <=", value, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdIn(List<Integer> values) {
            addCriterion("REQ_SYS_ID in", values, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdNotIn(List<Integer> values) {
            addCriterion("REQ_SYS_ID not in", values, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdBetween(Integer value1, Integer value2) {
            addCriterion("REQ_SYS_ID between", value1, value2, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andReqSysIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REQ_SYS_ID not between", value1, value2, "reqSysId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdIsNull() {
            addCriterion("ENTRANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntranceIdIsNotNull() {
            addCriterion("ENTRANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceIdEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID =", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdNotEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID <>", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdGreaterThan(Integer value) {
            addCriterion("ENTRANCE_ID >", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID >=", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdLessThan(Integer value) {
            addCriterion("ENTRANCE_ID <", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTRANCE_ID <=", value, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdIn(List<Integer> values) {
            addCriterion("ENTRANCE_ID in", values, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdNotIn(List<Integer> values) {
            addCriterion("ENTRANCE_ID not in", values, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTRANCE_ID between", value1, value2, "entranceId");
            return (Criteria) this;
        }

        public Criteria andEntranceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTRANCE_ID not between", value1, value2, "entranceId");
            return (Criteria) this;
        }

        public Criteria andTestConditonIsNull() {
            addCriterion("TEST_CONDITON is null");
            return (Criteria) this;
        }

        public Criteria andTestConditonIsNotNull() {
            addCriterion("TEST_CONDITON is not null");
            return (Criteria) this;
        }

        public Criteria andTestConditonEqualTo(String value) {
            addCriterion("TEST_CONDITON =", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonNotEqualTo(String value) {
            addCriterion("TEST_CONDITON <>", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonGreaterThan(String value) {
            addCriterion("TEST_CONDITON >", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_CONDITON >=", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonLessThan(String value) {
            addCriterion("TEST_CONDITON <", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonLessThanOrEqualTo(String value) {
            addCriterion("TEST_CONDITON <=", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonLike(String value) {
            addCriterion("TEST_CONDITON like", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonNotLike(String value) {
            addCriterion("TEST_CONDITON not like", value, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonIn(List<String> values) {
            addCriterion("TEST_CONDITON in", values, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonNotIn(List<String> values) {
            addCriterion("TEST_CONDITON not in", values, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonBetween(String value1, String value2) {
            addCriterion("TEST_CONDITON between", value1, value2, "testConditon");
            return (Criteria) this;
        }

        public Criteria andTestConditonNotBetween(String value1, String value2) {
            addCriterion("TEST_CONDITON not between", value1, value2, "testConditon");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceIsNull() {
            addCriterion("IS_DATA_SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceIsNotNull() {
            addCriterion("IS_DATA_SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceEqualTo(String value) {
            addCriterion("IS_DATA_SERVICE =", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceNotEqualTo(String value) {
            addCriterion("IS_DATA_SERVICE <>", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceGreaterThan(String value) {
            addCriterion("IS_DATA_SERVICE >", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DATA_SERVICE >=", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceLessThan(String value) {
            addCriterion("IS_DATA_SERVICE <", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceLessThanOrEqualTo(String value) {
            addCriterion("IS_DATA_SERVICE <=", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceLike(String value) {
            addCriterion("IS_DATA_SERVICE like", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceNotLike(String value) {
            addCriterion("IS_DATA_SERVICE not like", value, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceIn(List<String> values) {
            addCriterion("IS_DATA_SERVICE in", values, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceNotIn(List<String> values) {
            addCriterion("IS_DATA_SERVICE not in", values, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceBetween(String value1, String value2) {
            addCriterion("IS_DATA_SERVICE between", value1, value2, "isDataService");
            return (Criteria) this;
        }

        public Criteria andIsDataServiceNotBetween(String value1, String value2) {
            addCriterion("IS_DATA_SERVICE not between", value1, value2, "isDataService");
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

        public Criteria andReviserIsNull() {
            addCriterion("REVISER is null");
            return (Criteria) this;
        }

        public Criteria andReviserIsNotNull() {
            addCriterion("REVISER is not null");
            return (Criteria) this;
        }

        public Criteria andReviserEqualTo(String value) {
            addCriterion("REVISER =", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserNotEqualTo(String value) {
            addCriterion("REVISER <>", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserGreaterThan(String value) {
            addCriterion("REVISER >", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserGreaterThanOrEqualTo(String value) {
            addCriterion("REVISER >=", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserLessThan(String value) {
            addCriterion("REVISER <", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserLessThanOrEqualTo(String value) {
            addCriterion("REVISER <=", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserLike(String value) {
            addCriterion("REVISER like", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserNotLike(String value) {
            addCriterion("REVISER not like", value, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserIn(List<String> values) {
            addCriterion("REVISER in", values, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserNotIn(List<String> values) {
            addCriterion("REVISER not in", values, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserBetween(String value1, String value2) {
            addCriterion("REVISER between", value1, value2, "reviser");
            return (Criteria) this;
        }

        public Criteria andReviserNotBetween(String value1, String value2) {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(Integer value) {
            addCriterion("FUNC_ID =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(Integer value) {
            addCriterion("FUNC_ID <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(Integer value) {
            addCriterion("FUNC_ID >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(Integer value) {
            addCriterion("FUNC_ID <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(Integer value) {
            addCriterion("FUNC_ID <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<Integer> values) {
            addCriterion("FUNC_ID in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<Integer> values) {
            addCriterion("FUNC_ID not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_ID not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andReuseFlagIsNull() {
            addCriterion("REUSE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReuseFlagIsNotNull() {
            addCriterion("REUSE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReuseFlagEqualTo(Integer value) {
            addCriterion("REUSE_FLAG =", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagNotEqualTo(Integer value) {
            addCriterion("REUSE_FLAG <>", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagGreaterThan(Integer value) {
            addCriterion("REUSE_FLAG >", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("REUSE_FLAG >=", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagLessThan(Integer value) {
            addCriterion("REUSE_FLAG <", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagLessThanOrEqualTo(Integer value) {
            addCriterion("REUSE_FLAG <=", value, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagIn(List<Integer> values) {
            addCriterion("REUSE_FLAG in", values, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagNotIn(List<Integer> values) {
            addCriterion("REUSE_FLAG not in", values, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagBetween(Integer value1, Integer value2) {
            addCriterion("REUSE_FLAG between", value1, value2, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReuseFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("REUSE_FLAG not between", value1, value2, "reuseFlag");
            return (Criteria) this;
        }

        public Criteria andReqKeyIsNull() {
            addCriterion("REQ_KEY is null");
            return (Criteria) this;
        }

        public Criteria andReqKeyIsNotNull() {
            addCriterion("REQ_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andReqKeyEqualTo(String value) {
            addCriterion("REQ_KEY =", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotEqualTo(String value) {
            addCriterion("REQ_KEY <>", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyGreaterThan(String value) {
            addCriterion("REQ_KEY >", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_KEY >=", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyLessThan(String value) {
            addCriterion("REQ_KEY <", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyLessThanOrEqualTo(String value) {
            addCriterion("REQ_KEY <=", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyLike(String value) {
            addCriterion("REQ_KEY like", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotLike(String value) {
            addCriterion("REQ_KEY not like", value, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyIn(List<String> values) {
            addCriterion("REQ_KEY in", values, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotIn(List<String> values) {
            addCriterion("REQ_KEY not in", values, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyBetween(String value1, String value2) {
            addCriterion("REQ_KEY between", value1, value2, "reqKey");
            return (Criteria) this;
        }

        public Criteria andReqKeyNotBetween(String value1, String value2) {
            addCriterion("REQ_KEY not between", value1, value2, "reqKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyIsNull() {
            addCriterion("RSP_KEY is null");
            return (Criteria) this;
        }

        public Criteria andRspKeyIsNotNull() {
            addCriterion("RSP_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andRspKeyEqualTo(String value) {
            addCriterion("RSP_KEY =", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyNotEqualTo(String value) {
            addCriterion("RSP_KEY <>", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyGreaterThan(String value) {
            addCriterion("RSP_KEY >", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyGreaterThanOrEqualTo(String value) {
            addCriterion("RSP_KEY >=", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyLessThan(String value) {
            addCriterion("RSP_KEY <", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyLessThanOrEqualTo(String value) {
            addCriterion("RSP_KEY <=", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyLike(String value) {
            addCriterion("RSP_KEY like", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyNotLike(String value) {
            addCriterion("RSP_KEY not like", value, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyIn(List<String> values) {
            addCriterion("RSP_KEY in", values, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyNotIn(List<String> values) {
            addCriterion("RSP_KEY not in", values, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyBetween(String value1, String value2) {
            addCriterion("RSP_KEY between", value1, value2, "rspKey");
            return (Criteria) this;
        }

        public Criteria andRspKeyNotBetween(String value1, String value2) {
            addCriterion("RSP_KEY not between", value1, value2, "rspKey");
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