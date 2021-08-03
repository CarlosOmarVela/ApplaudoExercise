import io.restassured.mapper.ObjectMapper;
import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBreakingBad {

    CharacterPOJO characterPOJO = new CharacterPOJO();

    @Test
    public void DataWalterWhite(){
        RestAssured.baseURI = String.format("https://breakingbadapi.com/api/characters/1");

        Response response = given()
                .log().all().when()
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                .get();

        //Validations
        System.out.println("Name: " + response.jsonPath().getString("name"));
        System.out.println("Occupation: " + response.jsonPath().getString("occupation"));
        System.out.println("Birthday: " + response.jsonPath().getString("birthday"));
        System.out.println("Status: " + response.jsonPath().getString("status"));
        assertEquals(200,response.getStatusCode());
    }

    @Test
    public void DataJessePinkman(){
        RestAssured.baseURI = String.format("https://breakingbadapi.com/api/characters/2");

        Response response = given()
                .log().all().when()
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                .get();

        //Validations
        System.out.println("Name: " + response.jsonPath().getString("name"));
        System.out.println("Occupation: " + response.jsonPath().getString("occupation"));
        System.out.println("Birthday: " + response.jsonPath().getString("birthday"));
        System.out.println("Status: " + response.jsonPath().getString("status"));
        assertEquals(200,response.getStatusCode());
    }

    @Test
    public void AllData(){
        RestAssured.baseURI = String.format("https://breakingbadapi.com/api/characters");

        Response response = given()
                .log().all().when()
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
                .get();

        //Validations
            System.out.println("Name: " + response.jsonPath().getString("name"));
            System.out.println("---");
            System.out.println("Occupation: " + response.jsonPath().getString("occupation"));
            System.out.println("---");
            System.out.println("Birthday: " + response.jsonPath().getString("birthday"));
            System.out.println("---");
            System.out.println("Status: " + response.jsonPath().getString("status"));
            System.out.println("---");
            assertEquals(200,response.getStatusCode());

    }
}
