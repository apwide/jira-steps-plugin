package org.thoughtslive.jenkins.plugins.jira.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kohsuke.stapler.DataBoundConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__({@DataBoundConstructor}))
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Comments implements Serializable {

  private static final long serialVersionUID = 8693517644958876584L;

  @JsonProperty("startAt")
  private Integer startAt;

  @JsonProperty("maxResults")
  private Integer maxResults;

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("comments")
  private List<Comment> comments = null;

}
