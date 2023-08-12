package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Lista de item(classe item)
    private List<Item> itemList;

    // Construtor CarrinhoDeCompras
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valor, int quantidade){
        itemList.add(new Item(nome, valor, quantidade));
    }

    public int obterTotalDeItem(){
        return itemList.size();
    }


    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Açucar", 4.90, 5);

        System.out.println("Total de itens adicionados ao carrinho de compra: " + carrinhoDeCompras.obterTotalDeItem());



    }

}
