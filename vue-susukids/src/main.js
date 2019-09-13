import Vue from 'vue'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import '@fortawesome/fontawesome-free/css/all.css'
import '@fortawesome/fontawesome-free/js/all.js'
import '@/assets/css/sb-admin.css'
import App from './App.vue'
import VueRouter from 'vue-router'
import routes from './router/routes'
import VueLocalStorage from 'vue-localstorage'
import VueResource from 'vue-resource'

import './quasar'

Vue.use(VueLocalStorage, {
  name: 'ls',
  bind: true
})

Vue.use(VueResource)
Vue.use(BootstrapVue)
Vue.use(VueRouter)
const router = new VueRouter({routes});
Vue.config.productionTip = false



new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
