import java.util.Scanner; 

public class ListaJAVA {
	
	public static void main(String[] args) {
		//q3();
		//q1();
		//q2();
		//q4();
		//q5();
		//q6();
		//q7();
		//q8();
		//q9();
		//q10();
		//q11();
		//q12();
		//q13();
		//q14();
		//q15();
		//q16();
		//q17();
		//q18();
		//q19();
		//q20();
		//q21();
		//q22();
		//q23();
		//q24();
		//q25();
		//q26();
		//q27();
		q28();
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
		 * subtração, multiplicação e a divisão dos	
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
		/*  Escrevaum algoritmo para determinar
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
		/* Escreva um algoritmo	que	leia uma temperatura	
		 * em graus	Celsius	e apresentá-la convertida em graus Fahrenheit. 
		 * A fórmula de	conversão é: F = (9*C+160)/5, sendo F a	
		 * temperatura em Fahrenheit e C a temperatura em Celsius.
		 * */
		
		double celsius;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Graus em Celsius:");
		celsius = novo.nextDouble();
		
		System.out.println("Temperatura em Fahrenheit:"+ ((9*celsius+160)/5));
	}
	
	static void q5() {
		/*  Escreva um algoritmo que efetue a apresentação
		 * 	do valor da	conversão em real (R$)
		 * 	de um valor	lido em	dólar (US$).	
		 *  O algoritmo	deverá solicitar o valor
		 *  da cotação do dólar	e também a quantidade de dólares
		 * 	disponíveis	com	o usuário
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
		/*  Escreva um algoritmo que receba um
		 * 	valor que foi depositado em	uma	conta
		 * 	poupança e exiba o valor com rendimento
		 * 	após um	mês. Considere fixo	o juro da conta
		 * 	poupança em	0,70% a.m
		 */
		
		/*PS...poupança 0.5% a.m...PS*/
		
		double valorDepo;
		double valorFim;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Valor depositado:");
		valorDepo = novo.nextDouble();
		
		valorFim = ((valorDepo + valorDepo * 0.005)* 0.993);
		System.out.println("Rendimento final:"+ (valorFim - valorDepo));
	}
	
	static void q7() {
		/*A	Loja Mamão com Açúcar está vendendo	seus produtos
		 * 	em 5 (cinco) prestações	sem	juros. Faça	um algoritmo
		 * 	que	receba um valor	de uma compra e	mostre o valor das prestações.
		 */
		
		double valorDeCompra;
		int opt;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Mamão [1]:");
		System.out.println("Açucar [2]:");
		System.out.println("Sair [0]:");
		opt = novo.nextInt();
		
		switch (opt) {
		case 1:	
			System.out.println("Quantia em reais:");
			valorDeCompra = novo.nextDouble();
			System.out.println("Prestações:"+ (valorDeCompra / 5));
			System.out.println((valorDeCompra)+ " de mamão na mão");
			break;
		case 2:
			System.out.println("Quantia em reais :");
			valorDeCompra = novo.nextDouble();
			System.out.println("Prestações:"+ (valorDeCompra / 5));
			System.out.println((valorDeCompra)+ " de açucar na mão");
			break;
		case 0:
			System.out.println("Obrigado pela presença!!");
			break;
		}	
	}
	
	static void q8() {
		/*Faça um algoritmo	que	receba o preço de custo	de um produto e	mostre
		 * 	o valor	de	venda. Sabe-se que o preço de custo receberá	
		 * um acréscimo	de acordo com um percentual	informado pelo usuário.	
		 */
		
		Scanner novo = new Scanner(System.in);
		double pCusto;
		double acrecimo;
		
		System.out.println("Informe o preço de custo:");
		pCusto = novo.nextDouble();
		System.out.println("Informe a porcentagem de acrécimo:");
		acrecimo = novo.nextDouble();
		
		System.out.println("Valor de venda:"+ ((pCusto * acrecimo)/100));	
	}
	
	static void q9() {
		/*O	custo ao consumidor	de	um	carro	novo é a soma do custo	de	fábrica	com	a	
		 * percentagem	do	distribuidor e dos impostos	(aplicados,	primeiro os	impostos	
		 * sobre o	custo de fábrica, e	depois	a percentagem do distribuidor sobre	o resultado).	
		 * Supondo	que	a percentagem do distribuidor seja	de	28%	e os impostos 45%. Escrever
		 * 	um	algoritmo que leia o custo	de	
		 * fábrica de um carro	e informe o	custo ao consumidor	do mesmo.
		 */
		Scanner novo = new Scanner(System.in);
		double custoDeFabrica;
		double custoComImposto;
		
		System.out.println("Custo de fábrica: ");
		custoDeFabrica = novo.nextDouble();
		
		custoComImposto =  + custoDeFabrica + (custoDeFabrica * 0.45);
		
		System.out.println("Custo ao consumidor:"+ (custoComImposto + (custoComImposto *0.28)));
	}
	
