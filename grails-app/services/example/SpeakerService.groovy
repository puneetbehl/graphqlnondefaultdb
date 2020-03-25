package example

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Transactional('current')
@Service(Speaker)
abstract class SpeakerService {

    abstract Speaker save(Speaker speaker)

    abstract Speaker save(String firstName, String lastName, String email, String bio)

    @Transactional('current')
    Speaker addTalk(Speaker speaker, String title, int duration, String description) {
        speaker.addToTalks(title: title, duration: duration, description: description)
        save(speaker)
    }
}
