// let divs = Array.from(document.getElementsByTagName('div'))

// for (let div of divs) {
//     div.addEventListener('click', (evt) => alert(evt.target.id))
// }

function printStuff(evt) {
    console.log(evt.currentTarget.id)
    evt.stopPropagation()
}

let topdiv = document.getElementById('top')
let middiv = document.getElementById('middle')
let botdiv = document.getElementById('bottom')


topdiv.addEventListener('click', printStuff)
middiv.addEventListener('click', printStuff)
botdiv.addEventListener('click', printStuff)