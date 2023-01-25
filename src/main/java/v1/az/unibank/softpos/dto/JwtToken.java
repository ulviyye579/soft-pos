package v1.az.unibank.softpos.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "jti",
        "sub",
        "authorities",
        "iat",
        "exp"
})
@Generated("jsonschema2pojo")
public class JwtToken {

    @JsonProperty("jti")
    private String jti;
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("authorities")
    private List<String> authorities = null;
    @JsonProperty("iat")
    private Integer iat;
    @JsonProperty("exp")
    private Integer exp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jti")
    public String getJti() {
        return jti;
    }

    @JsonProperty("jti")
    public void setJti(String jti) {
        this.jti = jti;
    }

    @JsonProperty("sub")
    public String getSub() {
        return sub;
    }

    @JsonProperty("sub")
    public void setSub(String sub) {
        this.sub = sub;
    }

    @JsonProperty("authorities")
    public List<String> getAuthorities() {
        return authorities;
    }

    @JsonProperty("authorities")
    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    @JsonProperty("iat")
    public Integer getIat() {
        return iat;
    }

    @JsonProperty("iat")
    public void setIat(Integer iat) {
        this.iat = iat;
    }

    @JsonProperty("exp")
    public Integer getExp() {
        return exp;
    }

    @JsonProperty("exp")
    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "JwtToken{" +
                "jti='" + jti + '\'' +
                ", sub='" + sub + '\'' +
                ", authorities=" + authorities +
                ", iat=" + iat +
                ", exp=" + exp +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}