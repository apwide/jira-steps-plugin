+++
title = "GetProjects"
description = "More about jiraGetProjects step."
tags = ["steps", "project"]
weight = 2
date = "2017-10-21"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### jiraGetProjects

This step queries all projects from the provided JIRA site.

#### Input

* **site** - Optional, default: `JIRA_SITE` environment variable.
* **failOnError** - Optional. default: `true`.

{{% notice note %}}
For more information about input, please refer to the model objects in the [API](https://github.com/jenkinsci/jira-steps-plugin/tree/master/src/main/java/org/thoughtslive/jenkins/plugins/jira/api) package.
{{% /notice %}}

#### Output

* Each step generates generic output, please refer to this [link](config.html#common-response--error-handling) for more information.
* The api response of this jira_get_projects step can be reused later in your script by doing `response.data.required_field_name`.
* You can see some example scenarios [here](https://jenkinsci.github.io/jira-steps-plugin/common_usages.html)
* All the available fields for a jira response can be found in [JIRA API documentation](https://docs.atlassian.com/jira/REST/) depending on your JIRA version.

{{% notice note %}}
`response.data` returns all the fields returned by JIRA API.
{{% /notice %}}

#### Examples

* With default [site](config#environment-variables) from global variables.

    ```groovy
    node {
      stage('JIRA') {
        def projects = jiraGetProjects()
        echo projects.data.toString()
      }
    }
    ```
* `withEnv` to override the default site (or if there is not global site)

    ```groovy
    node {
      stage('JIRA') {
        withEnv(['JIRA_SITE=LOCAL']) {
          def projects = jiraGetProjects()
          echo projects.data.toString()
        }
      }
    }
    ```
* Without environment variables.

    ```groovy
    def projects = jiraGetProjects(), site: 'LOCAL'
    echo projects.data.toString()
    ```
