package com.github.dnvriend.selenium

class GoogleTest extends TestSpec {

  "Google search page" should "have the correct title" in {
    go to "http://www.google.nl"
    pageTitle should be ("Google")
    pageTitle should not be "The wrong title"
  }

  it should "search for cheese" in {
    click on "q"
    textField("q").value = "Cheese!"
    submit()

    eventually {
      pageTitle should be ("Cheese! - Google zoeken")
    }
  }
}
