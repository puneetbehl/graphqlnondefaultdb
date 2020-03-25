package example

import org.grails.datastore.gorm.GormEntity

class Talk implements GormEntity<Talk> {

    String title
    String description
    int duration

    static belongsTo = [speaker: Speaker]

    static constraints = {
        title unique: true
        description nullable: false
    }

    static mapping = {
        datasource 'current'
        description type: 'text'
    }

    static graphql = true
}
