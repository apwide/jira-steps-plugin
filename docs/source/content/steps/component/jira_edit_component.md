+++
title = "EditComponent"
description = "More about jiraEditComponent step."
tags = ["steps", "component"]
weight = 3
date = "2017-10-21"
lastmodifierdisplayname = "Naresh Rayapati"
+++

### jiraEditComponent

Edit component based on given input, which should have some minimal information on that object.

{{% notice note %}}
Sometimes it may not possible to directly edit component (rename it) without un tagging all of its current JIRAs.
{{% /notice %}}

#### Input

* **component** - component to be edited.
* **site** - Optional, default: `JIRA_SITE` environment variable.
* **failOnError** - Optional. default: `true`.
* **auditLog** - Optional. default: `true`. Append the build url and build user name to the description.

{{% notice note %}}
It supports all the fields that any jira instance supports including custom fields. For more information about all available input fields, please refer to the [JIRA API documentation](https://docs.atlassian.com/jira/REST/) depending on your JIRA version.
{{% /notice %}}

#### Output

* Each step generates generic output, please refer to this [link](config.html#common-response--error-handling) for more information.
* The api response of this jira_edit_component step can be reused later in your script by doing `response.data.required_field_name`.
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
        def testComponent = [ id: "1000",
                              name: "test-component",
                              description: "desc",
                              project: "TEST" ]
        jiraEditComponent component: testComponent
      }
    }
    ```
* `withEnv` to override the default site (or if there is not global site)

    ```groovy
    node {
      stage('JIRA') {
        withEnv(['JIRA_SITE=LOCAL']) {
          def testComponent = [ id: "1000",
                                name: "test-component",
                                description: "desc",
                                project: "TEST" ]
          jiraEditComponent component: testComponent
        }
      }
    }
    ```
* Without environment variables.

    ```groovy
    def testComponent = [ id: "1000",
                          name: "test-component",
                          description: "desc",
                          project: "TEST" ]
    jiraEditComponent site: "LOCAL", component: testComponent
    ```
