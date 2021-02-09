let paragraphs = Array.from(document.getElementsByTagName('p'))

function reversePara(evt) {
    let reverseText = evt.target.innerText.split("").reverse().join("")
    evt.target.innerText = reverseText
}

for(let para of paragraphs) {
    para.addEventListener('mouseenter', reversePara)
    para.addEventListener('mouseleave', reversePara)
}