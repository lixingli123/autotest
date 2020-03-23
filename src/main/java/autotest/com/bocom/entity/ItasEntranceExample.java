package autotest.com.bocom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItasEntranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItasEntranceExample() {
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

        public Criteria andEntranceEnvIsNull() {
            addCriterion("ENTRANCE_ENV is null");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvIsNotNull() {
            addCriterion("ENTRANCE_ENV is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvEqualTo(String value) {
            addCriterion("ENTRANCE_ENV =", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvNotEqualTo(String value) {
            addCriterion("ENTRANCE_ENV <>", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvGreaterThan(String value) {
            addCriterion("ENTRANCE_ENV >", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_ENV >=", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvLessThan(String value) {
            addCriterion("ENTRANCE_ENV <", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_ENV <=", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvLike(String value) {
            addCriterion("ENTRANCE_ENV like", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvNotLike(String value) {
            addCriterion("ENTRANCE_ENV not like", value, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvIn(List<String> values) {
            addCriterion("ENTRANCE_ENV in", values, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvNotIn(List<String> values) {
            addCriterion("ENTRANCE_ENV not in", values, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvBetween(String value1, String value2) {
            addCriterion("ENTRANCE_ENV between", value1, value2, "entranceEnv");
            return (Criteria) this;
        }

        public Criteria andEntranceEnvNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_ENV not between", value1, value2, "entranceEnv");
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

        public Criteria andRspSysIdIsNull() {
            addCriterion("RSP_SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andRspSysIdIsNotNull() {
            addCriterion("RSP_SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRspSysIdEqualTo(Integer value) {
            addCriterion("RSP_SYS_ID =", value, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdNotEqualTo(Integer value) {
            addCriterion("RSP_SYS_ID <>", value, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdGreaterThan(Integer value) {
            addCriterion("RSP_SYS_ID >", value, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSP_SYS_ID >=", value, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdLessThan(Integer value) {
            addCriterion("RSP_SYS_ID <", value, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdLessThanOrEqualTo(Integer value) {
            addCriterion("RSP_SYS_ID <=", value, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdIn(List<Integer> values) {
            addCriterion("RSP_SYS_ID in", values, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdNotIn(List<Integer> values) {
            addCriterion("RSP_SYS_ID not in", values, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdBetween(Integer value1, Integer value2) {
            addCriterion("RSP_SYS_ID between", value1, value2, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSysIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RSP_SYS_ID not between", value1, value2, "rspSysId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdIsNull() {
            addCriterion("RSP_SVC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdIsNotNull() {
            addCriterion("RSP_SVC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdEqualTo(Integer value) {
            addCriterion("RSP_SVC_ID =", value, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdNotEqualTo(Integer value) {
            addCriterion("RSP_SVC_ID <>", value, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdGreaterThan(Integer value) {
            addCriterion("RSP_SVC_ID >", value, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSP_SVC_ID >=", value, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdLessThan(Integer value) {
            addCriterion("RSP_SVC_ID <", value, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdLessThanOrEqualTo(Integer value) {
            addCriterion("RSP_SVC_ID <=", value, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdIn(List<Integer> values) {
            addCriterion("RSP_SVC_ID in", values, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdNotIn(List<Integer> values) {
            addCriterion("RSP_SVC_ID not in", values, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdBetween(Integer value1, Integer value2) {
            addCriterion("RSP_SVC_ID between", value1, value2, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andRspSvcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RSP_SVC_ID not between", value1, value2, "rspSvcId");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("PROTOCOL is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("PROTOCOL is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(String value) {
            addCriterion("PROTOCOL =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(String value) {
            addCriterion("PROTOCOL <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(String value) {
            addCriterion("PROTOCOL >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("PROTOCOL >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(String value) {
            addCriterion("PROTOCOL <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(String value) {
            addCriterion("PROTOCOL <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLike(String value) {
            addCriterion("PROTOCOL like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotLike(String value) {
            addCriterion("PROTOCOL not like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<String> values) {
            addCriterion("PROTOCOL in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<String> values) {
            addCriterion("PROTOCOL not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(String value1, String value2) {
            addCriterion("PROTOCOL between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(String value1, String value2) {
            addCriterion("PROTOCOL not between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andMsgFromatIsNull() {
            addCriterion("MSG_FROMAT is null");
            return (Criteria) this;
        }

        public Criteria andMsgFromatIsNotNull() {
            addCriterion("MSG_FROMAT is not null");
            return (Criteria) this;
        }

        public Criteria andMsgFromatEqualTo(String value) {
            addCriterion("MSG_FROMAT =", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatNotEqualTo(String value) {
            addCriterion("MSG_FROMAT <>", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatGreaterThan(String value) {
            addCriterion("MSG_FROMAT >", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatGreaterThanOrEqualTo(String value) {
            addCriterion("MSG_FROMAT >=", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatLessThan(String value) {
            addCriterion("MSG_FROMAT <", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatLessThanOrEqualTo(String value) {
            addCriterion("MSG_FROMAT <=", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatLike(String value) {
            addCriterion("MSG_FROMAT like", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatNotLike(String value) {
            addCriterion("MSG_FROMAT not like", value, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatIn(List<String> values) {
            addCriterion("MSG_FROMAT in", values, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatNotIn(List<String> values) {
            addCriterion("MSG_FROMAT not in", values, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatBetween(String value1, String value2) {
            addCriterion("MSG_FROMAT between", value1, value2, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andMsgFromatNotBetween(String value1, String value2) {
            addCriterion("MSG_FROMAT not between", value1, value2, "msgFromat");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureIsNull() {
            addCriterion("ENTRANCE_NATURE is null");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureIsNotNull() {
            addCriterion("ENTRANCE_NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureEqualTo(String value) {
            addCriterion("ENTRANCE_NATURE =", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureNotEqualTo(String value) {
            addCriterion("ENTRANCE_NATURE <>", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureGreaterThan(String value) {
            addCriterion("ENTRANCE_NATURE >", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_NATURE >=", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureLessThan(String value) {
            addCriterion("ENTRANCE_NATURE <", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_NATURE <=", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureLike(String value) {
            addCriterion("ENTRANCE_NATURE like", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureNotLike(String value) {
            addCriterion("ENTRANCE_NATURE not like", value, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureIn(List<String> values) {
            addCriterion("ENTRANCE_NATURE in", values, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureNotIn(List<String> values) {
            addCriterion("ENTRANCE_NATURE not in", values, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureBetween(String value1, String value2) {
            addCriterion("ENTRANCE_NATURE between", value1, value2, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceNatureNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_NATURE not between", value1, value2, "entranceNature");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusIsNull() {
            addCriterion("ENTRANCE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusIsNotNull() {
            addCriterion("ENTRANCE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusEqualTo(String value) {
            addCriterion("ENTRANCE_STATUS =", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusNotEqualTo(String value) {
            addCriterion("ENTRANCE_STATUS <>", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusGreaterThan(String value) {
            addCriterion("ENTRANCE_STATUS >", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_STATUS >=", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusLessThan(String value) {
            addCriterion("ENTRANCE_STATUS <", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_STATUS <=", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusLike(String value) {
            addCriterion("ENTRANCE_STATUS like", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusNotLike(String value) {
            addCriterion("ENTRANCE_STATUS not like", value, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusIn(List<String> values) {
            addCriterion("ENTRANCE_STATUS in", values, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusNotIn(List<String> values) {
            addCriterion("ENTRANCE_STATUS not in", values, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusBetween(String value1, String value2) {
            addCriterion("ENTRANCE_STATUS between", value1, value2, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andEntranceStatusNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_STATUS not between", value1, value2, "entranceStatus");
            return (Criteria) this;
        }

        public Criteria andCaseParserIsNull() {
            addCriterion("CASE_PARSER is null");
            return (Criteria) this;
        }

        public Criteria andCaseParserIsNotNull() {
            addCriterion("CASE_PARSER is not null");
            return (Criteria) this;
        }

        public Criteria andCaseParserEqualTo(Integer value) {
            addCriterion("CASE_PARSER =", value, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserNotEqualTo(Integer value) {
            addCriterion("CASE_PARSER <>", value, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserGreaterThan(Integer value) {
            addCriterion("CASE_PARSER >", value, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_PARSER >=", value, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserLessThan(Integer value) {
            addCriterion("CASE_PARSER <", value, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_PARSER <=", value, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserIn(List<Integer> values) {
            addCriterion("CASE_PARSER in", values, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserNotIn(List<Integer> values) {
            addCriterion("CASE_PARSER not in", values, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserBetween(Integer value1, Integer value2) {
            addCriterion("CASE_PARSER between", value1, value2, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseParserNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_PARSER not between", value1, value2, "caseParser");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerIsNull() {
            addCriterion("CASE_COMPILER is null");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerIsNotNull() {
            addCriterion("CASE_COMPILER is not null");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerEqualTo(Integer value) {
            addCriterion("CASE_COMPILER =", value, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerNotEqualTo(Integer value) {
            addCriterion("CASE_COMPILER <>", value, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerGreaterThan(Integer value) {
            addCriterion("CASE_COMPILER >", value, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASE_COMPILER >=", value, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerLessThan(Integer value) {
            addCriterion("CASE_COMPILER <", value, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerLessThanOrEqualTo(Integer value) {
            addCriterion("CASE_COMPILER <=", value, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerIn(List<Integer> values) {
            addCriterion("CASE_COMPILER in", values, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerNotIn(List<Integer> values) {
            addCriterion("CASE_COMPILER not in", values, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerBetween(Integer value1, Integer value2) {
            addCriterion("CASE_COMPILER between", value1, value2, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andCaseCompilerNotBetween(Integer value1, Integer value2) {
            addCriterion("CASE_COMPILER not between", value1, value2, "caseCompiler");
            return (Criteria) this;
        }

        public Criteria andTransceiverIsNull() {
            addCriterion("TRANSCEIVER is null");
            return (Criteria) this;
        }

        public Criteria andTransceiverIsNotNull() {
            addCriterion("TRANSCEIVER is not null");
            return (Criteria) this;
        }

        public Criteria andTransceiverEqualTo(Integer value) {
            addCriterion("TRANSCEIVER =", value, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverNotEqualTo(Integer value) {
            addCriterion("TRANSCEIVER <>", value, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverGreaterThan(Integer value) {
            addCriterion("TRANSCEIVER >", value, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSCEIVER >=", value, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverLessThan(Integer value) {
            addCriterion("TRANSCEIVER <", value, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSCEIVER <=", value, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverIn(List<Integer> values) {
            addCriterion("TRANSCEIVER in", values, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverNotIn(List<Integer> values) {
            addCriterion("TRANSCEIVER not in", values, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverBetween(Integer value1, Integer value2) {
            addCriterion("TRANSCEIVER between", value1, value2, "transceiver");
            return (Criteria) this;
        }

        public Criteria andTransceiverNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSCEIVER not between", value1, value2, "transceiver");
            return (Criteria) this;
        }

        public Criteria andRspParserIsNull() {
            addCriterion("RSP_PARSER is null");
            return (Criteria) this;
        }

        public Criteria andRspParserIsNotNull() {
            addCriterion("RSP_PARSER is not null");
            return (Criteria) this;
        }

        public Criteria andRspParserEqualTo(Integer value) {
            addCriterion("RSP_PARSER =", value, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserNotEqualTo(Integer value) {
            addCriterion("RSP_PARSER <>", value, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserGreaterThan(Integer value) {
            addCriterion("RSP_PARSER >", value, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserGreaterThanOrEqualTo(Integer value) {
            addCriterion("RSP_PARSER >=", value, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserLessThan(Integer value) {
            addCriterion("RSP_PARSER <", value, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserLessThanOrEqualTo(Integer value) {
            addCriterion("RSP_PARSER <=", value, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserIn(List<Integer> values) {
            addCriterion("RSP_PARSER in", values, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserNotIn(List<Integer> values) {
            addCriterion("RSP_PARSER not in", values, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserBetween(Integer value1, Integer value2) {
            addCriterion("RSP_PARSER between", value1, value2, "rspParser");
            return (Criteria) this;
        }

        public Criteria andRspParserNotBetween(Integer value1, Integer value2) {
            addCriterion("RSP_PARSER not between", value1, value2, "rspParser");
            return (Criteria) this;
        }

        public Criteria andEntranceDescIsNull() {
            addCriterion("ENTRANCE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andEntranceDescIsNotNull() {
            addCriterion("ENTRANCE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceDescEqualTo(String value) {
            addCriterion("ENTRANCE_DESC =", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescNotEqualTo(String value) {
            addCriterion("ENTRANCE_DESC <>", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescGreaterThan(String value) {
            addCriterion("ENTRANCE_DESC >", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_DESC >=", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescLessThan(String value) {
            addCriterion("ENTRANCE_DESC <", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescLessThanOrEqualTo(String value) {
            addCriterion("ENTRANCE_DESC <=", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescLike(String value) {
            addCriterion("ENTRANCE_DESC like", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescNotLike(String value) {
            addCriterion("ENTRANCE_DESC not like", value, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescIn(List<String> values) {
            addCriterion("ENTRANCE_DESC in", values, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescNotIn(List<String> values) {
            addCriterion("ENTRANCE_DESC not in", values, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescBetween(String value1, String value2) {
            addCriterion("ENTRANCE_DESC between", value1, value2, "entranceDesc");
            return (Criteria) this;
        }

        public Criteria andEntranceDescNotBetween(String value1, String value2) {
            addCriterion("ENTRANCE_DESC not between", value1, value2, "entranceDesc");
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

        public Criteria andFormatTypeIsNull() {
            addCriterion("FORMAT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFormatTypeIsNotNull() {
            addCriterion("FORMAT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFormatTypeEqualTo(String value) {
            addCriterion("FORMAT_TYPE =", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotEqualTo(String value) {
            addCriterion("FORMAT_TYPE <>", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeGreaterThan(String value) {
            addCriterion("FORMAT_TYPE >", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FORMAT_TYPE >=", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeLessThan(String value) {
            addCriterion("FORMAT_TYPE <", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeLessThanOrEqualTo(String value) {
            addCriterion("FORMAT_TYPE <=", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeLike(String value) {
            addCriterion("FORMAT_TYPE like", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotLike(String value) {
            addCriterion("FORMAT_TYPE not like", value, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeIn(List<String> values) {
            addCriterion("FORMAT_TYPE in", values, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotIn(List<String> values) {
            addCriterion("FORMAT_TYPE not in", values, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeBetween(String value1, String value2) {
            addCriterion("FORMAT_TYPE between", value1, value2, "formatType");
            return (Criteria) this;
        }

        public Criteria andFormatTypeNotBetween(String value1, String value2) {
            addCriterion("FORMAT_TYPE not between", value1, value2, "formatType");
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