# Fundamentos da Programação Orientada a Objetos

Vamos abordar os conceitos do paradigma e os pilares da orientação a objetos, classes, enums, construtores, Java Bens e UML.

## Conceito de POO

À medida que a tecnologia avança, as linguagens de programação também, é natural que tenhamos um nível maior de abstração quando se tratando de linguagens de alto e baixo nível.

**Baixo nível**: São linguagens que estão mais próxima da interpretação da máquina diante do algoritmo desenvolvido. Exemplo: **Assembly e C**.

**Alto Nível**: São linguagens que disponibilizam uma proposta de sintaxe maix próxima de interpretação humana. Exemplo: **Java, JavaScript, Python e C++**.

POO é um paradigma de programação baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos, e códigos, na forma de procedimentos, também conhecidos como métodos.

O que precisamos entender, é que cada vez mais as linguagens se adequam ao cenário real, proporcionando assim que o programador desenvolva algoritmos mais próximos de fluxos comportamentais, logo tudo ao nosso redor é representado como Objeto.

## Classes

Toda estrutura de código na linguagem Java é distribuído em arquivos com extensão **.java** denominados de **classe**.

As classes existentes em nosso projeto serão composta por:

**Identificador, Características e Comportamentos.**

* **Classe** *(class)*: A estrutura e ou representação que direciona a criação dos objetos de mesmo tipo.

* **Identificador** *(identity)*: Propósito existencial aos objetos que serão criados.

* **Características** *(states)*: Também conhecido como **atributos** ou **propriedades**, é toda informação que representa o estado do objeto.

* **Comportamentos** *(behavior)*: Também conhecido como **ações** ou **métodos**, é toda parte comportamental que um objeto dispõe.

* **Instanciar** *(new)*: É o ato de criar um objeto a partir de uma estrutura definida em uma classe.

Vamos ilustrar uma classe que abstrai um estudante que possui algumas características e ações.

![Exemplo de classe Student](images/classes-exemplo-student.png)
Na imagem acima temos uma abstração de um estudante que possui suas características(atributos), name, age, color e sex. Também possui ações(métodos), eating, drinking e running. Tal código define o molde para nosso objeto que será instanciado.

![Instanciando classe Student](images/classes-instanciando-student.png)
Acima temos um exemplo em que a classe `Student` serve de molde para o objeto e assim o instanciamos com o `new Student()`. Após instanciado é possível definir suas características e utilizar seus métodos.

Seguindo algumas convenções, as nossas classes são classificadas como:

* **Classe de modelo (model)**: classes que representem estrutura de domínio de aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.
* **Classe de serviço (service)**: classes que contém regras de negócio e validação de nosso sistema.
* **Classe de repositório (repository)**: classes que contém uma integração com banco de dados.
* **Classe de controle (controller)**: classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices.
* **Classe utilitária (util)**: classe que contém recursos comuns à toda nossa aplicação.

## Pacotes

A linguagem Java é composta por milhares de classes com as finalidades de, por exemplo: Classes de tipos de dados, representação de texto, números, datas, arquivos e deiretórios, conexão a banco de dados, entre outras. 
Para melhorar a organização de classes da linguagem, esta possui recursos que organizam essas classes em pacotes (package). Os pacotes são subdiretórios a partir da pasta src do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para a criação de pacotes já utilizados no mercado.

### Nomeclatura

Vamos imaginar que sua empresa se chama **Power Soft** e ela está desenvolvendo softwares comeciais, gorvernamentais e um software livre ou até código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela abaixo:

* **Comercial**: com.powersoft
* **Governamental**: gov.powersoft
* **Código aberto**: org.powersoft

Acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um pouco as nossas classes mediante a proposta de sua existência:

* **model**: Classes que representam a camada e modelo da aplicação: Cliente, Pedido, NotaFiscal, Usuario
* **repository**: Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository
* **service**: Classes que contém regras de negósio do sistema: ClienteService possui o método validar o CPF do cliente cadastrado
* **controller**: Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP
* **view**: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário
* **util**: Pacote que contém classes utilitárias do sistema: FormatadorNumeroUtil, ValidadorUtil

#### Identificação

Uma das características de uma classe é a sua identificação, Cliente, NotaFiscal, TituloPagar, porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (**próprio nome**) e agora o nome qualificado (**endereçamento do pacote + nome), exemplo: Considere a classe Usuario que está endereçada no pacote `com.controle.acesso.model`, o nome qualificado desta classe é **`com.controle.acesso.model.Usuario`**

