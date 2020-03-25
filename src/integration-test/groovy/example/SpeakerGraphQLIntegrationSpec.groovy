package example

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import groovy.json.JsonOutput
import org.grails.gorm.graphql.plugin.testing.GraphQLSpec
import spock.lang.Specification

@Rollback
@Integration
class SpeakerGraphQLIntegrationSpec extends Specification implements GraphQLSpec {

    void "test count speaker should be 1 due to bootstrap data"() {
        when:
        String curlCommand = '''
curl -X "POST" "{url}" \
     -H "Content-Type: application/graphql" \
     -d '
{
  speakerCount
}'
        '''.toString().replace('{url}', getUrl())

        Process process = ['bash', '-c', curlCommand].execute()
        process.waitFor()

        then:
        JsonOutput.prettyPrint(process.text) ==
                """{
    "data": {
        "speakerCount": 1
    }
}"""

    }
}
