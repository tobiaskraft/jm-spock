package de.jm

import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import spock.lang.Specification
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.context.ContextConfiguration
import spock.lang.Unroll

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = Application.class)
@WebAppConfiguration
@IntegrationTest
@Unroll
class TweetRestControllerSpec extends Specification {

  def "Create a new tweet message"() {
    given:
      String url = 'http://localhost:8080/storeTweet/'
      String msg = "Integrationstest mit Spock und Spring Boot erstellt"
      Date refDate = new Date()

    when:
      ResponseEntity<Tweet> entity = new RestTemplate().getForEntity(url + msg, Tweet.class)

    then: 'HTTP status is 200'
      entity.statusCode == HttpStatus.OK

    and: 'check message text'
      entity.body.message.regionMatches(0, msg, 0, 17)

    and: 'check the creation date'
      entity.body.created != null
      entity.body.created.time - refDate.time >= 0
  }

}