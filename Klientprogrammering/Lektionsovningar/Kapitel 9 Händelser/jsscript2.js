let listOfButtons = Array.from(document.getElementsByClassName('buttons'))

function printId(button) {
}

for (let button of listOfButtons) {
    button.addEventListener('click', (evt) => alert(evt.target.id))
}
