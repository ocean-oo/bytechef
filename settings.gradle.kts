/*
 * This file was generated by the Gradle "init" task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/7.1/userguide/multi_project_builds.html
 */

pluginManagement {
    repositories {
        gradlePluginPortal()

        mavenCentral()

        maven {
            url = uri("https://repo.spring.io/release")
        }
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}

rootProject.name = "bytechef"

include("cli:cli-app")
include("cli:commands:component")
include("cli:commands:component:init:openapi")

include("server:apps:server-app")

include("server:libs:atlas:atlas-configuration:atlas-configuration-api")
include("server:libs:atlas:atlas-configuration:atlas-configuration-config")
include("server:libs:atlas:atlas-configuration:atlas-configuration-converter")
include("server:libs:atlas:atlas-configuration:atlas-configuration-repository:atlas-configuration-repository-api")
include("server:libs:atlas:atlas-configuration:atlas-configuration-repository:atlas-configuration-repository-git")
include("server:libs:atlas:atlas-configuration:atlas-configuration-repository:atlas-configuration-repository-jdbc")
include("server:libs:atlas:atlas-configuration:atlas-configuration-repository:atlas-configuration-repository-resource")
include("server:libs:atlas:atlas-configuration:atlas-configuration-service")
include("server:libs:atlas:atlas-coordinator:atlas-coordinator-api")
include("server:libs:atlas:atlas-coordinator:atlas-coordinator-config")
include("server:libs:atlas:atlas-coordinator:atlas-coordinator-impl")
include("server:libs:atlas:atlas-execution:atlas-execution-api")
include("server:libs:atlas:atlas-execution:atlas-execution-config")
include("server:libs:atlas:atlas-execution:atlas-execution-repository:atlas-execution-repository-api")
include("server:libs:atlas:atlas-execution:atlas-execution-repository:atlas-execution-repository-jdbc")
include("server:libs:atlas:atlas-execution:atlas-execution-repository:atlas-execution-repository-memory")
include("server:libs:atlas:atlas-execution:atlas-execution-service")
include("server:libs:atlas:atlas-file-storage:atlas-file-storage-api")
include("server:libs:atlas:atlas-file-storage:atlas-file-storage-impl")
include("server:libs:atlas:atlas-worker:atlas-worker-api")
include("server:libs:atlas:atlas-worker:atlas-worker-config")
include("server:libs:atlas:atlas-worker:atlas-worker-impl")

include("server:libs:automation:automation-configuration:automation-configuration-api")
include("server:libs:automation:automation-configuration:automation-configuration-instance-impl")
include("server:libs:automation:automation-configuration:automation-configuration-rest:automation-configuration-rest-api")
include("server:libs:automation:automation-configuration:automation-configuration-rest:automation-configuration-rest-impl")
include("server:libs:automation:automation-configuration:automation-configuration-service")
include("server:libs:automation:automation-mcp-server")
include("server:libs:automation:automation-security-web:automation-security-web-impl")
include("server:libs:automation:automation-swagger")
include("server:libs:automation:automation-workflow:automation-workflow-coordinator")
include("server:libs:automation:automation-workflow:automation-workflow-execution:automation-workflow-execution-api")
include("server:libs:automation:automation-workflow:automation-workflow-execution:automation-workflow-execution-rest")
include("server:libs:automation:automation-workflow:automation-workflow-execution:automation-workflow-execution-service")

include("server:libs:config:app-config")
include("server:libs:config:async-config")
include("server:libs:config:automation-demo-config")
include("server:libs:config:cache-config")
include("server:libs:config:environment-config")
include("server:libs:config:jackson-config")
include("server:libs:config:jdbc-config")
include("server:libs:config:logback-config")
include("server:libs:config:messages-config")
include("server:libs:config:liquibase-config")
include("server:libs:config:static-resources-config")
include("server:libs:config:security-config")
include("server:libs:config:tenant-single-security-config")

include("server:libs:core:commons:commons-data")
include("server:libs:core:commons:commons-util")
include("server:libs:core:error:error-api")
include("server:libs:core:exception:exception-api")
include("server:libs:core:encryption:encryption-api")
include("server:libs:core:encryption:encryption-filesystem")
include("server:libs:core:encryption:encryption-impl")
include("server:libs:core:encryption:encryption-property")
include("server:libs:core:evaluator:evaluator-api")
include("server:libs:core:evaluator:evaluator-impl")
include("server:libs:core:file-storage:file-storage-api")
include("server:libs:core:file-storage:file-storage-base64-service")
include("server:libs:core:file-storage:file-storage-filesystem-service")
include("server:libs:core:class-loader:class-loader-api")
include("server:libs:core:message:message-api")
include("server:libs:core:message:message-broker:message-broker-amqp")
include("server:libs:core:message:message-broker:message-broker-api")
include("server:libs:core:message:message-broker:message-broker-jms")
include("server:libs:core:message:message-broker:message-broker-kafka")
include("server:libs:core:message:message-broker:message-broker-redis")
include("server:libs:core:message:message-broker:message-broker-sync")
include("server:libs:core:message:message-event:message-event-api")
include("server:libs:core:message:message-event:message-event-impl")
include("server:libs:core:rest:rest-api")
include("server:libs:core:rest:rest-impl")
include("server:libs:core:tenant:tenant-api")
include("server:libs:core:tenant:tenant-single-service")

include("server:libs:mcp:mcp-server")
include("server:libs:mcp:mcp-tool")

include("server:libs:platform:platform-ai:platform-ai-api")
include("server:libs:platform:platform-ai:platform-ai-rest")
include("server:libs:platform:platform-ai:platform-ai-service")
include("server:libs:platform:platform-api")
include("server:libs:platform:platform-category:platform-category-api")
include("server:libs:platform:platform-category:platform-category-service")
include("server:libs:platform:platform-component:platform-component-api")
include("server:libs:platform:platform-component:platform-component-service")
include("server:libs:platform:platform-component:platform-component-test-int-support")
include("server:libs:platform:platform-configuration:platform-configuration-api")
include("server:libs:platform:platform-configuration:platform-configuration-rest:platform-configuration-rest-api")
include("server:libs:platform:platform-configuration:platform-configuration-rest:platform-configuration-rest-impl")
include("server:libs:platform:platform-configuration:platform-configuration-service")
include("server:libs:platform:platform-connection:platform-connection-api")
include("server:libs:platform:platform-connection:platform-connection-service")
include("server:libs:platform:platform-coordinator")
include("server:libs:platform:platform-data-storage:platform-data-storage-api")
include("server:libs:platform:platform-data-storage:platform-data-storage-file-storage:platform-data-storage-file-storage-api")
include("server:libs:platform:platform-data-storage:platform-data-storage-file-storage:platform-data-storage-file-storage-service")
include("server:libs:platform:platform-data-storage:platform-data-storage-jdbc:platform-data-storage-jdbc-api")
include("server:libs:platform:platform-data-storage:platform-data-storage-jdbc:platform-data-storage-jdbc-service")
include("server:libs:platform:platform-feature-flags")
include("server:libs:platform:platform-file-storage:platform-file-storage-api")
include("server:libs:platform:platform-file-storage:platform-file-storage-impl")
include("server:libs:platform:platform-oauth2:platform-oauth2-api")
include("server:libs:platform:platform-oauth2:platform-oauth2-service")
include("server:libs:platform:platform-scheduler:platform-scheduler-api")
include("server:libs:platform:platform-scheduler:platform-scheduler-impl")
include("server:libs:platform:platform-security-web:platform-security-web-api")
include("server:libs:platform:platform-security-web:platform-security-web-impl")
include("server:libs:platform:platform-swagger")
include("server:libs:platform:platform-tag:platform-tag-api")
include("server:libs:platform:platform-tag:platform-tag-service")
include("server:libs:platform:platform-user:platform-user-api")
include("server:libs:platform:platform-user:platform-user-rest:platform-user-rest-api")
include("server:libs:platform:platform-user:platform-user-rest:platform-user-rest-impl")
include("server:libs:platform:platform-user:platform-user-service")
include("server:libs:platform:platform-webhook:platform-webhook-api")
include("server:libs:platform:platform-webhook:platform-webhook-impl")
include("server:libs:platform:platform-webhook:platform-webhook-rest:platform-webhook-rest-api")
include("server:libs:platform:platform-webhook:platform-webhook-rest:platform-webhook-rest-impl")
include("server:libs:platform:platform-workflow:platform-workflow-coordinator:platform-workflow-coordinator-api")
include("server:libs:platform:platform-workflow:platform-workflow-coordinator:platform-workflow-coordinator-impl")
include("server:libs:platform:platform-workflow:platform-workflow-task-dispatcher:platform-workflow-task-dispatcher-api")
include("server:libs:platform:platform-workflow:platform-workflow-task-dispatcher:platform-workflow-task-dispatcher-service")
include("server:libs:platform:platform-workflow:platform-workflow-task-dispatcher:platform-workflow-task-dispatcher-test-int-support")
include("server:libs:platform:platform-workflow:platform-workflow-test:platform-workflow-test-api")
include("server:libs:platform:platform-workflow:platform-workflow-test:platform-workflow-test-rest")
include("server:libs:platform:platform-workflow:platform-workflow-test:platform-workflow-test-service")
include("server:libs:platform:platform-workflow:platform-workflow-worker:platform-workflow-worker-api")
include("server:libs:platform:platform-workflow:platform-workflow-worker:platform-workflow-worker-impl")
include("server:libs:platform:platform-workflow:platform-workflow-execution:platform-workflow-execution-api")
include("server:libs:platform:platform-workflow:platform-workflow-execution:platform-workflow-execution-rest:platform-workflow-execution-rest-api")
include("server:libs:platform:platform-workflow:platform-workflow-execution:platform-workflow-execution-rest:platform-workflow-execution-rest-impl")
include("server:libs:platform:platform-workflow:platform-workflow-execution:platform-workflow-execution-service")

include("server:libs:modules:components:accelo")
include("server:libs:modules:components:active-campaign")
include("server:libs:modules:components:acumbamail")
include("server:libs:modules:components:affinity")
include("server:libs:modules:components:agile-crm")
include("server:libs:modules:components:aha")
include("server:libs:modules:components:ahrefs")
include("server:libs:modules:components:ai:agent")
include("server:libs:modules:components:ai:agent:chat-memory")
include("server:libs:modules:components:ai:agent:chat-memory:chat-memory-in-memory")
include("server:libs:modules:components:ai:agent:chat-memory:chat-memory-vectorstore")
include("server:libs:modules:components:ai:agent:rag:rag-modular")
include("server:libs:modules:components:ai:agent:rag:rag-modular:query-transformer")
include("server:libs:modules:components:ai:agent:rag:rag-modular:query-expander")
include("server:libs:modules:components:ai:agent:rag:rag-modular:query-augmenter")
include("server:libs:modules:components:ai:agent:rag:rag-modular:document-retriever")
include("server:libs:modules:components:ai:agent:rag:rag-modular:document-joiner")
include("server:libs:modules:components:ai:agent:rag:rag-questionanswer")
//include("server:libs:modules:components:ai:llm:amazon-bedrock")
include("server:libs:modules:components:ai:llm:anthropic")
include("server:libs:modules:components:ai:llm:azure-open-ai")
include("server:libs:modules:components:ai:llm:deepseek")
include("server:libs:modules:components:ai:llm:groq")
include("server:libs:modules:components:ai:llm:hugging-face")
include("server:libs:modules:components:ai:llm:mistral")
include("server:libs:modules:components:ai:llm:nvidia")
include("server:libs:modules:components:ai:llm:ollama")
include("server:libs:modules:components:ai:llm:open-ai")
include("server:libs:modules:components:ai:llm:perplexity")
include("server:libs:modules:components:ai:llm:stability")
include("server:libs:modules:components:ai:llm:vertex:gemini")
include("server:libs:modules:components:ai:universal:universal-image")
include("server:libs:modules:components:ai:universal:universal-text")
include("server:libs:modules:components:ai:vectorstore:milvus")
include("server:libs:modules:components:ai:vectorstore:pinecone")
include("server:libs:modules:components:ai:vectorstore:qdrant")
include("server:libs:modules:components:ai:vectorstore:reader")
include("server:libs:modules:components:ai:vectorstore:redis")
include("server:libs:modules:components:ai:vectorstore:transformer:enricher")
include("server:libs:modules:components:ai:vectorstore:transformer:splitter")
include("server:libs:modules:components:ai:vectorstore:typesense")
include("server:libs:modules:components:ai:vectorstore:weaviate")
include("server:libs:modules:components:airtable")
include("server:libs:modules:components:aitable")
include("server:libs:modules:components:amplitude")
include("server:libs:modules:components:apify")
include("server:libs:modules:components:apollo")
include("server:libs:modules:components:app-event")
include("server:libs:modules:components:approval-link")
include("server:libs:modules:components:asana")
include("server:libs:modules:components:attio")
include("server:libs:modules:components:aws:aws-s3")
include("server:libs:modules:components:bamboohr")
include("server:libs:modules:components:baserow")
include("server:libs:modules:components:bash")
include("server:libs:modules:components:beamer")
include("server:libs:modules:components:binance")
include("server:libs:modules:components:bitbucket")
include("server:libs:modules:components:bolna")
include("server:libs:modules:components:box")
include("server:libs:modules:components:brevo")
include("server:libs:modules:components:calcom")
include("server:libs:modules:components:calendly")
include("server:libs:modules:components:capsule-crm")
include("server:libs:modules:components:chat")
include("server:libs:modules:components:clickup")
include("server:libs:modules:components:coda")
include("server:libs:modules:components:contiguity")
include("server:libs:modules:components:copper")
include("server:libs:modules:components:crypto-helper")
include("server:libs:modules:components:csv-file")
include("server:libs:modules:components:data-mapper")
include("server:libs:modules:components:data-storage")
include("server:libs:modules:components:data-stream")
include("server:libs:modules:components:date-helper")
include("server:libs:modules:components:delay")
include("server:libs:modules:components:discord")
include("server:libs:modules:components:docusign")
include("server:libs:modules:components:dropbox")
include("server:libs:modules:components:elevenlabs")
include("server:libs:modules:components:email")
include("server:libs:modules:components:encharge")
include("server:libs:modules:components:example")
include("server:libs:modules:components:figma")
include("server:libs:modules:components:file-storage")
include("server:libs:modules:components:filesystem")
include("server:libs:modules:components:freshdesk")
include("server:libs:modules:components:freshsales")
include("server:libs:modules:components:github")
include("server:libs:modules:components:gitlab")
include("server:libs:modules:components:google:google-calendar")
include("server:libs:modules:components:google:google-chat")
include("server:libs:modules:components:google:google-commons")
include("server:libs:modules:components:google:google-contacts")
include("server:libs:modules:components:google:google-docs")
include("server:libs:modules:components:google:google-drive")
include("server:libs:modules:components:google:google-forms")
include("server:libs:modules:components:google:google-mail")
include("server:libs:modules:components:google:google-meet")
include("server:libs:modules:components:google:google-sheets")
include("server:libs:modules:components:google:google-slides")
include("server:libs:modules:components:google:google-tasks")
include("server:libs:modules:components:google:youtube")
include("server:libs:modules:components:gotify")
include("server:libs:modules:components:graphql-client")
include("server:libs:modules:components:hacker-news")
include("server:libs:modules:components:http-client")
include("server:libs:modules:components:hubspot")
include("server:libs:modules:components:hunter")
include("server:libs:modules:components:image-helper")
include("server:libs:modules:components:infobip")
include("server:libs:modules:components:insightly")
include("server:libs:modules:components:intercom")
include("server:libs:modules:components:jira")
include("server:libs:modules:components:jotform")
include("server:libs:modules:components:json-file")
include("server:libs:modules:components:json-helper")
include("server:libs:modules:components:jwt-helper")
include("server:libs:modules:components:keap")
include("server:libs:modules:components:klaviyo")
include("server:libs:modules:components:linear")
include("server:libs:modules:components:logger")
include("server:libs:modules:components:mailchimp")
include("server:libs:modules:components:mailerlite")
include("server:libs:modules:components:map")
include("server:libs:modules:components:math-helper")
include("server:libs:modules:components:mattermost")
include("server:libs:modules:components:mautic")
include("server:libs:modules:components:microsoft:microsoft-commons")
include("server:libs:modules:components:microsoft:microsoft-excel")
include("server:libs:modules:components:microsoft:microsoft-one-drive")
include("server:libs:modules:components:microsoft:microsoft-outlook-365")
include("server:libs:modules:components:microsoft:microsoft-share-point")
include("server:libs:modules:components:microsoft:microsoft-teams")
include("server:libs:modules:components:microsoft:microsoft-to-do")
include("server:libs:modules:components:mixpanel")
include("server:libs:modules:components:monday")
include("server:libs:modules:components:myob")
include("server:libs:modules:components:mysql")
include("server:libs:modules:components:nifty")
include("server:libs:modules:components:nocodb")
include("server:libs:modules:components:notion")
include("server:libs:modules:components:nutshell")
include("server:libs:modules:components:object-helper")
include("server:libs:modules:components:ods-file")
include("server:libs:modules:components:one-simple-api")
include("server:libs:modules:components:pagerduty")
include("server:libs:modules:components:pdf-helper")
include("server:libs:modules:components:petstore")
include("server:libs:modules:components:pipedrive")
include("server:libs:modules:components:pipeliner")
include("server:libs:modules:components:postgresql")
include("server:libs:modules:components:posthog")
include("server:libs:modules:components:productboard")
include("server:libs:modules:components:pushover")
include("server:libs:modules:components:quickbooks")
include("server:libs:modules:components:rabbitmq")
include("server:libs:modules:components:random-helper")
include("server:libs:modules:components:reckon")
include("server:libs:modules:components:reddit")
include("server:libs:modules:components:resend")
include("server:libs:modules:components:request")
include("server:libs:modules:components:retable")
include("server:libs:modules:components:rocketchat")
include("server:libs:modules:components:salesflare")
include("server:libs:modules:components:salesforce")
include("server:libs:modules:components:schedule")
include("server:libs:modules:components:scrape-graph-ai")
include("server:libs:modules:components:script")
include("server:libs:modules:components:sendfox")
include("server:libs:modules:components:sendgrid")
include("server:libs:modules:components:shopify")
include("server:libs:modules:components:slack")
include("server:libs:modules:components:snowflake")
include("server:libs:modules:components:spotify")
include("server:libs:modules:components:stripe")
include("server:libs:modules:components:supabase")
include("server:libs:modules:components:tavily")
include("server:libs:modules:components:teamwork")
include("server:libs:modules:components:text-helper")
include("server:libs:modules:components:todoist")
include("server:libs:modules:components:trello")
include("server:libs:modules:components:twilio")
include("server:libs:modules:components:typeform")
include("server:libs:modules:components:var")
include("server:libs:modules:components:vtiger")
include("server:libs:modules:components:webflow")
include("server:libs:modules:components:webhook")
include("server:libs:modules:components:whatsapp")
include("server:libs:modules:components:wolfram-alpha:wolfram-alpha-full-results")
include("server:libs:modules:components:wolfram-alpha:wolfram-alpha-shortanswers")
include("server:libs:modules:components:woocommerce")
include("server:libs:modules:components:wordpress")
include("server:libs:modules:components:wrike")
include("server:libs:modules:components:xero")
include("server:libs:modules:components:xlsx-file")
include("server:libs:modules:components:xml-file")
include("server:libs:modules:components:xml-helper")
include("server:libs:modules:components:zendesk-sell")
include("server:libs:modules:components:zeplin")
include("server:libs:modules:components:zoho:zoho-books")
include("server:libs:modules:components:zoho:zoho-commons")
include("server:libs:modules:components:zoho:zoho-crm")
include("server:libs:modules:components:zoho:zoho-invoice")
include("server:libs:modules:components:zoom")

include("server:libs:modules:task-dispatchers:approval")
include("server:libs:modules:task-dispatchers:branch")
include("server:libs:modules:task-dispatchers:condition")
include("server:libs:modules:task-dispatchers:each")
include("server:libs:modules:task-dispatchers:fork-join")
include("server:libs:modules:task-dispatchers:loop")
include("server:libs:modules:task-dispatchers:map")
include("server:libs:modules:task-dispatchers:parallel")
include("server:libs:modules:task-dispatchers:subflow")

include("server:libs:test:test-support")
include("server:libs:test:test-int-support")

include("sdks:backend:java:ai-toolkit")
include("sdks:backend:java:ai-toolkit-spring")
include("sdks:backend:java:component-api")
include("sdks:backend:java:component-test")
include("sdks:backend:java:definition-api")
include("sdks:backend:java:workflow-api")

// EE

include("server:ee:apps:api-gateway-app")
include("server:ee:apps:config-server-app")
include("server:ee:apps:configuration-app")
include("server:ee:apps:connection-app")
include("server:ee:apps:coordinator-app")
include("server:ee:apps:execution-app")
include("server:ee:apps:runtime-job-app")
include("server:ee:apps:scheduler-app")
include("server:ee:apps:webhook-app")
include("server:ee:apps:worker-app")

include("server:ee:libs:atlas:atlas-execution:atlas-execution-remote-rest")
include("server:ee:libs:atlas:atlas-execution:atlas-execution-remote-client")

include("server:ee:libs:automation:automation-code-workflow-loader")
include("server:ee:libs:automation:automation-configuration:automation-configuration-api")
include("server:ee:libs:automation:automation-configuration:automation-configuration-public-rest")
include("server:ee:libs:automation:automation-configuration:automation-configuration-remote-client")
include("server:ee:libs:automation:automation-configuration:automation-configuration-remote-rest")
include("server:ee:libs:automation:automation-configuration:automation-configuration-rest")
include("server:ee:libs:automation:automation-configuration:automation-configuration-service")
include("server:ee:libs:automation:automation-api-platform:automation-api-platform-configuration:automation-api-platform-configuration-api")
include("server:ee:libs:automation:automation-api-platform:automation-api-platform-configuration:automation-api-platform-configuration-rest")
include("server:ee:libs:automation:automation-api-platform:automation-api-platform-configuration:automation-api-platform-configuration-service")
include("server:ee:libs:automation:automation-api-platform:automation-api-platform-handler:automation-api-platform-handler-rest")
include("server:ee:libs:automation:automation-api-platform:automation-api-platform-handler:automation-api-platform-handler-security-web:automation-api-platform-handler-security-web-impl")

include("server:ee:libs:config:cloud-config")
include("server:ee:libs:config:observability-config")
include("server:ee:libs:config:tenant-multi-data-config")
include("server:ee:libs:config:tenant-multi-message-event-config")
include("server:ee:libs:config:tenant-multi-security-config")

include("server:ee:libs:core:cloud:cloud-aws")
include("server:ee:libs:core:discovery:discovery-metadata-api")
include("server:ee:libs:core:discovery:discovery-redis")
include("server:ee:libs:core:discovery:discovery-util")
include("server:ee:libs:core:file-storage:file-storage-aws:file-storage-aws-api")
include("server:ee:libs:core:file-storage:file-storage-aws:file-storage-aws-impl")
include("server:ee:libs:core:message:message-broker:message-broker-aws")
include("server:ee:libs:core:remote:remote-client")
include("server:ee:libs:core:remote:remote-rest")
include("server:ee:libs:core:tenant:tenant-multi-service")

include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-api")
include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-instance-impl")
include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-public-rest")
include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-remote-client")
include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-remote-rest")
include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-rest:embedded-configuration-rest-api")
include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-rest:embedded-configuration-rest-impl")
include("server:ee:libs:embedded:embedded-configuration:embedded-configuration-service")
include("server:ee:libs:embedded:embedded-connected-user:embedded-connected-user-api")
include("server:ee:libs:embedded:embedded-connected-user:embedded-connected-user-remote-client")
include("server:ee:libs:embedded:embedded-connected-user:embedded-connected-user-rest")
include("server:ee:libs:embedded:embedded-connected-user:embedded-connected-user-service")
include("server:ee:libs:embedded:embedded-execution:embedded-execution-api")
include("server:ee:libs:embedded:embedded-execution:embedded-execution-public-rest")
include("server:ee:libs:embedded:embedded-execution:embedded-execution-service")
include("server:ee:libs:embedded:embedded-mcp-server")
include("server:ee:libs:embedded:embedded-security-web:embedded-security-web-impl")
include("server:ee:libs:embedded:embedded-swagger")
include("server:ee:libs:embedded:embedded-unified:embedded-unified-api")
include("server:ee:libs:embedded:embedded-unified:embedded-unified-rest")
include("server:ee:libs:embedded:embedded-unified:embedded-unified-service")
include("server:ee:libs:embedded:embedded-user:embedded-user-rest")
include("server:ee:libs:embedded:embedded-workflow:embedded-workflow-coordinator")
include("server:ee:libs:embedded:embedded-workflow:embedded-workflow-execution:embedded-workflow-execution-api")
include("server:ee:libs:embedded:embedded-workflow:embedded-workflow-execution:embedded-workflow-execution-rest")
include("server:ee:libs:embedded:embedded-workflow:embedded-workflow-execution:embedded-workflow-execution-service")

include("server:ee:libs:platform:platform-api-connector:platform-api-connector-configuration:platform-api-connector-configuration-api")
include("server:ee:libs:platform:platform-api-connector:platform-api-connector-configuration:platform-api-connector-configuration-rest")
include("server:ee:libs:platform:platform-api-connector:platform-api-connector-configuration:platform-api-connector-configuration-service")
include("server:ee:libs:platform:platform-api-connector:platform-api-connector-file-storage:platform-api-connector-file-storage-api")
include("server:ee:libs:platform:platform-api-connector:platform-api-connector-file-storage:platform-api-connector-file-storage-impl")
include("server:ee:libs:platform:platform-api-connector:platform-api-connector-handler")
include("server:ee:libs:platform:platform-audit:platform-audit-service")
include("server:ee:libs:platform:platform-component:platform-component-remote-client")
include("server:ee:libs:platform:platform-component:platform-component-remote-rest")
include("server:ee:libs:platform:platform-configuration:platform-configuration-api")
include("server:ee:libs:platform:platform-configuration:platform-configuration-remote-client")
include("server:ee:libs:platform:platform-configuration:platform-configuration-remote-rest")
include("server:ee:libs:platform:platform-configuration:platform-configuration-rest")
include("server:ee:libs:platform:platform-configuration:platform-configuration-service")
include("server:ee:libs:platform:platform-connection:platform-connection-remote-client")
include("server:ee:libs:platform:platform-connection:platform-connection-remote-rest")
include("server:ee:libs:platform:platform-code-workflow:platform-code-workflow-configuration:platform-code-workflow-configuration-api")
include("server:ee:libs:platform:platform-code-workflow:platform-code-workflow-configuration:platform-code-workflow-configuration-service")
include("server:ee:libs:platform:platform-code-workflow:platform-code-workflow-file-storage:platform-code-workflow-file-storage-api")
include("server:ee:libs:platform:platform-code-workflow:platform-code-workflow-file-storage:platform-code-workflow-file-storage-impl")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-configuration:platform-custom-component-configuration-api")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-configuration:platform-custom-component-configuration-public-rest")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-configuration:platform-custom-component-configuration-rest")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-configuration:platform-custom-component-configuration-service")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-file-storage:platform-custom-component-file-storage-api")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-file-storage:platform-custom-component-file-storage-impl")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-handler")
include("server:ee:libs:platform:platform-custom-component:platform-custom-component-loader")
include("server:ee:libs:platform:platform-data-storage:platform-data-storage-jdbc:platform-data-storage-jdbc-remote-rest")
include("server:ee:libs:platform:platform-data-storage:platform-data-storage-jdbc:platform-data-storage-jdbc-remote-client")
include("server:ee:libs:platform:platform-scheduler:platform-scheduler-remote-client")
include("server:ee:libs:platform:platform-scheduler:platform-scheduler-aws")
include("server:ee:libs:platform:platform-scheduler:platform-scheduler-remote-rest")
include("server:ee:libs:platform:platform-user:platform-user-remote-client")
include("server:ee:libs:platform:platform-user:platform-user-remote-rest")
include("server:ee:libs:platform:platform-workflow:platform-workflow-task-dispatcher:platform-workflow-task-dispatcher-registry:platform-workflow-task-dispatcher-registry-remote-client")
include("server:ee:libs:platform:platform-workflow:platform-workflow-task-dispatcher:platform-workflow-task-dispatcher-registry:platform-workflow-task-dispatcher-registry-remote-rest")
include("server:ee:libs:platform:platform-workflow:platform-workflow-execution:platform-workflow-execution-remote-client")
include("server:ee:libs:platform:platform-workflow:platform-workflow-execution:platform-workflow-execution-remote-rest")
include("server:ee:libs:platform:platform-workflow:platform-workflow-worker:platform-workflow-worker-remote-client")
include("server:ee:libs:platform:platform-workflow:platform-workflow-worker:platform-workflow-worker-remote-rest")

include("server:ee:libs:modules:components:api-platform")
include("server:ee:libs:modules:components:code-workflow")
include("server:libs:platform:platform-mail")