	static void q10(){
		/* Escreva um algoritmo	que	armazene o valor 10	em uma variável
		 * 	A e	o valor	20 em uma variável	B. A seguir	(utilizando	apenas atribuições entre variáveis)
		 * 	troque os seus conteúdos fazendo com que o valor que está em A passe para B	e vice-versa.	
		 *  Ao final, escrever os valores que ficaram armazenados nas variáveis.
		 */
		Scanner novo = new Scanner(System.in);
		int A = 10;
		int B = 20;
		int aux;
		
		aux = A;
		A = B;
		B = aux;
		
		System.out.println("Valor A:" + (A)+ " Valor B:"+ (B));
	}
	
	static void q11() {
		/*Analise os algoritmos a baixo e diga o que será impresso na tela ao serem executados*/
		
		System.out.println("A) vai ser impresso 120, 100 e 234.");
		System.out.println("B) vai ser impresso 500, 140, 500, 300, 140 e 440.");
		System.out.println("C) vai ser impresso 34, 67 e 79.");
		System.out.println("D) vai dar erro porque Z não recebeu nada.");
	}
	
	static void q12() {
		/**/
		
		System.out.println("Apenas a 1 - [A] tem resultados iguais!");
	}
	
	static void q13(){
		/**a - 6*5
		 * b - 2+30
		 * c -  fala
		 * d - sério
		 * e - essa
		 * f - questão
		 * g - meu
		 * h - Deus
		 **/
	}
	
	static void q14(){
	/* Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor e seu sucessor*/
		
		double num;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = novo.nextDouble();
		
		System.out.println("Antecessor:"+ (num - 1)+ "Sucessor:"+ (num + 1));
	}
	
	static void q15() {
		/* Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo*/
		
		double base;
		double altura;
		
		Scanner novo = new Scanner(System.in);
		
		System.out.println("informe a base do retângulo em metros:");
		base = novo.nextDouble();
		System.out.println("informe a altura do retângulo em metros:");
		altura = novo.nextDouble();
		
		System.out.println("A área do retângulo é:"+ (base * altura)+ " m²");
	}
	
	static void q16() {
		/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
		 *  meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
		 *   Considerar ano com 365 dias e mês com 30 dias.	
		 */
		int ano;
		int meses;
		int dias;
		int aux, aux2;
		
		Scanner novo = new Scanner(System.in);
		
		System.out.println("informe sua idade exata com ano, mês e dia:");
		ano = novo.nextInt();
		meses = novo.nextInt();
		dias = novo.nextInt();
		
		aux = ano * 365;
		aux2 = meses * 30;
		
		System.out.println("Idade em dias: "+ (aux + aux2 + dias));
	}
	
	static void q17() {
		/* Escreva um algoritmo para ler o número total de eleitores de um município,
		 * o número de votos brancos, nulos e válidos. 
		 * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores
		 */
		Scanner novo = new Scanner(System.in);
		int totalDeEleitores;
		int nulos;
		int brancos;
		int validos;
		
		System.out.println("Total de eleitores:");
		totalDeEleitores = novo.nextInt();
		System.out.println("Votos Nulos/Brancos/Válidos:");
		nulos = novo.nextInt();
		brancos = novo.nextInt();
		validos = novo.nextInt();
		
		if ((nulos < totalDeEleitores)&(brancos < totalDeEleitores)&(validos < totalDeEleitores)) {
			System.out.println("Porcentagem nula:"+ (100*nulos/totalDeEleitores));
			System.out.println("Porcentagem brancos:"+ (100*brancos/totalDeEleitores));
			System.out.println("Porcentagem validos:"+ (100*validos/totalDeEleitores));
		}else{
			System.out.println("Sua contagem é incompatível!");
		}
	}
	
	static void q18() {
		/*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
		 * Calcular e escrever o valor do novo salário
		 */
		double salario;
		double reajuste;
		double pReajuste;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Salário normal:");
		salario = novo.nextInt();
		System.out.println("Porcentagem de reajuste:");
		reajuste = novo.nextInt();
		
		pReajuste = reajuste/100;
		
		System.out.println("Salário reajustado: "+(salario + (salario * pReajuste)));
	}
	