### Package versus Import

A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existentes em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:

    package

    import ...
    import ...

    public class MinhaClasse {

    }

#### Por que é tão importante compreender de pacotes?

A linguagem Java é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de bibliotecas e as classes do nosso projeto. Logo, existe uma enorme possibilidade da existência de classes de mesmo nome.

É nesta hora, que nós desenvolvedores precisamos detectar qual classe iremos importar em nosso projeto.

Um exemplo clássico é a existência de classes **`java.sql.Date`** e **`java.util.Date`** da própria linguagem.

## Visibilidade de recursos

### Modificadores

Em Java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipos de visibilidade de atributos, métodos e até mesmo classes no que se refere ao acesso por outras classes. Iremos ilustrar do mais visível ao mais restrito tipo de visibilidade nos arquivos em nosso projeto.

Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

#### Modificador public

Como o próprio nome representa, quando nossa classe, método ou atributo é definido como public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

![Projeto lanchonete](images/visibilidade-recursos-lanchonete.png)
No projeto acima, abstraimos uma lanchonete. Temos as classes `Cozinheiro`, `Atendente`, `Almoxarife` e `Cliente`. Todas elas possuem métodos, porém esses métodos estão todos públicos.
O que devemos entender é que nem tudo no projeto precisa estár público.
De maneira ilustrativa, neste projeto o cliente pode ver o que está acontecendo na cozinha e no almoxarife, mas isso não é interessante.

![Classe Estabelecimento](images/visibilidade-recursos-estabelecimento.png)
Acima temos a classe principal do nosso projeto, onde as ações são executadas.
Observe nos comentários as sugestões para mudança de visibilidade nos métodos.
Vamos a seguir refatorar este projeto para que se adeque a essas regras.

#### Modificador default

O modificador **`default`** está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar disponíveis por todo o projeto, e este modificador de acesso restringe a visibilidade por pacotes.

Dentro do pacote **`lanchonete`**, iremos criar dois sub-pacotes para representar essa divisão do estabelecimento.

* **lanchonete.atendimento.cozinha**: Pacote que contém classes da parte cozinha da lanchonete e atendimentos.
* **lanchonete.area.cliente**: Pacote que contém classes relacionadas ao espaço do cliente.

![Divisão de pacotes](images/visibilidade-recursos-pacotes-area-atendimento.png)
Nosso projeto agora tem a divisão de pacotes descrita anteriormente e agora a abstração faz mais sentido, pois separamos o cliente da cozinha, pois não faz sentido que o cliente possa visualizar essas áreas da nossa lanchonete.

![Almoxarife default](images/visibilidade-recursos-amoxarife-default.png)
Ao modificarmos os métodos `entregarIngredientes` e `trocarGas` na classe `Almoxarife` para **`default`** (que no caso é um modificador implícito e não precisa de palavra reservada), ela fica inacessível a classe `Estabelecimento`, mas a classe `Cozinheiro` pode acessa-la pois está dentro do mesmo pacote.

![Atendente default](images/visibilidade-recursos-atendente-default.png)
Quando definimos o método `trocarGas` na classe `Atendente` como **`default`**, a classe `Cozinheiro` não está mais autorizada a pedir para o `Atendente` `trocarGas`. Como numa definição hierarquica de um restaurante. Portanto devemos retirar esse método da classe `Cozinheiro` e `Estabelecimento`.

#### Modificador private

Depois de reestruturar nosso estabelecimento (projeto), onde, temos as divisões (pacotes) espaço do cliente e atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.

Conhecemos as ações disponíveis nas classes `Cozinheiro`, `Almoxarife`, `Atendente` e `Cliente`, mesmo com a organização da visibilidade por pacote, será se realmente estas classes precisam ser tão explicitas?

* Será se o `Cozinheiro` precisa saber que/como o `Almoxarife` controla as entradas e saídas?
* Que o `Cliente` precisa saber como o `Atendente` recebe o pedido para servir sua mesa?
* Que o `Atendente` precisa saber que antes de pagar o `Cliente` consulta o saldo do App?

Diante destes questionamentos é que nossas classes precisam continuar mantendo suas ações (métodos) mas nem todas precisam ser vistas por ninguém.

