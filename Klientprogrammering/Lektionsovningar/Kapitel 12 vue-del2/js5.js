const app = {
    data() {
        return {
            areaText: "",
            show: false
        }
    },

    methods: {
        hide() {
            let textArea = document.getElementById('area')
            let button = document.getElementsByTagName('input')[0]
            textArea.style.display = 'none'
            button.style.display = 'none'
            this.show = true
        }
    }
}

Vue.createApp(app).mount("#app")