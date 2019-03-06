package pages.app
import geb.Page

import modules.LoginModule


class SingleProfilePage extends Page {
	static at = { title.startsWith( "BCDevExchange - The BC Developer\'s Exchange ") }
	static url = "settings/profile"
	static content = {

        login { module LoginModule  }

        FirstName { $("input", id: "firstName")}
        LastName { $("input", id: "lastName")}
        emailprofile { $("input", id: "email")}
        city { $("input", id: "city")}

        SaveChangesButton { $("button", 'data-automation-id': "btnSaveChangesProfile")}

        MyCapabilitiesLink {$("a",id:"settings.skills")}
        MyMessages {$("a",id:"setttings.messages")}
        MyAffiliations {$("a",id:"setttings.affiliations")}
    }

    void setFirstName(String newFirstName) {
        FirstName.value(newFirstName)
    }

    void setLastName(String newLastName){
        LastName.value(newLastName)
    } 
    
    void setEmailAddress(String newEmailAddress) {
        emailprofile.value(newEmailAddress)
    }

    void setCity(String newCity){
        city.value(newCity)
    }    
}
