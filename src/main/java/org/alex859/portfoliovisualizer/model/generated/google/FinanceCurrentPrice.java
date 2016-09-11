
package org.alex859.portfoliovisualizer.model.generated.google;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "t",
    "e",
    "l",
    "l_fix",
    "l_cur",
    "s",
    "ltt",
    "lt",
    "lt_dts",
    "c",
    "c_fix",
    "cp",
    "cp_fix",
    "ccol",
    "pcls_fix"
})
public class FinanceCurrentPrice {

    @JsonProperty("id")
    private String id;
    @JsonProperty("t")
    private String t;
    @JsonProperty("e")
    private String e;
    @JsonProperty("l")
    private String l;
    @JsonProperty("l_fix")
    private String lFix;
    @JsonProperty("l_cur")
    private String lCur;
    @JsonProperty("s")
    private String s;
    @JsonProperty("ltt")
    private String ltt;
    @JsonProperty("lt")
    private String lt;
    @JsonProperty("lt_dts")
    private String ltDts;
    @JsonProperty("c")
    private String c;
    @JsonProperty("c_fix")
    private String cFix;
    @JsonProperty("cp")
    private String cp;
    @JsonProperty("cp_fix")
    private String cpFix;
    @JsonProperty("ccol")
    private String ccol;
    @JsonProperty("pcls_fix")
    private String pclsFix;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinanceCurrentPrice withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The t
     */
    @JsonProperty("t")
    public String getT() {
        return t;
    }

    /**
     * 
     * @param t
     *     The t
     */
    @JsonProperty("t")
    public void setT(String t) {
        this.t = t;
    }

    public FinanceCurrentPrice withT(String t) {
        this.t = t;
        return this;
    }

    /**
     * 
     * @return
     *     The e
     */
    @JsonProperty("e")
    public String getE() {
        return e;
    }

    /**
     * 
     * @param e
     *     The e
     */
    @JsonProperty("e")
    public void setE(String e) {
        this.e = e;
    }

    public FinanceCurrentPrice withE(String e) {
        this.e = e;
        return this;
    }

    /**
     * 
     * @return
     *     The l
     */
    @JsonProperty("l")
    public String getL() {
        return l;
    }

    /**
     * 
     * @param l
     *     The l
     */
    @JsonProperty("l")
    public void setL(String l) {
        this.l = l;
    }

    public FinanceCurrentPrice withL(String l) {
        this.l = l;
        return this;
    }

    /**
     * 
     * @return
     *     The lFix
     */
    @JsonProperty("l_fix")
    public String getLFix() {
        return lFix;
    }

    /**
     * 
     * @param lFix
     *     The l_fix
     */
    @JsonProperty("l_fix")
    public void setLFix(String lFix) {
        this.lFix = lFix;
    }

    public FinanceCurrentPrice withLFix(String lFix) {
        this.lFix = lFix;
        return this;
    }

    /**
     * 
     * @return
     *     The lCur
     */
    @JsonProperty("l_cur")
    public String getLCur() {
        return lCur;
    }

    /**
     * 
     * @param lCur
     *     The l_cur
     */
    @JsonProperty("l_cur")
    public void setLCur(String lCur) {
        this.lCur = lCur;
    }

    public FinanceCurrentPrice withLCur(String lCur) {
        this.lCur = lCur;
        return this;
    }

    /**
     * 
     * @return
     *     The s
     */
    @JsonProperty("s")
    public String getS() {
        return s;
    }

    /**
     * 
     * @param s
     *     The s
     */
    @JsonProperty("s")
    public void setS(String s) {
        this.s = s;
    }

    public FinanceCurrentPrice withS(String s) {
        this.s = s;
        return this;
    }

    /**
     * 
     * @return
     *     The ltt
     */
    @JsonProperty("ltt")
    public String getLtt() {
        return ltt;
    }

    /**
     * 
     * @param ltt
     *     The ltt
     */
    @JsonProperty("ltt")
    public void setLtt(String ltt) {
        this.ltt = ltt;
    }

    public FinanceCurrentPrice withLtt(String ltt) {
        this.ltt = ltt;
        return this;
    }

    /**
     * 
     * @return
     *     The lt
     */
    @JsonProperty("lt")
    public String getLt() {
        return lt;
    }

