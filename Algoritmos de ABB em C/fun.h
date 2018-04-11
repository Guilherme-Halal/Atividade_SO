// Prova 2
// 05/05/2017
// Guilherme Afonso Halal (guilhermehalal@gmail.com) - Tiago Machado Jardim (tiago.machado.jardim@hotmail.com)


typedef struct avlgen A;
struct avlgen{
	
	int altura;
	void *info;//permite a inclusão de qualque dado na arvore, porém seria necessária a criação de uma função de comparação para cada tipo de dado colocado na mesma...
	A *esq;
	A *dir;
	
};
typedef struct avlgen A;


A *cria();

A *rotacaoEsquerdaDireita(A *a);
A *rotacaoDireitaEsquerda(A *a);
A *rotacaoDireita(A *a);
A *rotacaoEsquerda(A *a);

A* balanceamento(A *a);

void imprimeavl_preordem(A *a);
void imprimeavl_simetrico(A *a);
void imprimeavl_posordem(A *a);

void imprimeavl_preordem_FILE(A *a, FILE *arq);
void imprimeavl_simetrico_FILE(A *a, FILE *arq);
void imprimeavl_posordem_FILE(A *a, FILE *arq);

int *maiorArvore(A *a);
int *menorArvore(A *a);
int retornaAltura(A *a);
void liberaFinal(A *a);
int max(int a, int b);
A * ins(A *a,void *n );
A * ex(A *a,void *n );
A* percorre(A *a, void *n, int tipo, int(*callback)(A*, void*));
