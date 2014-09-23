package de.jm

import spock.lang.Specification

class WhereConditionSpec extends Specification {
  def "Simple where condition"() {
    when:
      Tweet t = new Tweet(msg, created)
    then:
      t.message.length() <= 20
    where:
      msg << ['Groovy macht Spaß', 'Arbeiten mit Spock ebenfalls']
      created << [new Date(), (new Date()).minus(1)]
  }
}