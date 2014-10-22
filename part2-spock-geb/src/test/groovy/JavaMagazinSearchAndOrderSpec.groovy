import geb.spock.GebReportingSpec
import pages.JMAbonnementPage
import pages.JMAktuellPage
import pages.JMArchivPage
import pages.JMDetailPage
import pages.JMDigitalPage
import pages.JMOrderPage
import spock.lang.Stepwise

@Stepwise
class JavaMagazinSearchAndOrderSpec extends GebReportingSpec {

  def "search and order a magazine"() {
    given:
      def firstResultLink
    when:
      to JMArchivPage
      firstResultLink = magazineLink(0)
    then: 'see all magazines'
      at JMArchivPage
      searchResult.size() > 1
    when: 'sort by date'
      sortLink.click()
    then: 'compare first entry'
      at JMArchivPage
      firstResultLink != magazineLink(0)
    when: 'search for specific magazine'
      search '8.12'
    then: 'verify that only has been found'
      at JMArchivPage
      searchResult.size() == 1
    when: 'select magazine'
      magazineLink(0).click()
    then: 'view detail page'
      at JMDetailPage
      headline.text().contains('Groovy')
    when: 'select magazine for ordering'
      orderMagazine()
    then: 'view order page'
      at JMOrderPage
  }

}