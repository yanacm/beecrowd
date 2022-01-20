var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var prompt = function(texto) { return lines.shift(); };

var qtde = prompt("qtde de termos");
var a = 0; 
var b = 1;
var i = 2; 
var fibonacci = ""; 
	while(i<qtde){
		fibonacci+=(a + " " + b + " ");
		a = a + b; 
		b = a + b; 
		i = i + 2; 
	}
	if (i == qtde){
		fibonacci+=(a + " " + b);
	} else{
		fibonacci+=(a);
	  }
	  console.log(fibonacci); 
