let navs = document.getElementsByTagName("nav")

Array.from(navs).forEach((nav) => {
    let links = nav.getElementsByTagName('a')
    Array.from(links).forEach((link) => {
        link.addEventListener('click', (evt) => {
            evt.preventDefault()
            let text = evt.target.innerText.trim()
            let number = text.charAt(text.length-1)
            let even = document.getElementById('even')
            let odd = document.getElementById('odd')

            if (number % 2 == 0) {
                even.style.display = 'block'
                odd.style.display = 'none'
            }
            else {
                even.style.display = 'none'
                odd.style.display = 'block'
            }
        })

    })

})