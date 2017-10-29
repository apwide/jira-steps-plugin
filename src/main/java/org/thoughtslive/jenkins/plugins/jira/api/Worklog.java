package org.thoughtslive.jenkins.plugins.jira.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.net.URI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.kohsuke.stapler.DataBoundConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__({@DataBoundConstructor}))
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Worklog implements Serializable {

  private static final long serialVersionUID = -7546905758922665243L;

  @JsonProperty("issueUri")
  private URI issueUri;

  @JsonProperty("author")
  private User author;

  @JsonProperty("updateAuthor")
  private User updateAuthor;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("creationDate")
  private DateTime creationDate;

  @JsonProperty("updateDate")
  private DateTime updateDate;

  @JsonProperty("startDate")
  private DateTime startDate;

  @JsonProperty("minutesSpent")
  private int minutesSpent;

}
