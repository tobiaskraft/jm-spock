package de.jm

class FailedTestSpec extends spock.lang.Specification {

  def "Failed second list element compare"() {
    given:
      List<Tweet> list1 = new ArrayList<Tweet>();
      list1.add(new Tweet("Spock ist cool"));
      list1.add(new Tweet("Grails ist cool"));
      List<Tweet> list2 = new ArrayList<Tweet>();
      list2.add(new Tweet("Spock ist cool"));
      list2.add(new Tweet("Geb ist auch cool"));

    expect:
      list1.get(1).getMessage() == list2.get(1).getMessage()
  }

}