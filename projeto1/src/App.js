import React, {useRef, useState} from 'react';

import './App.css';

import axios from 'axios';

function App() {
	const formRef = useRef(null);
	const api = axios.create({
		baseURL: 'http://localhost:8080'	
	});
	
  	function handleSubmit(data,{ reset }){
	  	if (data.nome  === ""){
			formRef.current.setErrors({
				nome:'o nome e obrigatorio'
			});	
	  	}
		
  		console.log(data); 
		api.post('clientes',data.id).then(reset());
	
  	}

	  

  return (
    <div className="App">
      <h1>Cadastrar Clientes</h1>


      <form ref={formRef}  onSubmit = {handleSubmit}>
        <input name="nome" />
        <input name="cpf" />
        <input name="data_nascimento" type = "date" />
        <input name="fone" type = "int" />
		<input name="limite_credito" type = "bigdecimal" />

        <button type="submit" >enviar</button>
      </form>

	</div>
  );
}

export default App;