	static void q19() {
		/*  O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
		 *  do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual
		 *  do distribuidor seja de 28% e os impostos de 45%,
		 *  escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor
		 */
		
		/** Questão repetida **/
		
		Scanner novo = new Scanner(System.in);
		double custoDeFabrica;
		double custoComImposto;
		
		System.out.println("Custo de fábrica: ");
		custoDeFabrica = novo.nextDouble();
		
		custoComImposto =  + custoDeFabrica + (custoDeFabrica * 0.45);
		
		System.out.println("Custo ao consumidor:"+ (custoComImposto + (custoComImposto *0.28)));
	}
	
	static void q20() {
		/*  Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
		 *  mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas.
		 *  Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
		 *  o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
		 */
		
		double salarioFixo;
		int numCarrosV;
		double totalDeVenda;
		double valorPorCarro;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Número de carros vendidos:");
		numCarrosV = novo.nextInt();
		System.out.println("Valor total de vendas:");
		totalDeVenda = novo.nextDouble();
		System.out.println("Salário fixo:");
		salarioFixo = novo.nextDouble();
		System.out.println("Valor por carro:");
		valorPorCarro = novo.nextDouble();
		
		System.out.println("Salário final:"+ (salarioFixo +(totalDeVenda * 0.05)+ valorPorCarro * numCarrosV));
	}
	
	static void q21() {
		/* Ler um valor	e escrever a mensagem É MAIOR QUE 10! se o valor lido	
		 * for maior que 10, caso contrário	escrever NÃO É MAIOR QUE 10! 
		 */
		double valor;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um número:");
		valor = novo.nextInt();
		
		if (valor > 10) {
			System.out.println("Maior que 10!");
		}else {
			System.out.println("Menor que 10!");
		}
	}
	
	static void q22() {
		/* Ler um valor	e escrever
		 * se é positivo ou	negativo (considere	o valor	zero como positivo).
		 */
		int valor;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um número:");
		valor = novo.nextInt();
		
		System.out.println((valor >= 0) ? "Positivo": "negativo");
	}
	
	static void q23() {
		/*As maçãs custam R$ 1,30 cada se forem	compradas menos	de	uma	dúzia, e R$	1,00 se	forem compradas	pelo menos 12.
		 *Escreva um programa que leia o número	de maçãs compradas,	calcule	e escreva o	custo total	da compra.	
		 */
		int numDeCompra;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Quantas deseja comprar?");
		numDeCompra = novo.nextInt();
		
		System.out.println((numDeCompra >= 12) ? ("Total a pagar: "+ (numDeCompra * 1)): ("Total a pagar"+ (numDeCompra * 1.30)) );
	}
	
	static void q24() {
		float nota1;
		float nota2;
		float media;
		Scanner novo = new Scanner(System.in);
		
		System.out.println("Notas:");
		nota1 = novo.nextFloat();
		nota2 = novo.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		System.out.println((media >= 6) ? ("Aprovado com média: "+ (media)): "Reprovado com média: "+ ((media)));
	}
	
	static void q25() {
		int anoAtual;
		int anoNascimento;
		int votar;
		Scanner novo = new Scanner(System.in);
		
		System.out.println("Ano de nascimento:");
		anoNascimento = novo.nextInt();
		System.out.println("Ano atual:");
		anoAtual = novo.nextInt();
		
		votar = anoAtual - anoNascimento;
		
		System.out.println((votar >= 18)? "Você pode votar!": "Você não pode votar!");
	}
	
	static void q26() {
		double valor1;
		double valor2;
	
		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um número:");
		valor1 = novo.nextInt();
		System.out.println("Digite um número:");
		valor2 = novo.nextInt();
		
		System.out.println((valor1>valor2) ? (valor1)+ " é maior!": (valor2)+ " é maior!");
	}
	
	static void q27() {
		double valor1;
		double valor2;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Digite um número:");
		valor1 = novo.nextInt();
		System.out.println("Digite um número:");
		valor2 = novo.nextInt();
		
		System.out.println((valor1>valor2) ? (valor1)+", "+ (valor2): (valor2)+", "+ (valor1));
	}
	
	static void q28() {
		int horaI;
		int horaF;
		int hora;
		int dura;
		
		Scanner novo = new Scanner(System.in);
		System.out.println("Hora inicial:");
		horaI = novo.nextInt();
		System.out.println("Hora final:");
		horaF = novo.nextInt();
		
		hora = horaF - horaI;
		
		if(hora < 0) {
			dura = hora + 24;
			System.out.println("O jogo teve "+dura+" horas de duração");
		}else {
			System.out.println("O jogo teve "+hora+" horas de duração");
		}
	}
}







