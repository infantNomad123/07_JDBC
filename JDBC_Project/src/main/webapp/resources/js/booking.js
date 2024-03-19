const input = document.querySelector("#input");
const price = document.querySelector("#price");
const booking = document.querySelector("#button");
const total = document.querySelector("#total");
const persons = document.querySelector("#persons");


input.addEventListener("input", () => {   
    let prod = input.value * price.innerText;
    total.innerHTML = prod;
    persons.innerHTML = input.value;
    
    

});


