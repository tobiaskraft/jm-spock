package de.jm

import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.web.client.HttpServerErrorException
import org.springframework.web.client.RestTemplate
import spock.lang.Specification
import spock.lang.Unroll

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = Application.class)
@WebAppConfiguration
@IntegrationTest
@Unroll
class TweetRestControllerExceptionSpec extends Specification {

  def "Test HTTP Server exception"() {
    when:
      String url = 'http://localhost:8080/reverseTweetMessage/6'
      ResponseEntity<String> entity = new RestTemplate().getForEntity(url, String.class)

    then:
      HttpServerErrorException ex = thrown()
      ex.statusCode == HttpStatus.INTERNAL_SERVER_ERROR
  }

}