![Cozinheiro private](images/visibilidade-recursos-cozinheiro-private.png)
Com isso em mente modificamos os métodos `prepararVitamina`, `prepararLanche`, `selecionarIngredientesVitamina`, `baterVitaminaLiquidificador` e `lavarIngredientes` pois não interessa ao estabelecimento como o cozinheiro realiza essas ações, portanto serão ações privadas visíveis somente pelo próprio cozinheiro.

![Almoxarife e Atendente private](images/visibilidade-recursos-amoxarife-atendente-private.png)
Definimos nas classes `Almoxarife` e `Atendente` que os métodos `controlarSaida`, `controlarEntrada`, `pegarPedidoBalcao` e `pegarLancheCozinha` são privados, mas note que tais métodos são chamados por métodos públicos da classe. Como é o caso de `controlarSaida` que é chamado pelo método `entregarIngredientes`, pois não interessa a quem chama este método como o almoxarife controla a saída de ingredientes.

![Cliente private](images/visibilidade-recursos-cliente-private.png)
Por fim retiramos da classe `Cliente` o método `pegarPedidoBalcao`, pois definimos que esta ação é responsabilidade somente do `Atendente` e o método `consultarSaldoAplicativo` passa a ser privado pois se trata de uma ação sigilosa que outras classes não podem ter acesso.

## Getter e Setter

Seguindo a convensão Java Beans

Os métodos "Getters" e "Setters" são utilizados para buscar valores atributos ou definir novos valores de atributos de instâncias de classes.

O método **Getter** retorna o valor do atributo especificado.

O método **Setter** define outro novo valor para o atributo especificado.

Vemos o código abaixo da criação de um objeto Aluno com nome e idade:

![Objeto aluno](images/getter-setter-colegio.png)

Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as seguintes regras:

* Os atributos precisam ter o modificador de acesso `private`. Ex.: `private String nome;`
* Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos **get**X e **set**X, Ex.: `getNome()` e `setNome(String novoNome)`
* O método **get** é responsável por obter o valor atual do atributo, logo ele precisa ser `public` retornar um tipo correspondente ao valor, es.: `public String getNome() {};`
* O método **set** é responsável por definir ou modificar o valor de um atributo em um objeto, logo ele também precisa ser `public`, receber um parâmetro do mesmo tipo da variável mas não retorna nenhum valor void. Ex.: `public void setNome(String newNome) {} ;`

![Aluno Java Beans](images/getter-setter-aluno.png)
Agora nossa classe `Aluno` segue a convenção Java Beans.

![Escola Java Beans](images/getter-setter-escola.png)
Seguindo a mesma convenção, a classe `Escola` não mais atribui os valores diretamente ao objeto, mas sim o próprio objeto dispoe de métodos para realização destas operações.

Tal convenção foi criada para melhorar a segurança de nossas aplicações e também facilitar a realização de validações no momento de atribuir valores, onde com o atributo sendo público esta validação deveria ser feita fora da classe.

## Construtores

Sabemos que para criar um objeto na linguagem Java utilizamos a seguinte estrutura de código:

    Classe novoObjeto = new Classe();

Desta forma será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

Muitas das vezes queremos que já na instanciação de um objeto, a linguagem já solicite para quem for criar este novo objeto defina algumas propriedades essenciais. Abaixo iremos ilustrar uma classe Pessoa onde a mesma terá os atributos, Nome, CPF, Endereço.

![Classe Pessoa](images/construtores-pessoa.png)
Criaremos uma Pessoa mas como não temos um setter para nome e cpf, este objeto não tem como receber estes valores.

![Sistema de cadastro](images/construtores-sistema-cadastro.png)
Ao executar este código, sua saída será nula pois não temos o CPF e nome definidos.

![Construtor Pessoa](images/construtores-pessoa-contrutor.png)
Agora temos na classe `Pessoa` um construtor, que deverá sempre ter o nome idêntico ao da classe e seus argumentos que serão atribuidos às propriedades.

![Instanciando com Construtor](images/construtores-pessoa-instancia.png)
Por fim no momento de sua instanciação, devemos passar os argumentos solicitados pelo nosso construtor. Assim este código passará a imprimir os valores de suas propriedades que agora não são mais nulas.

## Enums

Enum é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.

Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.

**Exemplos:**
* **Grau de Escolaridade**: Analfabeto, Fundamental, Médio, Superior
* **Estado Civil**: Solteiro, Casado, Divorciado, Viúvo
* **Estados Brasileiros**: São Paulo, Rio de Janeiro, Piauí, Maranhão

