package com.anderson.entity;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUloginnameIsNull() {
            addCriterion("uloginname is null");
            return (Criteria) this;
        }

        public Criteria andUloginnameIsNotNull() {
            addCriterion("uloginname is not null");
            return (Criteria) this;
        }

        public Criteria andUloginnameEqualTo(String value) {
            addCriterion("uloginname =", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotEqualTo(String value) {
            addCriterion("uloginname <>", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameGreaterThan(String value) {
            addCriterion("uloginname >", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameGreaterThanOrEqualTo(String value) {
            addCriterion("uloginname >=", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameLessThan(String value) {
            addCriterion("uloginname <", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameLessThanOrEqualTo(String value) {
            addCriterion("uloginname <=", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameLike(String value) {
            addCriterion("uloginname like", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotLike(String value) {
            addCriterion("uloginname not like", value, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameIn(List<String> values) {
            addCriterion("uloginname in", values, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotIn(List<String> values) {
            addCriterion("uloginname not in", values, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameBetween(String value1, String value2) {
            addCriterion("uloginname between", value1, value2, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUloginnameNotBetween(String value1, String value2) {
            addCriterion("uloginname not between", value1, value2, "uloginname");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUfirstnameIsNull() {
            addCriterion("ufirstname is null");
            return (Criteria) this;
        }

        public Criteria andUfirstnameIsNotNull() {
            addCriterion("ufirstname is not null");
            return (Criteria) this;
        }

        public Criteria andUfirstnameEqualTo(String value) {
            addCriterion("ufirstname =", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameNotEqualTo(String value) {
            addCriterion("ufirstname <>", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameGreaterThan(String value) {
            addCriterion("ufirstname >", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("ufirstname >=", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameLessThan(String value) {
            addCriterion("ufirstname <", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameLessThanOrEqualTo(String value) {
            addCriterion("ufirstname <=", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameLike(String value) {
            addCriterion("ufirstname like", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameNotLike(String value) {
            addCriterion("ufirstname not like", value, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameIn(List<String> values) {
            addCriterion("ufirstname in", values, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameNotIn(List<String> values) {
            addCriterion("ufirstname not in", values, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameBetween(String value1, String value2) {
            addCriterion("ufirstname between", value1, value2, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUfirstnameNotBetween(String value1, String value2) {
            addCriterion("ufirstname not between", value1, value2, "ufirstname");
            return (Criteria) this;
        }

        public Criteria andUlastnameIsNull() {
            addCriterion("ulastname is null");
            return (Criteria) this;
        }

        public Criteria andUlastnameIsNotNull() {
            addCriterion("ulastname is not null");
            return (Criteria) this;
        }

        public Criteria andUlastnameEqualTo(String value) {
            addCriterion("ulastname =", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameNotEqualTo(String value) {
            addCriterion("ulastname <>", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameGreaterThan(String value) {
            addCriterion("ulastname >", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameGreaterThanOrEqualTo(String value) {
            addCriterion("ulastname >=", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameLessThan(String value) {
            addCriterion("ulastname <", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameLessThanOrEqualTo(String value) {
            addCriterion("ulastname <=", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameLike(String value) {
            addCriterion("ulastname like", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameNotLike(String value) {
            addCriterion("ulastname not like", value, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameIn(List<String> values) {
            addCriterion("ulastname in", values, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameNotIn(List<String> values) {
            addCriterion("ulastname not in", values, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameBetween(String value1, String value2) {
            addCriterion("ulastname between", value1, value2, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUlastnameNotBetween(String value1, String value2) {
            addCriterion("ulastname not between", value1, value2, "ulastname");
            return (Criteria) this;
        }

        public Criteria andUstatusIsNull() {
            addCriterion("ustatus is null");
            return (Criteria) this;
        }

        public Criteria andUstatusIsNotNull() {
            addCriterion("ustatus is not null");
            return (Criteria) this;
        }

        public Criteria andUstatusEqualTo(Integer value) {
            addCriterion("ustatus =", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotEqualTo(Integer value) {
            addCriterion("ustatus <>", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusGreaterThan(Integer value) {
            addCriterion("ustatus >", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ustatus >=", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusLessThan(Integer value) {
            addCriterion("ustatus <", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ustatus <=", value, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusIn(List<Integer> values) {
            addCriterion("ustatus in", values, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotIn(List<Integer> values) {
            addCriterion("ustatus not in", values, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusBetween(Integer value1, Integer value2) {
            addCriterion("ustatus between", value1, value2, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ustatus not between", value1, value2, "ustatus");
            return (Criteria) this;
        }

        public Criteria andUpowerIsNull() {
            addCriterion("upower is null");
            return (Criteria) this;
        }

        public Criteria andUpowerIsNotNull() {
            addCriterion("upower is not null");
            return (Criteria) this;
        }

        public Criteria andUpowerEqualTo(Integer value) {
            addCriterion("upower =", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerNotEqualTo(Integer value) {
            addCriterion("upower <>", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerGreaterThan(Integer value) {
            addCriterion("upower >", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("upower >=", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerLessThan(Integer value) {
            addCriterion("upower <", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerLessThanOrEqualTo(Integer value) {
            addCriterion("upower <=", value, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerIn(List<Integer> values) {
            addCriterion("upower in", values, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerNotIn(List<Integer> values) {
            addCriterion("upower not in", values, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerBetween(Integer value1, Integer value2) {
            addCriterion("upower between", value1, value2, "upower");
            return (Criteria) this;
        }

        public Criteria andUpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("upower not between", value1, value2, "upower");
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