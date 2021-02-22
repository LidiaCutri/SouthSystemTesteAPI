package stepsDifinitions;

import apis.Validar_cep_API;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class ValidarCep_steps {

    Validar_cep_API validarCep = new Validar_cep_API();

    @Dado("^que eu consulte o endereco atraves da API viacep$")
    public void que_eu_consulte_o_endereco_atraves_da_API_viacep(){
    }

    @Quando("^informar o CEP \"([^\"]*)\"$")
    public void informar_o_CEP(String cep) {
        validarCep.informar_CEP(cep);
    }

    @Entao("o servico me retorna o endereco \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void o_servico_me_retorna_o_endereco(String lagradouro,String bairro,String localidade,String uf){
        validarCep.Validar_CEP(lagradouro,bairro,localidade,uf);
    }
}
