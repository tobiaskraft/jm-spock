package de.jm

import spock.lang.Specification

class TweetControllerSpec extends Specification {

  def "check size of list"() {
    given:
      List<Tweet> list = Stub()
      // tell Spock the size of the list
      list.size() >> 10
    expect:
      list.size() == 10
  }

  def "check that return list contains all tweets"() {
    given: 'List of predefined tweet objects'
      // create mock for our service
      def tweetService = Mock(TweetService)

      List mockedList = []
      (1..10).each { item ->
        mockedList << new Tweet(String.valueOf("msg ${item}"), new Date())
      }
      // tell Spock that call to our function returns mockedList
      tweetService.getAll() >> mockedList
      TweetController controller = new TweetController();
      controller.tweetService = tweetService

    when:
      List<Tweet> result = controller.fetchAll();

    then: "return tweets as list"
      result.size() == 10
  }

  def "bulk store messages"() {
    given:
      TweetService tweetService = Mock()
      TweetController controller = new TweetController(tweetService: tweetService)
      def messages = ['my tweet', 'other tweet','your tweet', 'my tweet', 'other tweet']

    when:
      controller.bulkStore(messages)

    then:
      2 * tweetService.save({ String msg -> msg == 'my tweet' })
      1 * tweetService.save({ String msg -> msg == 'your tweet' })
      (1.._) * tweetService.save(_ as String)
  }

  def "store one message"() {
    given:
      TweetService tweetService = Mock()
      TweetController controller = new TweetController(tweetService: tweetService)

    when:
      controller.store("my tweet")

    then:
      1 * tweetService.save(_ as String)
  }

}