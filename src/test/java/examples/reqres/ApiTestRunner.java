package examples.reqres;
import com.intuit.karate.junit5.Karate;

public class ApiTestRunner {
    @Karate.Test
    Karate getUsers(){
        return Karate.run("apiTest").relativeTo(getClass());
    }
}
