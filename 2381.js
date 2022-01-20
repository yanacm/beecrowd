var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift(); };

var nomes = [];
var aux;

var x = prompt("qtde de alunos / posicao");
	var[a,b] = x.split(' ');
		alunos = parseInt(a);
		posicao = parseInt(b);

for(var k = 0 ; k < alunos; k++){
	nomes[k] = prompt("qual seu nome?").toLowerCase();
}

for (var i = 0; i < nomes.length; i++) {
		for (var j = 0; j < nomes.length-1-i; j++) {
			if (nomes[j] > nomes[j+1]) {  //charcodeat vazio = [0]
			    aux = nomes[j];
			    nomes[j] = nomes[j+1];
			    nomes[j+1] = aux;

			}	
		}
}

console.log(nomes[posicao-1]);