    /**
     * 
     * @param lt
     *     The lt
     */
    @JsonProperty("lt")
    public void setLt(String lt) {
        this.lt = lt;
    }

    public FinanceCurrentPrice withLt(String lt) {
        this.lt = lt;
        return this;
    }

    /**
     * 
     * @return
     *     The ltDts
     */
    @JsonProperty("lt_dts")
    public String getLtDts() {
        return ltDts;
    }

    /**
     * 
     * @param ltDts
     *     The lt_dts
     */
    @JsonProperty("lt_dts")
    public void setLtDts(String ltDts) {
        this.ltDts = ltDts;
    }

    public FinanceCurrentPrice withLtDts(String ltDts) {
        this.ltDts = ltDts;
        return this;
    }

    /**
     * 
     * @return
     *     The c
     */
    @JsonProperty("c")
    public String getC() {
        return c;
    }

    /**
     * 
     * @param c
     *     The c
     */
    @JsonProperty("c")
    public void setC(String c) {
        this.c = c;
    }

    public FinanceCurrentPrice withC(String c) {
        this.c = c;
        return this;
    }

    /**
     * 
     * @return
     *     The cFix
     */
    @JsonProperty("c_fix")
    public String getCFix() {
        return cFix;
    }

    /**
     * 
     * @param cFix
     *     The c_fix
     */
    @JsonProperty("c_fix")
    public void setCFix(String cFix) {
        this.cFix = cFix;
    }

    public FinanceCurrentPrice withCFix(String cFix) {
        this.cFix = cFix;
        return this;
    }

    /**
     * 
     * @return
     *     The cp
     */
    @JsonProperty("cp")
    public String getCp() {
        return cp;
    }

    /**
     * 
     * @param cp
     *     The cp
     */
    @JsonProperty("cp")
    public void setCp(String cp) {
        this.cp = cp;
    }

    public FinanceCurrentPrice withCp(String cp) {
        this.cp = cp;
        return this;
    }

    /**
     * 
     * @return
     *     The cpFix
     */
    @JsonProperty("cp_fix")
    public String getCpFix() {
        return cpFix;
    }

    /**
     * 
     * @param cpFix
     *     The cp_fix
     */
    @JsonProperty("cp_fix")
    public void setCpFix(String cpFix) {
        this.cpFix = cpFix;
    }

    public FinanceCurrentPrice withCpFix(String cpFix) {
        this.cpFix = cpFix;
        return this;
    }

    /**
     * 
     * @return
     *     The ccol
     */
    @JsonProperty("ccol")
    public String getCcol() {
        return ccol;
    }

    /**
     * 
     * @param ccol
     *     The ccol
     */
    @JsonProperty("ccol")
    public void setCcol(String ccol) {
        this.ccol = ccol;
    }

    public FinanceCurrentPrice withCcol(String ccol) {
        this.ccol = ccol;
        return this;
    }

    /**
     * 
     * @return
     *     The pclsFix
     */
    @JsonProperty("pcls_fix")
    public String getPclsFix() {
        return pclsFix;
    }

    /**
     * 
     * @param pclsFix
     *     The pcls_fix
     */
    @JsonProperty("pcls_fix")
    public void setPclsFix(String pclsFix) {
        this.pclsFix = pclsFix;
    }

    public FinanceCurrentPrice withPclsFix(String pclsFix) {
        this.pclsFix = pclsFix;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public FinanceCurrentPrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(t).append(e).append(l).append(lFix).append(lCur).append(s).append(ltt).append(lt).append(ltDts).append(c).append(cFix).append(cp).append(cpFix).append(ccol).append(pclsFix).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceCurrentPrice) == false) {
            return false;
        }
        FinanceCurrentPrice rhs = ((FinanceCurrentPrice) other);
        return new EqualsBuilder().append(id, rhs.id).append(t, rhs.t).append(e, rhs.e).append(l, rhs.l).append(lFix, rhs.lFix).append(lCur, rhs.lCur).append(s, rhs.s).append(ltt, rhs.ltt).append(lt, rhs.lt).append(ltDts, rhs.ltDts).append(c, rhs.c).append(cFix, rhs.cFix).append(cp, rhs.cp).append(cpFix, rhs.cpFix).append(ccol, rhs.ccol).append(pclsFix, rhs.pclsFix).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
