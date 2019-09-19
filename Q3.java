import java.util.Scanner; 

public class Q3 {
	
	public static void main(String[] args) {
		//q3();
		//q1();
		//q2();
		//q4();
		//q5();
		q6();
		}
	static void q3(){
		String nome;
		double salarioFixo;
		double totalDeVendas;
		double salarioFinal;
		
		Scanner novo = new Scanner(System.in);
		
		System.out.println("Digita o nome ai campeão");
		nome = novo.next();
		System.out.println("Teu salário fixo campeão");
		salarioFixo = novo.nextDouble();
		System.out.println("Tuas venda tudo chapa");
		totalDeVendas = novo.nextDouble();
		
		System.out.println("Seu nome:"+ (nome));
		System.out.println("Salário fixo:"+ (salarioFixo));
		System.out.println("Salário final:"+ (salarioFixo + totalDeVendas * 0.15));
	}
	
	static void q1() {
		/* Escreva um algoritmo que leia
		 * dois	números	e ao final mostre a soma,
		 *  subtração, multiplicação e a divisão dos	
		 */
		Scanner novo = new Scanner(System.in);
		
		double num;
		double num2;
		
		System.out.println("Número:");
		num = novo.nextDouble();
		System.out.println("Segundo número:");
		num2 = novo.nextDouble();
		
		System.out.println("Soma:"+ (num + num2));
		System.out.println("Subtração:"+ (num - num2));
		System.out.println("Divisão: "+ (num / num2));
		System.out.println("Multiplicação:"+ (num * num2));
		}
	
	static void q2() {
		/*Escrevaum	algoritmo para determinar
		 *  o consumo médio de um automóvel sendo	
		 *  fornecida a	distância total	percorrida 
		 *  pelo automóvel e o total de combustível gas
		 */
		int distancia;
		double combus;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Distância total percorrida:");
		distancia = novo.nextInt();
		System.out.println("Combustível gasto:");
		combus = novo.nextDouble();
		
		System.out.println("A média de combustível para "+ (distancia)+ "km é "+ (combus)+ "Litros");
		
		}
	
	static void q4() {
		/*Escreva	um	algoritmo	que	leia uma temperatura	
		 * em graus	Celsius	e apresentá-la	convertida	em	graus Fahrenheit. 
		 * A fórmula de	conversão é: F	= (9*C+160)/5, sendo F a	
		 * temperatura	em	Fahrenheit e C a temperatura em	Celsius.
		 * */
		
		double celsius;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Graus em Celsius:");
		celsius = novo.nextDouble();
		
		System.out.println("Temperatura em Fahrenheit:"+ ((9*celsius+160)/5));
	}
	
	static void q5() {
		/*Escreva um algoritmo que	efetue a apresentação
		 * 	do valor da	conversão em real (R$)
		 * 	de	um	valor	lido	em	dólar	(US$).	
		 * O	algoritmo	deverá	solicitar	o	valor
		 * da	cotação	do	dólar	e	também	a	quantidade	de	dólares
		 * 	disponíveis	com	o	usuário
		 */
		double cotaDolar;
		double quantReais;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Cotação do Dólar:");
		cotaDolar = novo.nextDouble();
		System.out.println("Sua quantidade de reais:");
		quantReais = novo.nextDouble();
		
		System.out.println("Sua quantidade de dólares:"+ (quantReais / cotaDolar));
	}
	
	static void q6() {
		/*Escreva um algoritmo que receba um
		 * 	valor que foi depositado em	uma	conta
		 * 	poupança e exiba o valor com rendimento
		 * 	após um	mês. Considere fixo	o juro da conta
		 * 	poupança em	0,70% a.m
		 * */
		
		/*PS...poupança 0.5% a.m...PS*/
		
		double valorDepo;
		double valorFim;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Valor depositado:");
		valorDepo = novo.nextDouble();
		
		valorFim = ((valorDepo + valorDepo * 0.005)* 0.993);
		System.out.println("Rendimento final:"+ (valorFim - valorDepo));
	}
}
