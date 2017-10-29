package org.thoughtslive.jenkins.plugins.jira.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kohsuke.stapler.DataBoundConstructor;
import org.thoughtslive.jenkins.plugins.jira.api.input.BasicIssue;

@Data
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__({@DataBoundConstructor}))
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class IssueLink implements Serializable {

  private static final long serialVersionUID = -6353677854648448215L;

  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private IssueLinkType type;

  @JsonProperty("inwardIssue")
  private BasicIssue inwardIssue;

  @JsonProperty("outwardIssue")
  private BasicIssue outwardIssue;

  @JsonProperty("comment")
  private Comment comment;
}
