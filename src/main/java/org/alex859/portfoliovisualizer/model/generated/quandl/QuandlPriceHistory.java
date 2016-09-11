
package org.alex859.portfoliovisualizer.model.generated.quandl;

import java.util.HashMap;
import java.util.List;
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
    "errors",
    "id",
    "source_name",
    "source_code",
    "code",
    "name",
    "urlize_name",
    "display_url",
    "description",
    "updated_at",
    "frequency",
    "from_date",
    "to_date",
    "column_names",
    "private",
    "type",
    "premium",
    "data"
})
public class QuandlPriceHistory {

    @JsonProperty("errors")
    private Errors errors;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("source_code")
    private String sourceCode;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("urlize_name")
    private String urlizeName;
    @JsonProperty("display_url")
    private String displayUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("from_date")
    private String fromDate;
    @JsonProperty("to_date")
    private String toDate;
    @JsonProperty("column_names")
    private List<String> columnNames = null;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("type")
    private Object type;
    @JsonProperty("premium")
    private Boolean premium;
    @JsonProperty("data")
    private List<List<Object>> data = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The errors
     */
    @JsonProperty("errors")
    public Errors getErrors() {
        return errors;
    }

    /**
     * 
     * @param errors
     *     The errors
     */
    @JsonProperty("errors")
    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    public QuandlPriceHistory withErrors(Errors errors) {
        this.errors = errors;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public QuandlPriceHistory withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceName
     */
    @JsonProperty("source_name")
    public String getSourceName() {
        return sourceName;
    }

    /**
     * 
     * @param sourceName
     *     The source_name
     */
    @JsonProperty("source_name")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public QuandlPriceHistory withSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceCode
     */
    @JsonProperty("source_code")
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * 
     * @param sourceCode
     *     The source_code
     */
    @JsonProperty("source_code")
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public QuandlPriceHistory withSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public QuandlPriceHistory withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public QuandlPriceHistory withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The urlizeName
     */
    @JsonProperty("urlize_name")
    public String getUrlizeName() {
        return urlizeName;
    }

    /**
     * 
     * @param urlizeName
     *     The urlize_name
     */
    @JsonProperty("urlize_name")
    public void setUrlizeName(String urlizeName) {
        this.urlizeName = urlizeName;
    }

    public QuandlPriceHistory withUrlizeName(String urlizeName) {
        this.urlizeName = urlizeName;
        return this;
    }

    /**
     * 
     * @return
     *     The displayUrl
     */
    @JsonProperty("display_url")
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * 
     * @param displayUrl
     *     The display_url
     */
    @JsonProperty("display_url")
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    public QuandlPriceHistory withDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public QuandlPriceHistory withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public QuandlPriceHistory withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The frequency
     */
    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    /**
     * 
     * @param frequency
     *     The frequency
     */
    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public QuandlPriceHistory withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 
     * @return
     *     The fromDate
     */
    @JsonProperty("from_date")
    public String getFromDate() {
        return fromDate;
    }

    /**
     * 
     * @param fromDate
     *     The from_date
     */
    @JsonProperty("from_date")
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public QuandlPriceHistory withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * 
     * @return
     *     The toDate
     */
    @JsonProperty("to_date")
    public String getToDate() {
        return toDate;
    }

    /**
     * 
     * @param toDate
     *     The to_date
     */
    @JsonProperty("to_date")
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public QuandlPriceHistory withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * 
     * @return
     *     The columnNames
     */
    @JsonProperty("column_names")
    public List<String> getColumnNames() {
        return columnNames;
    }

    /**
     * 
     * @param columnNames
     *     The column_names
     */
    @JsonProperty("column_names")
    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    public QuandlPriceHistory withColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    /**
     * 
     * @return
     *     The _private
     */
    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * @param _private
     *     The private
     */
    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public QuandlPriceHistory withPrivate(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public QuandlPriceHistory withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The premium
     */
    @JsonProperty("premium")
    public Boolean getPremium() {
        return premium;
    }

    /**
     * 
     * @param premium
     *     The premium
     */
    @JsonProperty("premium")
    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public QuandlPriceHistory withPremium(Boolean premium) {
        this.premium = premium;
        return this;
    }

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public List<List<Object>> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(List<List<Object>> data) {
        this.data = data;
    }

    public QuandlPriceHistory withData(List<List<Object>> data) {
        this.data = data;
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

    public QuandlPriceHistory withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(errors).append(id).append(sourceName).append(sourceCode).append(code).append(name).append(urlizeName).append(displayUrl).append(description).append(updatedAt).append(frequency).append(fromDate).append(toDate).append(columnNames).append(_private).append(type).append(premium).append(data).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuandlPriceHistory) == false) {
            return false;
        }
        QuandlPriceHistory rhs = ((QuandlPriceHistory) other);
        return new EqualsBuilder().append(errors, rhs.errors).append(id, rhs.id).append(sourceName, rhs.sourceName).append(sourceCode, rhs.sourceCode).append(code, rhs.code).append(name, rhs.name).append(urlizeName, rhs.urlizeName).append(displayUrl, rhs.displayUrl).append(description, rhs.description).append(updatedAt, rhs.updatedAt).append(frequency, rhs.frequency).append(fromDate, rhs.fromDate).append(toDate, rhs.toDate).append(columnNames, rhs.columnNames).append(_private, rhs._private).append(type, rhs.type).append(premium, rhs.premium).append(data, rhs.data).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
