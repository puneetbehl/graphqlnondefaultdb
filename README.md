# Grails 4.0.2 with GraphQL 2.0.0.BUILD-SNAPSHOT

This is a sample application in reference to the issue [grails/gorm-graphql#31](https://github.com/grails/gorm-graphql/issues/31). Also, in the Bootstrap.groovy we are save a new Speaker with a Talk in the `currentDevDb` database.

Please look into the Integration test file [SpeakerGraphQLIntegrationSpec.groovy](src/integration-test/groovy/example/SpeakerGraphQLIntegrationSpec.groovy) which tries to replicate the problem described in the issue report.
