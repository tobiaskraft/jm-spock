package de.jm

import spock.lang.Specification

class SimpleMathSpec extends Specification {
  def "Mathematik einfach gemacht"() {
    expect:
      1 + 3 == 4
      6 == 2 * 3
  }
}