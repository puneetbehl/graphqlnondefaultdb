package example

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TalkSpec extends Specification implements DomainUnitTest<Talk> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
