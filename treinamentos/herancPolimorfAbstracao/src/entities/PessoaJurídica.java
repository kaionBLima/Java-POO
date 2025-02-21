package entities;

public class PessoaJurídica extends Pessoa {

    private Integer numFunc;

    public PessoaJurídica() {
        super();
    }

    public PessoaJurídica(String nome, Double rendaAnual, Integer numFunc) {
        super(nome, rendaAnual);
        this.numFunc = numFunc;
    }

    @Override
    public double impostos() {
        if(numFunc > 10) {
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }

}
