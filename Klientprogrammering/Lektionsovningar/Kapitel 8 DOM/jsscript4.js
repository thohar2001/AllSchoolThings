let list = Array.from(document.getElementsByTagName('p'))

let empty = 0;
for(let i=0; i<list.length; i++) {
    let elem = list[i].innerText
    if (elem.trim().length === 0) {
        empty++
    }
}

console.log("Amount of empty paragraphs: " + empty)