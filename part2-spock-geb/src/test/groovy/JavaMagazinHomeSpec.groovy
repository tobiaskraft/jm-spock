import geb.spock.GebReportingSpec
import pages.JMAbonnementPage
import pages.JMAktuellPage
import pages.JMArchivPage
import pages.JMDigitalPage
import spock.lang.Stepwise

@Stepwise
class JavaMagazinHomeSpec extends GebReportingSpec {

  def "check homepage from the Java Magazin"() {
    when:
      go "http://jaxenter.de/java-magazin"
    then:
      title == "| JAXenter.de"
      $("#logo").@alt == "JAXenter.de"
  }

  def "check all sub pages"() {
    when:
      to JMDigitalPage
    then:
      at JMDigitalPage
      subMenu.menuDigital.find('a.active-trail').size() == 1
    when:
      to JMAbonnementPage
    then:
      at JMAbonnementPage
    when:
      to JMArchivPage
    then:
      at JMArchivPage
    when:
      to JMAktuellPage
    then:
      at JMAktuellPage
  }

}