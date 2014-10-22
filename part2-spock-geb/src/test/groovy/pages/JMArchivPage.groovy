package pages

import geb.Page

class JMArchivPage extends Page {

  static url = "https://jaxenter.de/java-magazin-archiv"

  static at = {
    title == "Java Magazin Archiv | JAXenter.de"
  }

  static content = {
    searchField { $('input', id: 'edit-keys') }
    searchButton(to: JMArchivPage) {
      $('input', type: 'submit', id: 'edit-submit-issues-in-the-shop')
    }
    sortLink(to: JMArchivPage) { $('th.availablefrom span a') }

    searchResult(required: false) { $('#block-system-main tbody tr') }
    searchResultSize(required: false) {
      $('#block-system-main tbody tr').size()
    }
    magazineLink { index -> searchResult(index).find("td a") }

    subMenu { module SubMenuModule }
  }

  void search(String searchTerm) {
    searchField.value searchTerm
    searchButton.click()
  }

}