Enquanto que uma constante é uma variável de tipo com valor imutável, um enum é um conjunto de objetos pre-definidos na aplicação.

Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e métodos. Veja o exemplo de um enum para disponibilizar os quartro estados brasileiros citados acima, contendo informações de: Nome, Sigla e um método que pega o nome de cada estado e já retorna com tudo minúsculo.

![Enum Estado Brasileiro](images/enum-estado-brasileiro.png)
Podemos observar que a classe não mais se chama `class`, mas sim `enum` e seguindo a convenção Java Beans seus atributos também são privados, podemos notar também que seu construtor é privado, pois um enum jamais é contruido de fora, portanto definimos que este enum tem uma sigla e um nome.
Logo abaixo da declaração deste enum já temos as definições dos objetos que serão construídos a partir deste enum.

![Valores do enum](images/enum-estados-brasileiros.png)
Após definirmos os valores do enum, em uma classe main podemos então utilizar um for para percorrer os valores deste enum e imprimi-los no console.

![Valor de um enum](images/enum-estado-brasileiro-valor.png)
Também podemos armazenar numa variável do tipo `EstadoBrasileiro` um dos valores contidos neste enum. É como se dessemos vários "new" e cada um deles armazena um objeto que pode ser chamado individualmente.

_**Enum servem para valores que não sofrem alteração constante, portanto atente-se para o seu uso.**_

## UML

Linguagem de Modelagem Unificada ou UML é uma notação que possibilita a representação gráfica do projeto.

Na UML temos três conceitos necessários para compreendermos inicialmente:

**diagramas**, **elementos** e **relacionamentos**. 

As notações UML são distribuídas em duas categorias de diagramas, a estrutural e a comportamental conforme listagem abaixo:

### Diagramas estruturais

* **Diagrama de classe**: O diagrama de Classes é utilizado para fazer a representação de estruturas de classes de negócio, interfaces e outros componentes do sistema. Por esta característica, este diagrama é considerado o mais importante para a UML, pois auxilia a maioria dos demais diagramas.
* **Diagrama de objetos**: Este diagrama representa os objetos existentes em um determinado instante ou fato na aplicação. Assim conseguimos ter uma perspectiva do estado de nossos objetos mediante a interação dos usuários no sistema.

#### Diagrama de classe
O diagrama de classes ilustra **graficamente** como classes serão estruturadas e interligadas entre si diante da proposta do nosso software.

Em diagrama a estrutura das classes é constituída por:

**Identificação**: Nome e/ou finalidade da classe
**Atributos**: Propriedades e/ou características
**Operações**: Ações e/ou métodos

##### Relacionamentos

Em um diagrama as classes podem existir deforma independete, mas obviamente haverá em alguma etapa da aplicação a necessidade de algumas se relacionarem, o que devemos compreender é o nível de dependência entre elas:

###### Associação

Uma associação define um relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura de um outro objeto.

![Associação](images/uml-associacao.jpg)

* **Agregação**: Em uma agregação a classe principal contém uma relação com outra classe mas ela pode existir sem a classe agregadora. Imagina em um cadastro de Candidatos, podemos encontrar candidatos que ainda não possuam uma Profissão.
![Agregação](images/uml-agregacao.png)
*Candidato é a classe principal e a Profissão agregação*
* **Composição**: A composição já caracteriza uma dependência existencial entre a classe principal e a classe associada. Imaginamos que uma Admissão só poderá existir contendo suas informações básicas e a composição do Candidato selecionado.
![Composição](images/uml-composicao.png)
*Admissão é a classe principal e Candidato compõe a Admissão*

###### Multiplicidade

Nem sempre o relacionamento entre classe será de **um para um**, um determinado cenário poderá exigir multiplicidades especídifcas conforme opções abaixo:

* 1.-> Representa uma associação **contendo um elemento**.
* *.-> Representa uma associação **contendo uma lista de elementos**.
* 0..1-> Representa uma associação **contendo zero ou um elemento**.
* 0..*-> Representa uma associação **contendo zero ou uma lista de elementos**.
* 1..*-> Representa uma associação **contendo um ou uma lista de elementos**.

###### Visibilidade

Os atributos e métodos de uma classe podem receber níves de visibilidade, e na UML existem símbolos que representam cada um deles.

* (+) Visibilidade pública
* (#) Visibilidade protegida (muito associada a herança)
* (-) Visibilidade privada

###### Representação

![Representação de uma classe UML](images/uml-representacao.png)


