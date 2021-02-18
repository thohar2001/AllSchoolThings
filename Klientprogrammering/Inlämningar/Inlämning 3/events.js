let buttons = document.getElementsByClassName('buttons')
let allParas
let paras = []

function updateJokes() {
    for(let para of allParas) {
        document.body.removeChild(para)
    }

    for(let para of paras) {
        document.body.appendChild(para)
    }
}

function addJoke(evt) {
    allParas = Array.from(document.getElementsByTagName('p'))
    const p = document.createElement('p')
    let text = evt.target.innerText
        
    if (text === 'Random') {
        p.innerText = 'Random joke!'
        paras.unshift(p)
    }
    else if (text === 'Short') {
        p.innerText = 'Short joke!'
        paras.unshift(p)
    }

    else if (text === 'Shower') {
        p.innerText = 'Shower joke!'
        paras.unshift(p)
    }

    else if (text === 'Traditional') {
        p.innerText = 'Traditional joke!'
        paras.unshift(p)
    }

    document.body.appendChild(p)

    if(paras.length === 10) {
        paras.pop()
        updateJokes()
    }
}

for (let button of buttons) {
    button.addEventListener('click', (evt) => addJoke(evt))
}