package testSuites;

import volunteer.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Categories.class, DestroyArticle.class, EditArticle.class, Languages.class, 
	Members.class, MySites.class, NewArticle.class})
public class AllVolunteerTests {

}
