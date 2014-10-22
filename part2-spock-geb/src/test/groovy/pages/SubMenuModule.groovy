package pages

import geb.Module

class SubMenuModule extends Module {

  static content = {
    menu { $('ul.menu') }
    menuAktuell { menu { $('li', 0) } }
    menuArchiv { menu { $('li', 1) } }
    menuDigital { menu { $('li', 2) } }
    menuAbonnement { menu { $('li', 3) } }
  }
}
