package testSuites;

import superadmin.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DestroyCategory.class, DestroyCountry.class, DestroyLanguage.class, 
	DestroyOrganization.class, DestroySite.class, EditArticle.class, EditCategory.class, 
	EditCountry.class, EditLanguage.class, EditOrganization.class, EditSite.class, 
	Members.class, NewArticle.class, NewCategory.class, NewCountry.class, NewLanguage.class, 
	NewOrganization.class, NewSite.class})
public class AllSuperadminTests {

}
