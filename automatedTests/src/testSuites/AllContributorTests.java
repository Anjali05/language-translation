package testSuites;

import contributor.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({EditAccount.class, EditPost.class, NewArticle.class})
public class AllContributorTests {

}
