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
		//q28();
		//q29();
		//q30();
		//q31();
		//q32();
		//q33();
		//q34();
		//q35();
		//q36();
		//q37();
		//q38();
		//q39();
		//q40();
		//q41();
		//q42();
		//q43();
		//q44();
		//q45();
		//q46();
		//q47();
		//q48();
		q49();
		//q50();
		//q51();
		//q52();
		//q53();
		//q54();
		//q55();
		}
	static void q3(){
		Scanner novo = new Scanner(System.in);
		String nome;
		double salarioFixo;
		double totalDeVendas;
		double salarioFinal;
		
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
	
		static void q29() {
 		Scanner novo = new Scanner(System.in);
 		Double salarioPorHora, horaPorSemana, numHorasMes, horasExtras;
 		System.out.println("Digite o numero de horas que vc trabalhou no mes: ");
 		numHorasMes = novo.nextDouble();
 		System.out.println("Digite seu salario por hora: ");
 		salarioPorHora = novo.nextDouble();
 		horaPorSemana = (numHorasMes / 4);
 		horasExtras = numHorasMes - 160;
 		
 		if(horaPorSemana > 40) {
 			System.out.println("O salario no final do mes é " + ((salarioPorHora*160) + (horasExtras*0.50)*salarioPorHora));	
 		}else {
 			System.out.println("O salario no final do mes é " + (salarioPorHora * numHorasMes));
 		}
 	}

		static void q30() {
		Scanner novo = new Scanner(System.in);
		String nome;
		Double alturaCm, alturaM, pesoIdeal;
		int sexo = 0;
		
		System.out.println("Digite seu nome: ");
		nome = novo.next();
		System.out.println("Digite sua altura em centimetros: ");
		alturaCm = novo.nextDouble();
		alturaM = alturaCm/100;
		
		while ((sexo != 1) || (sexo != 2)) {
			System.out.println("Digite seu sexo (1) masculino ou (2) feminino: ");
			sexo = novo.nextInt();
			if(sexo == 1) {
				pesoIdeal = ((72.7*alturaM) - 58);
				System.out.println("Seu peso ideal é: " + pesoIdeal);
				break;
			}else if(sexo == 2) {
				pesoIdeal = ((62.1 * alturaM) - 44.7);
				System.out.println("Seu peso ideal é: " + pesoIdeal);
				break;
			}else {
				System.out.println("opcao invalida!");
			}
		}
		
	}
	
	static void q31() {
		Scanner novo = new Scanner(System.in);
		int salarioF;
		int totalVendas;

		System.out.println("Digite seu salário fixo:");
		salarioF = novo.nextInt();
		System.out.println("Informe o valor das vendas efetuadas:");
		totalVendas = novo.nextInt();

		if(totalVendas > 1500)
		System.out.println("Salario final:" + (totalVendas * 0.05) + salarioF);
		else if(totalVendas <= 1500)
		System.out.println("Salario final:" + (totalVendas * 0.03) + salarioF);


	}

		static void q32(){
		Scanner novo = new Scanner(System.in);
		int numeroConta;
		double saldo;
		double credito;
		double debito;
		double saldoAtual;

		System.out.println("Informe o numero da conta:");
		numeroConta = novo.nextInt();
		System.out.println("Informe seu saldo:");
		saldo = novo.nextDouble();
		System.out.println("Informe se é  credito ou debito:");
		credito = novo.nextInt();
		debito = novo.nextInt();

		saldoAtual = (saldo - debito) + credito;

		System.out.println((saldoAtual >= 0) ? "Saldo positivo: "+ (saldoAtual): "Saldo negativo: "+(saldoAtual));	
	}
		public static void q33() {
			Scanner novo = new Scanner(System.in);
			Double quantidadeAtual, quantidadeMaxima, quantidadeMinima, quantidadeMedia;
			System.out.println("Digite a quantidade atual em estoque: ");
			quantidadeAtual = novo.nextDouble();
			System.out.println("Digite a quantidade maxima em estoque: ");
			quantidadeMaxima = novo.nextDouble();
			System.out.println("Digite a quantidade minima em estoque: ");
			quantidadeMinima = novo.nextDouble();
			quantidadeMedia = ((quantidadeMinima + quantidadeMaxima) / 2);
			
			if(quantidadeAtual >= quantidadeMedia) {
				System.out.println("Não efetuar compra!");
			}else {
				System.out.println("Efetuar compra!");
			}
		}
	
	
		static void q34() {
		Scanner novo = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero: ");
		num = novo.nextInt();
		
		if(num > 0) {
			System.out.println("Positivo!");
		}else if(num < 0) {
			System.out.println("Negativo!");
		}else {
			System.out.println("Zero!");
		}
	}
	
		static void q35() {
		Scanner novo = new Scanner(System.in);
		int num1, num2, num3, numMaior;
		System.out.println("Digite o primeiro numero: ");
		num1 = novo.nextInt();
		numMaior = num1;
		do {
			System.out.println("Digite o segundo numero: ");
			num2 = novo.nextInt();
		}while(num2 == num1);
		if(num2 > numMaior) {
			numMaior = num2;
		}
		do {
			System.out.println("Digite o terceiro numero: ");
			num3 = novo.nextInt();
		}while(num3 == num1 || num3 == num2);
		if(num3 > numMaior) {
			numMaior = num3;
		}
		System.out.println("O numero maior é " + numMaior);
	}
		
		static void q36() {
			Scanner novo = new Scanner(System.in);
			double valor1;
			double valor2;
			double valor3;
			double soma;

			System.out.println("Valor1:");
			valor1 = novo.nextDouble();
			System.out.println("Valor2:");
			valor2 = novo.nextDouble();
			System.out.println("Valor3:");
			valor3 = novo.nextDouble();

			if((valor1 < valor2)&( valor1 < valor3)){

			soma = valor2 + valor3;
			System.out.println("A soma dos dois maiores numeros e: "+ (soma));
			}else if((valor2<valor1)&( valor2<valor3)){
			soma = valor1 + valor3;
			System.out.println("A soma dos dois maiores numeros e: "+ (soma));
			}else {
			soma = valor1 + valor2;
			System.out.println("A soma dos dois maiores valores e: "+ soma);
			}
	}
	
		static void q37() {
		Scanner novo = new Scanner(System.in);
		double valor1;
		double valor2;
		double valor3;
		double aux;
		
		System.out.println("Digite 3 valores:");
		valor1 = novo.nextDouble();
		valor2 = novo.nextDouble();
		valor3 = novo.nextDouble();
		
		if(valor1 > valor2) {
			aux = valor1;
			valor1 = valor2;
			valor2 = aux;
			}
			if(valor1 > valor3) {
			aux = valor1;
			valor1 = valor3;
			valor3 = aux;
			}
			if(valor2 > valor3) {
			aux = valor2;
			valor2 = valor3;
			valor3 = aux;
			}
			System.out.println("Ordem crescente"+(valor1)+(valor2)+(valor3));
	}
		static void q38() {
		Scanner novo = new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.println("Digite um valor para A, B e C:");
		a = novo.nextDouble();
		b = novo.nextDouble();
		c = novo.nextDouble();
		
		if((a < b +c)||(b < a + c)||(c < a + b)) {
			System.out.println("é triângulo!");
		}else {
			System.out.println("Não é um triângulo!");
		}
	}
	
		static void q39() {
		Scanner novo = new Scanner(System.in);
		String time1;
		String time2;
		int golsT1;
		int golsT2;
		
		System.out.println("Digite o nome do 1° time:");
		time1 = novo.next();
		System.out.println("Digite o nome do 2° time:");
		time2 = novo.next();
		
		System.out.println("Gols marcados pelo 1° time:");
		golsT1 = novo.nextInt();
		System.out.println("Gols marcados pelo 2° time:");
		golsT2 = novo.nextInt();
		
		if(golsT1 == golsT2){
			System.out.println("EMPATE!");
		}else if(golsT1 > golsT2) {
			System.out.println((time1)+ " venceu!");
		}else {
			System.out.println((time2)+ " venceu!");
		}
	}
	
		static void q40() {
		Scanner novo = new Scanner(System.in);
		int n1;
		int n2;

		System.out.println("Valor 1: ");
		n1 = novo.nextInt();

		System.out.println("Valor 2: ");
		n2 = novo.nextInt();

		if (n1 > n2) {
			System.out.println("Primeiro é maior");
		}
		if (n2 == n1) {
			System.out.println("Iguais");
		}
		if (n2 > n1) {
			System.out.println("Segundo maior");
		}
	}

		static void q41() {
		Scanner novo = new Scanner(System.in);
		int res;

		System.out.print("Digite x: ");
		int x = novo.nextInt();

		System.out.print("Digite y: ");
		int y = novo.nextInt();

		int z = (x * y) + 5;

		if (z <= 0) {
			res = 'A';
		} else if (z <= 100) {
			res = 'B';
		} else {
			res = 'C';
		}
		System.out.println(z + ", " + res);
	}

		static void q42() {
		Scanner novo = new Scanner(System.in);
		double desconto;
		int combustivel;
		System.out.print("Número de Litros vendidos: ");
		int litro = novo.nextInt();

		System.out.print("Combustível [1]-A [2]-G: ");
		combustivel = novo.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}

		static void q43() {
		Scanner novo = new Scanner(System.in);
		int idadeH1;
		int idadeH2;
		int idadeM1;
		int idadeM2;
		int velhoH;
		int velhoM;
		int novoH;
		int novoM;

		System.out.print("Idade Homem 1: ");
		idadeH1 = novo.nextInt();

		do {
			System.out.print("Idade Homem 2: ");
			idadeH2 = novo.nextInt();
		} while (idadeH1 == idadeH2);
		if (idadeH1 > idadeH2) {
			velhoH = idadeH1;
			novoH = idadeH2;
		} else {
			velhoH = idadeH2;
			novoH = idadeH1;
		}
		System.out.print("Idade Mulher 1: ");
		idadeM1 = novo.nextInt();

		do {
			System.out.print("Idade Mulher 2: ");
			idadeM2 = novo.nextInt();
		} while (idadeM1 == idadeM2);
		if (idadeM1 > idadeM2) {
			velhoM = idadeM1;
			novoM = idadeM2;
		} else {
			velhoM = idadeM2;
			novoM = idadeM1;
		}
		System.out.println("Soma 1: " + (velhoH + novoM));
		System.out.println("Soma 2: " + (novoH + velhoM));
	}

		static void q44() {
		Scanner novo = new Scanner(System.in);
		double precoMa = 1.80;
		double precoMo = 2.50;
		double pesoMa;
		double pesoMo;
		double totalMo;
		double totalMa;
		double precoFinal;

		System.out.print("Quantos Kilos de morango: ");
		pesoMo = novo.nextDouble();

		System.out.print("Quantos Kilos de maçã: ");
		pesoMa = novo.nextDouble();

		if (pesoMo > 5) {
			totalMo = (precoMo - 0.3) * pesoMo;
		} else {
			totalMo = precoMo * pesoMo;
		}

		if (pesoMa > 5) {
			totalMa = (precoMa - 0.3) * pesoMa;
		} else {
			totalMa = precoMa * pesoMa;
		}
		if ((totalMo + totalMa) > 25 || (pesoMo + pesoMa) > 8) {
			precoFinal = (totalMo + totalMa) * 0.9;
		} else {
			precoFinal = totalMo + totalMa;
		}

		System.out.println("Preço finl da compra: R$" + precoFinal);
	}

		static void q45() {
		Scanner novo = new Scanner(System.in);
		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = novo.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = novo.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}

		static void q46() {
		System.out.println("VERDADEIRO\nFALSO\nFALSO");
	}
	
		static void q47() {
		Scanner novo = new Scanner(System.in);
		double descMenor5 = 0.02;
		double descMenor10 = 0.03;
		double descMaior10 = 0.05;
		String produto;
		int quantidade;
		double preco;
		double total;
		double descont = 0;

		System.out.println("Nome do produto: ");
		produto = novo.nextLine();
		System.out.println("Quantidade: ");
		quantidade = novo.nextInt();
		System.out.println("Preço Unitario: ");
		preco = novo.nextDouble();

		total = quantidade * preco;

		if (quantidade <= 5) {
			descont = total * descMenor5;
		}
		if (quantidade > 5 && quantidade <= 10) {
			descont = total * descMenor10;
		}
		if (quantidade > 10) {
			descont = total * descMaior10;
		}
		System.out.println("Produto: " + produto);
		System.out.println("Preço unitário: " + preco);
		System.out.println("Total: " + total);
		System.out.println("Desconto: " + descont);
		System.out.println("Total a pagar: " + (total - descont));

	}

		static void q48() {
		Scanner novo = new Scanner(System.in);
		int ano = 2011;

		System.out.println("Entre com seu codigo: ");
		int codigo = novo.nextInt();

		System.out.println("Entre com a data de nascimento: ");
		int data = novo.nextInt();

		System.out.println("Entre com o Ano de ingresso na empresa: ");
		int tempo = novo.nextInt();

		if (ano - data >= 16) {
			if (ano - data >= 65) {
				System.out.println("Requer Aposentadoria");
			} else {
				if (ano - tempo >= 30) {
					System.out.println("Requer Aposentadoria");
				} else {
					if ((ano - data >= 60) && (ano - tempo >= 25)) {
						System.out.println("Requer Aposentadoria");
					} else {
						System.out.println("NÃO Requer Aposentadoria");
					}
				}
			}
		} else {
			System.out.println("Você não tem idade para trabalhar");
		}
	}
		static void q49() {
			Scanner novo = new Scanner(System.in);
			double a;
			double b;
			double c;
			String mens;
			
			System.out.println("Informe os lados do triângulo:");
			a = novo.nextDouble();
			b = novo.nextDouble();
			c = novo.nextDouble();
			
			if((a < b + c)&(b < a + c)&(c < a + b)) {
				if((a==b)&(b==c)) {
					mens = "triângulo equilátero";
				}else if((a==b)||(b==c)||(a==c)){
					mens = "Triângulo isóseles";
				}else {
					mens = "Triângulo escaleno";
				}
			}else {
				mens = "Não é possível formar um triângulo";
			}
			System.out.println(mens);
			
			System.out.println("*****RESPOSTAS*****");
			System.out.println("Não é possível formar um triângulo");
			System.out.println("Triângulo escaleno");
			System.out.println("Triângulo isóseles");
			System.out.println("Triângulo equilátero");
			System.out.println("Triângulo isóseles");
		}

		static void q50() {
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite: ");
		double n1 = novo.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = novo.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}
	
		static void q51() {
		Scanner novo = new Scanner(System.in);
		System.out.print("Digite: ");
		double n1 = novo.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = novo.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

		static void q52() {
		Scanner novo = new Scanner(System.in);
		int res;

		System.out.print("Digite x: ");
		int x = novo.nextInt();
		int y;
		do {
			System.out.print("Digite y: ");
			y = novo.nextInt();

		} while (y == 0);
		int z = (x * y) + 5;

		if (z <= 0) {
			res = 'A';
		} else if (z <= 100) {
			res = 'B';
		} else {
			res = 'C';
		}
		System.out.println(z + ", " + res);
	}
	
		static void q53() {
		Scanner novo = new Scanner(System.in);
		double desconto;
		int combustivel;
		System.out.print("Número de Litros vendidos: ");
		int litro = novo.nextInt();

		System.out.print("Combustível [1]-A [2]-G: ");
		combustivel = novo.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}

		static void q54() {
		Scanner novo = new Scanner(System.in);
		double nota1;
		double nota2;
		do{
			System.out.println("Nota 1: ");
			nota1 = novo.nextDouble();
			System.out.println("Nota 2: ");
			nota2 = novo.nextDouble();
		}while(nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10);
		
		System.out.println("Média Simples: "+(nota1+nota2)/2);	
		
	}
		static void q55() {
		Scanner novo = new Scanner(System.in);
		
		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = novo.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = novo.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}
}