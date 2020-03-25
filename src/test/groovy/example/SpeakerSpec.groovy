package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SpeakerSpec extends Specification implements DomainUnitTest<Speaker> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
