function fetchQuizData() {

  try {
    const response = await fetch("http://localhost/api/countries");
    const countries = await response.json();
    const random = Math.floor(Math.random() * countries.length);
    const country = countries[random];
    const worngCap = [];
    while(worngCap.length < 2){
      const worngInde = Math.floor(Math.random()*countries.length);
      if(worngInde !== random && countries[worngInde].capital){
        worngCap.push(countries[worngInde].capital);
      }
    }
    const correctCap = country.capital ;

    const option = [worngCap, correctCap].sort(() => Math.random() - 0.5);
    doucment.getElementById('country').textContent = country.name;
    const opElement = doucment.getElementById('options');
    opElement.innerHTML = '';

    opElement.forEach(option =>{
      const button = doucment.createElement('button';
      button.className = 'option';
      button.textContent = option;
      opElement.appendChild(button);
    });
  } catch (error ) {

    console.log('Errore nel recupro dei dati del quiz:', error);
    
  }
}

window.onLoad = fetchQuizData;
