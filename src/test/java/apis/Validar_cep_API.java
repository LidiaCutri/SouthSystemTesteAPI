package apis;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

public class Validar_cep_API {
    public String cepinfo;

    public void informar_CEP (String cep){
       cepinfo = cep;
    }

     public void Validar_CEP(String lagradouro,String bairro,String localidade,String uf){
        String url = ("https://viacep.com.br/ws/"+cepinfo+"/json");
        given()
                .relaxedHTTPSValidation()
        .when()
                .get(url)
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("logradouro",is(lagradouro))
                .body ("bairro",is(bairro))
                .body("localidade",is(localidade))
                .body("uf",is(uf));
    }

}
