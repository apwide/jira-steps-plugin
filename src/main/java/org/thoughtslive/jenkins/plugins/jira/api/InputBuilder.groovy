package org.thoughtslive.jenkins.plugins.jira.api

class InputBuilder {

    def buildComment(body) {
        return [body: body]
    }
}
