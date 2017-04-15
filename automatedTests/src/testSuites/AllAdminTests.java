package testSuites;
import admin.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DestroyArticle.class, DestroyCategory.class, DestroyLanguages.class, DestroySite.class, EditArticle.class,
	EditCategory.class, EditCountry.class, EditLanguage.class, EditSite.class, LoginAdmin.class, Logout.class, Members.class, 
	MyOrganization.class, NewArticle.class, NewCategory.class, NewCountry.class, NewLanguage.class, NewSite.class})
public class AllAdminTests {

}
