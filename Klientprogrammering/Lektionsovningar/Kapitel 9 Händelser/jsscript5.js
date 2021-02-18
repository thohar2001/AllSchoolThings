let input = document.getElementById('passwordbox')

function noPaste(eve) {
    eve.preventDefault()
    alert("No pasting!")   
}

window.addEventListener('load', () => {
    input.addEventListener('paste', noPaste)
})
