// let bigs = document.getElementsByClassName('big')
// let list = Array.from(bigs)

// for(let i = 0; i < list.length; i++) {
//     list[i].style.backgroundColor = 'pink'
// }

// alternative 2

let newStyle = document.createElement('style')
newStyle.innerText = '.big { background-color: pink; }'
document.head.appendChild(newStyle)
