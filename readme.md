**Algoritmos e Estruturas de Dados**

**Relatório do trabalho sobre ordenação**

Iago Gomes

**Resumo**

*Pequeno programa em Java para ordenação de inteiros por meio do método QuickSort.*

**Keywords**

*Ordenação;QuickSort;Java;Algoritmos;*



**1. INTRODUÇÃO**

O Shell Sort é um algoritmo que consiste no particionamento do vector em conjuntos de tamanho ‘n’, definido
arbitrariamente , e a partir daí é realizada a ordenação dos
elementos por meio da técnica de inserção, com redução
do ‘n’ a cada execução do algoritmo.Não é um algoritmo
estável, tem uma complexidade ainda consideravelmente
alta (no pior caso: O(n1,5)) mas levemente melhor que o
Bubble sort.
O trabalho cuja descrição segue-se abaixo foi realizado
para a disciplina de Algoritmos e Estruturas de Dados na
Universidade do Algarve (Ualg), no primeiro semestre do ano letivo de
2020/2021. O objetivo do trabalho era de praticar com os
conceitos de Programação Orientada a Objetos (POO) em
Java e com os algoritmos de ordenação.
Uma vez que a ideia do trabalho era que a entrada de
dados no programa fosse feita por meio da leitura de fi-
cheiros eu optei por utilizar ficheiros binários, uma vez
que para a leitura dos mesmos não se fazem necessárias
as manipulações que caracteres que teriam de acontecer
na leitura de um ficheiro de texto.

**2. ALGORITMOS DE ORDENAÇÂO ESTUDADOS**

Durante a disciplina de Algoritmos e Estruturas de Dados
foram estudados três algoritmos de ordenação que foram
os seguintes: “Bubble Sort”, “Shell Sort” e “Quick Sort”.
Para a realização do trabalho, e uma vez que no mesmo
foi utilizado um vector de inteiros que não contém ne-
nhuma característica intrínseca para ser respeitada além
de seu valor numérico e por tanto a estabilidade da orde-
nação não chega a ser algo crucial, devido a sua menor
complexidade.
O Bubble Sort é um algoritmo que consiste na varredura
do array sucessivas vezes e cada varredura a comparação
dos elementos presentes nele para que seja possível a
ordenação de elementos contíguos até que o array esteja
ordenado. É considerado um algoritmo estável, o que
significa que ele mantém a posição relativa entre dois
elementos de mesmo valor mesmo após a ordenação ter
ocorrido, devido a quantidade de varreduras necessárias
acaba por ser um algoritmo com alta complexidade (no
pior caso: O(n2)).
O Quick Sort funciona realizando a divisão de vector em
dois subconjuntos com base em um pivot, escolhido arbi-
trariamente, e a comparação do valor do elemento pivot
com os elementos presentes no subconjunto, as compara-
ções são repetidas de forma recursiva e utilizando os sub-
conjuntos gerados até que todo o vector esteja ordenado.
Não é um algoritmo estável e dentre os três estudados
contém a menor complexidade (no caso médio: O (n log2
n)).

**3. IMPLEMENTAÇÃO DO TRABALHO**

Para assegurar a simplicidade e bom funcionamento do
programa optei por utilizar apenas uma classe, uma vez
que a opção de utilizar diversas classes, e para tal diver-
sos ficheiros ou então ter de utilizar mecanismos de he-
rança, parecia-me ser um excesso ante o escopo do pro-
blema em questão. A classe em questão é composta de
um construtor que com base em uma string recebida via
terminal, utilizando a classe nativa do Java “Scanner”
para leitura do input, utiliza a String como path para um
ficheiro, o qual subentende-se estar no mesmo diretório
no qual o programa se encontra, após isto segue-se para o
preenchimento de um array com os inteiros que se en-
contram no ficheiro. Como o array em questão é uma
variável comum a todos os métodos da classe o mesmo é
utilizado nos métodos/funções que manipulam dados. No
programa existem cinco métodos que manipulam dados,
dos quais dois destes servem para a ordenação. O método
“Write()” serve para gravar o array ordenado no ficheiro
intitulado “sorted.bin”. 
O método “Mostra()” serve para
exibir o conteúdo do array, por uma questão de ajuste
técnico ele também retorna o tamanho do array que foi
exibido, este ajuste foi necessário para que a aplicação do
método “QuickSort(int esq, int dir)” fosse possível. O
método “Ler()” realiza a leitura do ficheiro “sorted.bin” e
exibe os inteiros contidos nele. 
Para a aplicação do método 
de ordenação QuickSort foi necessário a utilização de
duas funções: “Particiona(int esq, int dir)” e “Quick-
Sort(int esq, int dir)”, devido a natureza de formação de
subconjuntos existente no algoritmo do QuickSort a fun-
ção “Particiona()” se faz útil para particionar o array em
subgrupos, que se definem em relação ao pivot escolhido
que no caso é o elemento mais a esquerda no array, a
cada vez que a função “QuickSort()” for chamada via
recursão para ordenar os subconjuntos em questão até
que todo o array esteja ordenado. O método “main()” da
classe chama o construtor do array e em seguida faz a
chamada em ordem dos métodos: “Mos-
tra()”,”QuickSort()”,”Write()”,”Ler()”.

**4. MODO DE FUNCIONAMENTO**

O programa quando executado pede ao utilizador o input
do nome de um ficheiro binário, após o mesmo ter sido
introduzido o programa realiza o cálculo da quantidade
de inteiros no mesmo e exibe esta quantidade no termi-
nal, passada esta parte mais interativa do programa ele
segue para realizar as operações de ordenação com o al-
goritmo Quicksort e após ter feito a ordenação o progra-
ma grava os dados ordenados em um ficheiro denomina-
do “sorted.bin” e exibe os conteúdos deste ficheiro no
terminal.


**4.1 Ficheiros de entrada**

O programa aceita os seguintes tipos de ficheiro:

1. Binários, contendo inteiros com 4 *bytes* cada.

Um exemplo pode ser encontrado no
diretorio que contém o programa em um ficheiro denominado “teste.bin”.


**4.2 Condições especiais**

O programa não é útil para ficheiros que não sejam biná-
rios preenchidos com inteiros, tipos de ficheiros diferentes 
deste (texto, binários compostos por outros tipos de
dados) irão resultar em resultados inesperados e erros.

**5. CONCLUSÕES E TRABALHO FUTURO**

Durante a realização deste trabalho cheguei pude com-
preender melhor alguns conceitos básicos de POO e tam-
bém de complexidade algorítmica.
Visualizo algumas alterações que podem ser feitas para
melhorar o trabalho no futuro. A primeira delas seria
otimizar o uso dos tratamentos de erro no programa para
que seja possível restringir a entrada apenas a arquivos
binários e avisar o utilizador caso o mesmo esteja a tentar
utilizar um ficheiro que seja de outro tipo. Outra altera-
ção possível seria definir novos métodos e até realizar
alterações no construtor com a finalidade de realizar tanto
a leitura de arquivos binários quanto de texto.
