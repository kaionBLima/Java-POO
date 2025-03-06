package model.exception;

//Classe que trata de exceção ou ás lança
public class DomainExpetion extends RuntimeException{ /*Se for Exception, é obrigatória trata-la "throws" na hora de chama-la,
                                              se for um RunTimeExpetion, basta chama-la que já funciona

    private static final long serialVersionUID = 1L; /*Classe Exception é uma classe serializable -> Uma classe serializável é uma
                                                       classe que pode ser transformada em um formato que possa ser armazenado ou transferido.*/

    public DomainExpetion(String msg) {
        super(msg);
    }

}
