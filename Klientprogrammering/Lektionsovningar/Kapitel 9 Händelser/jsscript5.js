let input = document.getElementById('passwordbox')

function noPaste(eve) {
    eve.preventDefault()
    alert("No pasting!")   
}

input.addEventListener('paste', noPaste)