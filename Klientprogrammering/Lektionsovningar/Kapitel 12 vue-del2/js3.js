const app = {
    data() {
        return {
            message: 'Hello World!'
        }
    },

    methods : {

        print(message) {
            console.log(message)
        }
        // log(evt) {
        //     if (evt.target.value === 'Knapp 1') {
        //         console.log(this.message)
        //     }
        //     else {
        //         console.log(this.message + " fast knapp 2 också!")
        //     }    
        // }
    }
}
Vue.createApp(app).mount("#app")