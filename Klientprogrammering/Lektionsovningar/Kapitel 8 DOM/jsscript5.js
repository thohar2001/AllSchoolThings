function paragraph(text) {
    let p = document.createElement('p')
    p.innerText = text
    return p
}


let main = document.getElementById('main')
let footer = document.getElementById('footer')

for(let i=0; i<5; i++) {
    main.appendChild(paragraph("main main " + i))
}

footer.appendChild(paragraph("yoyo yoyo!!!!!!!"))


