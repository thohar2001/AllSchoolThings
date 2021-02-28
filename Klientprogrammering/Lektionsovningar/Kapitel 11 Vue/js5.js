const app = {
    data() {
        return {
            message: 'Hello World!',
            number: 100,
            showHead: false
        }
    }
}
Vue.createApp(app).mount("#app")