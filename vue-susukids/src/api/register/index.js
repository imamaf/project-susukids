import VueResource from 'vue-resource'
import Vue from 'vue'
import {getApiSpringBoot} from '../utils'
 
Vue.use(VueResource)

export default {
    registerUser(credentials, window) {
        return getApiSpringBoot().post('pengguna/register', credentials)
            .then(function (response){
                console.log(response)
                return response.data
            }).catch(function(err){
                console.log(err)
            })  
    },
}