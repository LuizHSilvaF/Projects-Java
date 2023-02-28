package entities;

public class Products {

	private String nome;
	private double preco;
	private int qtd;
	
	
	public Products()
	{
		
	}
	public Products(String nome, double preco, int qtd)
	{
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	public Products(String nome, double preco)
	{
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
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
