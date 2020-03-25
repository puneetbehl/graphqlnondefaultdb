package example

import org.grails.datastore.gorm.GormEntity

class Speaker implements GormEntity<Speaker> {

    String firstName
    String lastName
    String name
    String email
    String bio

    static hasMany = [talks: Talk]

    static constraints = {
        email nullable: true, email: true
        bio nullable: true
    }

    static mapping = {
        datasource 'current'
        bio type: 'text'
        name formula: 'concat(FIRST_NAME,\' \',LAST_NAME)'
        talks sort: 'id'
    }

    static graphql = true
}
