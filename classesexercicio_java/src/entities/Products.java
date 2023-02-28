package entities;

public class Products {

	public String nome;
	public double preco;
	public int qtd;
	
	public double valorTotal()
	{
		return preco * qtd;
	}
	public void adicionarProdutos(int qtd)
	{
		this.qtd = this.qtd  + qtd;
	}
	public void removerProdutos(int qtd)
	{
		this.qtd = this.qtd - qtd;
	}
	public String toString()
	{
		return "Produto: " 
				+nome+ 
				", preço: " 
				+ String.format("%.2f",preco)+ 
				", quantidade: "
				+qtd+
				", Valor Total: "
				+ String.format("%.2f",valorTotal());
	}
}
