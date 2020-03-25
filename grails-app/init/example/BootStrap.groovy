package example

class BootStrap {

    SpeakerService speakerService

    def init = { servletContext ->
        Speaker.withNewTransaction {
            Speaker speaker = speakerService.save("John", "Doe", "jdoe@example.com", "Lorem Ipsum")
            speakerService.addTalk(speaker, "The Stand", 45, "Lorem Ipsum Stand")
        }
    }
    def destroy = {
    }
}
