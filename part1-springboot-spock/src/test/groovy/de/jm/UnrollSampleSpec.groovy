package de.jm

import spock.lang.Unroll

class UnrollSampleSpec extends spock.lang.Specification {

  @Unroll
  def "'#msg' results in the tweet message length of #msg_length chars"() {
    when:
      Tweet t = new Tweet(msg)
    then:
      t.getMessage().length() == msg_length
      if (msg.length() > 20) {
        assert t.getMessage().endsWith("...")
      }
    where:
      msg                      || msg_length
      "Spock is cool"          || 13
      "Geb is cool"            || 11
      "Junit 'versus' Spock"   || 20
      "Geb and Spock are cool" || 20
  }

}