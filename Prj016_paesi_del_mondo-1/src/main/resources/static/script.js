function fetchCounntryData() {

  try {
    const response = await fetch("https://localhost/api/countries");
    const countries = await response.json();
    const random = Math.floor(Math.random() * countries.length);

    const country = countries[random];
    document.getElementeById('country').textContent = country.name ;
    document.getElementeById('capital').textContent = country.capital;
  } catch (error) {
    console.error('Errore nel recipero dei  dati  del paese', error);
  }
}

window.onload = fetchCountryData;
