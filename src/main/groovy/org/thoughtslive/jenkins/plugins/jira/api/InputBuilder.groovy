package org.thoughtslive.jenkins.plugins.jira.api

public class InputBuilder {
    public static buildComment(body) {
        return [body: body]
    }
}
