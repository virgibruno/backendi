package TemplateMethod.cuentaBancaria;

public class CajeroHumano extends CuentaBancaria{

    public CajeroHumano(String c, int i, int t){
        procesar(c, i, t);
    }

    @Override
    public void saludar() {
        System.out.println("Buenos días! Bríndeme su DNI por favor");
    }

    @Override
    public void auditoria() {
        super.auditoria();
        System.out.println("Mucho gusto, vuelva pronto");
    }
}
